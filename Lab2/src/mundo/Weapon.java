package mundo;

public class Weapon {
	
	public static final String RANGED="Ranged"; //DISTANCE WEAPONS(PISTOLAS, RIFLES, ETC)
	public static final String MELEE="Melee"; //CLOSE WEAPONS(HACHA, ESPADA, ETC)
    private String image;
	private String name;
	private double power;
	private String type;
	
	public Weapon( String name,String image, double power, String type) {
		this.image= image;
		this.name=name;
		this.power=power;
		this.type=type;
		
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	
}
