package htw.berlin.wipeout.rest;

import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table
public class SurfSpot {
    @Id
    @SequenceGenerator(
            name = "surfspot_sequence",
            sequenceName = "surfspot_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "surfspot_sequence"
    )
    private int id;
    private String name;

    public SurfSpot(){
    }

    public SurfSpot(String name, int id){
        this.id = id;
        this.name = name;
    }

    public SurfSpot(String name) {
        id++;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
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
                '}';
    }
}
