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

	public void printPosts() {
		List<Integer>postIds=Database.userPostsMap.get(this.userId);
		System.out.println("Here are the posts by: "+this.name);
		for(Integer postId: postIds) {
			System.out.println("Title: "+Database.postMap.get(postId).title);
			System.out.println("Body: "+Database.postMap.get(postId).body);
			
			Post.printComments(postId);
		}		
	}
}
