package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramTestDepartment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = new DaoFactory().createDepartmentDao();
		
		System.out.println("======== TEST 1: department findById ========");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n======== TEST 2: department findAll ========");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n======== TEST 2: department insert ========");
		Department newDepartment = new Department(null, "Infantil");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New Id: " + newDepartment.getId());
		
		System.out.println("\n======== TEST 2: department update ========");
		department = departmentDao.findById(newDepartment.getId());
		department.setName("Jardinagem");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		sc.close();

	}

}
