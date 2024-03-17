import java.util.ArrayList;
import java.util.List;

public class Matter {
    public String nameOfMatter;
    private final List<String> importantForMatter = new ArrayList<>();
    public Matter(){
    }

    public Matter(String newMatter){
        //TODO automatic creation for item in loop
        this.nameOfMatter = newMatter;
        ArrayList<Reasons> listOfReasons = Person.getPersonality().getListOfReasons();
        for (Reasons reason : listOfReasons) {
            importantForMatter.add(reason.getNameOfReason() +" - "+ Person.getPersonality().getListOfItems().get(0));
        }
        importantForMatter.add("When - " + java.time.LocalTime.now());
        Personality.listOfMatters.add(this);
    }

    public int getWeight() {
        int Weight = 0;
        //TODO Weight calculation
        Weight = 5;
        return Weight;
    }

    @Override
    public String toString() {
        return "Matter{" +
                "nameOfMatter='" + nameOfMatter + '\'' +
                ", importantForMatter=" + importantForMatter +
                '}';
    }
}
