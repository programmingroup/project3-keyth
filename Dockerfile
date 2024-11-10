FROM ubuntu:latest
LABEL authors="keith"

ENTRYPOINT ["top", "-b"]