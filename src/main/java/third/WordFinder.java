package third;

import java.net.URL;
import java.util.Set;

public interface WordFinder {
    public Set<String> getSentences(URL resource);

    public boolean checkIfWordInSentence(String sentence, String word);

    public void writeSentenceToResult(String sentence);
}
