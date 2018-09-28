package third;

import java.net.URL;
import java.util.HashSet;

public interface WordFinder {
    public HashSet<String> getSentences(URL resource);

    public boolean checkIfWordInSentence(String sentence, String word);

    public void writeSentenceToResult(String sentence);
}
