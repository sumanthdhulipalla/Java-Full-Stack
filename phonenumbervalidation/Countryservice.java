package phonenumbervalidation;
public class Countryservice {

	public static void main(String[] args) {
		India india=new India();
		System.out.println(india.numberFormat("+91-9887766890"));
		
		BrazilNew brazil=new BrazilNew();
		System.out.println(brazil.numberFormat("+55 15 99999-9999"));
	}

}


/*
interface PhoneNumber{
abstract boolean numberFormat(String number) ;
}


abstract class Country implements PhoneNumber
{
	
}

class India extends Country
{
@Override
public boolean numberFormat(String number) {
	// TODO Auto-generated method stub
	return false;
}	
}

abstract class State implements PhoneNumber{
	
}
class Karnataka extends State
{
	@Override
	public boolean numberFormat(String number) {
		// TODO Auto-generated method stub
		return false;
	}
}

class Kerla extends State
{
@Override
public boolean numberFormat(String number) {
	// TODO Auto-generated method stub
	return false;
}	
}

*/
 