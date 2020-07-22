package phonenumbervalidation;
public class BrazilNew extends country {

	@Override
	public boolean numberFormat(String number) {

		String part1 = number.substring(0, 7);
		String part2 = number.substring(7);
		
		String numCheck = part2.replace("-", "");

		if (number.length() == 17) {
			if (part1.equals("+55 15 ")) {

				if (isNum(numCheck) && number.charAt(12) == '-') {
					return true;
				}
			}
		}

		return false;
	}

	
}

//+55 15 99999-9999