import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matter {
    public String nameOfMatter;
    private List<String> importantForMatter = new ArrayList<>();
    public Matter(){

    }

    public Matter(String newMatter){
        //TODO automatic creation for element in list
        this.nameOfMatter = newMatter;
        ArrayList<Reasons> listOfReasons = Person.getPersonality().getListOfReasons();
        for (Reasons reason : listOfReasons) {
            importantForMatter.add(reason.getNameOfReason() + Person.getPersonality().getItem(0));
        }
        importantForMatter.add("When - " + java.time.LocalTime.now());
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
