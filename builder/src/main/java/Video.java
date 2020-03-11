/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/2/17 17:58
 */
public class Video {
    private Boolean menu;
    private Boolean playList;
    private Boolean window;
    private Boolean ctrlProgress;
    private Boolean favorite;

    public Boolean getMenu() {
        return menu;
    }

    public void setMenu(Boolean menu) {
        this.menu = menu;
    }

    public Boolean getPlayList() {
        return playList;
    }

    public void setPlayList(Boolean playList) {
        this.playList = playList;
    }

    public Boolean getWindow() {
        return window;
    }

    public void setWindow(Boolean window) {
        this.window = window;
    }

    public Boolean getCtrlProgress() {
        return ctrlProgress;
    }

    public void setCtrlProgress(Boolean ctrlProgress) {
        this.ctrlProgress = ctrlProgress;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    @Override
    public String toString() {
        return "Video{" +
                "menu=" + menu +
                ", playList=" + playList +
                ", window=" + window +
                ", ctrlProgress=" + ctrlProgress +
                ", favorite=" + favorite +
                '}';
    }
}
