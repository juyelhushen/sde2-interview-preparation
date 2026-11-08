package low_level_design.logger.chainofresponsibility;

import low_level_design.logger.enums.LogLevel;
import low_level_design.logger.strategy.appenders.AppenderStrategy;
import low_level_design.logger.strategy.formater.FormatStrategy;

public class ErrorLogHandler extends LogHandler {

    public ErrorLogHandler(LogLevel level, AppenderStrategy appenderStrategy, FormatStrategy formatStrategy) {
        super(level, appenderStrategy, formatStrategy);
    }
}