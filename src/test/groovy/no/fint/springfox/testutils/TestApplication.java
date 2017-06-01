package no.fint.springfox.testutils;

import com.github.springfox.loader.EnableSpringfox;
import io.swagger.annotations.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableSpringfox(@Info(title = "Test", version = "1.0.0",
        extensions = {@Extension(name = "x-logo",
                properties = {@ExtensionProperty(name = "url", value = "/images/logo.png")}
        )}
))
@SwaggerDefinition(externalDocs = @ExternalDocs(value = "test", url = "http://localhost"))
@SpringBootApplication
@ComponentScan(basePackages = "no.fint.springfox")
public class TestApplication {
}
