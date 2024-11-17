class Student {
    // Private properties
    private int id;
    private String name;
    private int age;
    private String course;

    // Getter and Setter for ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) { // Simple validation
            this.age = age;
        } else {
            System.out.println("Age must be a positive number.");
        }
    }

    // Getter and Setter for Course
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Student class
        Student student = new Student();

        // Set values using setter methods
        student.setId(101);
        student.setName("Tanya Grover");
        student.setAge(21);
        student.setCourse("Computer Science");

        // Get and display values using getter methods
        System.out.println("Student Details:");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Course: " + student.getCourse());
    }
}
