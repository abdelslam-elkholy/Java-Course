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

    private Song findSong(String title)
    {
        for(Song song:songs)
        {
            if(song.getTitle().equalsIgnoreCase(title))
            {
                return song;
            }
        }
        return null;
    }

    public boolean addSong(String title , double duration)
    {
        if(findSong(title) == null)
        {
            songs.add(new Song(title , duration));
            System.out.println("Song Added Successfully!");
            return true;
        }

        System.out.println("Song Already Exist!");
        return false;
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
