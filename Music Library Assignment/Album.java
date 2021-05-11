
/**
 * Makes an Album
 *
 * Declan DeYoung
 * 4/30/21
 */
public class Album
{
    private String name = "";
    private String person = "";
    private int songs;
    private double playTime;
    public Album(String title, String artist, int tracks, double time){
        name = title;
        person = artist;
        songs = tracks;
        playTime = time;
    }
    public String getTitle(){
        return name;
    }
    public String getArtist(){
        return person;
    }
    public int getTracks(){
        return songs;
    }
    public double getTime(){
        return playTime;
    }
    public String toString(){
        String whichAlbum = name + ", " + person + ", " + songs + ", " + playTime;
        return whichAlbum;
    }
}
