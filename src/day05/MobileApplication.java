package day05;

import java.util.Scanner;

public class MobileApplication {

	public static void main(String[] args) {

		Mobile refMobile = new Mobile();
		Whatsapp refWhatsapp = new Whatsapp();
		Chat refChat = new Chat();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter message: ");
		String myText = sc.next();
		
		refChat.setChat(myText);
		refMobile.setRefWhatsApp(refWhatsapp);
		refWhatsapp.setRefChat(refChat);
		
		System.out.println(refMobile.getRefWhatsApp().getRefChat().getChat());
	}

}
