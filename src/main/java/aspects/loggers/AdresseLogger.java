package aspects.loggers;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import controllers.AdresseController;

@Aspect
public class AdresseLogger {
	
	static final Logger logger = LoggerFactory.getLogger(AdresseController.class);
	
	@After("execution(* controllers.AdresseController.*(..))")
	public void createLog(JoinPoint joinPoint){
		logger.debug("Methode " + joinPoint.getSignature().toString()+ "is running");
		logger.debug("Argument Methode " + Arrays.toString(joinPoint.getArgs()));
	}

}
