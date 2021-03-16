package by.shag.lesson21.golatina;

public class Runner {

    public static void main(String[] args) {

        String str1 = "!!!!Для конвертации массива символов в строку, необходимо создать ?.,       эту строку из массива символов. F .,:;-M";

        ListManager strList = new ListManager("!!!!Для конвертации массива символов в строку, необходимо создать эту строку из массива символов. F .,:;-M");

        System.out.println("Исходник:\n" + str1);
        System.out.println("\nМетод создает лист строк и сортирует его по длине слов. Класс компаратор создать как отдельный top-level класс (отдельный файл):\n"
                + ListManager.sortStringByLengthWords(str1));
        System.out.println("\nМетод создает лист строк и сортирует его по первой букве слова. Класс компаратор создать как static nested в этом же классе:\n"
                + ListManager.sortStringByAlphabetFirstLetter(str1));
        System.out.println("\nМетод создает лист строк и сортирует его по последней букве слова. Класс компаратор создать как inner класс (не статик):\n"
                + strList.sortStringByAlphabetLastLetter());
        System.out.println("\nМетод создает лист строк и сортирует его по длине слов в обратном порядке. Класс компаратор создать как local класс (в методе):\n"
                + ListManager.sortStringByLengthWordsReverse(str1));
        System.out.println("\nМетод создает лист строк и сортирует его по первой букве в обратном порядке. Класс компаратор создать как анонимный класс:\n"
                + ListManager.sortStringByAlphabetFirstLetterReverse(str1));
        System.out.println("\nМетод создает лист строк и сортирует его по по последней букве слова в обратном порядке. Класс создать с помощью lambda функции:\n"
                + strList.sortStringByAlphabetLastLetterReverse());

    }

}
