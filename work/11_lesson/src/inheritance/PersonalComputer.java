package inheritance;

public class PersonalComputer extends Computer {
    int usbSocketQuantity;

    public int getUsbSocketQuantity() {
        return usbSocketQuantity;
    }

    public void setUsbSocketQuantity(int usbSocketQuantity) {
        this.usbSocketQuantity = usbSocketQuantity;
    }

    public void printUsbQuantity() {
        System.out.println("usb socket quantity = " + this.usbSocketQuantity);
    }
}
