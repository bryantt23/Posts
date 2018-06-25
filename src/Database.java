import java.util.*;

public class Database {
	
	static HashMap<Integer, User> userMap = new HashMap<>();
	static HashMap<Integer, Post> postMap = new HashMap<>();
	static HashMap<Integer, Comment> commentMap = new HashMap<>();
	static HashMap<Integer, List<Integer>>userPostsMap=new HashMap<>();
	static HashMap<Integer, List<Integer>>postCommentsMap=new HashMap<>();
	
	public static class Users {
		
		static void addUser(User user) {
			userMap.put(user.userId, user);
			userPostsMap.put(user.userId, new ArrayList<Integer>());
		}
	}
	
	public static class Posts {
		
		static void addPost(Post post) {
			postMap.put(post.postId, post);
			postCommentsMap.put(post.postId, new ArrayList<Integer>());
			UserPosts.addPost(post.userId, post.postId);
		}
	}
	
	public static class UserPosts {
		
		static void addPost(int userId, int postId) {
			List<Integer>userPosts=userPostsMap.get(userId);
			userPosts.add(postId);
		}
	}
	
	public static class Comments {
		
		static void addComment(Comment comment) {
			List<Integer>postComments=postCommentsMap.get(comment.postId);
			postComments.add(comment.commentId);
			commentMap.put(comment.commentId, comment);
		}
	}
}
