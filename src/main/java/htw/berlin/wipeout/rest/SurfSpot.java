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
    private String owner;

    public SurfSpot(){

    }

    public SurfSpot(Long id,String name,String surfSpotAddress) {
        this.id = id;
        this.name = name;

        this.surfSpotAddress = surfSpotAddress;

    }

    public SurfSpot(Long id, String name, String surfSpotAddress, String owner) {
        this.id = id;
        this.name = name;
        this.surfSpotAddress = surfSpotAddress;
        this.owner = owner;
    }

    public SurfSpot(String name, String surfSpotAddress) {

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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "SurfSpot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surfSpotAddress='" + surfSpotAddress + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}