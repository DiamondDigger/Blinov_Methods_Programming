package SecondChapter;


public class StringExample {
    public static void main(String[] args) {
        String element = "hello";
        element += '2';
        element += "001";
        element += "/" + 001 + "\n";
        element = element + 5;
        element += 3.1233 + "\n" + 353434;
        System.out.println(element);

        //вывод строки String с помощью литерала
        String number = "123456789";
        for (int i =number.length() ; i >0 ; i--) {
            System.out.println(number.charAt(i-1)+"\n");
            System.out.println(number= number.replace(number.charAt(i-1), '0'));
            System.out.println("___________________________");
        }
    }
}