package htw.berlin.wipeout.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class DBController {
    @Autowired
    private SurfSpotService surfSpotService;

    @GetMapping(path = "/getall")
    public List<SurfSpot> getSurfSpot(){
        return surfSpotService.getSurfSpot();
    }


    @PostMapping(path="/surfspots")
    public SurfSpot createSurfspot(@RequestBody SurfSpot surfSpot){
        return surfSpotService.saveSurfspot(surfSpot);
    }



    //TODO nochmal testen
    @DeleteMapping(path = "/surfspot/{id}")
    public void delete(@PathVariable String id){
        long surfSpotID =Long.parseLong(id);
        surfSpotService.deleteByID(surfSpotID);
    }
}
