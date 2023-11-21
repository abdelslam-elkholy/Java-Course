import java.util.ArrayList;

public class AlbumChallenge {
    public static void main(String[] args) {

    }
}

class Album
{

    String name;
    String artist;
    ArrayList<Song> songs;

    Album(String name , String artist)
    {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();

    }
}

class Song
{
    String title;
    double duration;

    Song(String title , double duration)
    {
        this.title=title;
        this.duration=duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return  title + ": " + duration;
    }
}
