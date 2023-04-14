#!/usr/bin/env bash

dev_namespace=$1

if [ "$dev_namespace" == "" ] 
then
    echo "Error!! please specific developer namespace"
    exit
fi

tanzu service class-claim create inventory --class postgresql-unmanaged --parameter storageGB=1 -n $dev_namespace

tanzu service class-claim create reading --class rabbitmq-unmanaged --parameter replicas=1 --parameter storageGB=1 -n $dev_namespace