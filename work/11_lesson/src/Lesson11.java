import inheritance.Computer;
import inheritance.ServerComputer;
import inheritance.SuperComputer;

public class Lesson11 {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCpu("Intel");
        computer.setGraphics("gtx");
        computer.setModel("xxx");
        computer.setRamSize(1024);
        computer.setStorageSize(520);


//        computer.printSpecifications();
//        String spec = computer.geSpecifications();
//        System.out.println(computer.getClass().getCanonicalName());

        ServerComputer serverComputer = new ServerComputer();
        serverComputer.setCpu("Intel");
        serverComputer.setGraphics("gtx");
        serverComputer.setModel("xxx");
        serverComputer.setRamSize(1024);
        serverComputer.setStorageSize(520);
//        serverComputer.setServerType("SERVER-A");

//        serverComputer.printSpecifications();
//        String spec2 = serverComputer.geSpecifications();
//        serverComputer.printServerType();
//        System.out.println(serverComputer.getClass().getCanonicalName());

//        String a = "sdaf";
//        Computer computer2 = serverComputer;
//        System.out.println(computer2.getClass().getCanonicalName());
//        computer2.printServerType();
//        computer2 = computer;
//        computer2 = a;
//        if (computer2 instanceof ServerComputer) {
//            ServerComputer serverComputer3 = (ServerComputer) new Object();
//
//        }
//

    Computer[] computers = new Computer[2];
    computers[0] = serverComputer;
    computers[1] = computer;
    for (Computer c : computers) {
        c.printSpecifications();
        c.geSpecifications();
        if (c instanceof ServerComputer) {
            ((ServerComputer) c).printServerType();
        }
        ServerComputer sc = (ServerComputer) computer;

        Home home = new CoolHome();

        System.out.println(CoolHome.PI);
//        CoolHome.PI = 5;
//        Home home1 = new Home();
    }

}
}
