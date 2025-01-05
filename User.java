import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class User{
    
    //some fields I want are an array of hashmaps containing date and time events

    private HashMap<String, HashMap<String,String>> mapArr;

    
    public User(){
        this.mapArr = new HashMap<>();
    }


    public void setGroup(String newGroup){
        this.mapArr.put(newGroup, new HashMap<>());
    }


    public void setEvent(String newEvent, String newTime, String group){
        HashMap<String, String> tempHash = this.mapArr.get(group);
        tempHash.put(newEvent, newTime);
        this.mapArr.put(group, tempHash);
    }


    public Set<String> getGroups(){
        if (this.mapArr != null){
            return this.mapArr.keySet();
        }

        return new HashSet<>();
    }


    public void renameGroup(String oldString, String newString){
        if (this.mapArr.containsKey(oldString)){
            this.mapArr.put(newString, this.mapArr.remove(oldString));
        }
        throw new Error("This group does not exist.");
    }


    public void changeTime(String group, String newTime, String event){
        if (this.mapArr.containsKey(group)){
            if (this.mapArr.get(group).containsKey(event)){
                HashMap<String,String> temp = this.mapArr.get(group);
                temp.put(event, newTime);
                this.mapArr.put(group, temp);
            }
            throw new Error("This event does not exist");
        }
        throw new Error("This group does not exist");
    }
}