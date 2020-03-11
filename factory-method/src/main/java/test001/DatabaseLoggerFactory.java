package test001;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/2/17 15:19
 */
public class DatabaseLoggerFactory implements LoggerFactory {

    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
