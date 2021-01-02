package com.nil.cursojava.interfaces_heranca;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL{
	
	void abrirConexao();
	void fecharConexao();
	
}
