package triangleIQAssessment;

public class SetPermutations {
	
	List<List<Moves>> generateAllPermutations(ArrayList<Moves> input)
	{
	    List<Element> output = new ArrayList<Element>();
	    if (input.size() == 0)
	        return output;
	    for (Element first : input) {
	        for (List<Element> sequence : generateAllPermutations(input - first))
	            output.add(first + sequence);
	    }
	}

}
