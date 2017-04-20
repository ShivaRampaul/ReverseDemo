class Reverse {
	public void reverseR(String sentR) { //sentR: string input
		// String recRev(String s) {
		// 	Char result;
		// 	if (s == sentR.length()) {
		// 		return (sentR.length() - 1);
		// 	}
		// 	result = recRev(s-1)

		// }
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
		System.out.println(hi.reverseI(s));
	}
}