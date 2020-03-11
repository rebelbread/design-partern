/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/2/18 17:46
 */
public class Main {
    public static void main(String[] args) {
        Database mysqlDatabase = new MysqlDatabase(new PdfTrans());
        Database oracleDatabase = new OracleDatabase(new TxtTrans());
        System.out.println(mysqlDatabase.trans());
        System.out.println(oracleDatabase.trans());

    }
}
