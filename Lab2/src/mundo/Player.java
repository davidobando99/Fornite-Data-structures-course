package mundo;

public class Player {
	
	public static final String PC="PC";
	public static final String CONSOLE="Console";
	public static final String PHONE="Phone";
	private String name;
	private double ping;
	private String geo;
	private double skill;
	private int id;
	private String platform;
	
	public Player(String name, double ping, String geo, double skill, int id, String platform) {
		
		this.name=name;
		this.ping=ping;
		this.geo=geo;
		this.skill=skill;
		this.id=id;
		this.platform=platform;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPing() {
		return ping;
	}

	public void setPing(double ping) {
		this.ping = ping;
	}

	public String getGeo() {
		return geo;
	}

	public void setGeo(String geo) {
		this.geo = geo;
	}

	public double getSkill() {
		return skill;
	}

	public void setSkill(double skill) {
		this.skill = skill;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	
	
	

}
