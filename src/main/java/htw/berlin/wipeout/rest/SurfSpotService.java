package htw.berlin.wipeout.rest;


import htw.berlin.wipeout.rest.fetchingclasses.SurfResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SurfSpotService {

    private final SurfSpotRepository surfSpotRepository;

    public SurfSpotService(SurfSpotRepository surfSpotRepository) {
        this.surfSpotRepository = surfSpotRepository;
    }

    public List<SurfSpot> getSurfSpot() {
        return surfSpotRepository.findAll();
    }

    public List<SurfSpot> findAll(String userEmail) {
        var iterator = surfSpotRepository.findAll();
        var surfspot=new ArrayList<SurfSpot>();
        for(SurfSpot s: iterator){
            if(s.getOwner()!=null&&s.getOwner().equals(userEmail)){
                surfspot.add(s);
            }
        }
        return surfspot;
    }



    /**public List<Address> listAll() {
     return addressRepository.findAll();
     }**/

    public void addNewSurfSpot(SurfSpot surfSpot) {
        surfSpotRepository.save(surfSpot);
    }

    public void deleteSurfSpot(Long surfSpotId) {
        boolean exists = surfSpotRepository.existsById(surfSpotId);
        if (!exists){
            throw new IllegalStateException(
                    "address with id " + surfSpotId + "does not exists");

        }

        surfSpotRepository.deleteById(surfSpotId);
    }

    public SurfSpot save(SurfSpot surfSpot) {
        return surfSpotRepository.save(surfSpot);
    }





    /**
     private final SurfSpotRepository surfSpotRepository;
     private final RestTemplate restTemplate;
     private static final String API_URL = "https://api.stormglass.io/v2/weather/point?lat={lat}&lng={lng}&params=waveHeight&start={start}&end={end}";
     //  private static final String API_URL = "https://api.stormglass.io/v2/weather/point?lat=52.2000&lng=4.4000&params=waveHeight&start=2021-05-18T15:08:40.797Z&end=2021-05-18T15:08:40.797Z";
     private static final String API_KEY = "3d3d6a04-ada4-11eb-849d-0242ac130002-3d3d6a7c-ada4-11eb-849d-0242ac130002";

     @Autowired
     public SurfSpotService(SurfSpotRepository surfSpotRepository, RestTemplate restTemplate) {
     this.surfSpotRepository = surfSpotRepository;
     this.restTemplate = restTemplate;
     }

     public ResponseEntity<Object> request() {
     HttpHeaders httpHeaders = new HttpHeaders();
     httpHeaders.set("Authorization", API_KEY);
     HttpEntity<String> httpEntity = new HttpEntity<>(httpHeaders);

     //TODO set parameters dynamically, now they're still fixed
     Map<String, String> params = new HashMap<>();
     params.put("lat", "52.2000");
     params.put("lng", "4.4000");
     params.put("start", "2021-05-18T15:08:40.797Z");
     params.put("end", "2021-05-18T15:08:40.797Z");
     ResponseEntity<SurfResponse> entity = restTemplate.exchange(API_URL, HttpMethod.GET, httpEntity, SurfResponse.class, params);
     //TODO return entity.getBody() um JSON Body über API zurückzugeben (zum Testen)
     return ResponseEntity.ok().build();
     }


     public SurfSpot saveSurfspot(SurfSpot surfSpot){
     return surfSpotRepository.save(surfSpot);
     }

     public void deleteByID(long id){
     surfSpotRepository.deleteById(id);
     } **/

}
