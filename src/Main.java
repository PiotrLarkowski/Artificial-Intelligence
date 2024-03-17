public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.getPersonality().addNewItem("Job");
        person.getPersonality().addNewItem("Alarm");
        person.newTask("Power");
        person.newTask("To talk");
        System.out.println(Person.getListOfMatters());
    }
}