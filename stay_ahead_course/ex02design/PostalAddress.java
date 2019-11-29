package ex02design;

public class PostalAddress {
	private String saon;
	private String paon;
	private String street;
	private String locality;
	private String town;
	private String postCode;
	private String county;
	private String country;

	private PostalAddress(Builder builder) {
		this.saon = builder.saon;
		this.paon = builder.paon;
		this.street = builder.street;
		this.locality = builder.locality;
		this.town = builder.town;
		this.postCode = builder.postCode;
		this.county = builder.county;
		this.country = builder.country;
	}	

	@Override
	public String toString() {
		return "PostalAddress [saon=" + saon + ", paon=" + paon + ", street=" + street + ", locality=" + locality
				+ ", town=" + town + ", postCode=" + postCode + ", county=" + county + ", country=" + country + "]";
	}

	public static class Builder {
		// Mandatory fields
		private String paon;
		private String street;
		private String town;
		private String postCode;

		// Optional fields
		private String saon = "";
		private String locality = "";
		private String county = "";
		private String country = "United Kingdom";

		public Builder(String paon, String street, String town, String postCode) {
			this.paon = paon;
			this.street = street;
			this.town = town;
			this.postCode = postCode;
		}

		public Builder saon(String saon) {
			this.saon = saon;
			return this;
		}

		public Builder locality(String locality) {
			this.locality = locality;
			return this;
		}

		public Builder county(String county) {
			this.county = county;
			return this;
		}

		public Builder country(String country) {
			this.country = country;
			return this;
		}

		public PostalAddress build() {
			return new PostalAddress(this);
		}
	}
}
