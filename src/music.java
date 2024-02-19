public class music {
    String title, genre, artist, album;

    public music(String t, String g, String a, String al) {
        title = t;
        genre = g;
        artist = a;
        album = al; 
    }

    public void getName() {
        System.out.println(title);
    } 
}
