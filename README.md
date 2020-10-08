# account

### CRUD

- list all users

  `http://54.153.20.234:8080/list`

- add a user, this is the request body

  `http://54.153.20.234:8080/add`

  ```shell
  {
    "firstName": "mike",
    "lastName": "joes",
    "email": "mike@gmail.com",
    "phone": "213213213",
    "username": "mike2000",
    "password": "2000mike",
    "birth": "1994-11-17T00:00:00.000+00:00",
    "gender": 1
  }
  ```

- update a user

  `http://54.153.20.234:8080/update`

  ```shell
  {
    "id": 1,
    "firstName": "zhang",
    "lastName": "yuanhang",
    "email": "hang@gamil.com",
    "phone": "123123",
    "username": "zyhang9417",
    "password": "admin1994",
    "birth": "1994-11-17T00:00:00.000+00:00",
    "gender": 1
  }
  ```

- delete a user

  `http://54.153.20.234:8080/delete/{id}`

  

 ### Dockerfile

```shell
FROM java:8

COPY *.jar /app.jar
CMD ["--server.port=8080"]
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
```

