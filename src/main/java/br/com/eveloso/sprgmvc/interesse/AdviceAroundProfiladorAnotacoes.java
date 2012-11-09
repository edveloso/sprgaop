package br.com.eveloso.sprgmvc.interesse;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AdviceAroundProfiladorAnotacoes {


	@Around("execution(void *a (..) )")
	public Object profilar(ProceedingJoinPoint jointPoint) throws Throwable{
		System.out.println("Antees de executar o meu jointpoint");
		Object result = jointPoint.proceed();
		System.out.println("Depois de executar o meu jointpoint e o retorno foi "+ result); 
		return result;
	}
	
	
	
	
}
