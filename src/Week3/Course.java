package Week3;

import java.util.ArrayList;

public class Course 
{
    private String course;
    private String name;
    private ArrayList<Module> modules;

    public Course(String course, String name)
    {
        this.course = course;
        this.name = name;
        modules = new ArrayList<Module>();
        Module co452 = new Module("Programming Concepts", "CO452");
        modules.add(co452);
    }

    public void print(){
        System.out.println("Course: " + this.course);
        System.out.println("Name: " + this.name);
        for(Module module: modules){
            module.print();
        }
    }
}
