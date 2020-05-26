package life.qbic.cli;

import java.nio.file.Path;
import java.util.Map;
import life.qbic.datamodel.datasets.OxfordNanoporeExperiment;
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
        LOG.info("Executing NanoporeParser to validate Directory");
        try {
            OxfordNanoporeExperiment nanoporeOutputExperiment = runNanoporeParser(command.path);
            LOG.info("Validation process executed successfully");
        } catch (Exception e) {
            LOG.error(e.getMessage());
        }
    }
    private OxfordNanoporeExperiment runNanoporeParser(Path path) {

        OxfordNanoporeExperiment nanoporeOutputExperiment = NanoporeParser.parseFileStructure(path);
        return nanoporeOutputExperiment;
    }
}
