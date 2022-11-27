import com.stark.cooporation.FarenheitSensor;
public class Celcius implements Interface {
    @Override
    public double getTemperatura(){
        FarenheitSensor farenheitSensor = new FarenheitSensor();
        double temperaturaInFarenheit = farenheitSensor.getTemperaturaFarenheit();
        double temperaturaInCelsius = (temperaturaInFarenheit - 32) * 5/9;
        return temperaturaInCelsius;
    }
}