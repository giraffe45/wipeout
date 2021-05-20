package htw.berlin.wipeout.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class SurfSpotController {

    private final SurfSpotService surfSpotService;

    @Autowired
    public SurfSpotController(SurfSpotService surfSpotService){
        this.surfSpotService = surfSpotService;
    }

    @RequestMapping("/api/v1/surfSpot")
    @GetMapping
  //  public SurfSpot surfSpot(@RequestParam(value = "name", defaultValue = "Pipe") String name){
      //  return new SurfSpot(String.format("You're surfing at %s",name));
    public List<SurfSpot> getSurfSpot(){
    return surfSpotService.getSurfSpot();
    }

    @RequestMapping(path = "/status")
    @ResponseBody
    public ResponseEntity<Object> getRequest(){
        return surfSpotService.request();
    }
}