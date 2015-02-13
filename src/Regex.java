import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex {
	public static final String EXAMPLE_TEST = "[2014-11-18T20:22:12.343 <saml2:Assertion ID=_f22e6eba-b826-4718-85b7-45d81e11c8ac IssueInstant=2014-11-18T20:22:12.343Z ";
			

  public static void main(String[] args) {
  	String pattern1 = "(^.\\d+\\-\\d+\\-\\d+.\\d+\\:\\d+\\:\\d+.\\d+)";
  	Pattern pattern = Pattern.compile(pattern1);
  	Matcher matcher = pattern.matcher(EXAMPLE_TEST);
  	//if(matcher.matches()){
  		 //matcher.reset(); 
  		 if(matcher.find()) {  	 
  	             String date = matcher.group(1);
  	             System.out.println(date);
  	             if(date.charAt(0) == '['){
  	             	date = date.substring(1);
  	             }
  		    // String month = matcher.group(2);
  		     System.out.println(date);
  		 }
  }
	
}
