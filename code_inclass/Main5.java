
public class Main5 {

	public static void main(String[] args) {
		StringBuilder a1=new StringBuilder();
		StringBuilder a2=new StringBuilder(10);
		StringBuilder a3=new StringBuilder("Hello all people here");
		
		//a2.ensureCapacity(15);
		//System.out.println(a2.capacity());
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		System.out.println(a1.capacity());
		System.out.println(a1.length());
		
		System.out.println(a2.capacity());
		System.out.println(a2.length());
		
		System.out.println(a3.capacity());
		System.out.println(a3.length());
		
		String s1=a3.toString();
		System.out.println(s1);
		
		a3.setLength(6);
		System.out.println(a3);
		System.out.println(a3.capacity());
		
		a3.ensureCapacity(10);
		System.out.println(a3.capacity());
		
		System.out.println(a3);
		System.out.println(a3.charAt(1));
		
		char[] arr=new char[a3.length()];
		
		a3.getChars(0, a3.length(), arr, 0);
		
		for(char var:arr)
			System.out.println(var);
		
		a3.append(" everyone");
		System.out.println(a3);
		System.out.println(a3.length());
		
		//a3.append(System.getProperty("line.separator"))
		//.append("Maen").append(false); 
			
		System.out.println(a3);
		System.out.println(a3.capacity());
		System.out.println(a3.length());
		
		a3.setCharAt(0, 'M');
		System.out.println(a3);
		
		System.out.println(a3.reverse());
		
		StringBuilder j1=new StringBuilder("Hello");
		
		j1.insert(0, "Maen");
		System.out.println(j1);
		
		j1.insert(9, "all");
		System.out.println(j1);
		
		System.out.println(j1.capacity());
		
		j1.delete(0, 3);
		System.out.println(j1);
		
		j1.deleteCharAt(0);
		System.out.println(j1);
		System.out.println(j1.capacity());
		
		
		
		StringBuilder j2=new StringBuilder(10);
		System.out.println(j2.capacity());
		j2.ensureCapacity(5);
		System.out.println(j2.capacity());
		j2.ensureCapacity(50);
		System.out.println(j2.capacity());
		

	}

}
