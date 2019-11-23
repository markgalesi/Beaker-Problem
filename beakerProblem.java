import java.util.ArrayList;
enum Operator {AtoB,AtoC,BtoA,BtoC,CtoA,CtoB}
public class beakerProblem
{
		int i;
		beaker A;
		beaker B;
		beaker C;
		Operator prev;

	public beakerProblem()
	{
		i=0;
		A = new beaker(8,8);
		B = new beaker(5,0);
		C = new beaker(3,0);
	}
	public beakerProblem(beaker a, beaker b, beaker c,int index)
	{
		i=index;
		A = a;
		B = b;
		C = c;
	}
	public void setPrev(Operator p)
	{
		prev=p;
	}

	public int getIndex()
	{
		return i;
	}
	public beaker getA()
	{
		return A;
	}
	public beaker getB()
	{
		return B;
	}
	public beaker getC()
	{
		return C;
	}
	public Operator[] available()
	{
		Operator result[] = Operator.values();
		if(A.getVolume() == A.getMax())
		{
			result[2]=null;
			result[4]=null;
		}
		if(B.getVolume() == B.getMax())
		{
			result[0]=null;
			result[5]=null;
		}
		if(C.getVolume() == C.getMax())
		{
			result[1]=null;
			result[3]=null;
		}
		if(A.getVolume() == 0)
		{
			result[0]=null;
			result[1]=null;
		}
		if(B.getVolume() == 0)
		{
			result[2]=null;
			result[3]=null;
		}
		if(C.getVolume() == 0)
		{
			result[4]=null;
			result[5]=null;
		}
		return result;
	}

	public void pour(Operator X)
	{
		switch(X) {
			case AtoB:
				B.recieve(A);
				break;
			case AtoC:
				C.recieve(A);
				break;
			case BtoA:
				A.recieve(B);
				break;
			case BtoC:
				C.recieve(B);
				break;
			case CtoA:
				A.recieve(C);
				break;
			case CtoB:
				B.recieve(C);
				break;

			default:
				break;
		}
	}

	public String toString()
	{
		String result = "Index:" + i + "  (";
		result += A.getVolume() + ",";
		result += B.getVolume() + ",";
		result += C.getVolume() + ")";
		return result;
	}
}