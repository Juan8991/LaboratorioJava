package utilities;
import org.jboss.logging.Logger;

/**
 * Esta clase se usa para configurar el logger
 */
public class MessagesWithJboss {
    private Logger logger = Logger.getLogger(MessagesWithJboss.class);
    public void printMessage(String text){
        logger.info(text);
    }
}
