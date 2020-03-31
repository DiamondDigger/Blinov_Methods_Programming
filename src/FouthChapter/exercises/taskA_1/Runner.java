package FouthChapter.exercises.taskA_1;

public class Runner {
    public static void main(String[] args) {
        Text text = new Text();
        Sentence sentence = new Sentence();
        Sentence sentence1 = new Sentence();

        Word has = new Word("has");
        Word a_ride = new Word("a ride");

        Word horse = new Word("horse");
        Word was = new Word("was");
        Word ridden = new Word("ridden");
        Word by = new Word("by");
        Word the = new Word("the");
        Word man = new Word("man");

        sentence.addWord(true, horse);
        sentence.addWord(was);
        sentence.addWord(ridden);
        sentence.addWord(by);
        sentence.addWord(the);
        sentence.addWord(man);

        sentence1.addWord(true, man);
        sentence1.addWord(has);
        sentence1.addWord(a_ride);

        sentence.addDot(true);
        sentence1.addDot(true);

        text.addText(sentence);
        text.addText(sentence1);

        System.out.println(text);

    }
}
