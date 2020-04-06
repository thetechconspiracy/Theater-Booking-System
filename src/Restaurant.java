/**
 * 
 * @author Something Creative
 * 
 * This is the restuarant class. Some Venues have restaurants
 *
 */

public class Restaurant {
	
	private String name;
	private String desc;
	
	/**
	 * 
	 * @param name
	 * @param desc
	 * 
	 * constructor for restaurant
	 */
	public Restaurant(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	/**
	 * 
	 * getters and setters for Restaurant
	 * 
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
