public class beaker
{
	private int max;
	private int volume;
	public beaker()
	{
		max = 5;
		volume =0;
	}
	public beaker(int m, int v)
	{
		max = m;
		volume = v;
	}
	public void dec()
	{
		volume--;
	}
	public int getVolume()
	{
		return volume;
	}
	public int getMax()
	{
		return max;
	}
	public void recieve(beaker x)
	{
		int in = x.getVolume();
		while((volume < max)&&(x.getVolume() > 0))
		{
			x.dec();
			volume++;
		}
	}
}