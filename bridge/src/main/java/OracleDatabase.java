/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/2/18 17:43
 */
public class OracleDatabase extends Database {
    public OracleDatabase(Trans trans) {
        super(trans);
    }

    public String trans() {
        String transform = this.trans.transform();
        return "oracle " + transform;
    }


}
