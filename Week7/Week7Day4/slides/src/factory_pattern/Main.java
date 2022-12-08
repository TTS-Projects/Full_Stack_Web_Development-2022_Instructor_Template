package factory_pattern;

public class Main {
	public static void main(String[] args) {
		// based on the code seen earlier in main()
		// instead of "new"ing each department, the factory creates them
		Department sd = DepartmentFactory.CreateDepartment(DepartmentNames.SERVICE);
		Department fd = DepartmentFactory.CreateDepartment(DepartmentNames.FINANCE);

		List<Department> depts = new ArrayList<Department>();
		depts.add(sd);
		depts.add(fd);
	}
}