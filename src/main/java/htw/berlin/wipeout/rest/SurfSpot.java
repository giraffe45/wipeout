package htw.berlin.wipeout.rest;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class SurfSpot {
    @Id
    @SequenceGenerator(
            name = "address_sequence",
            sequenceName = "address_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator =  "address_sequence"
    )
    private Long id;
    private String name;

    private String surfSpotAddress;

    public SurfSpot(){

    }

    public SurfSpot(Long id,String name,String surfSpotAddress) {
        this.id = id;
        this.name = name;

        this.surfSpotAddress = surfSpotAddress;

    }

    public SurfSpot(String name,String surfSpotAddress) {

        this.name = name;
        this.surfSpotAddress = surfSpotAddress;
    }





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurfSpotAddress() {
        return surfSpotAddress;
    }

    public void setSurfSpotAddress(String surfSpotAddress) {
        this.surfSpotAddress = surfSpotAddress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", homeAddress='" + surfSpotAddress +
                '}';
    }
}