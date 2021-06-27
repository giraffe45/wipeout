package htw.berlin.wipeout;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import htw.berlin.wipeout.rest.SurfSpot;
import htw.berlin.wipeout.rest.SurfSpotRepository;
import htw.berlin.wipeout.rest.SurfSpotService;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.mockito.Mockito.doReturn;

@SpringBootTest
public class SurfSpotServiceTest {
    //TODO anpassen, läuft noch nicht
    private SurfSpotService surfSpotService;

    @MockBean
    private SurfSpotRepository surfSpotRepository;

    @Test
    @DisplayName("should find Surfspot by User")
    void testSurfspotByUser(){
        var s1 = new SurfSpot(3L, "Anchor Point", "Marokko");
        var s2 = new SurfSpot(4L, "Casa Grande", "Tayrona");

        doReturn(List.of(s1,s2)).when(surfSpotRepository.findAll());

        List<SurfSpot> technopoleProducts = surfSpotService.getSurfSpot();

        Assertions.assertSame(technopoleProducts.size(), 1, "The number of products returned was wrong");
        Assertions.assertSame(technopoleProducts.get(0).getName(), "Anchor Point", "The wrong Surfspot was returned");
    }
}
