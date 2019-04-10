package ie.tudublin;

import java.awt.Color;
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
