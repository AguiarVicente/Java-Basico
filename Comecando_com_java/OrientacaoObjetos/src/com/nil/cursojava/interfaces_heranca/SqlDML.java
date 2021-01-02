package com.nil.cursojava.interfaces_heranca;

public interface SqlDML {

	void insert(String query);
	void update(String query);
	void delete(String query);
	void select(String query);
}
