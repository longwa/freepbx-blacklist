echo "Fetching new list..."
wget http://www.callcap.com/blacklist -O blacklist.xml

echo "Generating CSV..."
groovy blacklist.groovy > blacklist.csv
