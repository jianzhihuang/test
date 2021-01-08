package Orm;

import java.util.List;

public interface DeptDAO {
	void add(Dept dept) ;
	void update(Dept dept);
	void del(int deptno);
	Dept findBydeptno(int deptno);
	List<Dept> getAll();
		
		
	
}
