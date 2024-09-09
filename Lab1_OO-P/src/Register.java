import java.util.Scanner;
public class Register {
    public static final MoneyType hundreds = new MoneyType("hundred-dollar note", 100, "bill", "hundred_note.png");
    public static final MoneyType fifty = new MoneyType("fifty-dollar note", 50, "bill", "fifty_note.png");
    public static final MoneyType twenty = new MoneyType("twenty-dollar note", 20, "bill", "twenty_note.png");
    public static final MoneyType ten = new MoneyType("ten-dollar note", 10, "bill", "ten_note.png");
    public static final MoneyType five = new MoneyType("five-dollar note", 5, "bill", "five_note.png");
    public static final MoneyType one = new MoneyType("one-dollar note", 1, "bill", "one_note.png");
    public static final MoneyType quarter = new MoneyType("quarter", 0.25, "coin", "quarter.png");
    public static final MoneyType dime = new MoneyType("dime", 0.1, "coin", "dime.png");
    public static final MoneyType nickel = new MoneyType("nickel", 0.05, "coin", "nickel.png");
    public static final MoneyType penny = new MoneyType("penny", 0.01, "coin", "penny.png");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total;
        System.out.println("Enter the total amount of money ");
        total = sc.nextDouble();
        Purse purse = new Purse();
        purse = Register.makeChange(total);
        System.out.println(purse.toString());
    }

    //Calculates the number of bills and coins
    static Purse makeChange(double amt){
        System.out.println(amt);
        Purse purse = new Purse();

        double tempAmt = amt;
        int hundred = 0, fifty = 0, twenty = 0, ten = 0;
        int five = 0, one = 0;
        int quarters = 0, dimes = 0, nickles = 0, pennies = 0;
        while(amt >= 0) {
            if (amt >= 100) {
                amt -= 100;
                hundred++;
            } else if (amt >= 50) {
                amt -= 50;
                fifty++;
            } else if (amt >= 20) {
                amt -= 20;
                twenty++;
            } else if (amt >= 10) {
                amt -= 10;
                ten++;
            } else if (amt >= 5) {
                amt -= 5;
                five++;
            } else if (amt >= 1) {
                amt -= 1;
                one++;
            } else if (amt >= 0.25) {
                amt *= 100;
                tempAmt = (int) amt;
                tempAmt -= 25;
                amt = tempAmt / 100;
                quarters++;
            } else if (amt >= 0.1) {
                amt *= 100;
                tempAmt = (int) amt;
                tempAmt -= 10;
                amt = tempAmt / 100;
                dimes++;
            } else if (amt >= 0.05) {
                amt *= 100;
                tempAmt = (int) amt;
                tempAmt -= 5;
                amt = tempAmt / 100;
                nickles++;
            } else if (amt >= 0.01) {
                amt *= 100;
                tempAmt = (int) amt;
                tempAmt -= 1;
                amt = tempAmt / 100;
                pennies++;
            } else {
                break;
            }
        }

        purse.add(Register.hundreds, hundred);
        purse.add(Register.fifty, fifty);
        purse.add(Register.twenty, twenty);
        purse.add(Register.ten, ten);
        purse.add(Register.five, five);
        purse.add(Register.one, one);
        purse.add(Register.quarter, quarters);
        purse.add(Register.dime, dimes);
        purse.add(Register.nickel, nickles);
        purse.add(Register.penny, pennies);

        return purse;
    }
}