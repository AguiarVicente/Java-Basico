package com.nil.cursojava.interfaces_heranca;

public interface SqlDDL {
	
	void create(String query);
	void drop(String query);
	void alter(String query);
}
