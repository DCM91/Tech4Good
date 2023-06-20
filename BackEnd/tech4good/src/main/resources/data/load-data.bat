@echo off
echo Beginning of insertion

mongoimport --host localhost --port 27017 --db tech4good --collection commercialCensus --type json --file commercialCensus.json --jsonArray --drop
mongoimport --host localhost --port 27017 --db tech4good --collection marketsFairs --type json --file mercats_i_fires.json --jsonArray --drop
mongoimport --host localhost --port 27017 --db tech4good --collection marketsMun --type json --file mercats_municipals.json --jsonArray --drop
mongoimport --host localhost --port 27017 --db tech4good --collection commercialGalleries --type json --file galerias_comerciales.json --jsonArray --drop
mongoimport --host localhost --port 27017 --db tech4good --collection shoppingCenters --type json --file centres_comercials.json --jsonArray --drop

pause
echo Import completed successfully.
exit