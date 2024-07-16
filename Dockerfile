# Use uma imagem base do OpenJDK
FROM openjdk:17-jdk-slim

# Exiba o diretório atual para fins de depuração
RUN pwd
RUN ls -la

# Defina o diretório de trabalho no contêiner
WORKDIR /app

# Exiba o conteúdo de build/libs antes de copiar
RUN ls -la build/libs

# Copie o arquivo JAR gerado para o contêiner
COPY build/libs/Kabum-0.0.1-SNAPSHOT.jar app.jar

# Exiba novamente o conteúdo de /app após a cópia
RUN ls -la /app

# Exponha a porta em que a aplicação Spring Boot estará escutando
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
