package test001;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/2/17 15:19
 */
public class Main {
    public static void main(String[] args) {
        LoggerFactory databaseFactory = new DatabaseLoggerFactory();
        Logger databaseLogger = databaseFactory.createLogger();
        LoggerFactory fileFactory = new FileLoggerFactory();
        Logger fileLogger = fileFactory.createLogger();

        databaseLogger.writeLog();
        fileLogger.writeLog();

    }
}
