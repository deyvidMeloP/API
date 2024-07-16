# Etapa de construção
FROM openjdk:17-jdk AS build

# Define o diretório de trabalho
WORKDIR /app

# Copia todos os arquivos para o diretório de trabalho
COPY . .

# Copia o Gradle Wrapper e os diretórios gradle
COPY gradlew .
COPY gradle ./gradle

# Configura permissões para o Gradle Wrapper
RUN chmod +x ./gradlew

# Executa o comando Gradle para construir o projeto
RUN ./gradlew build --no-daemon

# Etapa de execução
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho
WORKDIR /app

# Copia o JAR executável da etapa de construção
COPY --from=build /app/build/libs/Kabum-0.0.1-SNAPSHOT.jar app.jar

# Expõe a porta em que a aplicação Spring Boot estará escutando
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
