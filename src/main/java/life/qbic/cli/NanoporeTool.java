package life.qbic.cli;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Implementation of nanopore-parser-cli. Its command-line arguments are contained in instances of {@link NanoporeCommand}.
 */
public class NanoporeTool extends QBiCTool<NanoporeCommand> {

    private static final Logger LOG = LogManager.getLogger(NanoporeTool.class);

    /**
     * Constructor.
     *
     * @param command an object that represents the parsed command-line arguments.
     */
    public NanoporeTool(final NanoporeCommand command) {
        super(command);
    }

    @Override
    public void execute() {
        // get the parsed command-line arguments
        final NanoporeCommand command = super.getCommand();

        // TODO: do something useful with the obtained command.
        //

    }

    // TODO: override the shutdown() method if you are implementing a daemon and want to take advantage of a shutdown hook for clean-up tasks
}
