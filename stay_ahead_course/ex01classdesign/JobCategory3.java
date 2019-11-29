package ex01classdesign;

public enum JobCategory3 {
	DIRECTOR(5) {
		public int getMaxScalePoints() {
			return 12;
		}

		public int getMinScalePoints() {
			return 3;
		}
	},
	MANAGER(4), 
	SUPERVISOR(3), 
	TECHNICIAN(2) {
		public int getMaxScalePoints() {
			return 15;
		}

		public int getMinScalePoints() {
			return 2;
		}
	},
	ADMINISTRATOR(1);
	
	private int grade;

	private JobCategory3(int grade) {
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public int getMaxScalePoints() {
		return 8;
	}

	public int getMinScalePoints() {
		return 1;
	}
}
