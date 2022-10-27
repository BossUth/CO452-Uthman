package Week3;

import java.util.ArrayList;

public class Week03 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" Week 3 Classes, Objects, Constructors ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        Course webdevelopmet = new Course("Web Development", "Uthman");
        webdevelopmet.print(); 

        Student uthman = new Student(22139014, "Uthman", webdevelopmet);
        uthman.print();

        Student crown = new Student(22318956, "Crown", webdevelopmet);
        crown.print();
        Student oncar = new Student(22318956, "Oncar", webdevelopmet);
        crown.print();

        Module programing = new Module("Programming", "CO456" );

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(uthman);
        students.add(oncar);
        students.add(crown);


        ArrayList<Module> modules = new ArrayList<Module>();  
        
        for(Student student : students) 
        {

            student.print();

        }

        
        for(int i = 0; i < 3; i ++);

    }
    
}
