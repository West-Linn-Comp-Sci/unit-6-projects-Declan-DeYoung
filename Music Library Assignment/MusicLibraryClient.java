
/**
 * Music Library Client stuff
 *
 * Declan DeYoung
 * 4/30/21
 */
public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("First", "one Guy", 10, 42.5);
        Album a2 = new Album("This Music", "Some Band", 9, 36);
        Album a3 = new Album("Play", "People", 12, 39.1);

        myLibrary.add(a1);
        myLibrary.add(a2);

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.doubleSize();

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.add(a3);
        System.out.println(myLibrary);
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        myLibrary.sortTime();
        System.out.println(myLibrary);
        
        System.out.println(myLibrary.binarySearchTime(36));
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        myLibrary.sortTitle();
        System.out.println(myLibrary);
        System.out.println(myLibrary.binarySearchTitle("This Music"));
        
    }
}
