package ie.tudublin;

public class Resistor{

    private int hundreds;
    private int tens;
    private int ones;

    public Resistor(int value){
        separate(value);
    }

    public void separate(int value){
		this.hundreds = (value / 100);
		this.tens = (value - (hundreds * 100)) / 10;
		this.ones = value - ((hundreds * 100)  + (tens * 10));
    }

    public void setHundreds(int h){
        this.hundreds = h;
    }

    public void setTens(int t){
        this.tens = t;
    }

    public void setOnes(int o){
        this.ones = o;
    }

    public int getHundreds(){
        return hundreds;
    }

    public int getTens(){
        return tens;
    }

    public int getOnes(){
        return ones;
    }

    @Override
    public String toString() {
        return(hundreds + " " + tens + " " + ones);
    }
    
}