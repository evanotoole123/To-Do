

public class Main{
    public static void main(String[] args){
        User user = new User();
    
        if (args[0].equals("make group")){
            user.setGroup(args[1]);
            System.out.println("succesfully made group: " + args[1]);
        }

        else if (args[0].equals("make event")){
            user.setEvent(args[1], args[2], args[3]);
        }
    }
}