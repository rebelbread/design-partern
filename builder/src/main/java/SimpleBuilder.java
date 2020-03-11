/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/2/17 18:12
 */
public class SimpleBuilder extends Builder {

    public void buildMenu() {
        this.video.setMenu(false);
    }

    public void buildPlayList() {
        this.video.setPlayList(true);
    }

    public void buildWindow() {
        this.video.setWindow(true);
    }

    public void buildCtrlProgress() {
        this.video.setCtrlProgress(false);
    }

    public void buildFavorite() {
        this.video.setFavorite(false);
    }
}
