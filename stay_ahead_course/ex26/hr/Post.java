package ex26.hr;

import java.util.ArrayList;

public class Post implements Transferable {
	
	private String name;
	private BusinessUnit bu;
	private JobDescription jd;
	private float fullTimeEquivalent;
	private ArrayList<Assignment> postHolders;
	private String postType;

	public Post(String name) {
		this.name = name;
	}
	
	void setBu(BusinessUnit bu) {
		this.bu = bu;
	}
	
	public String getName() {
		return name;
	}
	public BusinessUnit getBu() {
		return bu;
	}
	public JobDescription getJd() {
		return jd;
	}
	public float getFullTimeEquivalent() {
		return fullTimeEquivalent;
	}
	public ArrayList<Assignment> getPostHolders() {
		return new ArrayList<Assignment>(postHolders);
	}
	public String getPostType() {
		return postType;
	}

	@Override
	public String toString() {
		return "Post [name=" + name + ", bu=" + bu + ", jd=" + jd + ", fullTimeEquivalent=" + fullTimeEquivalent
				 + ", postType=" + postType + "]";
	}

	public void setBusinessUnit(BusinessUnit bu) {
		this.bu = bu;
	}

	@Override
	public void transfer(BusinessUnit bu) {
		//this. because it's a the bu variable in an object of this class
		this.bu.removePost(this);
		this.bu.addPost(this);
		this.bu = bu;
	}
	
}
