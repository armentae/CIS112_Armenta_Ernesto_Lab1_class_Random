public class RandomNumber 
{
	public int GetANumber_between_1_and_10() 
	{
		int computerNum;
		computerNum = 0 + (int) (Math.random() * 10);
		return computerNum;
	}
	public int GetANumber(int high)
	{
		int highNumber = 0 + (int) (Math.random() * high);
		return highNumber;
	}

}

