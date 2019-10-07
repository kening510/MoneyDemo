package moneyDemo;

import java.util.List;
import java.util.Scanner;

public class ShoppingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much does it cost?");
        int cost = 0;
        if (sc.hasNextInt()) {
            cost = sc.nextInt();
            System.out.println("It costs " + cost + " kr.");
        } else {
            System.out.println("Give it a price");
        }
        System.out.println("How much do you pay?");
        int payment = 0;
        if (sc.hasNextInt()) {
            payment = sc.nextInt();
            System.out.println("You have paid " + payment + " kr.");
        } else {
            System.out.println("You have to pay something.");
        }
        if (payment > cost) {
            List<Integer> changeList = Money.getChange(payment, cost);
            StringBuilder sb = new StringBuilder();
            sb.append("You will get back ");

            for (int i = 0; i < changeList.size(); i++) {
                if (changeList.get(i) > 0) {
                    sb.append(changeList.get(i) + " " + MoneyType.values()[i].moneyName);
                    sb.append("\n");
                }
            }
            System.out.println(sb);
        }
        else if(payment==cost){
            System.out.println("You paid even money! God bless you!");
        }else{
            System.out.println("You can not go! Please pay " + (cost - payment) + " kr more!");
        }
    }
}
