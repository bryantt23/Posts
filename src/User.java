import java.util.*;

public class User {
		
	static int nextAvailableUserId;
	int userId;
	String name;
	
	public User(String name) {
		this.userId=nextAvailableUserId++;
		this.name=name;
	}
	
	void createPost(String title,String body) {
		new Post(title, body, this.userId);
	}
	
	void createComment(String comment, int postId) {
		new Comment(comment, this.userId, postId);
	}
	
	void printUserPosts() {
		Post.printPosts(this);
	}

}
