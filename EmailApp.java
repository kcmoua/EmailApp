package emailapp;

public class EmailApp {
	
	public static void main(String[] args) {
		Email em1 = new Email("John", "Smith");
//		em1.setMailboxCapacity(1000);
//		em1.setAlternateEmail("kcmoua@ncsu.edu");
//		
//		System.out.println(em1.getMailboxCapacity());
//		System.out.println(em1.getAlternateEmail());
//		
//		em1.changePassword("newpassw0rd!");
//		System.out.println(em1.getPassword());
		
		System.out.println(em1.showInfo());
	}
	
}
