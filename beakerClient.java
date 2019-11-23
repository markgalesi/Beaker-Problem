import java.util.ArrayList;
enum Operator { AtoB,AtoC,BtoA,BtoC,CtoA,CtoB}
public class beakerClient
{
	public static void main(String[] args)
	{
		int index=0;
		boolean solved=false;
		Operator previous = null;
		beakerProblem temp;
		beakerProblem next;
		ArrayList<beakerProblem> states = new ArrayList<beakerProblem>();
		states.add(new beakerProblem());
		states.add(new beakerProblem(new beaker(8,3),new beaker(5,5),new beaker(3,0),0));
		states.add(new beakerProblem(new beaker(8,3),new beaker(5,2),new beaker(3,3),0));
		states.add(new beakerProblem(new beaker(8,6),new beaker(5,2),new beaker(3,0),0));
		states.add(new beakerProblem(new beaker(8,6),new beaker(5,0),new beaker(3,2),0));
		states.add(new beakerProblem(new beaker(8,1),new beaker(5,5),new beaker(3,2),0));
		states.add(new beakerProblem(new beaker(8,1),new beaker(5,4),new beaker(3,3),0));
		states.add(new beakerProblem(new beaker(8,4),new beaker(5,4),new beaker(3,0),0));
		states.add(new beakerProblem(new beaker(8,4),new beaker(5,1),new beaker(3,3),0));
		states.add(new beakerProblem(new beaker(8,5),new beaker(5,0),new beaker(3,3),0));
		states.add(new beakerProblem(new beaker(8,0),new beaker(5,5),new beaker(3,3),0));
		states.add(new beakerProblem(new beaker(8,5),new beaker(5,3),new beaker(3,0),0));
		states.add(new beakerProblem(new beaker(8,2),new beaker(5,3),new beaker(3,3),0));
		states.add(new beakerProblem(new beaker(8,2),new beaker(5,5),new beaker(3,1),0));
		states.add(new beakerProblem(new beaker(8,7),new beaker(5,0),new beaker(3,1),0));
		states.add(new beakerProblem(new beaker(8,7),new beaker(5,1),new beaker(3,0),0));

		for(int i=0;i<states.size();i++)
		{
			System.out.println(states.get(i).toString());
				temp = states.get(i);
			for(int j=0;j<states.get(i).available().length;j++)
			{
				if(states.get(i).available()[j]!=null)
				{
					temp.pour(states.get(i).available()[j]);
					System.out.println("TEMP:" + temp.toString());
					//System.out.println(states.get(i).available()[j]);
					index++;
				}
			}
		}
			System.out.println(index);


		//states.get(0).pour(Operator.AtoB);
		//states.get(0).pour(Operator.BtoC);
		//System.out.println(states.get(0).toString());

		//index++;
		//int x=states.size();
		/*while(solved==false)
		{
			index++;
			System.out.println("index:" + index);
			for(int i=0;i<x;i++)
			{
				System.out.println(states.get(i).toString());
					for(int j=0;j<states.get(i).available().length;j++)
					{
						temp = states.get(i);
						if(states.get(i).available()[j]!=null)
						{
							System.out.println("OP:" + states.get(i).available()[j]);
							temp.pour(states.get(i).available()[j]);
							states.add(new beakerProblem(temp.getA(),temp.getB(),temp.getC(),index));
						}
					}
				x=states.size();
			}
		}*/
		/*for(int j=0;j<x;j++)
		{
			index++;
				temp = states.get(j);
			for(int i=0;i<states.get(j).available().length;i++)
			{
				System.out.println("temp:" + temp.toString());
				if(states.get(j).available()[i]!=null)
				{
					previous=states.get(j).available()[i];
					states.get(j).setPrev(previous);
					System.out.println("OP:" + states.get(j).available()[i]);
					temp.pour(states.get(j).available()[i]);
					states.add(new beakerProblem(temp.getA(),temp.getB(),temp.getC(),index));
					//states.remove(states.get(j));
				}
			}
			x=states.size();
		}*/
	}
}
