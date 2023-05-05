# Utilisez l'image officielle de Java pour la base
FROM openjdk:17

# Définissez un répertoire de travail
WORKDIR /app

# Copiez le fichier JAR de votre microservice dans l'image Docker
COPY Paiement-0.0.1-SNAPSHOT.jar /app/paiement.jar

# Exposez le port sur lequel votre microservice écoutera
EXPOSE 8081

# Définissez la commande pour démarrer votre microservice
ENTRYPOINT ["java", "-jar", "/app/paiement.jar"]
