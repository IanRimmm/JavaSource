package day04;

public class DevEnvironment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] lang = new String[3];
		String[] script = new String[3];
		String[] dbms = {"Oracle","ms-sql","my-sql"};
		
		lang[0]="JAVA"; lang[1]="C#"; lang[2]="C";
		script[0]="JSP"; script[1]="JSP"; script[2]="JSP";
		
		for(int i=0; i<=2; i++) {
			System.out.println(lang[i]+"-"+script[i]+"-"+dbms[i]);
		}
	}

}
