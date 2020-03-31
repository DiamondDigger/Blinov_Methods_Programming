package FouthChapter.exercises.taskA_1;

public class Runner {
    public static void main(String[] args) {
        Sentence sentence = new Sentence();
        Word horse = new Word("Horse");
        Word was = new Word("was");
        Word ridden = new Word("ridden");
        Word by = new Word("by");
        Word man = new Word("man");
        Sentence.addWord(horse);
        sentence.addWord(was);
        sentence.addWord(ridden);
        sentence.addWord(by);
        sentence.addWord(man);

        sentence.addDot(true);
        System.out.println(sentence);
    }
}
