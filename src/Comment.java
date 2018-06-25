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
	
	public static void printComments(int postId) {
		List<Integer>commentIds=Database.postCommentsMap.get(postId);
		for(Integer commentId: commentIds) {
			Comment comment=Database.commentMap.get(commentId);
			String userName=Database.userMap.get(comment.userId).name;
			System.out.println("\t"+comment.comment+" by "+userName);
		}		
	}
}
