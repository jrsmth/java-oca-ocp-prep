package ex02design;

import java.util.ArrayList;

public class JobRole2 {
	private int id;
	private String name;
	private ArrayList<Skill> skills;

	public JobRole2(int id, String name, ArrayList<Skill> skills) {
		this.id = id;
		this.name = name;
		this.skills = new ArrayList<Skill>(skills);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Skill> getSkills() {
		return new ArrayList<Skill>(skills);
	}
}
