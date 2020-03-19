package ThirdChapter.examples;

public class RunnerMessage {
    public static void main(String[] args) {
        Message<String> stringMessage = new Message<String>();
        stringMessage.setValue("Some text could be here");
        System.out.println(stringMessage.getValue());
        System.out.println("stringMessage: "+stringMessage);
        String valueString = stringMessage.getValue();
        System.out.println("valueString is: "+ valueString);

        Message<Integer> integerMessage = new Message<>(404);
        System.out.println(integerMessage.getValue());
        System.out.println("integerMessage: "+integerMessage);
        int value = integerMessage.getValue();
        System.out.println("valueInt is: "+ value);

        Message objectMessage = new Message();
        objectMessage.setValue("String in object");
        System.out.println("objectMessage: "+objectMessage);

        objectMessage.setValue(123l);
        System.out.println(objectMessage);
        objectMessage.setValue("Java is there");
        System.out.println(objectMessage);
        objectMessage.setValue((byte)13);
        System.out.println(objectMessage);
        Number number = new Integer(12);
        System.out.println( number.floatValue());
    }
}
