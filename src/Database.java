import java.util.*;

public class Database {
	
	static HashMap<Integer, User> userMap = new HashMap<>();
	static HashMap<Integer, Post> postMap = new HashMap<>();
	static HashMap<Integer, List<Integer>>userPostsMap=new HashMap<>();
	
	public static class Users {
		
		static void addUser(User user) {
			userMap.put(user.userId, user);
			userPostsMap.put(user.userId, new ArrayList<Integer>());
		}
	}
	
	public static class Posts {
		
		static void addPost(Post post) {
			postMap.put(post.postId, post);
			UserPosts.addPost(post.userId, post.postId);
		}
	}
	
	public static class UserPosts {
		
		static void addPost(int userId, int postId) {
			List<Integer>userPosts=userPostsMap.get(userId);
			userPosts.add(postId);
		}
	}

}
