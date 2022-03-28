package Entertainment;

public class Amphitheatre {
    Music m;
    Movie movie;
    public void functions(Music m,Movie movie)
    {

        this.m = new Music(m.getMusicgenre());
        this.movie = new Movie (movie.getMovieName());
        System.out.println("music "+m+ " Movie playing will be "+movie);
    }
}
