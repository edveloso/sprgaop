package br.com.eveloso.sprgmvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eveloso.sprgmvc.service.ControleAcesso;

@Service
public class ClasseMuitoImportante {
	
	
	@Autowired
	private ControleAcesso controleAcesso;

	public void metodoImportantea(){
		System.out.println("extou executando o meu metodo importante");
		if(controleAcesso.getPermissaoParaTal()){
//			return true;
		}
//		return false;
	}
	
	public ControleAcesso getControleAcesso() {
		return controleAcesso;
	}

	public void setControleAcesso(ControleAcesso controleAcesso) {
		this.controleAcesso = controleAcesso;
	}

}
