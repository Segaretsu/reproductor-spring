package co.com.jhonsebastianas.reproductor;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@ApplicationPath("/api/v1")
public class JerseyApplication extends ResourceConfig {
	
	@Autowired
	public JerseyApplication(ObjectMapper objectMapper) {
		packages("co.com.jhonsebastianas.reproductor");
		property(ServletProperties.FILTER_FORWARD_ON_404, true);
		register(CORSResponseFilter.class);
		register(new ObjectMapperContextResolver(objectMapper));
	}

	@Provider
	public static class ObjectMapperContextResolver implements ContextResolver<ObjectMapper> {
		private final ObjectMapper mapper;

		public ObjectMapperContextResolver(ObjectMapper mapper) {
			this.mapper = mapper;
		}

		@Override
		public ObjectMapper getContext(Class<?> type) {
			return mapper;
		}

	}

	@PostConstruct
	public void init() {
		this.SwaggerConfig();
	}

	private void SwaggerConfig() {
		this.register(ApiListingResource.class);
		this.register(SwaggerSerializers.class);

		BeanConfig swaggerConfigBean = new BeanConfig();
		swaggerConfigBean.setConfigId("Reproductor Swagger Jersey");
		swaggerConfigBean.setTitle("Using Swagger ,Jersey And Spring Boot ");
		swaggerConfigBean.setVersion("v1");
		swaggerConfigBean.setContact("JhonSebastianAS");
		swaggerConfigBean.setSchemes(new String[] { "http", "https" });
		swaggerConfigBean.setBasePath("/api/v1");
		swaggerConfigBean.setResourcePackage("co.com.jhonsebastianas.reproductor.services");
		swaggerConfigBean.setPrettyPrint(true);
		swaggerConfigBean.setScan(true);
	}

}
