package ex02design;

public class TestBuilder {

	public static void main(String[] args) {
		PostalAddress stayahead = new PostalAddress.Builder(
				"6", "Long Lane","London","EC1A 9HF")
				.saon("3rd Floor")
				.locality("Barbican")
				.build();
		System.out.println(stayahead.toString());
	}

}
