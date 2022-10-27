package Week3;

public class Module 
{
    private String name;
    private String code;

    public Module(String name, String code){

        this.name = name;
        this.code = code;
    }

public void print(){
    System.out.println("Course: " + this.name);
    System.out.println("Course: " + this.code);
}
}
