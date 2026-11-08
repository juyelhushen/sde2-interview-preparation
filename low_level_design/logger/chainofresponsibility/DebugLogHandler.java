package low_level_design.logger.chainofresponsibility;

import low_level_design.logger.enums.LogLevel;
import low_level_design.logger.strategy.appenders.AppenderStrategy;
import low_level_design.logger.strategy.formater.FormatStrategy;

// Concrete handlers are trivial — all logic is in the abstract base.
// Their only job is to declare which level they own.
public class DebugLogHandler extends LogHandler {


    public DebugLogHandler(LogLevel level, AppenderStrategy appenderStrategy, FormatStrategy formatStrategy) {
        super(level, appenderStrategy, formatStrategy);
    }


}
