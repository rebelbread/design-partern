/**
 * @author zhiwj
 * @Description:
 * @date 2020-03-11 22:09
 */
public class PrimeManagerHandler extends Handler {

    public void handlerRequest(Integer request) {
        if (request <= 30) {
            System.out.println("总经理通过");
        } else {
            System.out.println("不能通过");
        }
    }
}
