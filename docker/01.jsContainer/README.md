## Execution Description

- Run docker with npm enviroment, execute:
'''
docker build -t my-nodejs-app -f DockerfileNPM .
docker run -it my-nodejs-app
'''

- Run docker with NGINX, it's recommended to production enviroment.
docker build -t npm-app-prd -f DockerfileNGINX.prd .
docker run -it npm-app-prd


