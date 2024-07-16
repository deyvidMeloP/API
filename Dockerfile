# Use uma imagem base do OpenJDK
FROM openjdk:17-jdk-slim

# Defina o diretório de trabalho no contêiner
WORKDIR /app

# Copie o código fonte para o contêiner
COPY . .

# Execute o comando Gradle para construir o projeto e gerar o JAR
RUN ./gradlew build --no-daemon

# Copie o arquivo JAR gerado para o contêiner
COPY build/libs/Kabum-0.0.1-SNAPSHOT.jar app.jar

# Exponha a porta em que a aplicação Spring Boot estará escutando
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
