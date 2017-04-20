class Reverse {

	public String reverseR(String sentR, int b) { //sentR: string input
		if (b == sentR.length()-1) {
			return sentR.substring(b, b+1);
		}
		String v = reverseR(sentR, b+1) + sentR.substring(b, b+1);
		return v;
	}

	public String reverseI(String sentI) { //sentI: string input
		char sentArray[] = new char[sentI.length()];
		for (int i = 0; i < sentI.length(); i++) {
			int v = sentI.length() - (i + 1);
			sentArray[v] = sentI.charAt(i);
		}
		String revStr = new String(sentArray);
		return revStr;
	}
}

class ReverseDemo {
	public static void main(String args[]) {
		String s = "hello";
		Reverse hi = new Reverse();
		System.out.println(hi.reverseR(s, 0));
	}
}

// int b = 0;

// 	public String reverseR(String sentR) { //sentR: string input
// 		char sentArray[] = new char[sentR.length()];
// 		if (b < sentR.length()) {
// 			int v = sentR.length() - (b + 1);
// 			sentArray[v] = sentR.charAt(b);
// 			b++;
// 			reverseR(sentR);
// 		}
// 		String revStr = new String(sentArray);
// 		return revStr;
// 	}