package state;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/3/22 15:37
 */
public class Secondary implements State{
    public void play() {
        System.out.println("玩游戏");
    }

    public void doubleScore() {
        System.out.println("积分加倍");
    }

    public void changeCards() {
        throw new RuntimeException("不支持换牌");
    }

    public void peekCards() {
        throw new RuntimeException("不支持偷看他人的牌");
    }
}
