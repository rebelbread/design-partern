package test1;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/3/16 22:39
 */
public class Main {
    public static void main(String[] args) {
        Value value1 = new Value(1);
        Value value2 = new Value(2);
        Value value3 = new Value(3);
        Value value4 = new Value(4);
        Value value5 = new Value(1);
        AbstractExpression operation1 = new AddOperation(value1, value2);
        AbstractExpression operation2 = new AddOperation(operation1, value3);
        AbstractExpression operation3 = new SubOperation(operation2, value4);
        AbstractExpression operation4 = new AddOperation(operation3, value5);

        int interpret = operation4.interpret();
        System.out.println(interpret);

    }
}
