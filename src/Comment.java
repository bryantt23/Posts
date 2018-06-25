import java.util.List;

public class Comment {
	static int nextAvailableCommentId;
	int commentId;
	int userId;
	int postId;
	String comment;

	public Comment(String comment, int userId, int postId) {
		this.commentId = nextAvailableCommentId++;
		this.userId = userId;
		this.postId = postId;
		this.comment = comment;
		Database.Comments.addComment(this);
	}
}
