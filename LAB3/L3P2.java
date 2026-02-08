class L3P2 extends L3P1{
	static int neu;
	public static void display(){
		System.out.println(view+neu);
	}
	@Override
	public int show(){
		neu=5;
		return view+neu;
	}
	public void pearl(){
		System.out.println("Iam B child of A");
		super.display();
	}
}
