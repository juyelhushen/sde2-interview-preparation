package low_level_design.logger.strategy.formater;

import low_level_design.logger.entity.LogEvent;

public interface FormatStrategy {
    String format(LogEvent event);
}
