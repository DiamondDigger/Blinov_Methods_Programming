package FouthChapter.exercises.taskA_1;


public class Sentence {
    private String words="";
    private String word="";
    private String newWord;

    public Sentence() {
    }

    public void addWord(Word word) {
        this.words += " " + word.toString();
    }

    public void addWord(boolean firstWord, Word word){
        this.words += " " + word.toString().replace(word.toString().charAt(0),
                Character.toUpperCase(word.toString().charAt(0)));
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

