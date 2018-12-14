package pack_40_aop.pack_10_aspect.pack_joinpoints.pack_dao;

public class EmployeeDao {

	// Join point
	public void save() {
		System.out.println("\tsave something in the db");
	}
}
