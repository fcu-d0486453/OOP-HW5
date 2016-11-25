package fcu.iecs.oop.pokemon;

public class Pokemon {

	private final String name ;
	private  int cp;

	
    public  String getName() {
		return name;
	}
	
	public  int getCp() {
		return cp;
	}

	public  void setCp() {
		this.cp += 500;
	}

	public  Pokemon(final String name, int cp) {//«Øºc¤l
		this.name = new String(name);
		this.cp = cp;
	}
	
	
	
}
