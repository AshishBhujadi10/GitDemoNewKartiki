
public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int a=3;
		int b=7;
		sum=a+b;
		System.out.println(sum);
		
		
		int abc[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int min=abc[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)
				{
					min=abc[i][j];
				}
			}
		}
		
		System.out.println(min);
		
		int mincolumn=0;
		//int max=abc[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)                      //2
					{
					
					  min=abc[i][j];
					  mincolumn=j;
					}
				}
			}                                         //=1
		int max=abc[0][mincolumn];
		int k = 0;
		while(k<3)
		{
			if(abc[k][mincolumn]>max)
			{
				max=abc[k][mincolumn];
				}
			k++;
		}
		System.out.println(max);
	}

}
