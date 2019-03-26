package aspects.exceptions;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;

public class ExceptionAspect {

	@AfterThrowing("execution(* controllers.*.*(..))")
	public void createLog(JoinPoint joinPoint){
		System.out.println("Exception is throwing at " + joinPoint.getSignature().toString());
	}
}
