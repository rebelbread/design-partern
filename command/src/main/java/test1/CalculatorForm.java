package test1;

/**
 * @author zhiwj
 * @Description:
 * @date 2020-03-11 22:49
 */
public class CalculatorForm {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute(int value){
        int execute = command.execute(value);
        System.out.println("计算结果:" + execute);
    }

    public void undo(){
        int undo = command.undo();
        System.out.println("撤销计算结果:" + undo);
    }

    public void redo(){
        int undo = command.redo();
        System.out.println("恢复计算结果:" + undo);
    }

}
