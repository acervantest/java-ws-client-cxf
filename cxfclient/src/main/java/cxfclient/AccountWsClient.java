package cxfclient;

import java.net.MalformedURLException;
import java.net.URL;

import com.template.BankAccount;
import com.template.BankAccountService;
import com.template.CreditCardApplication;
import com.template.CreditCardInformation;

public class AccountWsClient {

	public static void main(String[] args) {
		
		try {
			
			BankAccountService service = new BankAccountService(
					new URL("http://localhost:8080/cxfwebs/services/account?wsdl"));
		    
			BankAccount port = service.getBankAccountPort();
			
			CreditCardApplication application = new CreditCardApplication();
			application.setName("applicant name");
			application.setLastname("applicant last name");
			application.setAge(25);
			application.setCountry("MEX");
			
			CreditCardInformation inforCard = port.newApplication(application);
			
			System.out.println("Name: "+inforCard.getHolderName());
			System.out.println("LastName: "+inforCard.getHolderLast());
			System.out.println("Card Num: "+inforCard.getCardNum());
			System.out.println("Security Code: "+inforCard.getSecCode());
			System.out.println("Country issue: "+inforCard.getIssue());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
