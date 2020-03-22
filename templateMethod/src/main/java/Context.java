/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/3/22 19:20
 */
public abstract class Context {

    public void play() {
        opt1();
        opt2();
        opt3();
    }

    private void opt3() {
        System.out.println("opt3");
    }

    protected abstract void opt2();

    private void opt1() {
        System.out.println("opt1");
    }

}
