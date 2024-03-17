import java.util.ArrayList;

public class Item {
    private ArrayList<String> thingsList = new ArrayList<>();
    private String name;
    public Item(String name){
        this.name = name;
    }

    public void addNewThingToList(String name){
        thingsList.add(name);
    }

    public String getName() {
        return name;
    }
}
