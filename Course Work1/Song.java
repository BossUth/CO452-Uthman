import java.util.ArrayList;



public class Song
{
    private String songtitle;
    private String artistname;
    private int playcount;
    private ArrayList<Song> songs;



    public Song(String songtitle, String artistname, int playcount)
    {
        this.songtitle = songtitle;
        this.artistname = artistname;
        this.playcount = playcount;
    }
    public void print(){
        System.out.println("SongTitle: " + this.songtitle);
        System.out.println("ArtistName: " + this.artistname);
        System.out.println("PlayCount: " + this.playcount);
        for(Song songs: songs){
            songs.print();
        }
    }
}

