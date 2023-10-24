# WQM API from OpenApi generator

## CLI run

1. Installed the OpenApi generator

```bash
# using NPM
npm install @openapitools/openapi-generator-cli -g

```

2. Download .yaml to a directoy
3. Run the gen from the cli (note -g spring for spring generator and -i for yaml file in the same directory)

### Run from npm

```bash

openapi-generator-cli generate -g spring --additional-properties=prependFormOrBodyParameters=true \
    -o generated-wqm-api-npm -i wqm.yaml --api-package com.example.wqm

```

### Run from jar

```bash

# optional use jar directly
wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/6.6.0/openapi-generator-cli-6.6.0.jar -O openapi-generator-cli.jar

```

```bash

java -jar openapi-generator-cli.jar generate -g spring --additional-properties=prependFormOrBodyParameters=true \
    -o generated-wqm-api-jar -i wqm.yaml --api-package com.example.wqm 

```

4. Open from Intellij, New Project from existing sources then in project, select pom.xml, right click add as Maven
5. Maven - clean install
6. Spring Boot - run
7. Go to localhost:8000

(examples in /generated folder for both generations)

## MVN Plugin

TODO: as part of a project

1. generate a spring MVC project from start.spring.io
2. 
