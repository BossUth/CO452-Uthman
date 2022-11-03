
public class Song
{
    private String songtitle;
    private String artistname;
    private int playcount;
    private Song[] songs;


    public Song findByplaycount(int playcount)
    {
        for(Song song : songs)
        {

            if(song.getplaycount() > playcount)
                 song.print();

        }
        return null;

    }
    private int getplaycount() {
        return this.playcount;
    }



    public Song(String songtitle, String artistname, int playcount)
    {
        this.songtitle = songtitle;
        this.artistname = artistname;
        this.playcount = playcount;
    }
    public void print(){
        System.out.print("SongTitle: " + this.songtitle + "\t");
        System.out.print("ArtistName: " + this.artistname + "\t");
        System.out.println("PlayCount: " + this.playcount + "\t");
    }
}

