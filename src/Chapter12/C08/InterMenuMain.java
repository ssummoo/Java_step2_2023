package Chapter12.C08;

public class InterMenuMain implements Inter_Menu3 {

	public static void main(String[] args) {
		
		InterMenuMain im=new InterMenuMain();
		
		Inter_Menu1 im1=im;  //UpCasting  
		Inter_Menu2 im2=im;  //UpCasting 
		Inter_Menu3 im3=im;  //UpCasting 
		System.out.println("===========Inter_Menu1=============");
		System.out.println(im1.jajang());
		System.out.println(im1.jjambbong());
		im1.show();
		System.out.println("===========Inter_Menu2=============");
		System.out.println(im2.tangsuyuk());
		System.out.println("===========Inter_Menu3=============");
		System.out.println(im3.bokkeunbob());
		

	}

	@Override
	public String jajang() {

		return "����Ķ��� �߰�";
	}

	@Override
	public String jjambbong() {
		
		return "��ū";
	}

	@Override
	public String tangsuyuk() {
	
		return "�θ��� ����";
	}

	@Override
	public String bokkeunbob() {

		return "«�ͱ�������";
	}

}
