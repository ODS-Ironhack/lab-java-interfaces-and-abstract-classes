package videoStreamer;

public abstract class Video {
    protected String title;
    protected int duration;

    public Video(String title, int duration) {
        setTitle(title);
        setDuration(duration);
    }

    public String getInfo(){
        return String.format("Title: %s, Duration:%d",
                title, duration);
    };

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
