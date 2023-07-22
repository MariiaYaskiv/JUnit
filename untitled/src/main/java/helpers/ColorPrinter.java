package helpers;

import org.apache.logging.log4j.Logger;

import static helpers.ConsoleColors.*;

public class ColorPrinter {
    public static void printMessageInYellow(String message) {

        System.out.println(YELLOW + message + RESET);
    }

    public static void printColorMessage(String message, Logger logger, Level level) {
        switch (level) {
            case INFO:
                logger.info(GREEN_BOLD + message + RESET);
                break;
            case DEBUG:
                logger.debug(BLUE_BOLD + message + RESET);
                break;
            case ERROR:
                logger.error(RED_BRIGHT + message + RESET);
        }
    }


}
