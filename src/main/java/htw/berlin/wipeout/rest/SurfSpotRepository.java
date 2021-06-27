package htw.berlin.wipeout.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SurfSpotRepository extends JpaRepository<SurfSpot, Long> {
    List<SurfSpot> findAll();

}
