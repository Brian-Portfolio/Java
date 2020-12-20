package eg2;

public class Main {

	public static void main(String[] args) {
		
		Team t1 = new Team(1, "Group1", "Alexander");
		Player pl1 = new Player(301, "Levi", 80, t1);
		System.out.println("pl1");
		System.out.println(pl1);
		
		Team t2 = new Team(2, "Group2", "Richardson");
		Player pl2 = new Player(302, "Sia", 50, t2);
		System.out.println("pl2");
		System.out.println(pl2);
		
		Address a1 = new Address(301, "Parkview Ave","NewYorkCity", 30312);
		Project p1=new Project(9000, "Abc Corp", "Abc Corp Some Client");
		Employee e1=new  Employee(100, "Sachin", "Manager", 23333.44,p1,a1,a1);
		System.out.println("e1");
		System.out.println(e1);
		
		Address a2 = new Address(301, "Landhill St","NewYorkCity", 30876);
		Employee e2=new Employee(101, "Richard", "Associate", 2000.33,p1,a2,a2);
		System.out.println("e2");
		System.out.println(e2);
		
		Address a3 = new Address(567, "Lewis Ave","San Diego", 30487);
		Project p2=new Project(9001, "SMS", "Revature");
		Employee e3=new Employee(102, "Tushar", "Manager", 33000.33, p2, a3, a3);
		System.out.println("e3");
		System.out.println(e3);
		
	}

} //Complete Address, Player and Team
