package itam.examen;

public class Solucion {

    public static boolean problema(String s){
	boolean resp = false;
	int n = 1;
	StringBuilder sb = new StringBuilder();

	while(n < s.length() && !resp){
		for(int j =0; j < s.length()/n; j++){
			sb.append(s.substring(0,n));
		}
		resp = s.equals(sb.toString());

		sb = new StringBuilder();
		n++;
	}
	
	return resp;
    }
    
    public static void main(String...argv) {
	System.out.println(problema("abab"));
	System.out.println(problema("aba"));
	System.out.println(problema("gustavogustavogustavo"));
    }

}
