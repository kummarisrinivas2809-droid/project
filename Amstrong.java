class  Amstrong
{
	public static void main(String[] args) 
	{
		int a=153,res=0,temp=a;
		while (a>0)
		{	
        int ext =a%10;
		res = res+(ext*ext*ext);
		a=a/10;
		}
			if (res==temp)
			{
             System.out.println("amstrong");
			}
			 else 
			{
             System.out.println(" not amstrong");
			 }
      }
}