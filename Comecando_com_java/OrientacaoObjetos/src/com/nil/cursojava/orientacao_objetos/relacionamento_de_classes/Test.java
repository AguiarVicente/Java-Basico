package com.nil.cursojava.orientacao_objetos.relacionamento_de_classes;

public class Test {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("Tyrion");
//		contato.setEndereco("Kings Londing");
//		contato.setTelefone("11 9999-9999");
		
		// criar o objeto endereco  == um para um ==
		Endereco end = new Endereco();
		end.setNomeRua("Rua Game Of Thrones");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Kings Londing");
		end.setEstado("Westeros");
		end.setCep("99999-999");
		
		contato.setEndereco(end);
		
		//criar o objeto telefone == um para muitos ==
		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setDdd("21");
		telefone.setNumero("99999-9999");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Casa");
		telefone2.setDdd("21");
		telefone2.setNumero("88888-8888");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		if(contato != null && contato.getTelefones() != null) {
			for( Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}

	}

}
