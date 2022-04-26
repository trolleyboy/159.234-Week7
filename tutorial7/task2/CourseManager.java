package tutorial7.task2;

public class CourseManager {

    // attributes
    private Course[] courses = new Course[3];
    private int courseCount = 0;

    // constructor

    // methods
    public void addCourse(String name, int days, double cost) throws CourseConstructorException {
        try {
            courses[courseCount] = new Course(name, days, cost);
            courseCount++;
        } catch (IllegalArgumentException e) {
            throw new CourseConstructorException("Course duration must be 1-10 days", e);
        } catch (NullPointerException e) {
            throw new CourseConstructorException("Course name must not be null", e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new CourseConstructorException("There are too many courses", e);
        }
    }

    public Course[] getCourses() {
        return courses;
    }

    public void displayCourses() {
        System.out.println("Number of courses: " + courseCount);
        for (int i = 0; i < courseCount; i++) {
            System.out.println(
                    courses[i].getName() + " contains the following " + courses[i].getModuleCount() + " modules: ");
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
