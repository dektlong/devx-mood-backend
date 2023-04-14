tanzu service class-claim create inventory --class mysql-unmanaged --parameter storageGB=1 -n YOUR_DEV_NAMESPACE

tanzu service class-claim create reading --class rabbitmq-unmanaged --parameter replicas=1 --parameter storageGB=1 -n YOUR_DEV_NAMESPACE