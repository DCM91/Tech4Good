@echo off
echo Beginning of insertion

mongoimport --host localhost --port 27017 --db tech4good --collection commercialCensus --type json --file commercialCensus.json --jsonArray --drop
pause
echo Import completed successfully.
exit