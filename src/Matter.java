
public class Matter {
    private String newMatter;
    private String[] importantForMatter = new String[10];
    public Matter(String newMatter){
        this.newMatter = newMatter;
        importantForMatter[0] = "Job";
        importantForMatter[1] = "Alarm";
        importantForMatter[2] = java.time.LocalTime.now().toString();
    }

    public int getWeight() {
        return 0;
    }
}
