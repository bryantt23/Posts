
public class Main {

	public static void main(String[] args) {

		User bry=new User("bryant");
		Database.Users.addUser(bry);
		
//		System.out.println(Database.Users.userMap.get(bry).name);
//		System.out.println(Database.Users.userMap.values());
		
		bry.createPost("Hello", "World");
		bry.createPost("Title", "Body");
		bry.createPost("My Favorite", "Things");		
		bry.printUserPosts();

		User jane=new User("jane");
		Database.Users.addUser(jane);
		jane.createPost("jane", "doe");
		jane.createPost("CS", "Comp Sci");
		jane.printUserPosts();
	}

}
