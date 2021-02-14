import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lesson16 {

    public static void main(String[] args) {
        // Работа с коллекциями

        //  Создать список  покупок, необходимых сделать в магазине (каждый кол-вом = 1)
        Collection<String> shopList = new ArrayList<>();
        //  Наполнить этот список по одному  5-7 товарами
        shopList.add("Brad");
        shopList.add("Fish");
        shopList.add("Milk");
        shopList.add("Beer");
        shopList.add("Chips");
        shopList.add("Nuts");
        //  Вывести на экран кол-во этих покупок
        System.out.println(shopList.size());
        //  Сходить к соседу и спросить,  нужно ли ему что-то купить (получить список)
        Collection<String> neighborShopList = new LinkedList<>();
        neighborShopList.add("Wisky");
        neighborShopList.add("Cola");
        //  Вывести на экран кол-во этих покупок
        System.out.println(neighborShopList.size());
        //  Добавить покупки соседа в свой список покупок
        shopList.addAll(neighborShopList);
        //  Вывести на экран кол-во этих покупок
        System.out.println(shopList.size());
        //  Идем в магазин
        //  Создать список того, что удалось купить в магазине
        Collection<String> canBoughtList = new HashSet<>();
        //  Вывести на экран, пустой ли он пока
        System.out.println(canBoughtList.isEmpty());
        //  Добавить в этот список те продукты, которые удалось купить
        canBoughtList.add("Brad");
        canBoughtList.add("Milk");
        canBoughtList.add("Beer");
        canBoughtList.add("Chips");
        //  Вывести на экран, пустой ли он теперь
        System.out.println(canBoughtList.isEmpty());
        //  Вывести на экран, покупали ли мы только то, что собирались
        System.out.println(shopList.containsAll(canBoughtList));
        //  Стояли на кассе и купили жвачку. Добавили ее во второй список
        canBoughtList.add("Orbit");
        //  Проверяем, была ли жвачка в списке покупок
        System.out.println(shopList.containsAll(canBoughtList));
        System.out.println(shopList.contains("Orbit"));
        //  Понимаем, что не собирались ее покупать и выкидываем из корзины
        canBoughtList.remove("Orbit");
        canBoughtList.remove("Dirol");
        //  Рассчитываемся на кассе. Вычеркиваем из первого списка все , что купили, чтобы понять, что еще осталось
        shopList.removeAll(canBoughtList);
        //  Выводим на экан кол-во товаров, которое не удалось купить в магазине
        System.out.println(shopList.size());
        //  Чистим второй список.
        canBoughtList.clear();
        // Выводим на экран, пустой ли он теперь
        System.out.println(canBoughtList.isEmpty());
        //  Пробегаемся "глазами" по списку еще раз и выводим на экран каждую покупку с новой строки
        System.out.println(shopList);
        for (int i = 0; i < shopList.size(); i++) {
            //
        }

        for (String buy: shopList) {
            if (buy.equals("Fish")) {
//                shopList.remove(buy);
            }
            System.out.println(buy);
        }

        Iterator<String> iterator = shopList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //  Пробегаемся "глазами" по списку еще раз и удаляем ни так уж и нужное в списке
        System.out.println("--------------------");
        for ( Iterator<String> i = shopList.iterator(); i.hasNext(); ) {
            String buy = i.next();
            if (buy.equals("Fish")) {
                i.remove();
            } else {
                System.out.println(buy);
            }
        }
        System.out.println(shopList);
        // Превращаем список в массив
        Object[] object =  shopList.toArray();



        // Поработаем с листом
        List<String> shopList1 = new ArrayList<>();
        //  Наполнить этот список по одному  5-7 товарами
        shopList1.add("Brad"); // 0
        shopList1.add("Fish"); // 1
        shopList1.add("Milk"); // 2
        shopList1.add("Beer"); // 3
        shopList1.add(9, "123");

        // Вставить в середину списка
        shopList1.add(2, "Beer");
        System.out.println(shopList1);
        // Заменить 3-ий элемент
        shopList1.set(2, "Chips");
        System.out.println(shopList1);
        // Вывести первый, третий, последний элемент
        System.out.println(shopList1.get(0));
        System.out.println(shopList1.get(2));
        System.out.println(shopList1.get(4));
        // Удаляем 0
        shopList1.remove(0);
        // Выводим все продукты на экран
        System.out.println(shopList1);
        // Удаляем 0
        shopList1.remove(0);
        // Выводим все элементы на экран
        System.out.println(shopList1);
        // Вывести индекс конкретной покупки
        System.out.println(shopList1.indexOf("Beer"));
        shopList1.add("Beer");
        System.out.println(shopList1);
        System.out.println(shopList1.indexOf("Beer"));
        // Вывести последний индекс конкретной покупки
        System.out.println(shopList1.lastIndexOf("Beer"));

        for (int i = 0; i < shopList1.size(); i++) {
            System.out.println(shopList1.get(i));
        }

        // ArrayList и capacity
        ArrayList<String> arrayList = new ArrayList<>(20);

        // (N * 3) / 2 + 1, где N – текущее значение capacity.
        ArrayList<String> list = new ArrayList<>(10);
        //  Чистим список.
        // trimToSize()
        // ensureCapacity(N)


        // LinkedList - двухсвязный список ( List, Dequeue и Queue)
        LinkedList<String> linkedList = new LinkedList<>();
        // addLast(value)
        // addFirst(value)
        // removeLast() и removeFirst()
        // descendingIterator()

        // Поработаем с сетом
        // Разница с добавлением списком соседа

        // Поработаем с очередью


        // Поработаем с мапой
        //  Создать список  покупок, необходимых сделать в магазине (каждый кол-вом >= 1)
        // Разница с добавлением списком соседа



//        Collections.copy() копирует одну коллекцию в другую;
//        Collections.sort() сортирует коллекцию;
//        Collections.max() возвращает максимальный элемент коллекции;
//        Collections.min() возвращает минимальный элемент коллекции;
//        Collections.reverse() обращает порядок элементов коллекции с конца в начало;
    }
}
