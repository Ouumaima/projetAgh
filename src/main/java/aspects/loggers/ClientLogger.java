package aspects.loggers;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import controllers.ClientController;

@Aspect
public class ClientLogger {

static final Logger logger = LoggerFactory.getLogger(ClientController.class);
	
	@After("execution(* controllers.ClientController.*(..))")
	public void createLog(JoinPoint joinPoint){
		logger.debug("Methode " + joinPoint.getSignature().toString()+ "is running");
		logger.debug("Argument Methode " + Arrays.toString(joinPoint.getArgs()));
	}
}
