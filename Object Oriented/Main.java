import java.util.*;

class Student
{
    private String name;
    private int rollno;
    private int age;
    
    // default constructor won't work if we explicitely define any constructor , means now constructor must be called along with parameters that is explicitely defined
    Student(String name,int rollno,int age)
    {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    Student()
    {

    }
    
    // Getter Function //
    String getName()
    {
        return this.name;
    }

    int getRollno()
    {
        return this.rollno;
    }
    
    int getAge()
    {
        return age;
    }

    // Setter Functions //
    void setName(String name)
    {
        this.name=name;
    }

    void setRollno(int rollno)
    {
        this.rollno = rollno;
    }

    void setAge(int age)
    {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Student student1 = new Student("satya", 2101185, 22);
        Student student2 = new Student();
        student2.setName("rishabh");
        student2.setRollno(2101185);
        student2.setAge(20);

        //-----ERROR IF VARIBALES IN STUDENT CLASS DECLARED AS PRIVATE---
        System.out.println(student2.getName());
        System.out.println(student2.getRollno());
        System.out.println(student2.getAge());
    }
}
