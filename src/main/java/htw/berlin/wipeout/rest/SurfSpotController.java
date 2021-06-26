package htw.berlin.wipeout.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/surfSpot")
public class SurfSpotController {

    private  SurfSpotService surfSpotService;

    @Autowired
    public SurfSpotController(SurfSpotService surfSpotService) {
        this.surfSpotService =  surfSpotService;
    }

    @GetMapping
    public List<SurfSpot> getSurfSpot() {
        return surfSpotService.getSurfSpot();
    }

    @PostMapping
    public void registerNewSurfSpot(@RequestBody SurfSpot surfSpot){
        surfSpotService.addNewSurfSpot(surfSpot);
    }

    @DeleteMapping(path= "{surfSpotId}")
    public void deleteSurfSpot(@PathVariable("surfSpotId")Long surfSpotId){
        surfSpotService.deleteSurfSpot(surfSpotId);
    }
}
