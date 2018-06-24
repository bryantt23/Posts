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
//
//	void printPostComments() {		
//		for (Comment comment : comments) {
//			User user=User.Users.userMap.get(this.userId);
//			System.out.println("\t" + comment.comment+" by: "+user.name);
//		}
//	}
	
	void printPostComments() {
		Database.printComments(this);
	}
}
