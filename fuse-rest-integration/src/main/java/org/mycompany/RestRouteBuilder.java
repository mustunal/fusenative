package org.mycompany;

import org.apache.camel.builder.RouteBuilder;

public class RestRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		restConfiguration()
		.component("spark-rest")
		.port("8082");
		
		from("spark-rest:get:/api/hello")
		  .transform().constant("Hello World");
		
	}
}
