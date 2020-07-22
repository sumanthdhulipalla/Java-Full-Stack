package phonenumbervalidation;
abstract class country implements Phonenumber{


	public boolean isNum(String num)
	{
		char[] arr=num.toCharArray();
		
		for(int i=0;i<num.length();i++)
		{
			if(!(arr[i]>=48 && arr[i]<=57))
			{
				return false;
			}
				
		}
		return true;
	}
	
}
