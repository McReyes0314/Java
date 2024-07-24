public class Samp4 {
    public static void main(String[] args) {
        Sample4 s1 = new Sample4();
        s1.setAge(20);
        s1.setCourse("BSCS");
        System.out.println("Student 1: \nAge: " + s1.getAge() + "\nCourse: " + s1.getCourse() + "\n");
        
        Sample4 s2 = new Sample4(19, "BSIT");
        System.out.println("Student 2: \nAge: " + s2.getAge() + "\nCourse: " + s2.getCourse() + "\n");
    }
}
