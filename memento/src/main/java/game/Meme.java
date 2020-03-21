package game;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/3/21 16:38
 */
public class Meme {
    private Integer life;
    private String place;

    public Meme(Integer life, String place) {
        this.life = life;
        this.place = place;
    }

    public Integer getLife() {
        return life;
    }

    public String getPlace() {
        return place;
    }
}
