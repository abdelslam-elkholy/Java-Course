public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie()
    {
        String instance = this.getClass().getSimpleName();
        System.out.printf("%s is %s Film \n" , title , instance);
    }
    public static Movie getMovie(String type , String name)
    {
       return switch (type.toUpperCase().charAt(0))
        {
            case 'A' -> new Adventure(name);
            case 'C' -> new Comedy(name);
            case 'S' -> new ScienceFiction(name);
            default -> new Movie(name);
        };
    }
}

 class Adventure extends Movie
{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s\n" . repeat(3) , "First Scene" , "Movie" , "The end ");
    }

    public void watchAdventure()
    {
        System.out.println("Watching Adventure ....");
    }
}

class Comedy extends Movie
{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s\n" . repeat(3) , "First Scene" , "Movie" , "The end ");
    }

    public void watchComedy()
    {
        System.out.println("Watching Comedy ....");
    }
}

class ScienceFiction extends Movie
{
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s\n" . repeat(3) , "First Scene" , "Movie" , "The end ");
    }

    public void watchScienceFiction()
    {
        System.out.println("Watching Science Fiction ....");
    }
}
