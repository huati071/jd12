import java.util.Scanner;
class Stack
{
	public String[] item; 
	public int size;//item數量
	private int top;//指向堆疊頂端
	public String pop()
	{
		if(top>-1)
		{
			String x=item[top];
			item[top]=null;
			top=top-1;
			return(x);
		}else {
			System.out.println("已到底部，無書可取走");
			return(null);
		}
		
	}
	public void push(String x)
	{
		if (top<(size-1))
		{
			top=top+1;
			item[top]=x;
			System.out.println("已放入"+x);
		}else {
			System.out.println("堆疊已滿無法再放入"+x);
		}
	}
	public void list()
	{
		System.out.println("*堆疊頂端:"+top);
		System.out.println("-------堆疊-------");
		for(int i=size-1;i>=0;i--)//印出三個item
		{
			if (item[i]!=null);
			System.out.println(item[i]);
		}
		System.out.println("------------------");
	}
	public Stack(int x)//是建構元非方法不用void
	{
		size=x;
		item= new String[size];
		top=-1;//表示堆疊上沒有書
	}
}
public class MyWork12 
{
	static Scanner scn=new Scanner(System.in);
	static Scanner scn2=new Scanner(System.in);
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Stack Book =new Stack(5);
		System.out.println("堆疊大小:"+Book.size+"本");
		//設定堆疊元素item的屬性
		int choice =3;
		while (choice!=0)
		{
			System.out.println();
			System.out.println("書疊管理系統");
			System.out.println("0.離開");
			System.out.println("1.放書");
			System.out.println("2.取書");
			System.out.println("3.列書");
			choice=scn.nextInt();
			if (choice==1)
			{
				System.out.println("請問你要放入的書的名字?");
				String tmp=scn2.nextLine();
				Book.push(tmp);
			}
			if (choice==3) 
			{
				System.out.println("書桌上還疊著以下書籍");
				Book.list();
			}
		}
		
	}
}
