package htw.berlin.wipeout.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/surfSpot")
public class JSONController {

    private  SurfSpotService surfSpotService;

    @Autowired
    public JSONController(SurfSpotService surfSpotService) {
        this.surfSpotService =  surfSpotService;
    }

    @GetMapping
    public List<SurfSpot> getSurfSpot(@AuthenticationPrincipal OidcUser user) {
        return surfSpotService.findAll(user.getEmail());
    }

    @PostMapping
    public void registerNewSurfSpot(@RequestBody SurfSpot surfSpot){
        surfSpotService.addNewSurfSpot(surfSpot);
    }

    @DeleteMapping(path= "{surfSpotId}")
    public void deleteSurfSpot(@PathVariable("surfSpotId")Long surfSpotId){
        surfSpotService.deleteSurfSpot(surfSpotId);
    }


    //VUE
    @GetMapping("/surfspots")
    public List<SurfSpot> allProducts(@AuthenticationPrincipal OidcUser user) {
        return surfSpotService.findAll(user.getEmail());
    }

    @PostMapping("/surfspots")
    public SurfSpot createProduct(@AuthenticationPrincipal OidcUser user, @RequestBody SurfSpot surfSpot) {
        surfSpot.setOwner(user.getEmail());
        return surfSpotService.save(surfSpot);
    }
}
