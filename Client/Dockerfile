# Utilisez l'image officielle de Java pour la base
FROM openjdk:17

# Définissez un répertoire de travail
WORKDIR /app

# Copiez le fichier JAR de votre microservice dans l'image Docker
COPY target/Client.jar /app/client.jar

# Exposez le port sur lequel votre microservice écoutera
EXPOSE 8083

# Définissez la commande pour démarrer votre microservice
ENTRYPOINT ["java", "-jar", "/app/client.jar"]
