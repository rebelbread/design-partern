/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/3/21 17:35
 */
public class Person extends Observer{

    public void update(Object msg) {
        System.out.println("收到信息：" + msg);
    }
}
