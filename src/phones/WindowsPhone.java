package phones;

public class WindowsPhone implements ISmartPhone {

	private String PhoneModel;
	private String PhoneRingtone;
	private final String PhoneOS = "Windows";
	
	public String getPhoneOS() {
		return PhoneOS;
	}

	@Override
	public String getPhoneModel() {
		return PhoneModel;
	}

	@Override
	public void setPhoneModel(String PhoneModel) {
		this.PhoneModel = PhoneModel;
		
	}

	@Override
	public void setRingTone(String PhoneRingtone) {
		this.PhoneRingtone = PhoneRingtone;
	}

	@Override
	public String getPhoneRingtone() {
		return PhoneRingtone;
	}
	
	public WindowsPhone(){
		this("Nokia","Nokia time" );
	}
	
	public WindowsPhone(String PhoneModel){
		this(PhoneModel, "Nokia time");
	}
	
	public WindowsPhone(String PhoneModel , String PhoneRingtone){
		this.PhoneModel = PhoneModel;
		this.PhoneRingtone = PhoneRingtone;
	}

	public static String WhichIsTheBestPhone() {
		return "Come on Mate.. Windows Phone";
	}

}
