package login.core;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

	public static boolean validateMail(String email) {

		

		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);

		if (matcher.matches()) {
			return true;
		} else {
			System.out.println("Hatalý mail kullanýlmýþtýr."+ email);
			return false;
		}

	}
}
