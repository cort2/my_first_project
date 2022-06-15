package lesson4;

public class Snake {
     private String name;
     private int length;
     Snake(String name, int length){
         this.name = name;
         this.length = length;
     }
    String getInfo(){
        return this.name + " " + this.length;
    }
    void setLength(int newLength){
         this.length = newLength;
    }
    int getLength(){
         return this.length;
    }


}

