import java.util.Scanner;
class Stack
{
	public String[] item; 
	public int size;//item�ƶq
	private int top;//���V���|����
	public String pop()
	{
		if(top>-1)
		{
			String x=item[top];
			item[top]=null;
			top=top-1;
			return(x);
		}else {
			System.out.println("�w�쩳���A�L�ѥi����");
			return(null);
		}
		
	}
	public void push(String x)
	{
		if (top<(size-1))
		{
			top=top+1;
			item[top]=x;
			System.out.println("�w��J"+x);
		}else {
			System.out.println("���|�w���L�k�A��J"+x);
		}
	}
	public void list()
	{
		System.out.println("*���|����:"+top);
		System.out.println("-------���|-------");
		for(int i=size-1;i>=0;i--)//�L�X�T��item
		{
			if (item[i]!=null);
			System.out.println(item[i]);
		}
		System.out.println("------------------");
	}
	public Stack(int x)//�O�غc���D��k����void
	{
		size=x;
		item= new String[size];
		top=-1;//��ܰ��|�W�S����
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
		System.out.println("���|�j�p:"+Book.size+"��");
		//�]�w���|����item���ݩ�
		int choice =3;
		while (choice!=0)
		{
			System.out.println();
			System.out.println("���|�޲z�t��");
			System.out.println("0.���}");
			System.out.println("1.���");
			System.out.println("2.����");
			System.out.println("3.�C��");
			choice=scn.nextInt();
			if (choice==1)
			{
				System.out.println("�аݧA�n��J���Ѫ��W�r?");
				String tmp=scn2.nextLine();
				Book.push(tmp);
			}
			if (choice==3) 
			{
				System.out.println("�Ѯ�W���|�ۥH�U���y");
				Book.list();
			}
		}
		
	}
}
