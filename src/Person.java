import java.util.ArrayList;
import java.util.List;

public class Person {
    private static Personality personality = new Personality();
    public static List<Matter> listOfMatters = new ArrayList<>();
    public static List<Matter> getListOfMatters(){
        return listOfMatters;
    }
    public void newTask(String matter){
        personality.Update(matter);
    }
    public Matter whatToDo(){
        String stringMatter = personality.Update();
        Matter presentMatter = new Matter();
        for(Matter matter: listOfMatters){
            if(matter.nameOfMatter.equals(stringMatter)){
                presentMatter = matter;
                break;
            }
        }
        return presentMatter;
    }

}
