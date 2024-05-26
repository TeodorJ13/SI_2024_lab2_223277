import java.util.Arrays;

public class SILab2Test {
    public static void main(String[] args) {

        try {
            SILab2.checkCart(null, 500);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage().equals("allItems list can't be null!"));
        }


        System.out.println(SILab2.checkCart(Arrays.asList(), 500) == true);

        System.out.println(SILab2.checkCart(
                Arrays.asList(new Item(null, "5901234123457", 75, 0),
                        new Item("", "8712345678901", 400, 0)), 400) == true);

        try {
            SILab2.checkCart(Arrays.asList(new Item("VivaPraska", null, 85, 0)), 100);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage().equals("No barcode!"));
        }

        try {
            SILab2.checkCart(Arrays.asList(new Item("StobiFlips", "А512Г3456789012", 10, 0)), 10);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage().equals("Invalid character in item barcode!"));
        }

        System.out.println(SILab2.checkCart(
                Arrays.asList(new Item("Bajadera", "0345678901234", 568, 0.2f)), 600) == true);


        System.out.println(SILab2.checkCart(
                Arrays.asList(new Item("Temjanika", "0456789012345", 629, 0.5f)), 700) == true);


        System.out.println(SILab2.checkCart(
                Arrays.asList(new Item("Martini", "4567890123456", 938, 0),
                        new Item("Raffaello", "0012345678902", 213, 0.1f)), 340) == true);


        System.out.println(SILab2.checkCart(
                Arrays.asList(new Item("Persil", "9876543210987", 902, 0),
                        new Item("Skittles", "0890123456789", 49, 0.1f)), 300) == false);
    }
}
