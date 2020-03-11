/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/2/17 18:13
 */
public class Director {

    public Video get(Builder builder) {
        builder.buildCtrlProgress();
        builder.buildFavorite();
        builder.buildMenu();
        builder.buildPlayList();
        builder.buildWindow();
        return builder.getVideo();
    }
}
