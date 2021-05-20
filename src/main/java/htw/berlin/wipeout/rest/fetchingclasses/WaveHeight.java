package htw.berlin.wipeout.rest.fetchingclasses;

/**class that get's JSON Objects retrieved from API are put into
 * Object Contains Waveheight numbers from different weather stations eg. dwd, fcoo and so on*/
public class WaveHeight {
    private double dwd;
    private double fcoo;
    private double icon;
    private double meteo;
    private double noaa;
    private double sg;

    public double getDwd() {
        return dwd;
    }

    public void setDwd(double dwd) {
        this.dwd = dwd;
    }

    public double getFcoo() {
        return fcoo;
    }

    public void setFcoo(double fcoo) {
        this.fcoo = fcoo;
    }

    public double getIcon() {
        return icon;
    }

    public void setIcon(double icon) {
        this.icon = icon;
    }

    public double getMeteo() {
        return meteo;
    }

    public void setMeteo(double meteo) {
        this.meteo = meteo;
    }

    public double getNoaa() {
        return noaa;
    }

    public void setNoaa(double noaa) {
        this.noaa = noaa;
    }

    public double getSg() {
        return sg;
    }

    public void setSg(double sg) {
        this.sg = sg;
    }
}
