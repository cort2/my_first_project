package lesson4;

public class Workers {
    private String name;
    private int bottle;
    Workers(String name, int bottle) {
        this.name = name;
        this.bottle = bottle;
    }
    String getInfo(){
        return this.name + " " + this.bottle;
    }
     int getBottle() {
        return bottle;
    }
    public void setBottle(int bottle, Storage shop) {
        this.bottle += bottle;
        shop.setSum(shop.getBottle() - bottle);
    }

}
