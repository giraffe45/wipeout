package htw.berlin.wipeout.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController(Endpoints.INDEX).setViewName(ViewNames.INDEX);
        registry.addViewController(Endpoints.FAVORITE).setViewName(ViewNames.FAVORITE);
        registry.addViewController(Endpoints.LOGIN).setViewName(ViewNames.LOGIN);
        registry.addViewController(Endpoints.WIPEOUT).setViewName(ViewNames.WIPEOUT);
    }
}
