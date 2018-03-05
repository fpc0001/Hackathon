public class RedditTester {
	
	public static void main(String[] args) {
	
		String filePosts= "RedditPost.txt";
		String fileAuthor= "RedditAuthors.txt";
		String input= "russia"; //look into sub-string
		String input1= "putin";
		
		RedditReader file= new RedditReader();
		file.readInTXT(filePosts, input, input1);
		//file.readInTXT(fileAuthor);
		//file.detectRussia("hello Russia");
	}
}
//obj.method(i/p);