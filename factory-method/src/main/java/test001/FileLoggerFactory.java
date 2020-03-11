package test001;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/2/17 15:26
 */
public class FileLoggerFactory implements LoggerFactory {

    public Logger createLogger() {
        return new FileLogger();
    }
}
