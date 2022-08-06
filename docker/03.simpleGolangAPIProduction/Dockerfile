# start from base
FROM alpine:3.14

MAINTAINER Leonel Garófolo <garofolo.leonel@gmail.com>

# install bash
RUN apk update
RUN apk upgrade
RUN apk add bash


# install some tools
RUN apk add vim
RUN apk add curl

WORKDIR /home/app

COPY ./main .

CMD ["main"]
