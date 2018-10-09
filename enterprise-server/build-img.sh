if [${1} = ""]; then 
	echo "Informe uma tag para a imagem - /build-img.sh <tag>"
else 
	docker build -t sample/enterprise-server:${1} .
fi
