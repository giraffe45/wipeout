package htw.berlin.wipeout.rest.fetchingclasses;

import java.util.List;
/**class that get's JSON Objects retrieved from API are put into
 * */
public class SurfResponse {
    private List<SurfHour> hours;

    public List<SurfHour> getHours() {
        return hours;
    }

    public void setHours(List<SurfHour> hours) {
        this.hours = hours;
    }
}
