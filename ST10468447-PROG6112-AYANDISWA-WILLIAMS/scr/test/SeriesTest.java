import jdk.jfr.Timestamp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.api.BeforeEach;


public class SeriesTest {
    @BeforeEach
    
    void clearBeforeEach(){
        Series.seriesList.clear();
    }

    @Test
    void testSearchSeries(){
        seriesModel s = new SeriesModel("S101", "Extreme Sports", "Sports", 12, 10);
        Series.seriesList.add(s);
        SeriesModel found = Series.searchSeries("S101");
        assertNotNull(found);
        assertEquals("Extreme Sports", found.seriesName);

    }
    @Test
    void testSearchSeriesNotFound(){
        SeriesModel found = Series.searchSeries("S999");
        assertNull(found);
    }
    @Test
    void testUpdateSeries(){
        SeriesModel s = new SeriesModel("S101", "Extreme Sports 2025", "Sports", 10, 12);
        Series.seriesList.add(s);
        boolean updated = Series.updateSeries("S101", "Extreme Sports 2025", 10, 12);
        assertTrue(updated);
        SeriesModel updatedSeries = Series.searchSeries("S101");
        assertEquals("Extreme Sports 2025", updatedSeries.seriesName);
        assertEquals(10, updatedSeries.seriesAge);
        assertEquals(12, updatedSeries.seriesNumberOfEpisodes);
    }
    @Test
    void testUpdateSeriesNotFound(){
        boolean updated = Series.updateSeries("S999", "Nonexistent Series", 10, 12);
        assertFalse(updated);
    }
    @Test
    void testDeleteSeries(){
        SeriesModel s = new SeriesModel();
        Series.seriesList.add(s);
        boolean deleted = Series.deleteSeries("S101");
        assertTrue(deleted);
        SeriesModel found = Series.searchSeries("S101");
        assertNull(found);
    }
    @Test
    void testDeleteSeriesNotFound(){
        boolean deleted = Series.deleteSeries("S999");
        assertFalse(deleted);
    }
    @Test
    void testAgeRestriction_AgeValid(){
        SeriesModel s = new SeriesModel("S102", "Family Show", "Family", 8, 20);
        assertTrue(s.agerestriction>=13 && s.ageRestriction <= 18);

    }
    @Test
    void testAgeRestriction_AgeInvalid(){
        SeriesModel s = new SeriesModel("S103", "Kids Show", "Kids", 1, 15);
        assertFalse(s.ageRestriction >=13 && s.ageRestriction <= 18);
    }
}
