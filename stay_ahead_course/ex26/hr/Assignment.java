package ex26.hr;

import java.time.LocalDate;

public class Assignment {

	private Post post;
	private Employee assignee;
	private float fullTimeEquivalent;
	private LocalDate assignmentStartDate;
	private LocalDate assignmentEndDate;
	private String assignmentType;

	public Assignment(Post post, Employee assignee, float fullTimeEquivalent, LocalDate assignmentStartDate) {
		this.post = post;
		this.assignee = assignee;
		this.fullTimeEquivalent = fullTimeEquivalent;
		this.assignmentStartDate = assignmentStartDate;
	}

	public Post getPost() {
		return post;
	}

	public Employee getAssignee() {
		return assignee;
	}

	public float getFullTimeEquivalent() {
		return fullTimeEquivalent;
	}

	public LocalDate getAssignmentStartDate() {
		return assignmentStartDate;
	}

	public LocalDate getAssignmentEndDate() {
		return assignmentEndDate;
	}

	public String getAssignmentType() {
		return assignmentType;
	}

	public void setAssignmentEndDate(LocalDate assignmentEndDate) {
		this.assignmentEndDate = assignmentEndDate;
	}

	public void setAssignmentType(String assignmentType) {
		this.assignmentType = assignmentType;
	}

}
