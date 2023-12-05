class Person{
	int age;
	String name;
	String degree;
	void person(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println(name+age);		
	}
}
class Teacher extends Person{
	void Teacher(String name,int age, String degree){
		//this.name = name;
		//this.age = age;
		//this.degree = degree;

		person("sri hari",22);//we can add super keyword also.
			System.out.println(name+age+degree);
		
	}
	public static void main(String[]args){
		Teacher tr = new Teacher();
		tr.Teacher("sri hari",21,"Ece");
	}
}