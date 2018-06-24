
public class Main {

	public static void main(String[] args) {

		User bry=new User("bryant");
		Database.Users.addUser(bry);
		
//		System.out.println(Database.Users.userMap.get(bry).name);
//		System.out.println(Database.Users.userMap.values());
		
		bry.createPost("Hello", "World");
		
		bry.createComment("Hi back", 0);
		bry.createPost("Title", "Body");	
		bry.createPost("My Favorite", "Things");	

		User jane=new User("jane");
		Database.Users.addUser(jane);
		jane.createComment("Hi bry", 0);
		jane.createPost("jane", "doe");
		jane.createPost("CS", "Comp Sci");	
		
		bry.printUserPosts();
		jane.printUserPosts();
	}

}
