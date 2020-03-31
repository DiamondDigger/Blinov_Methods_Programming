package FouthChapter.exercises.taskA_1;

public class Runner {
    public static void main(String[] args) {
        Sentence sentence = new Sentence();
        Word horse = new Word("Horse");
        Word was = new Word("was");
        Word ridden = new Word("ridden");
        Word by = new Word("by");
        Word the = new Word("the");
        Word man = new Word("man");
        sentence.addWord(horse);
        sentence.addWord(was);
        sentence.addWord(ridden);
        sentence.addWord(by);
        sentence.addWord(the);
        sentence.addWord(man);

        sentence.addDot(true);
        System.out.println(sentence);
    }
}
