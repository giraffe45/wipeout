package htw.berlin.wipeout.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/api/v1/surfSpot")
public class SurfSpotController {

    private final SurfSpotService surfSpotService;

    @Autowired
    public SurfSpotController(SurfSpotService surfSpotService){
        this.surfSpotService = surfSpotService;
    }


    @GetMapping
  //  public SurfSpot surfSpot(@RequestParam(value = "name", defaultValue = "Pipe") String name){
      //  return new SurfSpot(String.format("You're surfing at %s",name));
    public List<SurfSpot> getSurfSpot(){
    return surfSpotService.getSurfSpot();
    }
}