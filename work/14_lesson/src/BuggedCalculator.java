import java.io.IOException;
import java.rmi.AccessException;
import java.rmi.RemoteException;

public class BuggedCalculator {


    public static int division(int firstArgument, int secondArgument) {
        return firstArgument / secondArgument;
    }

    public static void makeException() throws Exception {
        throw new AccessException("Я ошибка. Я создалась");
    }

    public static void makeRuntimeException() {
        throw new RuntimeException("Я ошибка. Я создалась");
    }

    public void makeNotStaticException() throws RemoteException {

        throw new RemoteException("Я ошибка. Я создалась");
    }

    public void makeNotStaticException(int value) throws IOException, RemoteException {

        if (value > 0) {
            throw new RemoteException("Я ошибка. Я создалась");
        }
        throw new IOException("123");
    }
}
