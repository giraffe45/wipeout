package htw.berlin.wipeout.rest.fetchingclasses;

/**class that get's JSON Objects retrieved from API are put into
 *Stormglass API returns Hours Object*/
public class SurfHour {
    private String time;
    private WaveHeight waveHeight;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public WaveHeight getWaveHeight() {
        return waveHeight;
    }

    public void setWaveHeight(WaveHeight waveHeight) {
        this.waveHeight = waveHeight;
    }
}
