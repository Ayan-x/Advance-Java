//YOu canoot extends enum with other class.

enum Laptop{
    Mackbook(2000),ThinkPad(1500),Pavallion(1600),XPS(1800);

    private int price;
    private Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}

class Main4{
    public static void main(String[] args) {
        for(Laptop lap:Laptop.values()){
            System.err.println(lap+" : "+lap.getPrice());
        }
    }
}