package ���ǽ�;

import java.util.Scanner; // ��ĳ�� ����
import java.text.SimpleDateFormat; // �ð��� �ؽ�Ʈȭ
import java.util.Date; // ��ǻ���� �ð��� �ޱ�
import java.util.Calendar; //CalendarŬ������ ���� ��,��,��,�ð��� �ޱ�

class restaurant // ������� �λ縻
{
	void restaurant() //
	{
		System.out.println(" '��' Chef ��������� ���� �����е��� ȯ���մϴ�. ");
		System.out.println(" '��' Chef ��������� �����ð��� 9:00 ~ 21:00 �Դϴ�. ");
		System.out.println("  �ֹ� ������ �ð���  9:00 ~ 21:00���� �Դϴ�.\n ");
		System.out.println("  ���� ��������� ���� ǰ���� ���� ���������� ��Ʈ�޴� 3������ �����Ǿ��ֽ��ϴ�.");
		System.out.println("  ���Ͻô� ��Ʈ�� �������ּ���. \n");
		System.out.println("  set menu1 : ����Ÿ���� ���� ������ũ ���� ����Ʈ ");
		System.out.println("  set menu2 : ����Ÿ���� ���� ������ũ ����Ʈ (����x) ");
		System.out.println("  set menu3 : ����Ÿ���� ���� ������ũ ���� (����Ʈx) ");
	}
}

class menu
{
	
	void appetizer() //����Ÿ���� �޴� 
	{
		System.out.println("appetizer menu \n");
		System.out.println("���Ͻô� ���� �������ּ���. ");
		System.out.println("1.��¥����ġ���丶�� 2.ī���� 3.����");
	}//�丶�並 ���쿡 ���� ��¥���� ġ� �������� �� �巹���� �Ѹ� ��ǥ���� ����Ÿ�����̴�
	//
	void soup() //���� �޴�
	{
		System.out.println("soup menu\n");
		System.out.println("���Ͻô� ���� �������ּ���.");
		System.out.println("1.�κ� ��ȣ�� ��Ǫ 2.����ݸ� ��Ǫ 3.����� ��Ǫ");
	}
	void steak() // ������ũ �޴�
	{
		System.out.println("steak menu \n ");
		System.out.println("���Ͻô� ���� �������ּ���.");
		System.out.println("1.�ӽ��� ������ ������ũ �� �� 2.���� ������ 3.��� ȭ�̾� �׸� ������ũ �� ����");
	}// �ӽ��� �׷��̺� �ҽ��� ������ ������ ������ũ
	// �߻�� �ҽ��� ������ ������ ��췯�� �ɵ�� ������ũ
	// �������� ���� ����ġ ���� ä����� ������ũ
	
	void beverage() // ���� �޴�
	{
		System.out.println("Beverage menu \n ");
		System.out.println("���Ͻô� ���� �������ּ���.");
		System.out.println("1.ź������ 2.�������꽺 3.���̵�");
	}
	void Dessert() // ����Ʈ �޴�
	{
		System.out.println("dessert menu \n");
		System.out.println("���Ͻô� ���� �������ּ���.");
		System.out.println("1.Ƽ��̼� ����ũ 2.���̽�ũ�� 3.�������");
	}

}//�޴� Ŭ���� ()

class receipt extends  menu // menu �� receipt�� ���  
//
{
	int appetizer;
	int soup;
	int steak;
	int beverage;
	int Dessert;
	public receipt(int a, int s, int st, int b,int d ) //������
	{
		appetizer = a;
		soup  = s;
		steak = st;
		beverage = b;
		Dessert = d;
	}
	public receipt(int a, int s, int st,int d) // ������ �����ε�  
	{
		appetizer = a;
		soup  = s;
		steak = st;
		Dessert = d;
	}
	// ? ���Ḧ ������ �ʴ� �մ�
	
	public receipt(int a, int s, int st,double b) // ������ �����ε�
	// int b�� ���� ���� ���� ������ ������ ���� �ε��� �Ű������� Ÿ�԰� ������ �޶�� �ϴµ� 
	// int b�� �������ָ� ���� ������ �����ε���  Ÿ���� ���Ƽ� ������ ���⶧���� int ��� double�� �����Ͽ���.
	{
		appetizer = a;
		soup  = s;
		steak = st;
		beverage = (int) b;
		
	}// ? ����Ʈ�� ������ �ʴ� �մ�
	
		
	int receipt1(int a, int s, int st, int b, int d) //�޼ҵ�
	{
		
		int Totalpay = a+ s+ st+ b+ d; // ����Ÿ����+����+������ũ+����+����Ʈ ����
		
		return Totalpay;
		
	}//��Ʈ1 ���ý�
	
	int receipt1(int a, int s, int st,  int d) //�޼ҵ� �����ε�
	{
		int Totalpay = a+ s+ st+ d; // ����Ÿ����+����+������ũ+����Ʈ ����
		return Totalpay;
	}//��Ʈ2 ���ý�
	
	int receipt1(int a, int s, int st,double b ) //�޼ҵ� �����ε�
	{
		
		int Totalpay = (int) (a+ s+ st+ b); // ����Ÿ����+����+������ũ+���� ����
		return Totalpay;
	}//��Ʈ3 ���ý�

}

