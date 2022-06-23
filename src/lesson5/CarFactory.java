package lesson5;

public class CarFactory{
    static Vaz createVaz(){
        return new Vaz();
    }
    static Toyota createToyota(){
        return new Toyota();
    }
}
