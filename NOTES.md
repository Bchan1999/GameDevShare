Postgres Local Setup 

ssh -L 5432:localhost:5432 bchan955@192.168.1.73 -p 5899

Test on DB Beaver 

jdbc:postgresql://localhost:5432/postgres

- Authentication username and password

<h2>Springboot Questions</h2>

Why is RestController needed?
- It tells spring that this bean is a canditate to handle HTTP requests. For REST API, it will serialize the data and turn it into a response body