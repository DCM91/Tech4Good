@echo off
echo Beginning of insertion

mongoimport --host localhost --port 27017 --db tech4good --collection users --type csv --headerline --file countries.csv

echo Made it
exit