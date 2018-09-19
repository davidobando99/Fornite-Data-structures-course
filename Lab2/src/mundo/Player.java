package mundo;

public class Player {
	
	public static final String PC="PC";
	public static final String CONSOLE="Console";
	public static final String PHONE="Phone";
	private String name;
	private int ping;
	private String geo;
	private int skill;
	private int id;
	private String platform;
	
	public Player(String name, int ping, String geo, int skill, int id, String platform) {
		
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

	public int getPing() {
		return ping;
	}

	public void setPing(int ping) {
		this.ping = ping;
	}

	public String getGeo() {
		return geo;
	}

	public void setGeo(String geo) {
		this.geo = geo;
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
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
