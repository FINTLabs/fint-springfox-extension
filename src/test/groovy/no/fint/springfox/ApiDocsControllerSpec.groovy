package no.fint.springfox

import com.jayway.jsonpath.JsonPath
import spock.lang.Specification

class ApiDocsControllerSpec extends Specification {

    def "Parse SwaggerDefinition externalDocs on startup"() {
        when:
        def controller = new ApiDocsController(basePackage: 'no.fint.springfox')
        controller.init()

        then:
        controller.externalDocsDescription != null
        controller.externalDocsUrl != null
    }

    def "Add externalDocs to json"() {
        given:
        def controller = new ApiDocsController(basePackage: 'no.fint.springfox')
        controller.init()

        when:
        def json = controller.addExternalDocs('{}')

        then:
        JsonPath.read(json, '$.externalDocs').size() == 2
    }

    def "Do not add externalDocs if externalDocsDescription is not set"() {
        given:
        def controller = new ApiDocsController(externalDocsDescription: null)
        controller.init()

        when:
        def json = controller.addExternalDocs('{}')

        then:
        json == '{}'
    }

}
