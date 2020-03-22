package state;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/3/22 15:38
 */
public class Final implements State {
    public void play() {
        System.out.println("玩游戏");
    }

    public void doubleScore() {
        System.out.println("积分加倍");
    }

    public void changeCards() {
        System.out.println("换牌");
    }

    public void peekCards() {
        System.out.println("不支持偷看他人的牌");
    }
}
