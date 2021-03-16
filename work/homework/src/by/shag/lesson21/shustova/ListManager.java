package by.shag.lesson21.shustova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListManager {

    private static List<String> listManager = new ArrayList<>();

    //1.Метод создает лист строк и сортирует его по длине слов.
    //Компаратор ManagerSortLenghtComparatorотдельный как top-level класс (отдельный файл).
    public void setListFirstTask(String manager) {
        listManager.add(manager);
        Collections.sort(listManager, new ManagerSortLenghtComparator());
    }

    //2.Класс компаратор создать как static nested
    // сортирует по первой букве слова
    public static class ManagerSortAlphaComparator implements Comparator<String> {

        @Override
        public int compare(String manager1, String manager2) {
            char char1 = manager1.charAt(0);
            char char2 = manager2.charAt(0);
            return Character.compare(char1, char2);
        }
    }

    public void setListWithStatic(String manager) {
        listManager.add(manager);
        Collections.sort(listManager, new ManagerSortAlphaComparator());
    }

    //3.Класс компаратор создать как inner класс (не статик)
    // сортирует по последней букве слова.
    public class ManagerSortLastAlphaComparator implements Comparator<String> {

        @Override
        public int compare(String manager1, String manager2) {
            int i1 = manager1.length() - 1;
            int i2 = manager2.length() - 1;
            char char1 = manager1.charAt(i1);
            char char2 = manager2.charAt(i2);
            return Character.compare(char1, char2);
        }
    }

    public void setListWithInner(String manager) {
        listManager.add(manager);
        Collections.sort(listManager, new ManagerSortLastAlphaComparator());
    }

    //4. Класс компаратор создать как local класс (в методе).
    // сортирует его по длине слов в обратном порядке
    public void setListLocal(String manager) {

        class ManagerSortReverceLenComparator implements Comparator<String> {

            @Override
            public int compare(String manager1, String manager2) {
                return -1 * (manager1.length() - manager2.length());
            }
        }
        listManager.add(manager);
        Collections.sort(listManager, new ManagerSortReverceLenComparator());
    }

    //5. Класс компаратор создать как анонимный класс.
    //сортирует по первой букве в обратном порядке.
    public void setListAnonym(String manager) {
        listManager.add(manager);

        Collections.sort(listManager, new Comparator<String>() {

            @Override
            public int compare(String manager1, String manager2) {
                char char1 = manager1.charAt(0);
                char char2 = manager2.charAt(0);
                return -1 * Character.compare(char1, char2);
            }
        });
    }

    public List<String> getListManager() {
        return listManager;
    }
}
