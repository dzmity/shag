package by.shag.lesson21.shustova;

public class Runner {

    public static void main(String[] args) {
        ListManager listManager = new ListManager();

        /*listManager.setListFirstTask("Antonov");
        listManager.setListFirstTask("Antipov");
        listManager.setListFirstTask("Komissarova");
        listManager.setListFirstTask("Satrap");
        listManager.setListFirstTask("Tokarev");
        listManager.setListFirstTask("Kalashnikoff");*/


        listManager.setListAnonym("Antipov");
        listManager.setListAnonym("Komissarova");
        listManager.setListAnonym("Satrap");
        listManager.setListAnonym("Tokarev");
        listManager.setListAnonym("Kalashnikoff");

        /*listManager.setListWithStatic("Antonov");
        listManager.setListWithStatic("Komissarova");
        listManager.setListWithStatic("Satrap");
        listManager.setListWithStatic("Tokarev");
        listManager.setListWithStatic("Kalashnikoff");*/

        /*listManager.setListWithInner("Kalashnikoff");
        listManager.setListWithInner("Satrap");
        listManager.setListWithInner("Komissarova");
        listManager.setListWithInner("Antonov");*/

        /*listManager.setListLocal("Kalashnikoff");
        listManager.setListLocal("Satrap");
        listManager.setListLocal("Antonov");
        listManager.setListLocal("Tokarev");
        listManager.setListLocal("Antipov");*/

        System.out.println(listManager.getListManager());
    }
}
