# FINT springfox extension

## Installation

## Usage

Add `ApiDocsController` in a `@Configuration` class.

```java
@ComponentScan()
@Configuration
public class Config {
    ...
}
```

The ApiDocsController is available on: `/fint-springfox/api-docs`  
Response contains:
- externalDocs, value from `@SwaggerDefinition`