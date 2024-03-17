import java.util.ArrayList;
import java.util.List;

public class Reasons {
    private String name;
    private List<String> listOfReasons = new ArrayList<>();

    public Reasons(String nameOfReason) {
        this.name = nameOfReason;
    }
    public String getNameOfReason(){
        return name;
    }
    public List<String> getListOfReasons(){
            return listOfReasons;
        }
        public void addNewReasonToList(String reason){
            listOfReasons.add(reason);
        }
}
