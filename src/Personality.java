import java.util.ArrayList;

public class Personality {
    private ArrayList<String> toDoList = new ArrayList<>();
    private ArrayList<Integer> toDoListWeight = new ArrayList<>();
    public String getMatterWithHighestWeight(){
        int max = 0;
        int index = 0;
        for (int i = 0; i < toDoList.size(); i++) {
            if(toDoListWeight.get(i)>max){
                max = toDoListWeight.get(i);
                index = i;
            }
        }
        return toDoList.get(index);
    }
    public void Update(String matter){
        Matter Matter = new Matter(matter);
        int weight = Matter.getWeight();
        toDoList.add(matter);
        toDoListWeight.add(weight);
    }
}
