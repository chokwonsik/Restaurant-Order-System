package 조권식;

import java.util.Scanner; // 스캐너 선언
import java.text.SimpleDateFormat; // 시간값 텍스트화
import java.util.Date; // 컴퓨터의 시간값 받기
import java.util.Calendar; //Calendar클래스를 통해 년,월,일,시간값 받기

class restaurant // 레스토랑 인사말
{
	void restaurant() //
	{
		System.out.println(" '권' Chef 레스토랑에 오신 여러분들을 환영합니다. ");
		System.out.println(" '권' Chef 레스토랑의 영업시간은 9:00 ~ 21:00 입니다. ");
		System.out.println("  주문 가능한 시간은  9:00 ~ 21:00까지 입니다.\n ");
		System.out.println("  저희 레스토랑은 좋은 품질의 음식 제공을위해 세트메뉴 3가지로 구성되어있습니다.");
		System.out.println("  원하시는 세트를 선택해주세요. \n");
		System.out.println("  set menu1 : 에피타이져 수프 스테이크 음료 디저트 ");
		System.out.println("  set menu2 : 에피타이저 수프 스테이크 디저트 (음료x) ");
		System.out.println("  set menu3 : 에피타이저 수프 스테이크 음료 (디저트x) ");
	}
}

class menu
{
	
	void appetizer() //에피타이저 메뉴 
	{
		System.out.println("appetizer menu \n");
		System.out.println("원하시는 것을 선택해주세요. ");
		System.out.println("1.모짜렐라치즈토마토 2.카나페 3.연어");
	}//토마토를 오븐에 굽고 모짜렐라 치즈를 보기좋게 썰어서 드레싱을 뿌린 대표적인 애피타이저이다
	//
	void soup() //수프 메뉴
	{
		System.out.println("soup menu\n");
		System.out.println("원하시는 것을 선택해주세요.");
		System.out.println("1.두부 단호박 스푸 2.브로콜리 스푸 3.양송이 스푸");
	}
	void steak() // 스테이크 메뉴
	{
		System.out.println("steak menu \n ");
		System.out.println("원하시는 것을 선택해주세요.");
		System.out.println("1.머쉬룸 서로인 스테이크 포 유 2.갈릭 립아이 3.우드 화이어 그릴 스테이크 오 포와");
	}// 머쉬룸 그레이비 소스가 더해진 서로인 스테이크
	// 발사믹 소스에 조리한 마늘이 어우러진 꽃등심 스테이크
	// 참나무로 구운 프렌치 페퍼 채끝등심 스테이크
	
	void beverage() // 음료 메뉴
	{
		System.out.println("Beverage menu \n ");
		System.out.println("원하시는 것을 선택해주세요.");
		System.out.println("1.탄산음료 2.생과일쥬스 3.에이드");
	}
	void Dessert() // 디저트 메뉴
	{
		System.out.println("dessert menu \n");
		System.out.println("원하시는 것을 선택해주세요.");
		System.out.println("1.티라미수 케이크 2.아이스크림 3.열대과일");
	}

}//메뉴 클래스 ()

class receipt extends  menu // menu 를 receipt에 상속  
//
{
	int appetizer;
	int soup;
	int steak;
	int beverage;
	int Dessert;
	public receipt(int a, int s, int st, int b,int d ) //생성자
	{
		appetizer = a;
		soup  = s;
		steak = st;
		beverage = b;
		Dessert = d;
	}
	public receipt(int a, int s, int st,int d) // 생성자 오버로딩  
	{
		appetizer = a;
		soup  = s;
		steak = st;
		Dessert = d;
	}
	// ? 음료를 원하지 않는 손님
	
	public receipt(int a, int s, int st,double b) // 생성자 오버로딩
	// int b로 선언 하지 않은 이유는 생성자 오버 로딩은 매개변수의 타입과 개수가 달라야 하는데 
	// int b로 선언해주면 위의 생성자 오버로딩과  타입이 같아서 에러가 나기때문에 int 대신 double를 선언하였다.
	{
		appetizer = a;
		soup  = s;
		steak = st;
		beverage = (int) b;
		
	}// ? 디저트를 원하지 않는 손님
	
		
	int receipt1(int a, int s, int st, int b, int d) //메소드
	{
		
		int Totalpay = a+ s+ st+ b+ d; // 에피타이저+스프+스테이크+음료+디저트 총합
		
		return Totalpay;
		
	}//세트1 선택시
	
	int receipt1(int a, int s, int st,  int d) //메소드 오버로딩
	{
		int Totalpay = a+ s+ st+ d; // 에피타이저+스프+스테이크+디저트 총합
		return Totalpay;
	}//세트2 선택시
	
	int receipt1(int a, int s, int st,double b ) //메소드 오버로딩
	{
		
		int Totalpay = (int) (a+ s+ st+ b); // 에피타이저+스프+스테이크+음료 총합
		return Totalpay;
	}//세트3 선택시

}

