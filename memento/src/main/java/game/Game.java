package game;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/3/21 16:36
 */
public class Game {

    private Integer life;
    private String place;

    public Game(Integer life, String place) {
        this.life = life;
        this.place = place;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Meme save() {
        return new Meme(this.life, this.place);
    }

    public void load(Meme meme) {
        this.life = meme.getLife();
        this.place = meme.getPlace();
    }



}
