/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/2/18 17:39
 */
public abstract class Database {

    protected Trans trans;

    public Database(Trans trans) {
        this.trans = trans;
    }

    public abstract String trans();

}
