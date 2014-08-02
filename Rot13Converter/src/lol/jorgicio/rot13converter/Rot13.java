package lol.jorgicio.rot13converter;

public class Rot13 {
	public Rot13(){
	}
	public String rot13Method(String s){
		StringBuilder s_b = new StringBuilder();
		for (int i=0; i < s.length(); i++ ){
			char c = s.charAt(i);
			if ( (c >= 'a' && c <= 'm') || (c >= 'A' && c <= 'M'))
				c += 13;
			else if ((c >= 'n' && c <= 'z') || (c >= 'N' && c <= 'Z'))
				c -= 13;
			s_b.append(c);
		}
		return s_b.toString();
	}
}
