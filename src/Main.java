public class Main {
    public static Matter currentMatter;
    public static void main(String[] args) {
        // Learning Process
        Person.getPersonality().addNewItem("Job");
        Person.getPersonality().addNewItem("Alarm");

        Person.getPersonality().addNewReason("What");
        Person.getPersonality().addNewReason("Why");
        Person.getPersonality().addNewReason("Which");
        Person.getPersonality().addNewReason("How");
        Person.getPersonality().addNewReason("Where");

        // Living Process
        Person.getPersonality().createNewMatter("Power");
        Person.getPersonality().createNewMatter("To talk");
        currentMatter = Person.whatToDo();

        // Checking Process
        System.out.println(Person.getPersonality().getListOfWhatToDo());
        System.out.println(Person.getPersonality().getListOfWhatToDoListWeight());
        System.out.println(Person.getPersonality().getListOfItems());
        System.out.println(Person.getPersonality().getListOfReasons());
        System.out.println(Person.getPersonality().getListOfMatters());
    }
}