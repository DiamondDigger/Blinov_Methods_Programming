package FouthChapter.exercises.taskA_1;

public class Sentence {
    private String words="";

    public Sentence() {
    }

    public void addWord(Word word) {
        this.words += " " + word.toString();
    }

    public void addDot(boolean end) {
        if (end) {
            words += ".";
        }
    }

    @Override
    public String toString() {
        return words;
    }
}

