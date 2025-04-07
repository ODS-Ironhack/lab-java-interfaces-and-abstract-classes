package videoStreamer;

public class TvSeries extends Video{
    private int episodes;

    public TvSeries (String title, int duration, int episodes) {
        super(title,duration);
        setEpisodes(episodes);
    }

    private void setEpisodes(int episodes) {
        this.episodes=episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    @Override
    public String getInfo() {
        return String.format("%s, Episodes: %n",
                super.getInfo(), episodes);
    }
}
