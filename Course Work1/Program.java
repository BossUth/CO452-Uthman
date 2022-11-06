import java.util.ArrayList;

import helpers.InputReader;


public class Program
{
    public static ArrayList<Song> songs;
    public static void main(String[] args)
    {
        System.out.println("Uthman's CW1");
        Song burna = new Song("On the Low", "Burna Boy", 3434359);
        burna.print();
        Song the = new Song("Sambh", "The Prophec", 39033958);
        the.print();
        Song dharia = new Song("Sugar & Brownies", "Dharia", 438424053);
        dharia.print();
        Song shekhar = new Song("Firecracker", "Shekhar Ravjiani", 353585418);
        shekhar.print();
        Song bon = new Song("Livin' On a Prayer", "Bon Jovi", 689846223);
        bon.print();
        Song mreazi = new Song("Oh My Gawd", "Mr Eazr & Major Lazer", 53516516);
        mreazi.print();

        



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
        songs.remove(ogb);
        
        
        for(Song song : songs)
    {
        song.print();
    }


    System.out.println(songs.contains(james));
    System.out.println(songs.contains(leo));
    System.out.println(songs.contains(james));
    int songnumber = 0 ;
    for(Song song : songs){
        System.out.println("No: " + songnumber + "\t");
        song.print();
        songnumber++;
    }
    String f2 = InputReader.getString("Do you want to add songs to the list? ");
    if (f2.equalsIgnoreCase("yes")){
        String songadd = InputReader.getString("Enter Song Name: ");
    Song newsong = new Song(songadd);
    songs.add(newsong);
    for (Song i:songs) {
        i.print();
    }
    }

    int f3 = InputReader.getInt("Do you want to remove songs from list? ");
    String f4 = InputReader.getString("confirm for removal " + f3 + "?");
    if (f4.equalsIgnoreCase("yes")){
        songs.remove(f3);
        for(Song i : songs)
        {
            System.out.print("Songnumber: 0");
            i.print();
            System.out.println();
        }
    }
   



    int playcount = 0;
    playcount = InputReader.getInt("Enter Number: ");
    findByplaycount(playcount);

    }

    public static Song findByplaycount(int playcount)
    {
        for(Song song : songs)
        {

            if(song.getplaycount() > playcount)
                 song.print();

        }
        return null;
    }
    
    



}