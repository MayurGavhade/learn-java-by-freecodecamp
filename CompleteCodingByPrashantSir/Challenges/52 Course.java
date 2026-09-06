class Course {
    static int maxCapacity = 0;
    String courseName ;
    int enrollments;
    String[] enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int capacity){
        Course.maxCapacity = capacity;
    }

    void enrollStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unenrollStudent(String studentName){
        int i = 0;
        while(i < enrolledStudents.length) {
            if(enrolledStudents[i] != null && enrolledStudents[i].equals(studentName)) {
                enrolledStudents[i] = null;
                enrollments--;
            }
            i++;
        }
        System.out.println("Student removed");
    }

    public static void main(String[] args) {
        Course.setMaxCapacity(50);
        Course python = new Course("Python Full Stack Coding by CJP");
        python.enrollStudent("Nitin Gatkari");
        int i = 0;
        while(i < python.enrollments) {
            System.out.println("Following students have enrolled: " + python.enrolledStudents[i]);
            i++;
        }
    }
}