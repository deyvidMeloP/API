# Etapa de construção
FROM openjdk:17-jdk AS build

# Define o diretório de trabalho
WORKDIR /app

# Copia todos os arquivos para o diretório de trabalho
COPY . .

# Instala o Gradle Wrapper (caso não esteja presente)
COPY gradlew .
COPY gradle ./gradle
RUN chmod +x ./gradlew

# Executa a construção do JAR executável
RUN ./gradlew bootJar --no-daemon

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
