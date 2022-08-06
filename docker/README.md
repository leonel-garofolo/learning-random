##Annotation about Docker

#### Docker Generic Commands
Run console 
'''
docker exec -it <container_id> /bin/bash
'''

Show log
'''
docker logs <container_id>
'''

Delete all containers with only a command:
'''
docker rm -f $(docker ps -a -q)
'''

Delete all volumes using te following command:
'''
docker volume rm $(docker volume ls -q)
'''

Delete all images
'''
docker rmi $(docker images -q)h
'''

## Docker Compose
#### Version 3.9
Run profile
'''
docker compose --profile <NAME_PROFILE> up
'''


## Information about docker Images
#### Nginx
Run Nginx container
'''
docker run -it --rm -d -p 8080:80 --name web nginx
'''
