import java.util.HashMap;

public class Purse {
    private HashMap<MoneyType, Integer> cash;

    public Purse() {
        cash = new HashMap<>();
        cash.put(Register.hundreds, 0);
        cash.put(Register.fifty, 0);
        cash.put(Register.twenty, 0);
        cash.put(Register.ten, 0);
        cash.put(Register.five, 0);
        cash.put(Register.one, 0);
        cash.put(Register.quarter, 0);
        cash.put(Register.dime, 0);
        cash.put(Register.nickel, 0);
        cash.put(Register.penny, 0);
    }

    public void add(MoneyType moneyType, int amount) {
        cash.put(moneyType, cash.get(moneyType) + amount);
    }

    public double remove(MoneyType moneyType, int amount) {
        cash.put(moneyType, cash.get(moneyType) - amount);
        return getValue();
    }

    public double getValue(){
        double total = 0;
        total += cash.get(Register.hundreds) * 100;
        total += cash.get(Register.fifty) * 50;
        total += cash.get(Register.twenty) * 20;
        total += cash.get(Register.ten) * 10;
        total += cash.get(Register.five) * 5;
        total += cash.get(Register.one);
        total += cash.get(Register.quarter) * 0.25;
        total += cash.get(Register.dime) * 0.1;
        total += cash.get(Register.nickel) * 0.05;
        total += cash.get(Register.penny) * 0.01;
        return total;
    }

    public String toString(){
        String contents = "";
        if(cash.get(Register.hundreds) > 0){
            contents += "Hundred-dollar note(s): " + cash.get(Register.hundreds) + "\n";
        }
        if(cash.get(Register.fifty) > 0){
            contents += "Fifty-dollar note(s): " + cash.get(Register.fifty) + "\n";
        }
        if(cash.get(Register.twenty) > 0){
            contents += "Twenty-dollar note(s): " + cash.get(Register.twenty) + "\n";
        }
        if(cash.get(Register.ten) > 0){
            contents += "Ten-dollar note(s): " + cash.get(Register.ten) + "\n";
        }
        if(cash.get(Register.five) > 0){
            contents += "Five-dollar note(s): " + cash.get(Register.five) + "\n";
        }
        if(cash.get(Register.one) > 0){
            contents += "One-dollar note(s): " + cash.get(Register.one) + "\n";
        }
        if(cash.get(Register.quarter) > 0){
            contents += "Quarter(s): " + cash.get(Register.quarter) + "\n";
        }
        if(cash.get(Register.dime) > 0){
            contents += "Dime(s): " + cash.get(Register.dime) + "\n";
        }
        if(cash.get(Register.nickel) > 0){
            contents += "Nickel(s): " + cash.get(Register.nickel) + "\n";
        }
        if(cash.get(Register.penny) > 0){
            contents += "Penny(ies): " + cash.get(Register.penny) + "\n";
        }

        return contents;
    }
}
