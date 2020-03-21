/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/3/21 17:26
 */
public class Main {

    public static void main(String[] args) {
        Stock stock = new Stock();
        Person person = new Person();
        stock.register(person);

        stock.notice("sdf");

    }
}
