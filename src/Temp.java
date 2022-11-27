
public class Temp {
    
    private Interface temp;
    public Interface getTemp(){
        return temp;
    }
    public void setTemp(Interface temp){
        this.temp = temp;
    }

    public void printTemp(){
        System.out.println(temp.getTemperatura()+ " C°");
    }

    public static void main(String [] args){
        Temp temperatura = new Temp();
        temperatura.setTemp(new Celcius());
        int i = 0;
        while(i<5){
            temperatura.printTemp();
            i++;
        }
    }   
}