public class Testing{
    public static void schoolTest(){
        User user1 = new User();
        user1.setGroup("School");
        user1.setEvent("School Starts", "06-01-2025", "School");
        System.out.println(user1.getGroups());
    }


}