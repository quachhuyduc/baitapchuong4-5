package Chuong5;


public class throwandthrows {

	public static void main(String[] args) {
		throwandthrows tat = new throwandthrows();
		try {
			tat.checkStatus();
			tat.connectDatabase();
		}catch (EducationException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
	public void connectDatabase() throws Exception{
		
		throw new Exception();
	}
	public void checkStatus() throws EducationException {
	
		throw new EducationException("Out of slot");


	}

}
