package ie.tudublin;

public class Colour{

    private String name;
    private int r;
    private int g;
    private int b;
    private int value;

    public Colour(String name, int r, int g, int b, int value){
        this.name = name;
        this.r = r;
        this.g = g;
        this.b = b;
        this.value = value;
    }

    public Colour(String name, int r, int g, int b){
        this.name = name;
        this.r = r;
        this.g = g;
        this.b = b;
        this.value = -1;
    }

    public Colour(int r, int g, int b, int value){
        this.name = null;
        this.r = r;
        this.g = g;
        this.b = b;
        this.value = value;
    }

    public Colour(int r, int g, int b){
        this.name = null;
        this.r = r;
        this.g = g;
        this.b = b;
        this.value = -1;
    }

    public String getName(){
        return this.name;
    }

    public int getR(){
        return this.r;
    }
    public int getG(){
        return this.g;
    }
    public int getB(){
        return this.b;
    }

    public int getValue(){
        return this.value;
    }


    @Override
    public String toString() {
        return(name + ": (" + r + ", " + g + ", " + b + ")  " + value);
    }
}