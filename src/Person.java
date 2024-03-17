import java.util.List;

public class Person {
    private static Personality personality = new Personality();
    public static Matter whatToDo(){
        String stringMatter = personality.getMatterWithHighestWeight();
        List<Matter> listOfMatters = personality.getListOfMatters();
        Matter presentMatter = new Matter();
        for(Matter matter: listOfMatters){
            if(matter.nameOfMatter.equals(stringMatter)){
                return matter;
            }
        }
        return presentMatter;
    }
    public static Personality getPersonality(){
        return personality;
    }
}
