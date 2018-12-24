# simple-kafka-example
Kafka with spring boot rest api producer consumer example

##1- Set up kafka in localhost with default configuration

##2- Start spring boot application and send json request to "/produce/direct" api with ExampleRequest model

##3- Api will send message to Kafka "test" topic and consumer will read that message and prints it to the console

##4- Consumers with just string and ConsumerRecord is available in SimpleConsumer component (groupId's are intentionally given different to show both consumers can get the message in a different way)