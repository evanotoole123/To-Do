import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CRUD{
    public static void createGroup(String group){
        File file = new File(group + ".txt");
        if (file.exists()){
            throw new Error("this file already exists");
        }
        try (FileWriter writer = new FileWriter(file)){
            writer.write("");
        } catch(IOException e){
            System.out.println("An error occurred while writing to the file.");
        }
    }


    public static void createEvent(String group, String event, String time){
        File file = new File(group + ".txt");
        if (file.exists()){
            try (FileWriter writer = new FileWriter(group + ".txt", true)){
                writer.write(event + " " + time + "\n");
            } catch (IOException e){
                System.out.println("failed to create the event");
            }
            //if file already exists then append to it.

        } else{
            throw new Error("File does not exist");
        }

    }


    public static boolean searchEvents(String group, String event){
        Pattern pattern = Pattern.compile(event);
        try (BufferedReader reader = new BufferedReader(new FileReader(group + ".txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()){
                    return true;
                }
            }
            return false;
        } catch (IOException e){
            throw new Error("could not read from file");
        }
    }
}