/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/2/17 18:04
 */
public class CompleteBuilder extends Builder {

    public void buildMenu() {
        video.setMenu(true);
    }

    public void buildPlayList() {
        video.setPlayList(true);
    }

    public void buildWindow() {
        video.setWindow(true);
    }

    public void buildCtrlProgress() {
        video.setCtrlProgress(true);
    }

    public void buildFavorite() {
        video.setFavorite(true);
    }
}
