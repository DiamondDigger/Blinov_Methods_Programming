package FouthChapter.exercises.taskA_1;

public class Sentence {
    private String completeSentence;
    private String words;

    public Sentence() {
    }

    public void addWord(Word word) {
        this.words += " " + word;
    }

    public void addDot(boolean end) {
        if (end) {
            words += ".";
        }
    }
}

