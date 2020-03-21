package test1;

/**
 * @author zhiwj
 * @Description:
 * @date 2020-03-11 22:52
 */
public interface Command {

    int execute(int value);

    int undo();

    int redo();

}
