package javaflowchart;

public class FlowChart {

	private int result;

	public int EnterFlowChart(int firstInput, int secondInput, boolean flowchartBool)
	{
		
		if(flowchartBool == true)
		{
			
			return result = firstInput + secondInput;
		}
		else if ( flowchartBool == false)
		{
			
			return  result = firstInput * secondInput;
		}
		
		return result;
		
	}
	
	public void TakeInt(int a)
	{
		if(a > 2000)
		{
			System.out.println("A");
		
		
		// If A > 2000 \\ 
		 if (a > 6000)
		{
			System.out.println("C");
			return;
		} 
		
		if (a < 6000)
		{
			System.out.println("B");
		}
		
		 if (a > 4000)
		{
			System.out.println("D");
		}
		 if (a < 4000)
		{
			System.out.println("E");
		}
		
		
		
		// If (!A > 2000) \\\
		
		if (a < 2000)
		{
			System.out.println("1");
		
		if ( a < 100)
		{
			System.out.println("2");
			return;
		}
		
		 if( a > 100)
		{
			System.out.println("3");
		}
		
		 if (a > 600)
		{
			System.out.println("5");
		}
		
		
		if (a < 600)
		{
			System.out.println("4");
		}
		
		 if(a > 500)
		{
			System.out.println("6");
			return;
		}
		
		 if(a < 500)
		{
			System.out.println("7");
			return;
		}
	}
	
	
		}		
}
	
}
