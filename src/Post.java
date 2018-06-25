import java.util.List;

public class Post {
	static int nextAvailablePostId;
	int postId;
	int userId;
	String title, body;

	public Post(String title, String body, int userId) {
		this.postId = nextAvailablePostId++;
		this.userId = userId;
		this.title = title;
		this.body = body;
		Database.Posts.addPost(this);
	}
	
	public static void printPosts(User user) {
		List<Integer>postIds=Database.userPostsMap.get(user.userId);
		System.out.println("Here are the posts by: "+user.name);
		for(Integer postId: postIds) {
			System.out.println("Title: "+Database.postMap.get(postId).title);
			System.out.println("Body: "+Database.postMap.get(postId).body);
			
			printPostComments(postId);
		}		
	}
	
	static void printPostComments(int postId) {
		Comment.printComments(postId);
	}
	
}
