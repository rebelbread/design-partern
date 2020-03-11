package lazy;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/2/10 20:56
 */
public class Singleton {

    private static Singleton singleton = null;

    public Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }

        }
        return singleton;
    }

}
