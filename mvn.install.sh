PROJECT="$1"

if  [ "$PROJECT" != "" ] && [ "$PROJECT" != "qiniu-resource" ] ;
then
	echo "error parameters : $PROJECT" 
	exit ;
fi

cd chemical-qiniu-resource

#cd jnwtv-common
#mvn clean install -Dmaven.test.skip=true

if [ $PROJECT != "" ] ; then
	cd ../chemical-$PROJECT
	mvn clean package -Dmaven.test.skip=true
else	
	cd ../chemical-qiniu-resource;
	mvn clean package -Dmaven.test.skip=true
fi