public class gun{ //���� 
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in); // ��ĳ�� ����
	
	restaurant rt = new restaurant(); // �λ縻 ��ü
	menu menu1 = new menu(); //�޴� ��ü
	receipt gun1 = new receipt(0,0,0,0,0); // receipt ��ü

	rt.restaurant(); // �λ縻 ȣ��
	
	int sum=0; // �Ѿ� ��� ����
	int mm; // ��Ʈ�޴� 123 ���� �� �Է½� �ٽùޱ� ���� ����ġ ����
	int z=0; // ��Ʈ�޴� 123 ���ý� ���߿� ��°��� ���� ���� 
	
	do
	{
		mm = scan.nextInt(); // ����ġ��
	if (1==mm)
	{
	
		
		System.out.println("  set menu1 ���ÿϷ� \n");
		sum= gun1.receipt1(3000,4000,12000,3500,3500); // �ѱݾ� 26000
		z = 1;
	}
	else if(2==mm)
	{
		System.out.println("  set menu2 ���ÿϷ� \n");
		sum = gun1.receipt1(3000,4000,12000,0,3500); // �ѱݾ� 22500
		//��Ʈ 2�� ���ᰡ ���⶧���� 4��° beverage ���� 0 ��
		z = 2;
	}
	else if(3==mm)
	{
		System.out.println("  set menu3 ���ÿϷ� \n");
		sum = gun1.receipt1(3000,4000,12000,3500,0); // �ѱݾ� 22500
		//��Ʈ 3�� ����Ʈ�� ���⶧���� 5��° Dessert ���� 0 �Է�
		z = 3;	
	}
	else
	{
		System.out.println("   set 1 2 3 �߿��� �������ּ���!.\n");
		System.out.println("   �ٽ� �Է� ���ּ���!");
	}
	}while(mm !=3 && mm!=1&&mm!=2);
	
	String appetizer = "''"; // ������ ����� ���� ����Ÿ����   ���� ����
	String soup = "''"; // ������ ����� ���� ���� ���� ����
	String steak = "''"; // ������ ����� ���� ������ũ �� ����  ���� ����
	String Beverage = "''"; // ������ ����� ���� ����  ���� ����
	String dessert = "''"; // ������ ����� ���� ����Ʈ  ���� ����
	
	boolean TorF = true;//������
	while(TorF) // �޴� ������ ���� �ݺ���
		{	
			System.out.println("  � �޴��� ���ðڽ��ϱ�?");
			System.out.println("  1.����Ÿ���� 2. ���� 3. ������ũ 4.���� 5.����Ʈ\n");
			int a = scan.nextInt();
			if(a==1)
			{
				menu1.appetizer();
				int a1 = scan.nextInt();
				if(a1==1){
					System.out.println("�����Ͻ� ����Ÿ������ ��¥����ġ���丶�� �Դϴ�.\n");		
					appetizer = "'��¥����ġ���丶��'";
					
				}
				else if(a1==2){
					System.out.println("�����Ͻ� ����Ÿ������ ī���� �Դϴ�.\n");
					appetizer = "'ī����'";
					}
				else if(a1==3){
					System.out.println("�����Ͻ� ����Ÿ������ ���� �Դϴ�.\n");
					appetizer = "'����'";
				}	
				else
				{
					System.out.println("�߸��Է��ϼ̽��ϴ�. 1 2 3 �߿� �������ּ���");
				}
			}//"1.��¥����ġ���丶�� 2.ī���� 3.����"
			else if(a==2)
			{
				menu1.soup();
				int a1 = scan.nextInt();
				if(a1==1){
				
					System.out.println("�����Ͻ� ��Ǫ�� �κ� ��ȣ�� ��Ǫ �Դϴ�.\n");
					soup = "'�κ� ��ȣ�� ��Ǫ'";
				}
				else if(a1==2){
				
					System.out.println("�����Ͻ� ��Ǫ�� ����ݸ� ��Ǫ �Դϴ�.\n");
					soup = "'����ݸ� ��Ǫ'";
				}
				else if(a1==3){
				
					System.out.println("�����Ͻ� ��Ǫ�� ����� ��Ǫ �Դϴ�.\n");
					soup = "'����� ��Ǫ'";
				}
				else{
					System.out.println("�߸��Է��ϼ̽��ϴ�. 1 2 3 �߿� �������ּ���");
				}
			}
			//"1.�κ� ��ȣ�� ��Ǫ 2.����ݸ� ��Ǫ 3.����� ��Ǫ"
			else if(a==3)
			{
				menu1.steak();
				int a1 = scan.nextInt();
				if(a1==1){
				
					System.out.println("�����Ͻ� ������ũ�´� �ӽ��� ������ ������ũ �� �� �Դϴ�.\n");
					steak = "'�ӽ��� ������ ������ũ �� ��'";
				}
				else if(a1==2){
				
					System.out.println("�����Ͻ� ������ũ�´� ���� ������ �Դϴ�.\n");
					steak = "'���� ������'";
				}
				else if(a1==3){
				
					System.out.println("�����Ͻ� ������ũ�´� ��� ȭ�̾� �׸� ������ũ �� ���� �Դϴ�.\n");
					steak = "'��� ȭ�̾� �׸� ������ũ �� ����'";
				}
				else{
					System.out.println("�߸��Է��ϼ̽��ϴ�. 1 2 3 �߿� �������ּ���");
				}
			}//1.�ӽ��� ������ ������ũ �� �� 2.���� ������ 3.��� ȭ�̾� �׸� ������ũ �� ����
			else if(a==4)
			{
				menu1.beverage();
				int a1 = scan.nextInt();
				if(a1==1){
				
					System.out.println("�����Ͻ� ����� ź������ �Դϴ�.\n");
					Beverage = "'ź������'";
				}
				else if(a1==2){
				
					System.out.println("�����Ͻ� ����� ������ �꽺 �Դϴ�.\n");
					Beverage = "'������ �꽺'";
				}
				else if(a1==3){
				
					System.out.println("�����Ͻ� ����� ���̵� �Դϴ�.\n");
					Beverage = "'���̵�'";
				}
				else{
					System.out.println("�߸��Է��ϼ̽��ϴ�. 1 2 3 �߿� �������ּ���");
				}
			}//1.ź������ 2.�������꽺 3.���̵�
			else if(a==5)
			{
				menu1.Dessert();
				int a1 = scan.nextInt();
				if(a1==1){
				
					System.out.println("�����Ͻ� ����Ʈ�� Ƽ��̼� ����ũ �Դϴ�.\n");
					dessert = "'Ƽ��̼� ����ũ'";
				}
				else if(a1==2){
				
					System.out.println("�����Ͻ� ����Ʈ�� ���̽�ũ�� �Դϴ�.\n");
					dessert = "'���̽�ũ��'";
				}
				else if(a1==3){
				
					System.out.println("�����Ͻ� ����Ʈ�� ������� �Դϴ�.\n");
					dessert = "'�������'";
				}
				else{
					System.out.println("�߸��Է��ϼ̽��ϴ�. 1 2 3 �߿� �������ּ���. \n");
				}
			}//1.Ƽ��̼� ����ũ 2.���̽�ũ�� 3.�������	
			else
			{
				System.out.println("1 2 3 4 5 �߿��� �Է����ּ���. \n");
			}
		
			System.out.println("�޴��� ��Ӻ��÷���' ������'  �׸� ���÷���' ������ '�� �Է����ּ���  ");
		
		
			String end = scan.next();
			if(end.equals("������"))
			{
				TorF = false;
				System.out.println("�޴����⸦ ���½��ϴ�.\n");
			}
			else if(end.equals("������"))
			{
				TorF = true;
			}
			else
			{
				System.out.println("������ or �����⸸ �Է����ּ���");
				System.out.println("�޴������ ���ư��ϴ�.\n");
				TorF = true;
			}
		}// switch�� ��ȣ
	System.out.println("       	          ī�� ������ �Ͻ÷��� 1�� \n       	          ���� ������ �Ͻ÷��� 2���� �����ּ���");
	int pay = scan.nextInt(); // ����ġ�� �Է°� �ޱ�, ���� ������ ���� ���̽���-pay
	int pay2 = 0; //�������� ī�� ���� ���� ��������� ����
	int pay1 = 0; //���� �Է°�
	switch (pay)
	{
	case 1:
		System.out.println("       	          ī�� ������ �����ϼ̽��ϴ�.");
		pay2=1; //pay2�� 1�̵Ǹ� ���� if������ ī�� ������ ���
		break;
	
	case 2:
		System.out.println("       	          ���� ������ ���� �ϼ̽��ϴ�.\n");
		System.out.println("       	          �����Ͻ� �ݾ��� �Է����ּ���.");
		pay1 = scan.nextInt(); // ������ ���� �ޱ�°�
		pay2=2; //pay2�� 2���Ǹ� ���� if������ ���� ������ ���
		break;
		
	}//pay switch�� ��ȣ
	
	System.out.println("\n\n\n\n");
	System.out.println("-------------------------------------------------------------------");
	System.out.println("		        ��     ��     ��\n");
	System.out.println("		'��' Chef �������");
	System.out.println("		�������� ����Ư���� ����� ���Ϸ� 214�� 32");
	System.out.println("		02-5593-1879");
	System.out.println("		�ֹ���ȣ 201512030001\n");
	System.out.println("		set menu"+ z + "�� ���� �ϼ̽��ϴ�.");
	System.out.println("		"+appetizer+"");
	System.out.println("		"+soup+"");
	System.out.println("		"+steak+"");
	System.out.println("		"+Beverage+"");
	System.out.println("		"+dessert+"");
	System.out.println("		Total" +sum+"(VAT:3000��)(��������������1500��)�Դϴ�");
	System.out.println("--------------------------------------------------------------------");
	if(pay2==1)
	{
		System.out.println("       	          ī����� " +sum+ " ���� ó�� �Ǿ����ϴ�");
		System.out.println("       	          �Һ� ���� : �Ͻú� (5�������� �ڵ� �Ͻú�)");
	}
	else if(pay2==2)
	{
		System.out.println("       	          ������ :"+pay1+ " �Ž����� :"+(pay1-sum));
	}
	
	System.out.print("       	          ����Ʈ ����: "+ (int)(sum*0.1)+"\n");
	int point =(int)(sum*0.1); //������ ����Ʈ�� point���� �����Ͽ� ����Ʈ �������� 
	System.out.println("		����Ʈ ����: "+  point );
	System.out.println("--------------------------------------------------------------------");
	Calendar A = Calendar.getInstance(); //Calendar Ŭ������ ���� A�� �̸����� ��ü ����
	
	System.out.println("		�ŷ��Ͻ�");
	System.out.print("		"+A.get(Calendar.YEAR)+"-");      // �⵵
	System.out.print(+A.get(Calendar.MONTH)+1+"-");   // �� ǥ�ô� 0~11�� ǥ�õǱ� ������ +1
	System.out.println(+A.get(Calendar.DATE));      // ��¥
	System.out.print("		");
	System.out.print(+A.get(Calendar.HOUR)+12+":"); // 24�ð� ǥ�ø� ���� +12
	System.out.print(+A.get(Calendar.MINUTE)+":");  // ��
	System.out.print(+A.get(Calendar.SECOND)+" \n");  // ��
	
	if(sum>=25000)
	{
		System.out.println("		25000�� �̻� �����ϼ����Ƿ� ������ ����");
	}
	
	System.out.println("                [�����ȳ�]");
	System.out.println("                   �������� ������ ������ �����Ƕ� �����ϼ���.\n");
	System.out.println("                ���� '��' chef ��������� �̿����ּż� �����մϴ�          ");
	
//	System.out.println(cal.get(Calendar.AM_PM)); // �����̸� 0���,���ĸ� 1���
	
//	String hour ;				// ��
//	String minute ;				// ��
//	String second ;				// ��
//	hour = new SimpleDateFormat("HH").format(new Date());    // �ð�-> �ؽ�Ʈ
//	minute = new SimpleDateFormat("mm").format(new Date());  // �� -> �ؽ�Ʈ
//	second = new SimpleDateFormat("ss").format(new Date());  // �� -> �ؽ�Ʈ
//	System.out.println(hour + "�� " + minute + "�� " + second + "��\n"); // �ð� �� �� ���
	
	}//public static void main(String[] args) ��ȣ
}// ����

