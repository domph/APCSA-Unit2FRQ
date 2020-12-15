public class Main {
	public static void main(String[] args) {
		/* A */
		LightSequence gradShow = new LightSequence("0101 0101 0101");

		/* B */
		gradShow.display();

		/* C */
		gradShow.changeSequence("0011 0011 0011");

		/* D */
		String resultSeq = gradShow.insertSegment("1111 1111", 4);

		/* E */
		String oldSeq = "1100000111";
		String segment = "11";

		int Index = oldSeq.indexOf(segment);
		String newSeq = oldSeq.substring(0, Index) + oldSeq.substring(Index + segment.length());

		System.out.println(newSeq);

		/* F */
		double a = 3;
		double b = 4;

		System.out.println(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
	}
}
