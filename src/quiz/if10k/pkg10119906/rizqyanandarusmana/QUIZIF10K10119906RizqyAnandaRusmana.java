/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if10k.pkg10119906.rizqyanandarusmana;
import java.util.Scanner;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class QUIZIF10K10119906RizqyAnandaRusmana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        ServicePrice servicePrice = new ServicePrice();

        System.out.println("==== Program Kasir Rock n Roll ====");
        Customer customer = new Customer();

        System.out.print("Customer Name: ");
        customer.setName(scanner.nextLine());

        System.out.print("Customer Email: ");
        customer.setEmail(scanner.nextLine());

        servicePrice.displayService();
        float priceService = servicePrice.getPrice(scanner.nextInt());
        scanner.nextLine();
        System.out.println();

        System.out.print("Are you member? (yes/no): ");
        String isMember = scanner.nextLine();

        customer.setMember(isMember.equals("yes"));

        System.out.println("Customer Invoice");
        System.out.println("=====");
        System.out.println("Date Transaction: " + customer.currentTime());
        System.out.println("Service Price: " + priceService);
        float discount = servicePrice.getSale(customer.isMember(), priceService);
        System.out.println("Discount: " + discount);
        System.out.println("Total Pay: " + servicePrice.getTotalPay(priceService, discount));
    }
}