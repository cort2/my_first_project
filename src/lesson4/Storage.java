package lesson4;

public class Storage {

    private String name;
     private int sum;
    Storage(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }
    String getInfo(){
        return this.name + " " + this.sum;
    }

    int getBottle() {
        return sum;
    }

     void setSum(int sum) {
        this.sum = sum;
    }
}
