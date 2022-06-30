package lesson6;

public class Duck implements Flying {
       private boolean isInjured;
    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }
    public void fly() throws FlyException {
        if(isInjured){
            throw new FlyException("Ошибка: утка ранена");
        }
        System.out.println("Утка летит");
    }

}