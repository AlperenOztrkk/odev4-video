package PolymorphismDemo;

public class Main {

	public static void main(String[] args) {
	//	BaseLoggger[] logggers=new BaseLoggger[] {new FileLogger(),new EmailLogger(),new DataBaseLogger()};
	//	for(BaseLoggger logger:logggers) {
	//		logger.Log("Log mesajı");
			
	//	}
		
		CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
		customerManager.Add();
	}

}
