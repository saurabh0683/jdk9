package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

//    @Bean
//    public UndertowEmbeddedServletContainerFactory embeddedServletContainerFactory() {
//        UndertowEmbeddedServletContainerFactory factory = new UndertowEmbeddedServletContainerFactory();
//        factory.addBuilderCustomizers(
//                builder -> builder.setServerOption(UndertowOptions.ENABLE_HTTP2, true));
//        return factory;
//    }

//    @Bean
//    public EmbeddedServletContainerCustomizer tomcatCustomizer() {
//        return (container) -> {
//            if (container instanceof TomcatEmbeddedServletContainerFactory) {
//                ((TomcatEmbeddedServletContainerFactory) container)
//                        .addConnectorCustomizers((connector) -> {
//                            connector.addUpgradeProtocol(new Http2Protocol());
//                        });
//            }
//        };
//    }
}
