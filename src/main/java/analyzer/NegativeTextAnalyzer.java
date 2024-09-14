package main.java.analyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer{

    @Override
    public Label processText(String text) {
        StringBuilder textLines = new StringBuilder(text);
        if (text.matches(".*(?:=\\(|:\\(|:\\|).*")){
            return Label.NEGATIVE_TEXT;
        }
        return Label.OK;
    }

    @Override
    protected String[] getKeywords() {
        return new String[]{":(", "=(", ":|"};
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
