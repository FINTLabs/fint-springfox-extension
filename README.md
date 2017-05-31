# FINT springfox extension

[![Build Status](https://travis-ci.org/FINTlibs/fint-springfox-extension.svg?branch=master)](https://travis-ci.org/FINTlibs/fint-springfox-extension)

## Installation

## Usage

Add `ApiDocsController` in a `@Configuration` class.

```java
@ComponentScan(basePackageClasses = ApiDocsController.class)
@Configuration
public class Config {
    ...
}
```

The ApiDocsController is available on: `/fint-springfox/api-docs`  
The response will include:
- _externalDocs_, value from `@SwaggerDefinition`