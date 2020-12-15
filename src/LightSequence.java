public class LightSequence  {

	String Sequence;

	/** The parameter seq is the initial sequence used for
	 * the light display
	 */

	public LightSequence(String seq) {
		Sequence = seq;
	}

	/** Inserts the string segment in the current sequence,
	 * starting at the index ind. Returns the new sequence.
	 */

	public String insertSegment(String segment, int ind) {
		Sequence = Sequence.substring(0, ind) + segment + Sequence.substring(ind);
		return Sequence;
	}


	/** Updates the sequence to the value in seq
	 */

	public void changeSequence(String seq) {
		Sequence = seq;
	}


	/** Uses the current sequence to turn the light on and off
	 * for the show
	 */

	public void display() {
		System.out.println(Sequence);
	}

}