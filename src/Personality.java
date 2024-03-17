import java.util.ArrayList;

public class Personality {
    private ArrayList<String> toDoList = new ArrayList<>();
    public String Update(){
        return toDoList.iterator().next();
    }
    public String Update(String matter){
        Matter Matter = new Matter(matter);
        int weight = Matter.getWeight();
        toDoList.add(weight,matter);
        return toDoList.iterator().next();
    }
}
