class Student 
{
  int rollNo;
  String name;
  int marks;
}

public class ArrayObject {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.rollNo = 1;
    s1.name = "John";
    s1.marks = 85;  

    Student s2 = new Student();
    s2.rollNo = 2;
    s2.name = "Jane";
    s2.marks = 90;

    Student s3 = new Student();
    s3.rollNo = 3;
    s3.name = "Doe";
    s3.marks = 95;
    
    
    
    Student students[] = new Student[3];  
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;
    
        for (Student student : students) {
            System.out.println("Roll No: " + student.rollNo + ", Name: " + student.name + ", Marks: " + student.marks);
        }
 }
}
