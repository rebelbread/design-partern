/**
 * @author zhiwj
 * @Description:
 * @date 2020-03-11 22:55
 */
public class Main {
    public static void main(String[] args) {
        CalculatorForm calculatorForm = new CalculatorForm();
        calculatorForm.setCommand(new AdderCommand());
        calculatorForm.execute(1);
        calculatorForm.execute(2);
        calculatorForm.execute(3);
        calculatorForm.undo();
        calculatorForm.undo();
        calculatorForm.undo();
        calculatorForm.undo();
        calculatorForm.redo();
        calculatorForm.redo();
        calculatorForm.redo();
        calculatorForm.redo();
        calculatorForm.undo();
        calculatorForm.redo();
    }
}
