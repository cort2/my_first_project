package lesson6;

public class Plain implements Flying {
    private int countPassengers;
    public Plain(int countPassengers) {
        this.countPassengers = countPassengers;
    }
    public void fly() throws FlyException{
        if(countPassengers < 0){
            throw new FlyException("Ошибка:  пассажиров в самолете меньше 0");
        }
        System.out.println("Самолет летит");
    }
}
