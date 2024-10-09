package lessons.september19.tvset;

public class Tvs {
    public static TvSet[] generateTvsArray() {
        int length = 10;
        TvSet[] tvs = new TvSet[length];
        for (int i = 0; i < tvs.length; i++) {
            tvs[i] = new TvSet(Utils.generateBrand(),1000,Utils.generateTvSize());
        }
        return tvs;
    }
}
