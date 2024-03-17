
public class Matter {
    private String newMatter;
    private String[] importantForMatter = new String[10];
    public Matter(String newMatter){
        this.newMatter = newMatter;
        importantForMatter[0] = "Why - Job";
        importantForMatter[1] = "How - Alarm";
        importantForMatter[2] = "When - " +java.time.LocalTime.now().toString();
        Person.person.listOfMatters.add(this);
    }

    public int getWeight() {
        return 0;
    }
}
