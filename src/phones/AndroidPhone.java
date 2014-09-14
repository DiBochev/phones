package phones;

public class AndroidPhone implements ISmartPhone{

	private String PhoneModel;
	private String PhoneRingtone;
	private String PhoneOS = "Android";
	
	@Override
	public String getPhoneModel() {
		return PhoneModel;
	}

	@Override
	public void setPhoneModel(String PhoneModel) {
		this.PhoneModel = PhoneModel;
	}

	public String getPhoneOS() {
		return PhoneOS;
	}

	@Override
	public void setRingTone(String PhoneRingtone) {
		this.PhoneRingtone = PhoneRingtone;
	}

	@Override
	public String getPhoneRingtone() {
		return PhoneRingtone;
	}

	public AndroidPhone(String PhoneModel , String PhoneRingtone){
		this.PhoneModel = PhoneModel;
		this.PhoneRingtone = PhoneRingtone;
	}
	
	public AndroidPhone(String PhoneModel) {
		this(PhoneModel , "ring ring");
	}
	
	public AndroidPhone() {
		this("Samsung" , "ring ring");
	}

}