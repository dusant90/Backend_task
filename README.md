# Rest Api 




To create a build of the application, execute the following command in the projects' root directory:

```console
mvn package -DskipTests
```

The packaged ``*.jar``-file can be found under:

```console
cyrilic_app/target/restapi-0.0.1-SNAPSHOT.jar
```

To run the ``jar``-file, switch to cyrilic_app/target and execute the following command:

```console
java -jar restapi-0.0.1-SNAPSHOT.jar
```
To check api-docs(swagger) type in your browser:

```console
SERVER_URL/swagger-ui.html
```
