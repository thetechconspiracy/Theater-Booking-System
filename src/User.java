/**
 * 
 * @author Something Creative
 * This is the user Interface to be implemented by the Consumer, Manager, and Guest
 */
public interface User {
	public String getType();
	public String getName();
	public String getUserName();
	public String getPassword();
	public void viewMovies(Theater theater);
}
