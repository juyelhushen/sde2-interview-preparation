package low_level_design.logger.strategy.appenders;

import low_level_design.logger.entity.LogEvent;
import low_level_design.logger.strategy.formater.FormatStrategy;

import java.io.PrintStream;

public final class ConsoleAppenderStrategy implements AppenderStrategy {
//    public static final ConsoleAppenderStrategy INSTANCE = new ConsoleAppenderStrategy();

    private final PrintStream output;
    private final FormatStrategy formatStrategy;

    public ConsoleAppenderStrategy(PrintStream output, FormatStrategy formatStrategy) {
        this.output = output;
        this.formatStrategy = formatStrategy;
    }

    @Override
    public void append(LogEvent event) {
        output.println(formatStrategy.format(event));
    }
}
