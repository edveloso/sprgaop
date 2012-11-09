package br.com.eveloso.sprgmvc.model;

import junit.framework.TestCase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.eveloso.sprgmvc.service.ControleAcesso;


public class ClasseMuitoImportanteTest extends TestCase {

	private ControleAcesso controleAcesso;

	private ClasseMuitoImportante cmi;
	
	
	
	
	public ClasseMuitoImportanteTest() {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("spring-servlet.xml");
		cmi = (ClasseMuitoImportante)
		              ctx.getBean("classeMuitoImportante");
	}
	
	
	public void testMetodoImportanteSemPermissao() {
		cmi.metodoImportantea();
	}

	
	public void testMetodoImportanteComPermissao() {

	}

	
	

	public ControleAcesso getControleAcesso() {
		return controleAcesso;
	}

	public void setControleAcesso(ControleAcesso controleAcesso) {
		this.controleAcesso = controleAcesso;
	}


	public ClasseMuitoImportante getCmi() {
		return cmi;
	}


	public void setCmi(ClasseMuitoImportante cmi) {
		this.cmi = cmi;
	}

	
}
