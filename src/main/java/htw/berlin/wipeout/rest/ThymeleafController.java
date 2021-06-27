package htw.berlin.wipeout.rest;


import htw.berlin.wipeout.config.Endpoints;
import htw.berlin.wipeout.config.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
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

    @RequestMapping(value="/createsurfspot", method = {RequestMethod.GET})
    public String surfSpotForm(Model model){
        model.addAttribute("surfspot", new SurfSpot());
        return "createsurfspot";
    }

    //TODO und er bleibt auf createsurfspot Seite
    @RequestMapping(value="/createsurfspot", method = {RequestMethod.POST})
    public String submitSurfspot(@AuthenticationPrincipal OidcUser user, @ModelAttribute SurfSpot surfSpot, Model model){
        surfSpot.setOwner(user.getEmail());
        surfSpotService.addNewSurfSpot(surfSpot);
        model.addAttribute("surfspot", surfSpot);
        return "surfspotresult";
    }


    @GetMapping(path="/surfspottable")
    public String surfspotsTable(@AuthenticationPrincipal OidcUser user,Model model){
        List<SurfSpot> surfspots = surfSpotService.findAll(user.getEmail());
        model.addAttribute("surfspots", surfspots);
        return "surfspottable";
    }
    @GetMapping(path= Endpoints.VUEDYNAMIC)
    public ModelAndView showVueDynamic(){
        return new ModelAndView(ViewNames.VUEDYNAMIC);
    }
}

