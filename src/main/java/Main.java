import third.WordFinderImpl;
import third.WordFinderUser;

import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) {
        WordFinderUser wordFinderUser = new WordFinderUser(new WordFinderImpl());
        try {
            wordFinderUser.doWork("some", "word");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
