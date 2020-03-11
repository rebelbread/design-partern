package hungry;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/2/10 20:56
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    public Singleton getInstance() {
        return singleton;
    }

}
