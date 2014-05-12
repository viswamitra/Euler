package topcoder;

public class EasyHomework {
	public String determineSign(int[] A) {
		int product = 1;
		for(int i: A) {
			if (i == 0) {
				product =0;
				break;
			}else if ( i >> 31 != 0) {
				product *= -1;
			}else {
				product *= 1;
			}
		}
		if (product == 1) {
			return "POSITIVE";
		}else if (product == -1) {
			return "NEGATIVE";
		}else {
			return "ZERO";
		}
	}
}
