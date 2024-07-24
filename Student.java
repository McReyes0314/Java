public class Student {
    public static void main(String[] args) {
        MyStudent s1 = new MyStudent();
        int studentAge = s1.age;
        System.out.println("Before student Age: " + studentAge);
        s1.alterAge(19);
        studentAge = s1.GetAge();
        System.out.println("Now student age: " + studentAge);
    }
}
