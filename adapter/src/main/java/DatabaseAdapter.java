/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/2/18 14:23
 */
public class DatabaseAdapter extends DatabaseOperate {

    private Encrypt encrypt;

    public DatabaseAdapter(Encrypt encrypt) {
        this.encrypt = encrypt;
    }

    @Override
    public void save() {
        encrypt.encrypt();
        super.save();
    }
}
