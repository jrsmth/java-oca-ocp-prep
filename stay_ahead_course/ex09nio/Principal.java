package ex09nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.attribute.UserPrincipal;

public class Principal {

	public static void main(String[] args) {
		
		try {
			UserPrincipal owner = FileSystems.getDefault()
					.getUserPrincipalLookupService() 
					.lookupPrincipalByName("delegate");
			System.out.println(owner.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
