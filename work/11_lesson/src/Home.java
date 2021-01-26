public abstract class Home {

    {
        doorsQuantity = 3;
        windowsQuantity = 5;
        rootType = "металопрофиль";
    }

    private int doorsQuantity;
    private int windowsQuantity;
    private String rootType = setRotType("dsf");


//    private int doorsQuantity = 1;
//    private int windowsQuantity = 2;
//    private String rootType = "черепице";




    public Home(int doorsQuantity, int windowsQuantity, String rootType) {
        this.doorsQuantity = doorsQuantity;
        this.windowsQuantity = windowsQuantity;
        this.rootType = rootType;
    }

    public Home() {
        doorsQuantity = 55;
    }

    private final String setRotType(String rootType) {
        return rootType;
    }
}
