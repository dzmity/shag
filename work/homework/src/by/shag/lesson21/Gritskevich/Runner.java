package by.shag.lesson21.Gritskevich;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        ListManager listManager = new ListManager();

        List<String> listOfString1 = listManager.createStringArrayListWithSortWordLength();
        System.out.println(listOfString1);

        List<String> listOfString2 = listManager.createStringArrayListWithSortFirstChar();
        System.out.println(listOfString2);

        List<String> listOfString3 = listManager.createStringArrayListWithSortLastChar();
        System.out.println(listOfString3);

        List<String> listOfString4 = listManager.createStringArrayListWithSortWordLengthInvert();
        System.out.println(listOfString4);

        List<String> listOfString5 = listManager.createStringArrayListWithSortFirstCharInvert();
        System.out.println(listOfString5);

        List<String> listOfString6 = listManager.createStringArrayListWithSortLastCharInvert();
        System.out.println(listOfString6);
    }
}
