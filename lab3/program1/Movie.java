package co.demo.lab3.program1;

public class Movie {
    private static int moviesCount = 0;
    private final String movieName;
    private String producedBy;
    private String directedBy;
    private int duration;   // in minutes
    private int year;
    private String category;

    private final String movieId;

    // Mandatory constructor
    public Movie(String movieName, String producedBy) {
        if (movieName == null || producedBy == null) {
            throw new IllegalArgumentException("movieName and producedBy are required");
        }
        this.movieName = movieName;
        this.producedBy = producedBy;
        moviesCount++;
        this.movieId = movieName + "_" + moviesCount;
    }

    // Full constructor chaining to mandatory
    public Movie(String movieName, String producedBy,
                 String directedBy, int duration, int year, String category) {
        this(movieName, producedBy);
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    public static int getMoviesCount() {
        return moviesCount;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setDirectedBy(String directedBy) {
        this.directedBy = directedBy;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    // showDetails concatenates all fields into a string
    public String showDetails() {
        return "MovieId: " + movieId
                + ", Name: " + movieName
                + ", ProducedBy: " + producedBy
                + ", DirectedBy: " + directedBy
                + ", Duration: " + duration
                + " min, Year: " + year
                + ", Category: " + category;
    }
}

