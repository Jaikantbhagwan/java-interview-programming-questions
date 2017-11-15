import java.util.HashMap;

public class GenericsType<T> {

	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	
	public static void main(String args[]){
		GenericsType<String> type = new GenericsType<>();
		//type.set("Pankaj"); //valid		
		
		GenericsType type1 = new GenericsType(); //raw type
		type1.set("Pankaj"); //valid
		type1.set(new Integer(10)); //valid and autoboxing support
		
		duplicateCharacters("Java J2EE Java JSP J2EE");
		 
		duplicateCharacters("All Is Well");
	 
		duplicateCharacters("Done And Gone");
		
		
	}
	
	
	public static void duplicateCharacters(String str) {
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		char[] charArray = str.toCharArray();
		
		for(char c : charArray) {
			
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		
		System.out.println(hm);
	}
}