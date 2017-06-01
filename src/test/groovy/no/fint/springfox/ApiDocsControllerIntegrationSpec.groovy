package no.fint.springfox

import com.jayway.jsonpath.JsonPath
import no.fint.springfox.testutils.TestApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import spock.lang.Specification

@SpringBootTest(classes = TestApplication, properties = "fint.springfox.swagger-https=false", webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApiDocsControllerIntegrationSpec extends Specification {

    @Autowired
    private ApiDocsController controller

    @Autowired
    private TestRestTemplate restTemplate

    def "GET swagger api-docs"() {
        when:
        def response = restTemplate.getForEntity('/fint-springfox/api-docs', String)
        def json = response.getBody()

        then:
        response.statusCode == HttpStatus.OK
        JsonPath.read(json, '$.externalDocs.description') == 'test'
        JsonPath.read(json, '$.externalDocs.url') == 'http://localhost'
    }
}
