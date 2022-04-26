package tutorial7.task2;

public class Module {
    
    private String name;
    private int creditPoints;
    private String assessment;

    //Contructors
    public Module(String name, int points, String assess) {
        setName(name);
        setCreditPoints(points);
        setAssessment(assess);
    }

    // Methods
    // Name
    public String getName() {
        return name;
        
    }

    public void setName(String moduleName) {
        name = moduleName;
    }

    //CreditPoints
    public int getCreditPoints() {
        return creditPoints;
    }

    public void setCreditPoints(int points) {
        creditPoints = points;
    }

    //Assessment
    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assess) {
        assessment = assess;
    }

}
