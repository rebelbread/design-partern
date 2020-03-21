import game.Game;
import game.Meme;
import game.MementoCaretaker;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/3/21 16:35
 */
public class Main {

    public static MementoCaretaker mementoCaretaker = new MementoCaretaker();

    public static Integer index = -1;

    /**
     * Sunny软件公司正在开发一款RPG网游，为了给玩家提供更多方便，在游戏过程中可以设
     * 置一个恢复点，用于保存当前的游戏场景，如果在后续游戏过程中玩家角色“不幸牺牲”，
     * 可以返回到先前保存的场景，从所设恢复点开始重新游戏。试使用备忘录模式设计该功
     * 能
     */
    public static void main(String[] args) {
        Game game = new Game(1, "1");
        save(game);
        game.setLife(2);
        System.out.println(game.getLife() + "\t" + game.getPlace());
        undo(game);
        System.out.println(game.getLife() + "\t" + game.getPlace());
        game.setLife(3);
        System.out.println(game.getLife() + "\t" + game.getPlace());
    }

    private static void save(Game game) {
        mementoCaretaker.save(game.save());
        index++;
    }

    private static void undo(Game game) {
        if (index >= 0) {
            Meme meme = mementoCaretaker.get(index);
            game.load(meme);
            index--;
        } else {
            System.out.println("无法悔棋");
        }
    }



}
