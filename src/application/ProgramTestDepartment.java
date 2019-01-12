package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class ProgramTestDepartment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = new DaoFactory().createDepartmentDao();
		
		sc.close();

	}

}
