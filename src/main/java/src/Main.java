package src;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Ship<Pirate> pirateShip = new Ship<>();
        pirateShip.add(new Pirate("Jan", "Nowak"));
        Pirate pirate = pirateShip.findBySurname("Nowak");
        System.out.println("damage " + pirate.cannonShot());

        Ship<Merchant> merchantShip = new Ship<>();
        merchantShip.add(new Merchant("Karol", "Wiśniewski"));
        Merchant merchant = merchantShip.findBySurname("Wiśniewski");

        List<Double> doubleList = Arrays.asList(2D, 3D, 4.4D);
        List<Number> numberList = Arrays.asList(2, 3, 5);
        System.out.println("profit " + merchant.trande(numberList));
    }
}
