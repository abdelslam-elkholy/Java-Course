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
}

class Comedy extends Movie
{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s\n" . repeat(3) , "First Scene" , "Movie" , "The end ");
    }
}

class ScienceFiction extends Movie
{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s\n" . repeat(3) , "First Scene" , "Movie" , "The end ");
    }
}
