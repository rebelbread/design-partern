package oh;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/2/10 22:17
 */
public class Singleton {

    private static class InnerSingleton{
        private static Singleton singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return InnerSingleton.singleton;
    }


}
