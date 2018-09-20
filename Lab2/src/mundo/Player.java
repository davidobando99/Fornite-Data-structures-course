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
	 * returns the name attribute
	 * @return name
	 */
	public String getName() {
		return name;
	}
    
	/**
	 * update the name attribute
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
    
	/**
	 * returns the ping attribute
	 * @return ping
	 */
	public int getPing() {
		return ping;
	}
    
	/**
	 * update the ping attribute 
	 * @param ping
	 */
	public void setPing(int ping) {
		this.ping = ping;
	}

	/**
	 * returns the geo attribute
	 * @return geo
	 */
	public String getGeo() {
		return geo;
	}

	/**
	 * update the geo attribute
	 * @param geo
	 */
	public void setGeo(String geo) {
		this.geo = geo;
	}

	/**
	 * returns the skill attribute
	 * @return skill
	 */
	public int getSkill() {
		return skill;
	}
    
	/**
	 * update the skill attribute
	 * @param skill
	 */
	public void setSkill(int skill) {
		this.skill = skill;
	}

	/**
	 * returns the id attribute
	 * @return id
	 */
	public int getId() {
		return id;
	}
    
	/**
	 * update the id attribute
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * returns the platform attribute
	 * @return platform
	 */
	public String getPlatform() {
		return platform;
	}
	
    /**
     * uodate the platform attribute
     * @param platform
     */
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	/**
	 * returns the weaponStack attribute
	 * @return weaponStack
	 */
	public Stack<Weapon> getWeaponStack() {
		return weaponStack;
	}

	/**
	 * update the weaponStack attribute
	 * @param weaponStack
	 */
	public void setWeaponStack(Stack<Weapon> weaponStack) {
		this.weaponStack = weaponStack;
	}	

}
