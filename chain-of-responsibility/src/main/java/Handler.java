/**
 * @author zhiwj
 * @Description:
 * @date 2020-03-11 22:03
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handlerRequest(Integer request);

}
