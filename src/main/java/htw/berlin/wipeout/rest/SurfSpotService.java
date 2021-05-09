package htw.berlin.wipeout.rest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurfSpotService {

    private final SurfSpotRepository surfSpotRepository;

    @Autowired
    public SurfSpotService(SurfSpotRepository surfSpotRepository) {
        this.surfSpotRepository = surfSpotRepository;
    }

    public List<SurfSpot> getSurfSpot() {
        return surfSpotRepository.findAll();
    }
}
