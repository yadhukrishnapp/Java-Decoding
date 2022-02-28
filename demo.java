interface buyable {
    void buy();
}

class books implements buyable {
    public void buy() {
        System.out.println("The book one of the bestsellers");
    }

}

class phones implements buyable {
    public void buy() {
        System.out.println("This the best phone available in the market");
    }
} 


public class demo {
    public static void main(String[] args) {
        buyable book = new books();
        book.buy();
        buyable phone = new phones();
        phone.buy();
    }
}
