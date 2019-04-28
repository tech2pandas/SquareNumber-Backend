### Square Demo

This is a simple Spring Boot Project which exposes an endpoint to square a number. 

#### Sample Example with endpoint

##### Request:
GET http://ec2-35-164-116-43.us-west-2.compute.amazonaws.com:8080/square/10

##### Response:
```json
{
"data": 100
}
```

Change 10 to any number. 

#### Input Validation
However if the given number is not an integer(i.e., it is a string or a double), then you will get an error response like this

##### Request:
GET http://ec2-35-164-116-43.us-west-2.compute.amazonaws.com:8080/square/ten

##### Response:
```json
{
"error": "Error while parsing input. Make sure the input is an integer"
}
```
