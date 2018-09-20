package mundo;

import java.io.BufferedReader;
import java.io.FileReader;

import collections.Stack;

public class Player {
	
	//****************************
	//         CONSTANTS
	//***************************
	public static final String PC="PC";
	public static final String CONSOLE="Console";
	public static final String PHONE="Phone";
	
	//**************************
	// ATTRIBUTES
	//**************************
	
	private String name;
	private int ping;
	private String geo;
	private int skill;
	private int id;
	private String platform;
	private Stack<Weapon> weaponStack;
	
	/**
	 * Constructor method of the Player class.
	 * @param name
	 * @param ping
	 * @param geo
	 * @param skill
	 * @param id
	 * @param platform
	 * @param weaponStack
	 */
	public Player(String name, int ping, String geo, int skill, int id, String platform,Stack<Weapon> weaponStack ) {
		
		this.name=name;
		this.ping=ping;
		this.geo=geo;
		this.skill=skill;
		this.id=id;
		this.platform=platform;
		this.weaponStack=weaponStack;
		
	}
	
	//**************************
	// METHODS GETS AND SETTERS
	//**************************
    
	/**
	 * 
	 * @return name
	 */
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

	public Stack<Weapon> getWeaponStack() {
		return weaponStack;
	}

	public void setWeaponStack(Stack<Weapon> weaponStack) {
		this.weaponStack = weaponStack;
	}	

}
