package htw.berlin.wipeout.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SurfSpotRepository extends CrudRepository<SurfSpot, Long> {
    List<SurfSpot> findByName(String name);
    SurfSpot findById(long id);

}
