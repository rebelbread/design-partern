/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/2/17 18:05
 */
public abstract class Builder {

    protected Video video = new Video();

    public abstract void buildMenu();
    public abstract void buildPlayList();
    public abstract void buildWindow();
    public abstract void buildCtrlProgress();
    public abstract void buildFavorite();

    public Video getVideo() {
        return video;
    }
}
