#!/bin/bash
cd Client
docker build -t client .
cd ../
cd Commande
docker build -t commande .
cd ../
cd Config
docker build -t config .
cd ../
cd Eureka
docker build -t eureka .
cd ../
cd Gateway
docker build -t Gateway .
cd ../
cd Produit
docker build -t produit .
cd ../
cd Paiement
docker build -t paiement .
cd ../
docker-compose down
docker-compose up -d
