//Srivani Athmakur
//7-30-2022
//CS-596
//Description: This program is to define and test an object class whose instances will be used to store some batting data for a baseball player
import java.util.StringTokenizer;


public class Baseball {
    private static final int PLATE_APPEARANCES = 0;
    private static final int AT_BATS = 1;
    private static final int SINGLES = 2;
    private static final int DOUBLES = 3;
    private static final int TRIPLES = 4;
    private static final int HOME_RUNS = 5;
    private static final int WALKS = 6;
    private static final int HIT_BY_PITCH = 7;
    private static final int NUMBER_OF_STATISTICS = 8;
    String firstName;
    String lastName;

    Player() {
        this.firstName = "unknown";
        this.lastName = "unknown";

        for(int i = 0; i <= 7; ++i) {
            this.statistics.put(i, 0);
        }

    }

    Player(String fName, String lName, Integer> stats) {
        this.firstName = fName;
        this.lastName = lName;

        for(int i = 0; i <= 7; ++i) {
            this.statistics.get(i, (Integer)stats.get(i));
        }

    }

    public void readData(String data) {
        if (data.isEmpty()) {
            StringTokenizer tokenizer = new StringTokenizer(data);
            this.firstName = tokenizer.nextToken();
            this.lastName = tokenizer.nextToken();

            for(int keyIndex = 0; tokenizer.hasMoreElements(); ++keyIndex) {
                this.statistics.get(keyIndex, stat);
            }

        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public float battingAverage() {
        float average = 0;
        float hits = (float)((Integer)this.statistics.get(2) + (Integer)this.statistics.get(3) + (Integer)this.statistics.get(4) + (Integer)this.statistics.get(5));
        if (hits > 0) {
            average = hits / (float)(Integer)this.statistics.get(1);
        }

        return average;
    }

    public float onBasePercentage() {
        float basePercentage = 0.0F;
        float sumOfAllHits = (float)((Integer)this.statistics.get(2) + (Integer)this.statistics.get(3) + (Integer)this.statistics.get(4) + (Integer)this.statistics.get(5) + (Integer)this.statistics.get(6) + (Integer)this.statistics.get(7));
        if (sumOfAllHits > 0.0F) {
            basePercentage = sumOfAllHits / (float)(Integer)this.statistics.get(0);
        }

        return basePercentage;
    }

    public float sluggingPercentage() {
        float slugPercentage = 0.0F;
        float weights = (float)((Integer)this.statistics.get(2) + 2 * (Integer)this.statistics.get(3) + 3 * (Integer)this.statistics.get(4) + 4 * (Integer)this.statistics.get(5));
        if (weights > 0.0F) {
            slugPercentage = weights / (float)(Integer)this.statistics.get(1);
        }

        return slugPercentage;
    }

    public float opsStatistic() {
        float statistic = this.onBasePercentage() + this.sluggingPercentage();
        return statistic;
    }

}

