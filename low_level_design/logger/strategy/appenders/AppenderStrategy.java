package low_level_design.logger.strategy.appenders;

import low_level_design.logger.entity.LogEvent;

public interface AppenderStrategy {
    void append(LogEvent event);
}
