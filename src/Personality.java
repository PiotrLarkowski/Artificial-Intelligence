import java.util.ArrayList;
import java.util.List;

public class Personality {
    private final ArrayList<String> toDoList = new ArrayList<>();
    private final ArrayList<Integer> toDoListWeight = new ArrayList<>();
    private final ArrayList<Item> listOfKnowItems = new ArrayList<>();
    private final ArrayList<Reasons> listOfKnowReasons = new ArrayList<>();
    public static List<Matter> listOfMatters = new ArrayList<>();
    //Get all items from lists-----------------------------------------------------------
    public ArrayList<String> getListOfWhatToDo(){
        return toDoList;
    }
    public ArrayList<Integer> getListOfWhatToDoListWeight(){
        return toDoListWeight;
    }
    public ArrayList<Item> getListOfItems(){
        return listOfKnowItems;
    }
    public ArrayList<Reasons> getListOfReasons(){
        return listOfKnowReasons;
    }
    public List<Matter> getListOfMatters(){
        return listOfMatters;
    }
    //Get single item from list-------------------------------------------------
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
    //Add items to lists-----------------------------------------------------------
    public void createNewMatter(String matter){
        Matter Matter = new Matter(matter);
        int weight = Matter.getWeight();
        toDoList.add(matter);
        toDoListWeight.add(weight);
    }
    public void addNewItem(String nameOfItem){
        Item item = new Item(nameOfItem);
        listOfKnowItems.add(item);
    }
    public void addNewReason(String nameOfReason){
        Reasons reasons = new Reasons(nameOfReason);
        listOfKnowReasons.add(reasons);
    }

}
