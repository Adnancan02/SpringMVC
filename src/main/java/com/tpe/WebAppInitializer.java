package com.tpe;

//web.xml yerine bu classi kullaniriz
//dispatcher servlet in tanimlanmasi, configuration classlarinin yerini gösterme
//bu iki islem icin : AbstractAnnotationConfigDispatcherServletInitializer

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //Dispatcher : servlet WebAppContext-> Controller, Handler Mapping, View Resolver
    //           Root WebAppContext -> DB ye erisim : repositories, services


    @Override//data erişim(hibernate/jdbc) için gerekli config class
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override//Controller,Handler Mapping,View Resolver(SpringMVC) ile ilgili config class
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                WebMvcConfig.class


        };
    }

    //http://localhost:8080/SpringMvc/....
    @Override//hangi url ile gelen istekleri servlet tarafından karşılanacak/
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
