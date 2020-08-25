class ConstructorExa{
	int value;
	double value1;

	ConstructorExa(){
System.out.println(value);
	}

	/*ConstructorExa(){
		 value=10;
		System.out.println(value);
	}*/
	ConstructorExa(int value){
		this.value=value;
		System.out.println(value);
	
	}
	ConstructorExa(double value1){
		this.value1=value1;
		System.out.println(value1);
	
	}
	public static void main(String[] args) {

		ConstructorExa x1=new ConstructorExa();
		ConstructorExa x=new ConstructorExa(20);
		ConstructorExa x2=new ConstructorExa(20.56);


	}
}