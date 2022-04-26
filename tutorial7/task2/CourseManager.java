package tutorial7.task2;

public class CourseManager {
    
    //attributes
    private Course[] courses = new Course[10];
    private int courseCount = 0;

    //constructor


    //methods
    public void addCourse(Course newCourse) {
        if (courseCount <= courses.length) {
            courses[courseCount] = newCourse;
            courseCount++;
        } else {
            System.out.println("There are too many courses.");
        }
    }

    public Course[] getCourses() {
        return courses;
    }

    public void displayCourses() {
        System.out.println("Number of courses: " + courseCount);
        for( int i = 0; i < courseCount; i++ ) {
            System.out.println(courses[i].getName() + " contains the following " + courses[i].getModuleCount() + " modules: ");
            System.out.println("Module name\tCredit Points\tAssessment");
            for (int j = 0; j < courses[i].getModuleCount(); j++) {
                System.out.println(courses[i].getModules()[j].getName() + "\t" 
                    + courses[i].getModules()[j].getCreditPoints() + "\t" 
                    + courses[i].getModules()[j].getAssessment());
            }
            System.out.println("");
        }
    }
}
