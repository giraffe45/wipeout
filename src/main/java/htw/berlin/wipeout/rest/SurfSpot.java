package htw.berlin.wipeout.rest;

import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name = "surf_spot")
public class SurfSpot {
    //@SequenceGenerator(
    //        name = "surfspot_sequence",
    //        sequenceName = "surfspot_sequence",
    //        allocationSize = 1
    //)

    //@GeneratedValue(
    //        strategy = GenerationType.SEQUENCE,
    //        generator = "surfspot_sequence"
    //)
    @Id
    @Column(name = "id")
    private Integer id=1;

    @Column(name="name")
    private String name;

    @Column(name="lat")
    private Float lat;

    @Column(name="lng")
    private Float lng;

    public SurfSpot(String name, float lat, float lng) {
        id++;
        this.name = name;
        this.lat = lat;
        this.lng = lng;
    }

    public SurfSpot() {
        id++;
    }

    public Float getLat() {
        return lat;
    }


    public Float getLng() {
        return lng;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SurfSpot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
