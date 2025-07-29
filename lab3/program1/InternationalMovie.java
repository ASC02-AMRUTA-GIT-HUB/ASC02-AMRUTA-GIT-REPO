package co.demo.lab3.program1;


public class InternationalMovie extends Movie {
    private String country;
    private String language;

    public InternationalMovie(String movieName, String producedBy,
                              String country, String language) {
        super(movieName, producedBy);
        this.country = country;
        this.language = language;
    }

    public InternationalMovie(String movieName, String producedBy,
                              String directedBy, int duration, int year, String category,
                              String country, String language) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.country = country;
        this.language = language;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String showDetails() {
        return super.showDetails()
                + ", Country: " + country
                + ", Language: " + language;
    }
    public static void main(String[] args) {
        Movie m1 = new Movie("Hello", "XYZ Productions");
        System.out.println(m1.getMovieId());      // Hello_1
        System.out.println(m1.showDetails());

        SpecialMovie sm = new SpecialMovie(
                "Avengers", "Marvel Studios",
                "Dolby Atmos", "IMAX Enhanced");
        sm.setDirectedBy("Joe Russo");
        sm.setDuration(180);
        sm.setYear(2019);
        sm.setCategory("Action");
        System.out.println(sm.getMovieId());      // Avengers_2
        System.out.println(sm.showDetails());

        InternationalMovie im = new InternationalMovie(
                "Amelie", "Clap Productions",
                "France", "French");
        im.setDirectedBy("Jean-Pierre Jeunet");
        im.setDuration(122);
        im.setYear(2001);
        im.setCategory("Comedy/Romance");
        System.out.println(im.getMovieId());      // Amelie_3
        System.out.println(im.showDetails());

        System.out.println("Total movies created: " + Movie.getMoviesCount());
    }
}
