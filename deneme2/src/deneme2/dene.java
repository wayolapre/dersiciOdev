package deneme2;
import org.apache.commons.lang3.StringUtils;

public class dene {

	public static void main(String[] args) {
		String berkay = "hatallı meti  n ";
		
		String duzgunMetın =StringUtils.deleteWhitespace(berkay);
		System.out.print(duzgunMetın);
	}

}
