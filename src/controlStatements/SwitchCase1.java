package controlStatements;

public class SwitchCase1 {

	public static void main(String[] args) {

		String weekName="Sunday";
		
		switch(weekName)
		{
		case "Sunday": System.out.println(1);
		break;
		case "Monday": System.out.println(2);
		break;
		case "Tuesday": System.out.println(3);
		break;
		case "Wednesday": System.out.println(4);
		break;
		case "Thursday": System.out.println(5);
		break;
		case "Friday": System.out.println(6);
		break;
		case "Saturday": System.out.println(7);
		default : System.out.println("invalid Week");
		}

	}

}
