package by.shag.java;

import java.time.LocalDate;

public class Runner {

    private static final Integer VKUSNOE_MILK_CODE = 1111;
    private static final Integer KOROVKA_MILK_CODE = 1112;
    private static final Integer MOLOKO_MILK_CODE = 1113;
    private static final Integer BREAD_CODE = 2222;
    private static final Integer BATON_BREAD_CODE = 2223;

    public static void main(String[] args) {
        Milk milk1 = new Milk();
        milk1.setName("Vkusnoe");
        milk1.setBrand(MilkBrand.BREST_LITOVSKOE);
        milk1.setTare(Tare.BOTTLE);
        milk1.setVolume(1.0);
        milk1.setCode(VKUSNOE_MILK_CODE);
        milk1.setExpirationDate(LocalDate.of(2021, 3, 11));

        Milk milk2 = new Milk();
        milk2.setName("Vkusnoe");
        milk2.setBrand(MilkBrand.BREST_LITOVSKOE);
        milk2.setTare(Tare.BOTTLE);
        milk2.setVolume(1.0);
        milk2.setCode(VKUSNOE_MILK_CODE);
        milk2.setExpirationDate(LocalDate.of(2021, 3, 10));

        Milk milk3 = new Milk();
        milk3.setName("Vkusnoe");
        milk3.setBrand(MilkBrand.BREST_LITOVSKOE);
        milk3.setTare(Tare.BOTTLE);
        milk3.setVolume(1.0);
        milk3.setCode(VKUSNOE_MILK_CODE);
        milk3.setExpirationDate(LocalDate.of(2021, 1, 12));

        Milk milk4 = new Milk();
        milk4.setName("Korovka");
        milk4.setBrand(MilkBrand.MOLOCHNY_MIR);
        milk4.setTare(Tare.TETRA_PAK);
        milk4.setVolume(0.9);
        milk4.setCode(KOROVKA_MILK_CODE);
        milk4.setExpirationDate(LocalDate.of(2021, 3, 2));

        Milk milk5 = new Milk();
        milk5.setName("MOLOKO");
        milk5.setBrand(MilkBrand.SAVUSHKIN_PRODUCT);
        milk5.setTare(Tare.PACKET);
        milk5.setVolume(0.85);
        milk5.setCode(MOLOKO_MILK_CODE);
        milk5.setExpirationDate(LocalDate.of(2021, 2, 21));

        Bread bread1 = new Bread();
        bread1.setName("Hleb borodinsky");
        bread1.setSliced(false);
        bread1.setWeight(500);
        bread1.setCode(BREAD_CODE);
        bread1.setExpirationDate(LocalDate.of(2021, 2, 28));

        Bread bread2 = new Bread();
        bread2.setName("Hleb borodinsky");
        bread2.setSliced(false);
        bread2.setWeight(500);
        bread2.setCode(BREAD_CODE);
        bread2.setExpirationDate(LocalDate.of(2021, 2, 25));

        Bread bread3 = new Bread();
        bread3.setName("Hleb borodinsky");
        bread3.setSliced(false);
        bread3.setWeight(500);
        bread3.setCode(BREAD_CODE);
        bread3.setExpirationDate(LocalDate.of(2021, 3, 5));

        Bread bread4 = new Bread();
        bread4.setName("Hleb borodinsky");
        bread4.setSliced(false);
        bread4.setWeight(500);
        bread4.setCode(BREAD_CODE);
        bread4.setExpirationDate(LocalDate.of(2021, 3, 3));

        Bread bread5 = new Bread();
        bread5.setName("BATON");
        bread5.setSliced(true);
        bread5.setWeight(450);
        bread5.setCode(BATON_BREAD_CODE);
        bread5.setExpirationDate(LocalDate.of(2021, 3, 2));

        CacheMachine cacheMachine = new CacheMachine();
        cacheMachine.addProductPrice(VKUSNOE_MILK_CODE, 150);
        cacheMachine.addProductPrice(KOROVKA_MILK_CODE, 161);
        cacheMachine.addProductPrice(MOLOKO_MILK_CODE, 140);
        cacheMachine.addProductPrice(BREAD_CODE, 122);
        cacheMachine.addProductPrice(BATON_BREAD_CODE, 98);

        VillageShop shop = new VillageShop();

        CleverSeller seller = new CleverSeller("Valya", shop, cacheMachine);

        seller.addProduct(milk1);
        seller.addProduct(milk2);
        seller.addProduct(milk3);
        seller.addProduct(milk4);
        seller.addProduct(milk5);
        seller.addProduct(bread1);
        seller.addProduct(bread2);
        seller.addProduct(bread3);
        seller.addProduct(bread4);
        seller.addProduct(bread5);

//     System.out.println(seller.getBreadFromShell());
//     System.out.println(seller.getBreadFromShell());
//     System.out.println(seller.getBreadFromShell());
//     System.out.println(seller.getBreadFromShell());
//     System.out.println(seller.getBreadFromShell());
//
//     System.out.println(seller.getMilkFromShell());
//     System.out.println(seller.getMilkFromShell());
//     System.out.println(seller.getMilkFromShell());
//     System.out.println(seller.getMilkFromShell());
//     System.out.println(seller.getMilkFromShell());


     Cart cart = new Cart();
     cart.addProductToCart(seller.getBreadFromShell());
     cart.addProductToCart(seller.getBreadFromShell());
     cart.addProductToCart(seller.getMilkFromShell());
     cart.addProductToCart(seller.getMilkFromShell());
     System.out.println("Total price in cart = " + seller.calculateTotalCost(cart));
    }
}
