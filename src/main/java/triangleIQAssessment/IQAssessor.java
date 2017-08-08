package triangleIQAssessment;

public class IQAssessor {

	public static void main(String[] args) {
		char[] boardPosition = new char[15];
		boardPosition[0] = 'O';
		for (int i=1; i<15; i++) {
			boardPosition[i] = 'X';
		}
		System.out.println("An 'X' indicates a peg and an 'O' indicates an empty space:");
		System.out.println();
		System.out.println("    "+boardPosition[0]+"    ");
		System.out.println("   "+boardPosition[1]+" "+boardPosition[2]+"   ");
		System.out.println("  "+boardPosition[3]+" "+boardPosition[4]+" "+boardPosition[5]+"  ");
		System.out.println(" "+boardPosition[0]+" "+boardPosition[7]+" "+boardPosition[8]+" "+boardPosition[9]+" ");
		System.out.println(boardPosition[10]+" "+boardPosition[11]+" "+boardPosition[12]+" "+boardPosition[13]+" "+boardPosition[14]);
	}

}
