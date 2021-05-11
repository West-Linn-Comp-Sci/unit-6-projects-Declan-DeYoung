
/**
 * Stores the albums
 *
 * Declan DeYoung
 * 4/30/21
 */
public class MusicLibrary
{
    private int count = 0;
    private Album[] albums;
    int doubled;
    public MusicLibrary(){
        albums = new Album[10];
    }
    public void add(Album newAlbum){
        albums[count] = newAlbum;
        count++;
    }
    public void remove(int index){
        albums[index] = null;
        count--;
    }
    public void doubleSize(){
        Album[] doubled = new Album[2 * albums.length];
        for (int i = 0; i < albums.length; i++){
            doubled[i] = albums[i];
        }
        albums = doubled;
    }
    public String toString(){
        String eachAlbum = "";
        for(int i = 0; i < albums.length; i++){
            if(albums[i] == null){
                eachAlbum += "There's no album in this slot.\n";
            }
            else if(albums[i] != null){
                eachAlbum += albums[i].getTitle() + ", " + albums[i].getArtist() + ", " + albums[i].getTracks() + ", " + albums[i].getTime() + "\n";
            }
        }
        return eachAlbum;
    }
    public String getAlbum(String whichAlbum){
        String thisOne;
        for(int i = 0; i < albums.length; i++){
            if(albums[i].getTitle().equals(whichAlbum)){
                thisOne = albums[i].toString();
                return thisOne;
            }
            else if(albums[i].getArtist().equals(whichAlbum)){
                thisOne = albums[i].toString();
                return thisOne;
            }
        }
        thisOne = "This album does not exist";
        return thisOne;
    }
    public void sortTime(){
        int min;
        Album temp;
        for(int i = 0; i<albums.length-1; i++){
            min = i;
            for(int scan = i+1; scan<albums.length; scan++){
                if(albums[scan] != null){
                    if(albums[scan].getTime() < albums[min].getTime()){
                        min = scan;
                    }
                }
            }
            temp = albums[min];
            albums[min] = albums[i];
            albums[i] = temp;
        }
    }
    public void sortTitle(){
        
    }
}
