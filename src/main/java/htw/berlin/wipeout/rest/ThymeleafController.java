package htw.berlin.wipeout.rest;

import htw.berlin.wipeout.config.Endpoints;
import htw.berlin.wipeout.config.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ThymeleafController {
    @Autowired
    private SurfSpotService surfSpotService;

    //TODO Hier übernimmt er lat & lng als EIngabe nicht in die Klasse
    //TODO und er bleibt auf createsurfspot Seite
    @RequestMapping(value="/createsurfspot", method = {RequestMethod.GET, RequestMethod.POST})
    public String submitSurfspot(@ModelAttribute SurfSpot surfSpot, Model model){
        surfSpotService.saveSurfspot(surfSpot);
        model.addAttribute("surfspot", surfSpot);
        return "createsurfspot";
    }

    @GetMapping(path="/listsurfspots")
    public String surfspotsTable(Model model){
        List<SurfSpot> surfspots = surfSpotService.getSurfSpot();
        model.addAttribute("surfspots", surfspots);
        return "surfspottable";
    }
    @GetMapping(path= Endpoints.VUEDYNAMIC)
    public ModelAndView showVueDynamic(){
        return new ModelAndView(ViewNames.VUEDYNAMIC);
    }
}
