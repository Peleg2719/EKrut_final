package entityControllers;

import entities.User;

/**
 * 
 * UserController class is used to handle all the user related operations.
 * 
 * @author Ron Lahiani , Peleg Oanuno
 */
public class UserController {
	private User user = null;
	private User userToUpdate = null;
	private String areaManagerUserNAme;

	/**
	 * getter method for userToUpdate
	 * 
	 * @return User - an object of the user that needs to be updated
	 */
	public User getUserToUpdate() {
		return userToUpdate;
	}

	/**
	 * setter method for userToUpdate
	 * 
	 * @param userToUpdate - an object of the user that needs to be updated
	 */
	public void setUserToUpdate(User userToUpdate) {
		this.userToUpdate = userToUpdate;
	}
	public UserController() {
	}

	/**
	 * constructor that takes user object as an argument
	 * 
	 * @param user - an object of the user
	 */
	public UserController(User user) {
		this.user = user;
	}

	/**
	 * getter method for user
	 * 
	 * @return User - an object of the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * setter method for user
	 * 
	 * @param user - an object of the user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * method to check if user object is exist
	 * 
	 * @return boolean - true if user object is exist, false otherwise
	 */
	public boolean isUserExist() {
		if (user == null)
			return false;
		return true;
	}

	/**
	 * method to check if user object to approve is exist
	 * 
	 * @return boolean - true if user object to approve is exist, false otherwise
	 */
	public boolean isUserToApproveExist() {
		if (userToUpdate == null)
			return false;
		return true;
	}

	/**
	 * getter method for area manager's username
	 * 
	 * @return String - the area manager's username
	 */
	public String getAreaManagerUserNAme() {
		return areaManagerUserNAme;
	}

	/**
	 * setter method for area manager's username
	 * 
	 * @param areaManagerUserNAme - the area manager's username
	 */
	public void setAreaManagerUserNAme(String areaManagerUserNAme) {
		this.areaManagerUserNAme = areaManagerUserNAme;
	}

}
