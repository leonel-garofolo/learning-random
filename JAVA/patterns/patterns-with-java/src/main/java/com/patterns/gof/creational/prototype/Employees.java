package com.patterns.gof.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	private List<String> empList;

	public Employees() {
		empList = new ArrayList<String>();
	}

	public Employees(List<String> list) {
		this.empList = list;
	}

	public void loadData() {
		//read all employees from database and put into the list
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}

	public List<String> getEmpList() {
		return empList;
	}

	/**
	 * Clone objects to manipulate them without change the data from database
	 * @return
	 */
	@Override
	public Object clone() {
		List<String> temp = new ArrayList();
		temp.addAll(this.getEmpList());
		return new Employees(temp);
	}

}