public class gun{ //메인 
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in); // 스캐너 선언
	
	restaurant rt = new restaurant(); // 인사말 객체
	menu menu1 = new menu(); //메뉴 객체
	receipt gun1 = new receipt(0,0,0,0,0); // receipt 객체

	rt.restaurant(); // 인사말 호출
	
	int sum=0; // 총액 출력 변수
	int mm; // 세트메뉴 123 외의 값 입력시 다시받기 위한 스위치 변수
	int z=0; // 세트메뉴 123 선택시 나중에 출력값을 위한 변수 
	
	do
	{
		mm = scan.nextInt(); // 스위치문
	if (1==mm)
	{
	
		
		System.out.println("  set menu1 선택완료 \n");
		sum= gun1.receipt1(3000,4000,12000,3500,3500); // 총금액 26000
		z = 1;
	}
	else if(2==mm)
	{
		System.out.println("  set menu2 선택완료 \n");
		sum = gun1.receipt1(3000,4000,12000,0,3500); // 총금액 22500
		//세트 2는 음료가 없기때문에 4번째 beverage 란에 0 입
		z = 2;
	}
	else if(3==mm)
	{
		System.out.println("  set menu3 선택완료 \n");
		sum = gun1.receipt1(3000,4000,12000,3500,0); // 총금액 22500
		//세트 3은 디저트가 없기때문에 5번째 Dessert 란에 0 입력
		z = 3;	
	}
	else
	{
		System.out.println("   set 1 2 3 중에만 선택해주세요!.\n");
		System.out.println("   다시 입력 해주세요!");
	}
	}while(mm !=3 && mm!=1&&mm!=2);
	
	String appetizer = "''"; // 영수증 출력을 위한 에피타이저   종류 저장
	String soup = "''"; // 영수증 출력을 위한 수프 종류 저장
	String steak = "''"; // 영수증 출력을 위한 스테이크 음 종류  종류 저장
	String Beverage = "''"; // 영수증 출력을 위한 음료  종류 저장
	String dessert = "''"; // 영수증 출력을 위한 디저트  종류 저장
	
	boolean TorF = true;//참거짓
	while(TorF) // 메뉴 선택을 위한 반복문
		{	
			System.out.println("  어떤 메뉴를 보시겠습니까?");
			System.out.println("  1.에피타이저 2. 스프 3. 스테이크 4.음료 5.디저트\n");
			int a = scan.nextInt();
			if(a==1)
			{
				menu1.appetizer();
				int a1 = scan.nextInt();
				if(a1==1){
					System.out.println("선택하신 에피타이저는 모짜렐라치즈토마토 입니다.\n");		
					appetizer = "'모짜렐라치즈토마토'";
					
				}
				else if(a1==2){
					System.out.println("선택하신 에피타이저는 카나페 입니다.\n");
					appetizer = "'카나페'";
					}
				else if(a1==3){
					System.out.println("선택하신 에피타이저는 연어 입니다.\n");
					appetizer = "'연어'";
				}	
				else
				{
					System.out.println("잘못입력하셨습니다. 1 2 3 중에 선택해주세요");
				}
			}//"1.모짜렐라치즈토마토 2.카나페 3.연어"
			else if(a==2)
			{
				menu1.soup();
				int a1 = scan.nextInt();
				if(a1==1){
				
					System.out.println("선택하신 스푸는 두부 단호박 스푸 입니다.\n");
					soup = "'두부 단호박 스푸'";
				}
				else if(a1==2){
				
					System.out.println("선택하신 스푸는 브로콜리 스푸 입니다.\n");
					soup = "'브로콜리 스푸'";
				}
				else if(a1==3){
				
					System.out.println("선택하신 스푸는 양송이 스푸 입니다.\n");
					soup = "'양송이 스푸'";
				}
				else{
					System.out.println("잘못입력하셨습니다. 1 2 3 중에 선택해주세요");
				}
			}
			//"1.두부 단호박 스푸 2.브로콜리 스푸 3.양송이 스푸"
			else if(a==3)
			{
				menu1.steak();
				int a1 = scan.nextInt();
				if(a1==1){
				
					System.out.println("선택하신 스테이크는는 머쉬룸 서로인 스테이크 포 유 입니다.\n");
					steak = "'머쉬룸 서로인 스테이크 포 유'";
				}
				else if(a1==2){
				
					System.out.println("선택하신 스테이크는는 갈릭 립아이 입니다.\n");
					steak = "'갈릭 립아이'";
				}
				else if(a1==3){
				
					System.out.println("선택하신 스테이크는는 우드 화이어 그릴 스테이크 오 포와 입니다.\n");
					steak = "'우드 화이어 그릴 스테이크 오 포와'";
				}
				else{
					System.out.println("잘못입력하셨습니다. 1 2 3 중에 선택해주세요");
				}
			}//1.머쉬룸 서로인 스테이크 포 유 2.갈릭 립아이 3.우드 화이어 그릴 스테이크 오 포와
			else if(a==4)
			{
				menu1.beverage();
				int a1 = scan.nextInt();
				if(a1==1){
				
					System.out.println("선택하신 음료는 탄산음료 입니다.\n");
					Beverage = "'탄산음료'";
				}
				else if(a1==2){
				
					System.out.println("선택하신 음료는 생과일 쥬스 입니다.\n");
					Beverage = "'생과일 쥬스'";
				}
				else if(a1==3){
				
					System.out.println("선택하신 음료는 에이드 입니다.\n");
					Beverage = "'에이드'";
				}
				else{
					System.out.println("잘못입력하셨습니다. 1 2 3 중에 선택해주세요");
				}
			}//1.탄산음료 2.생과일쥬스 3.에이드
			else if(a==5)
			{
				menu1.Dessert();
				int a1 = scan.nextInt();
				if(a1==1){
				
					System.out.println("선택하신 디저트는 티라미수 케이크 입니다.\n");
					dessert = "'티라미수 케이크'";
				}
				else if(a1==2){
				
					System.out.println("선택하신 디저트는 아이스크림 입니다.\n");
					dessert = "'아이스크림'";
				}
				else if(a1==3){
				
					System.out.println("선택하신 디저트는 열대과일 입니다.\n");
					dessert = "'열대과일'";
				}
				else{
					System.out.println("잘못입력하셨습니다. 1 2 3 중에 선택해주세요. \n");
				}
			}//1.티라미수 케이크 2.아이스크림 3.열대과일	
			else
			{
				System.out.println("1 2 3 4 5 중에만 입력해주세요. \n");
			}
		
			System.out.println("메뉴를 계속보시려면' 더보기'  그만 보시려면' 끝내기 '를 입력해주세요  ");
		
		
			String end = scan.next();
			if(end.equals("끝내기"))
			{
				TorF = false;
				System.out.println("메뉴보기를 끝냈습니다.\n");
			}
			else if(end.equals("더보기"))
			{
				TorF = true;
			}
			else
			{
				System.out.println("끝내기 or 더보기만 입력해주세요");
				System.out.println("메뉴보기로 돌아갑니다.\n");
				TorF = true;
			}
		}// switch문 괄호
	System.out.println("       	          카드 결제를 하시려면 1번 \n       	          현금 결제를 하시려면 2번을 눌러주세요");
	int pay = scan.nextInt(); // 스위치문 입력값 받기, 결제 선택을 위한 케이스명-pay
	int pay2 = 0; //영수증에 카드 현금 인지 출력을위한 변수
	int pay1 = 0; //현금 입력값
	switch (pay)
	{
	case 1:
		System.out.println("       	          카드 결제를 선택하셨습니다.");
		pay2=1; //pay2이 1이되면 밑의 if문에서 카드 결제만 출력
		break;
	
	case 2:
		System.out.println("       	          현금 결제를 선택 하셨습니다.\n");
		System.out.println("       	          지불하실 금액을 입력해주세요.");
		pay1 = scan.nextInt(); // 구매자 현금 받기는값
		pay2=2; //pay2에 2가되면 밑의 if문에서 현금 결제만 출력
		break;
		
	}//pay switch문 괄호
	
	System.out.println("\n\n\n\n");
	System.out.println("-------------------------------------------------------------------");
	System.out.println("		        영     수     증\n");
	System.out.println("		'권' Chef 레스토랑");
	System.out.println("		성서대점 서울특별시 노원구 동일로 214길 32");
	System.out.println("		02-5593-1879");
	System.out.println("		주문번호 201512030001\n");
	System.out.println("		set menu"+ z + "를 선택 하셨습니다.");
	System.out.println("		"+appetizer+"");
	System.out.println("		"+soup+"");
	System.out.println("		"+steak+"");
	System.out.println("		"+Beverage+"");
	System.out.println("		"+dessert+"");
	System.out.println("		Total" +sum+"(VAT:3000원)(레스토랑발전기금1500원)입니다");
	System.out.println("--------------------------------------------------------------------");
	if(pay2==1)
	{
		System.out.println("       	          카드결제 " +sum+ " 정상 처리 되었습니다");
		System.out.println("       	          할부 월수 : 일시불 (5만원이하 자동 일시불)");
	}
	else if(pay2==2)
	{
		System.out.println("       	          받은돈 :"+pay1+ " 거스름돈 :"+(pay1-sum));
	}
	
	System.out.print("       	          포인트 적립: "+ (int)(sum*0.1)+"\n");
	int point =(int)(sum*0.1); //적립한 포인트를 point값에 저장하여 포인트 내역으로 
	System.out.println("		포인트 내역: "+  point );
	System.out.println("--------------------------------------------------------------------");
	Calendar A = Calendar.getInstance(); //Calendar 클래스를 통해 A란 이름으로 객체 생성
	
	System.out.println("		거래일시");
	System.out.print("		"+A.get(Calendar.YEAR)+"-");      // 년도
	System.out.print(+A.get(Calendar.MONTH)+1+"-");   // 월 표시는 0~11로 표시되기 때문에 +1
	System.out.println(+A.get(Calendar.DATE));      // 날짜
	System.out.print("		");
	System.out.print(+A.get(Calendar.HOUR)+12+":"); // 24시간 표시를 위해 +12
	System.out.print(+A.get(Calendar.MINUTE)+":");  // 분
	System.out.print(+A.get(Calendar.SECOND)+" \n");  // 초
	
	if(sum>=25000)
	{
		System.out.println("		25000원 이상 구매하셨으므로 주차권 증정");
	}
	
	System.out.println("                [주차안내]");
	System.out.println("                   주차권을 소지후 주차장 나가실때 제시하세요.\n");
	System.out.println("                저희 '권' chef 레스토랑을 이용해주셔서 감사합니다          ");
	
//	System.out.println(cal.get(Calendar.AM_PM)); // 오전이면 0출력,오후면 1출력
	
//	String hour ;				// 시
//	String minute ;				// 분
//	String second ;				// 초
//	hour = new SimpleDateFormat("HH").format(new Date());    // 시간-> 텍스트
//	minute = new SimpleDateFormat("mm").format(new Date());  // 분 -> 텍스트
//	second = new SimpleDateFormat("ss").format(new Date());  // 초 -> 텍스트
//	System.out.println(hour + "시 " + minute + "분 " + second + "초\n"); // 시간 분 초 출력
	
	}//public static void main(String[] args) 괄호
}// 메인

