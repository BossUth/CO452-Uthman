import java.util.ArrayList;


public class Program
{
    public static void main(String[] args)
    {
        System.out.println("Uthman's CW1");
        ArrayList<Song> songs = new ArrayList<Song>();
        songs = new ArrayList<Song>();
        Song ice = new Song("Gongo Aso","9ice",100000000);
        Song shaggy = new Song("Church Heathen", "Shaggy",5240000);
        Song tinie = new Song("Girls Like","Tinie Tempah",2000000000);
        Song awilo = new Song("Coupe Bibamba", "Awilo Logomba", 783938743);
        Song ogb = new Song("Lala Fatema", "OGB", 343934812);
        Song brandon = new Song("Twerk It Like Miley", "Brandon Beal", 516515163);
        Song leo = new Song("Do Ya Thang", "Leo Soul", 416515641);
        Song james = new Song("Get Up I Feel Like Being Like A Sex Machine", "James Brown", 39835038);
        Song gnarls = new Song("Crazy", "Gnals Barkly", 37202830);
        Song richie = new Song("Way Up", "Richie Loop", 873233829);
        songs.add(ice);
        songs.add(shaggy);
        songs.add(tinie);
        songs.add(awilo);
        songs.add(ogb);
        songs.add(brandon);
        songs.add(leo);
        songs.add(james);
        songs.add(gnarls);
        songs.add(richie);
        songs.add(james);




        for(Song song : songs)
    {
        song.print();
    }
        
    }


    

}