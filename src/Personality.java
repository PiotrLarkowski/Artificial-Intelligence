import java.util.ArrayList;

public class Personality {
    private ArrayList<String> toDoList = new ArrayList<>();
    private ArrayList<Item> listOfKnowItems = new ArrayList<>();
    private ArrayList<Reasons> listOfKnowReasons = new ArrayList<>();
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
    public void addNewItem(String nameOfItem){
        Item item = new Item(nameOfItem);
        listOfKnowItems.add(item);
    }

    public String getItem(int index) {
        return listOfKnowItems.get(index).getName();
    }
    public void addNewReason(String nameOfReason){
        Reasons reasons = new Reasons(nameOfReason);
        listOfKnowReasons.add(reasons);
    }
    public String getReason(int index) {
        return listOfKnowReasons.get(index).getNameOfReason();
    }
    public ArrayList<Item> getListOfItems(){
        return listOfKnowItems;
    }
    public ArrayList<Reasons> getListOfReasons(){
        return listOfKnowReasons;
    }
}
