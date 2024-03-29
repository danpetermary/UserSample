package com.stackroute.keepnote.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/* Annotate this class with @Aspect and @Component */
@Aspect
@Component
public class LoggingAspect {
	/*
	 * Write loggers for each of the methods of User controller, any particular
	 * method will have all the four aspectJ annotation
	 * (@Before, @After, @AfterReturning, @AfterThrowing).
	 */
}
