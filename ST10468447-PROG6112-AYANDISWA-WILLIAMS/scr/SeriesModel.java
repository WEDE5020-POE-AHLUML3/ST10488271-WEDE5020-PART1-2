
public class SeriesModel {
     public String seriesId;
        public String seriesName;
        public int seriesAge;
        public int seriesNumberOfEpisodes;
        public boolean seriesDelete;
        public boolean seriesReport;
    String seriesGenre;

   
    
 

    public SeriesModel(String seriesId, String seriesName, int seriesAge, int seriesNumberofEpisodes) {
        this.seriesId = seriesId;
        this.seriesName = seriesName;
        this.seriesAge = seriesAge;
        this.seriesNumberOfEpisodes = seriesNumberOfEpisodes;
        this.seriesDelete = seriesDelete;
        this.seriesReport = seriesReport;
    }

}