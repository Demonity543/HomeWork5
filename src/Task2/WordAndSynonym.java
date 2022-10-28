package Task2;

import java.util.ArrayList;

class WordAndSynonym {
    private String mainWord = "";
    private ArrayList<String> synonms = new ArrayList<>(0);
    private String mainTranslation = "";

    WordAndSynonym(String... wordAndSynonyms) {
        if (wordAndSynonyms.length != 0) {
            this.mainWord = wordAndSynonyms[0];
            synonms = new ArrayList<>(wordAndSynonyms.length - 2);
            for (int i = 1; i < wordAndSynonyms.length - 1; i++) {
                synonms.add(wordAndSynonyms[i]);
            }
            this.mainTranslation = wordAndSynonyms[wordAndSynonyms.length - 1];
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        WordAndSynonym that = (WordAndSynonym) o;
        return mainWord.equals(that.mainWord);
    }

    @Override
    public int hashCode() {
        return mainWord.hashCode();
    }

    public String getMainWord() {
        return mainWord;
    }

    public void setMainWord(String mainWord) {
        this.mainWord = mainWord;
    }

    public ArrayList<String> getSynonms() {
        return synonms;
    }

    public void setSynonms(ArrayList<String> synonms) {
        this.synonms = synonms;
    }

    public String getMainTranslation() {
        return mainTranslation;
    }

    public void setMainTranslation(String mainTranslation) {
        this.mainTranslation = mainTranslation;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String tmp : synonms)
            stringBuilder.append(tmp).append(", ");
        return mainWord + " [" + stringBuilder.toString() + "]\nTranslate - " +
                mainTranslation;
    }
}