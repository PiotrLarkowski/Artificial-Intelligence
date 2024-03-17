public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person.getPersonality().addNewItem("Job");
        Person.getPersonality().addNewItem("Alarm");
        Person.getPersonality().addNewReason("What");
        Person.getPersonality().addNewReason("Why");
        Person.getPersonality().addNewReason("Which");
        Person.getPersonality().addNewReason("How");
        Person.getPersonality().addNewReason("Where");
        person.newTask("Power");
        person.newTask("To talk");
        System.out.println(Person.getListOfMatters());
    }
}