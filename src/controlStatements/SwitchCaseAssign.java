package controlStatements;

public class SwitchCaseAssign {

	public static void main(String[] args) {

	   /* if Monday--->this is first day of week
		  if Tuesday--->this is second day of week
		  if Wednesday--->this is third day of week
		  if Thursday--->this is fourth day of week
		  if Friday--->this is fifth day of week
		  if Saturday--->this is sixth day of week
		  if Sunday--->this is seventh day of week */
		
		String days;
		days="Saturday";
		
		switch (days)
		{
		case "Monday":  System.out.println("this is 1st day of week");
	    break;
			
		case "Tuesday": System.out.println("this is 2nd day of week");
		break;
		
		case "Wednesday": System.out.println("this is 3rd day of week");
		break;
		
		case "Thursday": System.out.println("this is 4th day of week");
		break;
		
		case "Friday": System.out.println("this is 5th day of week");
		break;
		
		case "Saturday": System.out.println("this is 6th day of week");
		break;
		
		case "Sunday": System.out.println("this is 7th day of week");
		break;
		
		default:System.out.println("Please enter valid days");
			break;
		}
		
		
	}

}
