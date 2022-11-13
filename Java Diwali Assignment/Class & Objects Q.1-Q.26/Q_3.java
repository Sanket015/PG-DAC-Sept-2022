//Q.3. Java Program to Illustrates Use of Instance Inner Class

class Batsman
{
	int totRuns;
	int totMatches;
	
	Batsman()
	{}
	Batsman(int totRuns,int totMatches)
	{
		this.totRuns = totRuns;
		this.totMatches = totMatches;
	}
	void printAverage()
	{
		AvgCalculator avgCal = new AvgCalculator();
		double res = avgCal.calAverage();
		System.out.println("Batsman average is: "+res);
	}
	
	// Inner class
	class AvgCalculator
	{
		double avg;
		double calAverage()
		{
			avg = (totRuns/totMatches);
			return avg;
		}
	}
}

class Q_3
{
	public static void main(String[] args)
	{
		Batsman bats1 = new Batsman(5000,200);
		bats1.printAverage();
		
		Batsman bats2 = new Batsman(2000,100);
		Batsman.AvgCalculator avgCal2 = bats2.new AvgCalculator();
		double res = avgCal2.calAverage();
		System.out.println("Batsman average is: "+res);
		
		
	}
}

/*
C:\Users\Sanket\OneDrive\Desktop\CDAC\Java Diwali Assignments\Class & Objects Q.1-Q.26>java Q_3
Batsman average is: 25.0
Batsman average is: 20.0
*/
