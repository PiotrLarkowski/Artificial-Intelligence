public class Reasons {
    private String name;
    public Reasons(String nameOfReason) {
        this.name = nameOfReason;
    }
    public String getNameOfReason(){
        return name;
    }

    @Override
    public String toString() {
        return "Reasons{" +
                "name='" + name + '\'' +
                '}';
    }
}
