package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet{

	private ArrayList<Resistor> resistors = new ArrayList<Resistor>();
	private ArrayList<Colour> colours = new ArrayList<Colour>();
	private Table resistorsTable;
	private Table coloursTable;


	public void settings(){
		size(500, 800);
	}

	public void setup() {
		loadColors();
		loadResistors();
		printColors();
		printResistors();
	}
	
	public void draw(){		
		background(204);
		float m = map(50, 0, width, 0, height);
		for (int i = 0; i < resistors.size(); i++) {
			fill(250);
			rect(100, 100 + (m*i), 150, 50);
			
			//Draw lines
			for (int j = 0; j < 3; j++) {
				fill(color(findColour(j).getR(), findColour(i).getG(), findColour(i).getB()));
				rect(100 + 10 + (10*j), 100+(m*i), 5, 50);
			}
		}
	}

	public void loadColors(){
		coloursTable = loadTable("colours.csv", "header");
		for (TableRow row : coloursTable.rows()){
			String colour = row.getString("colour");
			int r = Integer.parseInt(row.getString("r"));
			int g = Integer.parseInt(row.getString("g"));
			int b = Integer.parseInt(row.getString("b"));
			int value = Integer.parseInt(row.getString("value"));
			colours.add(new Colour(colour, r, g, b, value));
		}
	}

	public void loadResistors(){
		resistorsTable = loadTable("resistors.csv", "header");
		for (TableRow row : resistorsTable.rows()){
			int value = Integer.parseInt(row.getString("resistors"));
			resistors.add(new Resistor(value));
		}
	}

	public Colour findColour(int value){
		return colours.get(value);
	}

	public void printColors(){
		for (Colour col : colours) {
			println(col.toString());
		}
	}

	public void printResistors(){
		for (Resistor res : resistors) {
			println(res.toString());
		}
	}
}
