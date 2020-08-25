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
	
	private void alternateConfig() {
		/*
		 restConfiguration().component("spark-rest").port(9091);

			rest("/say")
			    .get("/hello").to("direct:hello")
			    .get("/bye").to("direct:bye");
			
			from("direct:hello")
			    .transform().constant("Hello World");
			from("direct:bye")
			    .transform().constant("Bye World");
		 */
	}

}
