package htw.berlin.wipeout;

import htw.berlin.wipeout.rest.SurfSpot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello World!!";
    }

    @GetMapping(path="/surfspot")
    public SurfSpot surfSpot(@RequestParam(value = "name", defaultValue = "Pipe") String name){
        return new SurfSpot(String.format("You're surfing at %s",name));
    }
}