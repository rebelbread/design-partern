/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/2/18 17:43
 */
public class MysqlDatabase extends Database {
    public MysqlDatabase(Trans trans) {
        super(trans);
    }

    public String trans() {
        String transform = this.trans.transform();
        return "mysql " + transform;
    }


}
