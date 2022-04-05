# quarkus-mqtt-message Project

Este projeto é uma aplicação exemplo do uso de mensageria com o protocolo MQTT.

##  Executando aplicação em modo desenvolvimento
./mvnw compile quarkus:dev
```

## Gerando executável nativo

./mvnw package -Pnative
```
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

