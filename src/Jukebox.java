import java.util.ArrayList;

public class Jukebox {

    public static ArrayList<music> insertionSort(ArrayList<music> songs, String sorttype){
        switch(sorttype){
            case "title":
                System.out.println("\nsort by title");
                for(int i = 1; i < songs.size(); i++){
                  music current = songs.remove(i); // removes & returns
                  int index = i - 1;
                  while(index >= 0 && current.title.compareTo( songs.get(index).title)<0)
                      index--;
                  songs.add(index+1, current);
                }
                break;
            case "genre":
                
                break;
            case "artist":
                
                break;
            case "album":
                
                break;
        }
       
        return songs;
    }
    // searches by title
    public static music sequentialSearch(ArrayList<music> songs, String target) {
        int found = -1;
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).title.equals(target)) {
                found = i;
            }
            else {
                found = -1;
            }
        }
        return songs.get(found);

    }

    public static void main(String[] args) throws Exception {
        ArrayList<music> songs = new ArrayList<>();
        music music1 = new music("Heat Waves", "Pop", "Glass Animals", "idk");
        music music2 = new music("First Flight", "Soundtrack", "Bandai", "AC5");
        songs.add(music1);
        songs.add(music2);

        for(int i = 0; i<songs.size(); i++) {
            System.out.println(songs.get(i).title);
        }

        songs = insertionSort(songs, "title");

        for(int i = 0; i<songs.size(); i++) {
            System.out.println(songs.get(i).title);
        }

        music foundMusic = sequentialSearch(songs, "First Flight");
        System.out.println(foundMusic.title);
    }
}
