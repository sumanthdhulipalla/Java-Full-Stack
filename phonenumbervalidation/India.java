package phonenumbervalidation;

public class India extends country{

	public boolean numberFormat(String c) {
		char[] charArray = c.toCharArray();
		if(charArray.length!=14) {
			return false;
		}
		if(charArray[0]!=43) {
			return false;
		}
		if(charArray[1]!=57) {
			return false;
		}
		if(charArray[2]!=49) {
			return false;
		}
		if(charArray[3]!=45) {
			return false;
		}
		for(int i=4;i<14;i++) {
			if(!(charArray[i]>=48 && charArray[i]<=57)) {
				return false;
			}
		}
		return true;
		
	}
}
