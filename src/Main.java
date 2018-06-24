
public class Main {

	public static void main(String[] args) {

		User bry=new User("bry");
		bry.createPost("Hello", "World");
		bry.createPost("Title", "Body");
		bry.createPost("My Favorite", "Things");		
		bry.printUserPosts();
	}

}
