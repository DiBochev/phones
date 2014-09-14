package phones;


public class Main {

	public static void main(String[] args) {
		

		//add that phone to the shop
		PhoneShop<ISmartPhone> shop = new PhoneShop<ISmartPhone>();

		//gets 10 windows phone
		WindowsPhone[] winPhones = new WindowsPhone[10000];
		for (int i = 0; i < winPhones.length; i++)
		{
			winPhones[i] = new WindowsPhone();
		}
		AndroidPhone[] aPhones = new AndroidPhone[10000];
		for (int i = 0; i < aPhones.length; i++)
		{
			aPhones[i] = new AndroidPhone();
		}
		//add them to the shop too
		//default brand is "Nokia"
		//this should work with list as well, not only massive
		shop.AddPhones(winPhones);
		shop.AddPhones(aPhones);
		//add new phone with brand Sumsung
		AndroidPhone phone = new AndroidPhone("Sumsung");
		shop.AddPhone(phone);

		//get a HTC Windows phone (the brand is HTC)
		WindowsPhone HTCWinPhone = new WindowsPhone("HTC");

		//add this to the shop
		shop.AddPhone(HTCWinPhone);

		//Nokias are 10
		//this should return "Nokia phones are 10"
		System.out.println("Nokia phones are " + shop.CountOfPhoneWithBrand("Nokia"));

		//Windowsed are 11
		//this should return "Windows phones are 11"
		System.out.println("Windows phones are " + shop.CountOfPhonesWithOS("Windows"));

		//Androids are 1 (the Sumsung)
		//this should return "Android phones are 1"
		System.out.println("Android phones are " + shop.CountOfPhonesWithOS("Android"));

		//this shop works with Nokia no more
		//delete all of them from the shop
		shop.BreakContractWithBrand("Nokia");
		System.out.println("No nokias");
		//Nokias are 0
		//this should return "Nokia phones are 0"
		System.out.println("Nokia phones are " + shop.CountOfPhoneWithBrand("Nokia"));

		//Windowsed are 1 (the HTC)
		//this should return "Windows phones are 1"
		System.out.println("Windows phones are " + shop.CountOfPhonesWithOS("Windows"));

		//Androids are 1 (the Sumsung)
		//this should return "Android phones are 1"
		System.out.println("Android phones are " + shop.CountOfPhonesWithOS("Android"));
		
		//Ask WindowsPhone which is the best phone
		//this shoud say "Come on Mate.. Windows Phone"
		System.out.println(WindowsPhone.WhichIsTheBestPhone());
		
		//add a Nokia
		//so there are 2 windows and one android in the shop
		shop.AddPhone(new WindowsPhone());
		
		//forces all current phones in the shop to ring
		//windows phone is ringing with "Nokia Time" sound (constant)
		//android phone is ringing with "ring ring" sound (constant)
		//this should return:
		//Android Phone is ringing with sound "ring ring"
		//Windows Phone is ringing with sound "Nokia time"
		//Windows Phone is ringing with sound "Nokia time"
		System.out.println(shop.DemoRing());
	}

}
