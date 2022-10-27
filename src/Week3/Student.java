package Week3;

public class Student 
{
    private int id;
    private String name;
    private Course course;

    public Student(int id, String name, Course course)
    {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    public void print(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        course.print();
    }
    

}
