# WQM API from OpenApi generator

## CLI run

1. Installed the OpenApi generator

```bash
# using NPM
npm install @openapitools/openapi-generator-cli -g

```

2. Download .yaml to a directoy
3. Run the gen from the cli (note -g spring for spring generator and -i for yaml file in the same directory)

```bash

openapi-generator-cli generate -g spring --additional-properties=prependFormOrBodyParameters=true \
    -o generated-wqm-api-npm -i wqm.yaml

```

TODO: from the jar instead of the wrapper


```bash

# optional use jar directly
wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/6.6.0/openapi-generator-cli-6.6.0.jar -O openapi-generator-cli.jar

```

```bash

java -jar openapi-generator-cli.jar generate -g spring --additional-properties=prependFormOrBodyParameters=true \
    -o generated-wqm-api-jar -i wqm.yaml

```
## MVN Plugin

TODO: as part of a project

