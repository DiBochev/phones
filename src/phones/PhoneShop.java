package phones;

import java.util.ArrayList;

public class PhoneShop<T extends ISmartPhone> {
	private ArrayList <T> phones;
	
	public PhoneShop(){
		phones = new ArrayList<T>();
		
	}
	
	
	PhoneShop(T phone){
		phones = new ArrayList<T>();
		this.phones.add(phone);
	}
	
	public void AddPhones(T[] winPhones){
		for (T windowsPhone : winPhones) {
			phones.add((T) windowsPhone);
		}
	}
	
	public void AddPhones(AndroidPhone[] androPhones){
		for (AndroidPhone androPhone : androPhones) {
			phones.add((T) androPhone);
		}
	}
	
	public void AddPhone(T phone){
		this.phones.add(phone);
	}


	
	public int CountOfPhoneWithBrand(String PhoneModel) {
		int counter = 0;
		for (T t : phones) {
			if(t.getPhoneModel().equals(PhoneModel)){
				counter+=1;
			}
		}
		return counter;
	}


	public int CountOfPhonesWithOS(String WantedOS) {
		int counter = 0;
		for (T t : phones) {
			if(t.getPhoneOS().equals(WantedOS)){
				counter++;
			}
		}
		return counter;
	}


	public void BreakContractWithBrand(String PhoneModel) {
		int a = phones.size();
		for (int i = 0; i <a; i++) {
			if (phones.get(i).getPhoneModel().equals(PhoneModel)) {
				phones.remove(i);
				i--;
				a--;
			}
		}
	}


	public StringBuilder DemoRing() {
		StringBuilder sb = new StringBuilder();
		for (T t : phones) {
			sb.append(t.getPhoneOS()+ " Phone is ringing with sound \"");
			sb.append(t.getPhoneRingtone());
			sb.append("\"");
			sb.append(System.getProperty("line.separator"));
		}
		return sb;
	}
	
	
}
