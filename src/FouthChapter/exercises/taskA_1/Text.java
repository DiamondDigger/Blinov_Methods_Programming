package FouthChapter.exercises.taskA_1;

public class Text {

    private String text ="";

    public Text() {
    }

    public void addText(Sentence sentence){
        this.text +=sentence.toString()+" ";
    }

    @Override
    public String toString() {
        return text;
    }
}
