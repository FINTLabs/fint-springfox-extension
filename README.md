# FINT springfox extension

[![Build Status](https://travis-ci.org/FINTlibs/fint-springfox-extension.svg?branch=master)](https://travis-ci.org/FINTlibs/fint-springfox-extension)
[![Coverage Status](https://coveralls.io/repos/github/FINTlibs/fint-springfox-extension/badge.svg?branch=master)](https://coveralls.io/github/FINTlibs/fint-springfox-extension?branch=master)

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