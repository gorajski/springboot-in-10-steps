package com.gorajski.spring.basics.componentscan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
//jdbcConnection will be the same bean when personDAO and personDAO2 are created unless the proxyMode is set to TARGET_CLASS
//BUT!  A proxy mode of TARGET_CLASS will cause any use of PersonDAO to create a new instance each time it is needed.
public class ComponentJdbcConnection {
    public ComponentJdbcConnection() {
        System.out.println("JDBC Connection");
    }
}
