# FINT springfox extension

[![Build Status](https://travis-ci.org/FINTlibs/fint-springfox-extension.svg?branch=master)](https://travis-ci.org/FINTlibs/fint-springfox-extension)
[![Coverage Status](https://coveralls.io/repos/github/FINTlibs/fint-springfox-extension/badge.svg?branch=master)](https://coveralls.io/github/FINTlibs/fint-springfox-extension?branch=master)

## Installation

```groovy
repositories {
    maven {
        url  "http://dl.bintray.com/fint/maven" 
    }
}

compile('no.fint:fint-springfox-extension:0.0.1')
```

## Usage

Add `@EnableSpringfoxExtension` in the main Application-class.

```java
@EnableSpringfoxExtension
@SpringBootApplication
public class Application {
   public static void main(String[] args) {
       SpringApplication.run(Application.class, args);
   } 
}
```

The ApiDocsController is available on: `/fint-springfox/api-docs`  
The response will include:
- _externalDocs_, value from `@SwaggerDefinition`

## Configuration

| Key | Description | Default value |
|-----|---------------|-------------|
| fint.springfox.base-package | Base package where the controller will search for `@SwaggerDefinition`. | no.fint |
| fint.springfox.swagger-https | Use https in the request to swagger api-docs. | true |
| fint.springfox.swagger-apidocs-path | Path the the swagger api-docs | /v2/api-docs |