package phonenumbervalidation;
public class Brazil extends country{

	public boolean numberFormat(String c) {
		char[] charArray = c.toCharArray();
		if(charArray.length!=17) {
			return false;
		}
		if(charArray[0]!=43) {
			return false;
		}
		if(charArray[1]!=53 || charArray[2]!=53 || charArray[5]!=53) {
			return false;
		}
		if(charArray[3]!=32 || charArray[6]!=32) {
			return false;
		}
		if(charArray[4]!=49) {
			return false;
		}
		for(int i=7;i<=11;i++) {
			if(!(charArray[i]>=48 && charArray[i]>=57)) {
				return false;
			}
		}
		for(int i=13;i<=16;i++) {
			if(!(charArray[i]>=48 && charArray[i]<=57)) {
				return false;
			}
		}
		return true;
		
		
	}

}


// 
//7-11   13-16