package ex26.hr;

import java.util.ArrayList;
import java.util.Arrays;

public final class JobDescription {

	private final String name;
	private final String jobCategory;
	private final ArrayList<String> activities;

	public JobDescription(String name, String jobCategory, String... activities) {
		this.name = name;
		this.jobCategory = jobCategory;
		this.activities = new ArrayList<String>(Arrays.asList(activities));
	}

	@Override
	public String toString() {
		return "JobDescription=[name=" + name + ", jobCategory=" + jobCategory + ", activities=" + activities + "]";
	}

	public String getName() {
		return name;
	}

	public String getJobCategory() {
		return jobCategory;
	}

	public ArrayList<String> getActivities() {
		//return activities;
		return new ArrayList<String>(activities);
	}
}
