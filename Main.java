
import com.sun.security.auth.module.UnixSystem;

public class Main{
    public static void main(String[] args){

        if (args[0].equals("make group")){
            User user = new User();
            user.setGroup(args[1]);
            System.out.println("succesfully made group: " + group);
        }
    }
}