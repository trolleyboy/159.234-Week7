package tutorial7.task2;

public class Main {
    
    public static void main(String[] args) {

        CourseManager prospectus = new CourseManager();

        // Course course1;
        // Course course2;
        // Course course3;
        // Course course4;
        
        // course1 = new Course("Software Testing", 5, 2000);
        // Module module1 = new Module("Unit Testing", 10, "Assessment");
        // Module module2 = new Module("Acceptance Testing", 20, "Coursework");
        // Module module3 = new Module("Boundary Values", 10, "Exam");
        // try {
        //     course1.addModule(module1);
        //     course1.addModule(module2);
        //     course1.addModule(module3);
        // } catch (ModuleException e) {
        //     System.out.println("Too many modules.\n");
        // }


        // course2 = new Course("System Analysis", 3, 1000);
        // Module module4 = new Module("Use Cases", 10, "Seminar");
        // Module module5 = new Module("Class Diagrams", 10, "Presentation");
        // course2.addModule(module1);
        // course2.addModule(module4);
        // course2.addModule(module5);

        // try {
        //     course3 = new Course(null, 3, 1000);
        //     course3.addModule(module1);
        //     course3.addModule(module4);
        //     course3.addModule(module5);
        //     prospectus.addCourse(course3);
        // } catch (NullPointerException e) {
        //     System.out.println("Null course name not acceptable.\n");
        // }
        

        // try {
        //     course4 = new Course("Exception Course", 12, 1000);
        //     course4.addModule(module1);
        //     course4.addModule(module4);
        //     course4.addModule(module5);
        //     prospectus.addCourse(course4);
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Course length must be less than or equal to 10 days.\n");
        // }
        
        try {
            prospectus.addCourse("Software Testing 0", 5, 2000);
        } catch (CourseConstructorException e) {
            e.printStackTrace();
        }

        try {
            prospectus.addCourse(null, 5, 2000);
        } catch (CourseConstructorException e) {
            e.printStackTrace();
        }

         try {
            prospectus.addCourse("Software Testing ", 12, 2000);
        } catch (CourseConstructorException e) {
            e.printStackTrace();
        }

        try {
            prospectus.addCourse("Software Testing 1", 5, 2000);
        } catch (CourseConstructorException e) {
            e.printStackTrace();
        }

        try {
            prospectus.addCourse("Software Testing 2", 5, 2000);
        } catch (CourseConstructorException e) {
            e.printStackTrace();
        }

        try {
            prospectus.addCourse("Software Testing 3", 5, 2000);
        } catch (CourseConstructorException e) {
            e.printStackTrace();
        }
        
        //prospectus.addCourse(course2);
        
        prospectus.displayCourses();

    }

}
