package third;

import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;

public class WordFinderImpl implements WordFinder {

    @Override
    public HashSet<String> getSentences(URL resource) {
        //Какая-то реализация
        return new HashSet<>(Arrays.asList("Один", "Два", "Три"));


    }

    @Override
    public boolean checkIfWordInSentence(String sentence, String word) {
        return true;
    }

    @Override
    public void writeSentenceToResult(String sentence) {

    }
}
