/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/3/21 17:34
 */
public class Stock extends Subject {

    

    public void notice(Object msg) {
        for (Observer observer : list) {
            observer.update(msg);
        }
    }
}
