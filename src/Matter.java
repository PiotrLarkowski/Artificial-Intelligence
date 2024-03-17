import java.util.Arrays;

public class Matter {
    public String nameOfMatter;
    private String[] importantForMatter = new String[10];
    public Matter(){

    }
    public Matter(String newMatter){
        this.nameOfMatter = newMatter;
        importantForMatter[0] = "Why - Job";
        importantForMatter[1] = "How - Alarm";
        importantForMatter[2] = "When - " +java.time.LocalTime.now().toString();
        Person.listOfMatters.add(this);
    }

    public int getWeight() {
        return 5;
    }

    @Override
    public String toString() {
        return "Matter{" +
                "nameOfMatter='" + nameOfMatter + '\'' +
                ", importantForMatter=" + Arrays.toString(importantForMatter) +
                '}';
    }
}
