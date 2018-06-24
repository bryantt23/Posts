import java.util.*;

public class User {
	static int nextAvailableUserId;
	int userId;
	String name;
	List<Post>posts;
	
	public User(String name) {
		this.userId=nextAvailableUserId++;
		this.name=name;
		this.posts=new ArrayList<>();
	}
	
	void createPost(String title,String body) {
		Post post=new Post(title, body);
		this.posts.add(post);
	}
	
	void printUserPosts() {
		System.out.println("Here are the posts by: "+this.name);
		for(Post post: posts) {
			System.out.println("Title: "+post.title);
			System.out.println("Body: "+post.body+"\n");
		}
	}
}
