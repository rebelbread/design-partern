/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/2/18 14:23
 */
public class Main {
    public static void main(String[] args) {
        DatabaseAdapter databaseAdapter = new DatabaseAdapter(new Encrypt());
        databaseAdapter.save();
    }
}
