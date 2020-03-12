/**
 * @author zhiwj
 * @Description:
 * @date 2020-03-11 22:05
 */
public class Main {
    /**
     * Sunny软件公司的OA系统需要提供一个假条审批模块：
     * 如果员工请假天数小于3天，主任 可以审批该假条；
     * 如果员工请假天数大于等于3天，小于10天，经理可以审批；
     * 如果员工 请假天数大于等于10天，小于30天，总经理可以审批；
     * 如果超过30天，总经理也不能审 批，提示相应的拒绝信息。
     * 试用职责链模式设计该假条审批模块。
     */
    public static void main(String[] args) {
        Handler directorHandler = new DirectorHandler();
        Handler managerHandler = new ManagerHandler();
        Handler primeManagerHandler = new PrimeManagerHandler();
        directorHandler.setSuccessor(managerHandler);
        managerHandler.setSuccessor(primeManagerHandler);

//        directorHandler.handlerRequest(1);
        directorHandler.handlerRequest(5);

    }
}
