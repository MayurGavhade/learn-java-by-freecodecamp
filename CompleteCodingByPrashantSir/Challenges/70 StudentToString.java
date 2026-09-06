class Student {
    String name = "Lisa";
    int age = 35;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student lisa = new Student();
        System.out.print(lisa);
    }
}