public class Persistence{
    public static void createGroup(String group){
        CRUD.createGroup(group);
    }

    public static void createEvent(String group, String event, String time){
        if (!searchEvents(group, event)){
            CRUD.createEvent(group, event, time);
        }
        
        else{
            System.out.println("This event already exists. It was not added");
        }
    }

    public static boolean searchEvents(String event, String group){
        return CRUD.searchEvents(event, group);
    }

}