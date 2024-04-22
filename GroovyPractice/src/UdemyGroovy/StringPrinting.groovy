package UdemyGroovy

//import JavaConversion.StringPrinting

public class StringPrinting {
	
	private String name;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String success()
	{
		return "hello" +name;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringPrinting sp=new StringPrinting();
		sp.setName("ramya");
		System.out.println(sp.success());
	}
	
}

