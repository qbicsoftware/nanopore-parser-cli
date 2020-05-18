package life.qbic.cli;

import java.nio.file.Path;
import java.util.Map;
import life.qbic.utils.NanoporeParser;
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
        LOG.debug("Starting Nanopore tool");
        Map NanoporeOutputMap = runNanoporeParser(command.path);
        System.out.println(NanoporeOutputMap);
        LOG.debug("Ending Nanopore tool");
    }
    //ToDo Switch Map for NanoporeExperiment as soon as it works
    private Map runNanoporeParser(Path path) {

        Map nanoporeOutputMap = NanoporeParser.parseFileStructure(path);
        return nanoporeOutputMap;

        //OxfordNanoporeExperiment oxfordNanoporeExperiment = NanoporeParser.parseFileStructure(path);
        // return oxfordNanoporeExperiment;
    }

    // TODO: override the shutdown() method if you are implementing a daemon and want to take advantage of a shutdown hook for clean-up tasks
}
