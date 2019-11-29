package ex26.hr;

import java.util.ArrayList;

public abstract class BusinessUnit {

	private String name;
	private String description;
	private ArrayList<Post> posts = new ArrayList<>();
	
	public BusinessUnit(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public void addPost(Post post) {
		posts.add(post);
		post.setBusinessUnit(this);
	}
	
	public boolean removePost(Post post) {
		return posts.remove(post);
	}
	
	public int getHeadCount() {
		return posts.size();
	}

	public ArrayList<Post> getPosts() {
		return new ArrayList<Post>(posts);
	}
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "BusinessUnit [name=" + name + ", description=" + description + "]";
	}
	
	
}
