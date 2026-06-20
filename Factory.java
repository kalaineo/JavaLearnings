interface Currency{
    public String getSymbol();
}

class Rupee implements Currency{
    public String getSymbol() {
        return "Rs";
    }
}
class SgDollar implements Currency{
    public String getSymbol(){
        return "SGD";
    }
}

class CurrencyFactory{
    public static Currency createCurrency(String country) {
        if(country.equalsIgnoreCase ("India")) {
            return new Rupee();
        }
        if(country.equalsIgnoreCase ("Singapore")) {
            return new SgDollar();
        }

        throw new IllegalArgumentException("No such currency");
    }
}

public class Factory {
    public static void main(String args[]) {
        String country = args[0];
        Currency curr = CurrencyFactory.createCurrency(country);
        System.out.println(curr.getSymbol());
    }
}