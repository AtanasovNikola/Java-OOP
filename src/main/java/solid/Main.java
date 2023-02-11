package solid;


import solid.enums.ReportLevel;
import solid.impl.factories.LoggerFactory;
import solid.interfaces.Logger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputParser inputParser = new InputParser();
        Scanner scanner = new Scanner(System.in);
        LoggerFactory loggerFactory = new LoggerFactory();

        Logger logger = loggerFactory.produce(inputParser.readLoggerInfo(scanner));

        String input = scanner.nextLine();

        while (!"END".equals(input)) {
            String[] tokens = input.split("\\|");

            ReportLevel reportLevel = ReportLevel.valueOf(tokens[0]);
            String time = tokens[1];
            String message = tokens[2];

            switch (reportLevel) {
                case INFO -> logger.logInfo(time, message);
                case WARNING -> logger.logWarning(time, message);
                case ERROR -> logger.logError(time, message);
                case CRITICAL -> logger.logCritical(time, message);
                case FATAL -> logger.logFatal(time, message);
            }

            input = scanner.nextLine();
        }

        System.out.println(logger);
    }
}
