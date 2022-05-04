import java.util.Scanner;

public class AirCraftTicketCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add Your Flight Distance                                   ..:");
        int distance = scanner.nextInt();

        System.out.print("Add Your Age                                               ..:");
        int age = scanner.nextInt();

        System.out.print("Add Your Flight Single Ticket (1) or  Two-Way Ticket (2)   ..:");
        int ticketType = scanner.nextInt();

        if (distance > 0 && age > 0 && ticketType == 1 || ticketType == 2) {
            double firstPrice = distance * 0.10;
            double ageDiscountRate = 0.0;

            if (age < 12) {
                ageDiscountRate = firstPrice * 0.5;
            } else if (age >= 12 && age <= 24) {
                ageDiscountRate = firstPrice * 0.1;
            } else if (age >= 65) {
                ageDiscountRate = firstPrice * 0.3;
            }

            double discountPrice = firstPrice - ageDiscountRate;
            if (ticketType == 2) {
                discountPrice = discountPrice - (discountPrice * 0.2); // (Yaş İndirimli Fiyattan Bilet İndirimli Fiyat Çıkartıldı.)
                System.out.println("Total Ticket Price ..: " + discountPrice * 2);
            }else{
                System.out.println("Total Ticket Price ..: " + discountPrice);
            }




        } else {
            System.out.print("Your Data is Wrong");
        }


    }
}
