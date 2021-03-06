package im.actor.sdk.controllers.conversation.messages.content.preprocessor;

public class PreprocessedList {

    private final PreprocessedData[] preprocessedData;

    public PreprocessedList(PreprocessedData[] preprocessedData) {
        this.preprocessedData = preprocessedData;
    }

    public PreprocessedData[] getPreprocessedData() {
        return preprocessedData;
    }
}
