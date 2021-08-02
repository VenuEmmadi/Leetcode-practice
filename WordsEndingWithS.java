import java.util.*;
public class EndWithS
{    public static void main(String args[])
    {
        String sent = "This is TonyStark and i have employees ";
        System.out.println("words which ending with s: " );
        List<String> arrayList = new ArrayList<String>();
        arrayList = Words(sent); 
        for(String s: arrayList){
	        System.out.println(s);
        }
        
    }


public static List<String> Words(String sent) {
List<String> result = new ArrayList<String>();

	String str[] = sent.split(" ");
	List<String> arrayList1 = new ArrayList<String>();
	arrayList1 = Arrays.asList(str);
	List<String> arrayList2 = new ArrayList<String>();
	for(String s: arrayList1){
	    if(s.endsWith("s")||s.endsWith("S")){
	        arrayList2.add(s);
	        
	    }
	}
	
return arrayList2;
}
}