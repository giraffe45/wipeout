package htw.berlin.wipeout.rest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Configuration
public class SurfSpotConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    CommandLineRunner commandLineRunner(SurfSpotRepository repository){
        return args -> {
            SurfSpot playa_del_socorro = new SurfSpot(
                            "Playa del Socorro",1.0f,1.0f
            );
            SurfSpot playa_san_juan = new SurfSpot(
                    "Playa San Juan",1.0f,1.0f
            );

            SurfSpot punta_del_hidalgo = new SurfSpot(
                    "Punta del Hidalgo",1.0f,1.0f
            );
            SurfSpot poris_de_abona = new SurfSpot(
                    "Porís de Abona",1.0f,1.0f
            );


            repository.saveAll(
                    List.of(playa_del_socorro,playa_san_juan,punta_del_hidalgo,poris_de_abona)
            );
        };
    }
}
