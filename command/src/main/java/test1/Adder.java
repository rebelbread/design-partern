package test1;

/**
 * @author zhiwj
 * @Description:
 * @date 2020-03-11 22:49
 */
public class Adder {
    private int num = 0;
    public int add(int value) {
        num += value;
        return num;
    }

    public int getNum() {
        return num;
    }
}
