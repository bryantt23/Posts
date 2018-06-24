import java.util.ArrayList;
import java.util.List;

public class Post {
	static int nextAvailablePostId;
	int postId;
	String title, body;
	
	public Post(String title, String body) {
		this.postId=nextAvailablePostId++;
		this.title=title;
		this.body=body;
	}
}
