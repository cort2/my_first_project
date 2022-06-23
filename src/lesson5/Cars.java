package lesson5;

public abstract class Cars {
    public void run (){
        System.out.println("начинает движение");
    }
    public void stop(){
        System.out.println("останавливается");
    }
    public void light(){
        System.out.println("включает фары");
    }
}
