package htw.berlin.wipeout.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurfSpotRepository extends JpaRepository <SurfSpot, Integer>{
}
