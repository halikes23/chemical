PROJECT="$1"

if  [ "$PROJECT" != "" ] && [ "$PROJECT" != "qiniu-resource" -a "$PROJECT" != "redis" -a "$PROJECT" != "redis-interface"  -a "$PROJECT" != "message" ] ;
then
	echo "error parameters : $PROJECT" 
	exit ;
fi


cd chemical-common
mvn clean install -Dmaven.test.skip=true

if [ "$PROJECT" != "" ] ; then
	cd ../chemical-$PROJECT
	mvn clean install -Dmaven.test.skip=true

else	
	cd ../chemical-qiniu-resource;
	mvn clean install -Dmaven.test.skip=true
	cd ../chemical-redis;
	mvn clean install -Dmaven.test.skip=true
	cd ../chemical-redis-interface;
	mvn clean install -Dmaven.test.skip=true
	cd ../chemical-message;
	mvn clean install -Dmaven.test.skip=true
fi

