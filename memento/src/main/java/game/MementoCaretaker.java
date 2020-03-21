package game;

import java.util.ArrayList;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/3/21 16:38
 */
public class MementoCaretaker {

    private ArrayList<Meme> memeList = new ArrayList<Meme>();

    public void save(Meme meme) {
        memeList.add(meme);
    }

    public Meme get(Integer i) {
        return memeList.get(i);
    }

}
