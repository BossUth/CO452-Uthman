import java.util.ArrayList;


public class Program
{
    private String songtitle;
    private String artistname;
    private int playcount;
    private ArrayList<Program> programs;

    public Program(String songtitle, String artistname, int playcount)
    {
        this.songtitle = songtitle;
        this.artistname = artistname;
        this.playcount = playcount;
        programs = new ArrayList<Program>();
        Program ice = new Program("Gongo Aso","9ice",100000000);
        Program shaggy = new Program("Church Heathen", "Shaggy",5240000);
        programs.add(ice);
        programs.add(shaggy);
    }

    public void print(){
        System.out.println("Title: " + this.songtitle);
        System.out.println("Name: " + this.artistname);
        System.out.println("Name: " + this.playcount);
        for(Program program: programs){
            program.print();
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Uthman's CW1");
    }

}