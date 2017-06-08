package spring.mvc.tuto.trash;

/**
 * Created by Ghazi Naceur on 08/06/2017.
 */
public class Car {

    private Engine engine;

    private String warningMessage;

    public Car(Engine engine){
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getWarningMessage() {
        return warningMessage;
    }

    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }

    public void accelerate(){
        engine.increaseRPM();
        if (engine.getRpm()>5000){
            warningMessage = "Slow down !";
        }
    }
}
