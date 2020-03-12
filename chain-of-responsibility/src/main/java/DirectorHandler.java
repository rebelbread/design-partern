/**
 * @author zhiwj
 * @Description:
 * @date 2020-03-11 22:05
 */
public class DirectorHandler extends Handler {


    public void handlerRequest(Integer request) {
        if (request <= 3) {
            System.out.println("主任通过");
        } else {
            this.successor.handlerRequest(request);
        }
    }
}
