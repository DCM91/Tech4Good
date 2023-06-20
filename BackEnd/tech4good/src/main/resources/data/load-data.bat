@echo off
echo Beginning of insertion

mongoimport --host localhost --port 27017 --db tech4good --collection commercialCensus --type json --file commercialCensus.json --jsonArray --drop
mongoimport --host localhost --port 27017 --db tech4good --collection marketFair --type json --file mercats_i_fires.json --jsonArray --drop
mongoimport --host localhost --port 27017 --db tech4good --collection marketMun --type json --file mercats_municipals.json --jsonArray --drop
mongoimport --host localhost --port 27017 --db tech4good --collection commercialGallery --type json --file galerias_comerciales.json --jsonArray --drop
mongoimport --host localhost --port 27017 --db tech4good --collection shoppingCenter --type json --file centres_comercials.json --jsonArray --drop

pause
echo Import completed successfully.
exit