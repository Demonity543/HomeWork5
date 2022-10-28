package Task2;

import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<WordAndSynonym> rusEngDictionary = new TreeSet<>(new Comparator<WordAndSynonym>() {
            @Override
            public int compare(WordAndSynonym o1, WordAndSynonym o2) {
                return o1.getMainWord().compareTo(o2.getMainWord());
            }
        });
        Charset encoding = Charset.defaultCharset();
        rusEngDictionary.add(new WordAndSynonym("крісло", "табуретка", "chair"));
        rusEngDictionary.add(new WordAndSynonym("диван", "антрисоль", "sofa"));
        WordAndSynonym search = new WordAndSynonym();
        search.setMainWord("стіл");
        if (rusEngDictionary.contains(search)) {
            System.out.println(rusEngDictionary.floor(search));
        } else {
            System.out.printf("this world \'%s\' not found\n", search.getMainWord(), encoding);
        }
        search.setMainWord("крісло");
        if (rusEngDictionary.contains(search)) {

            System.out.println(rusEngDictionary.floor(search));
        } else {
            System.out.printf("this world \'%s\' not found\n", search.getMainWord());
        }
    }
}
