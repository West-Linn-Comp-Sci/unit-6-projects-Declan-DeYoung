
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
        for(int i = 0; i < albums.length-1; i++){
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
        int min;
        Album temp;
        for(int i = 0; i < albums.length-1; i++){
            min = i;
            for(int scan = i+1; scan < albums.length; scan++){
                if(albums[scan] != null){
                    String nameCheck = albums[scan].getTitle();
                    String checkAgainst = albums[min].getTitle();
                    if(nameCheck.compareTo(checkAgainst) < 0){
                       min = scan;
                    }
                }
            }
            temp = albums[min];
            albums[min] = albums[i];
            albums[i] = temp;
        }
    }
    public int binarySearchTitle(String target) {
        int low = 0, high = albums.length-1, middle = (low + high)/2;
        while (!albums[middle].getTitle().equals(target) && low <= high){ 
            if (albums[middle].getTitle().compareTo(target) < 0){
                high = middle - 1; 
            }
            else{
                low = middle + 1;
            }
            middle = (low + high)/2;
        }
        if (albums[middle].equals(target)){
            return middle;
        }
        else{
            return -1;
        }
    }
    public int binarySearchTime(int target) {
        int low = 0, high = albums.length-1, middle = (low + high)/2;
        while (albums[middle].getTime() != target && low <= high){ 
            if (target < albums[middle].getTime()){
                high = middle - 1; 
            }
            else{
                low = middle + 1;
            }
            middle = (low + high)/2;
        }
        if (albums[middle].getTime() == target){
            return middle;
        }
        else{
            return -1;
        }
    }
}
