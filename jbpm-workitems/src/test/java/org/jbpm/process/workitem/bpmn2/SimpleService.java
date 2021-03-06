package org.jbpm.process.workitem.bpmn2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebService(serviceName="SimpleService")
public class SimpleService {
    
    private static final Logger logger = LoggerFactory.getLogger(SimpleService.class);

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String name) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            logger.error("Interupted while waiting", e);
        }
        logger.info("Hello {}", name);
        return "Hello " + name;
    }
    
}
