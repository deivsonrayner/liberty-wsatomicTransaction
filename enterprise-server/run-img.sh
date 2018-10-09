if [${1} = ""]; then 
	echo "Informe uma tag para a imagem - /run-img.sh <tag>"
else 
	docker run -d -p 9402:9402 -p 80:9080 -p 443:9443 -p 2809:2809 sample/enterprise-server:${1}
fi
