/**
 * @author zhiwj
 * @Description:
 * @date 2020-03-11 22:08
 */
public class ManagerHandler extends Handler {

    public void handlerRequest(Integer request) {
        if (request <= 10) {
            System.out.println("总经理通过");
        } else {
            this.successor.handlerRequest(request);
        }
    }
}
