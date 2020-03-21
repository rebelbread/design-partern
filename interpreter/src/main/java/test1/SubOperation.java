package test1;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/3/16 22:40
 */
public class SubOperation extends AbstractExpression {

    private AbstractExpression left;
    private AbstractExpression right;

    public SubOperation(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
