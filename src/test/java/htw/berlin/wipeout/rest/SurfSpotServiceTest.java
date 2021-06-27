package htw.berlin.wipeout.rest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import htw.berlin.wipeout.rest.SurfSpot;
import htw.berlin.wipeout.rest.SurfSpotRepository;
import htw.berlin.wipeout.rest.SurfSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.mockito.Mockito.doReturn;

@SpringBootTest
public class SurfSpotServiceTest {
    @Autowired
    private SurfSpotService surfSpotService;

    @MockBean
    private SurfSpotRepository surfSpotRepository;

    @Test
    @DisplayName("should find Surfspot by User")
    void testSurfspotByUser(){
        var s1 = new SurfSpot(3L, "Anchor Point", "Marokko");
        s1.setOwner("technopole@live.de");
        var s2 = new SurfSpot(4L, "Casa Grande", "Tayrona");
        s2.setOwner("hans@web.de");

        doReturn(List.of(s1,s2)).when(surfSpotRepository).findAll();

        List<SurfSpot> technopoleProducts = surfSpotService.findAll("technopole@live.de");

        Assertions.assertSame(technopoleProducts.size(), 1, "The number of products returned was wrong");
        Assertions.assertSame(technopoleProducts.get(0).getName(), "Anchor Point", "The wrong Surfspot was returned");
    }
}
