package LogicalPrograms;

public class StringRevEachword {

	public static void main(String[] args) {
		String Str="Hello good evening";
		//Expected result= gnineve doog olleH
		//Expected = olleh doog gnineve
		
		String [] Word=Str.split(" ");//Splitted string
		String RevS="";
		
		for(String W: Word) {//Outer loop
			String StringWord="";
			
			for(int i=W.length()-1;i>=0;i--) {//inner loop
				
				StringWord=StringWord+W.charAt(i);
				}
			RevS=RevS+StringWord+" ";
			}
		System.out.println(RevS);

	}

}
