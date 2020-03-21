package test1;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/3/16 22:36
 */
public class Value extends AbstractExpression{
    private int value;

    public Value(int value) {
        this.value = value;
    }

    public int interpret() {
        return value;
    }
}
