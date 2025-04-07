package videoStreamer;

public class Movie extends Video{
    private double rating;

    public Movie(String title,int duration, double rating){
        super(title,duration);
        setRating(rating);
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String getInfo() {
        return String.format( "%s, %n", super.getInfo(), rating);
    }
}
