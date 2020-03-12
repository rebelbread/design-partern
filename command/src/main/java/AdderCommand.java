import java.util.Stack;

/**
 * @author zhiwj
 * @Description:
 * @date 2020-03-11 22:51
 */
public class AdderCommand implements Command {
    private Adder adder = new Adder();

    private Stack<Integer> undoList = new Stack<>();
    private Stack<Integer> redoList = new Stack<>();

    public int execute(int value) {
        undoList.push(value);
        return adder.add(value);
    }

    public int undo() {
        if (undoList.isEmpty()) {
            return adder.getNum();
        } else {
            Integer lastValue = undoList.pop();
            redoList.push(lastValue);
            return adder.add(- lastValue);
        }
    }

    @Override
    public int redo() {
        if (redoList.isEmpty()) {
            return adder.getNum();
        } else {
            Integer lastValue = redoList.pop();
            undoList.push(lastValue);
            return adder.add(lastValue);
        }
    }

}
