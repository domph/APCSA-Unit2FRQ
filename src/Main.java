public class Main {
	public static void main(String[] args) {
		/* A
		* Write a statement to create a LightSequence object gradShow that has the initial light sequence "0101 0101 0101".
		* Write the statement below.
		* */
		LightSequence gradShow = new LightSequence("0101 0101 0101");
		// Object initialization

		/* B
		* Write a statement that will call the display method to display the light sequence for the gradShow object.
        * Write the statement below.
		* */
		gradShow.display();
		// Basic function call

		/* C
		* Write a statement that will be used to update the gradShow light sequence to "0011 0011 0011".
        * Write the statement below.
		* */
		gradShow.changeSequence("0011 0011 0011");
		// Basic function call w/ parameter as provided

		/* D
		* Write a code segment that will call the insertSegment method to insert the segment "1111 1111" in the current sequence for gradShow at index 4. The resulting sequence will be stored in the string resultSeq.
        * Write the code segment below.
		* */
		String resultSeq = gradShow.insertSegment("1111 1111", 4);
		// Basic function call w/ parameters as provided

		/* E
		* Assume that the string oldSeq has been properly declared and initialized and contains the string segment. Write a code segment that will remove the first occurrence of segment from oldSeq and store it in the string newSeq. Consider the following examples.
        * If oldSeq is "1100000111" and segment is "11", then "00000111" should be stored in newSeq.
        * If oldSeq is "0000011" and segment is "11", then "00000" should be stored in newSeq.
        * If oldSeq is "1100000111" and segment is "00", then "11000111" should be stored in newSeq.
		* */
		// Sample data to test
		String oldSeq = "1100000111";
		String segment = "11";

		int Index = oldSeq.indexOf(segment);
		String newSeq = oldSeq.substring(0, Index) + oldSeq.substring(Index + segment.length());

		System.out.println(newSeq);
		// Testing the various sample data from the question confirms that the code is correct

		/* F
		* Two lights will be arranged on a two-dimensional plane. The vertical distance between the two lights is stored in the double variable a. The horizontal distance between the two lights is stored in the double variable b.
        * The straight-line distance between the two lights is given by the formula square root of the quantity a squared plus b squared.
        * Write a code segment that prints the straight-line distance between the two lights according to the formula above.
		* */
		// Sample data to test
		double a = 3;
		double b = 4;

		System.out.println(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
		// Expected output = 5 (per Pythagorean Theorem) --> correct
	}
}
