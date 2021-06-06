# the most basic CRUD api using spring boot

the deployed link to test the api

https://crudbasic-springboot.herokuapp.com/


The above link has an entity topic havings elements as:
1. id(primary key)
2. name of the topic
3. description

To access that , open the link in the postman app

and hit:https://crudbasic-springboot.herokuapp.com/topics 

First it will show null , by using Post method one can insert the topic over any technology/framework

Enter the info into the raw body frame , with the below format:

{
        "id": "",
        "name": " ",
        "description": " "
    }
For, example: {
        "id": "java",
        "name": " java uptd framework ",
        "description": " java uptd framework description"
    }
    
    above insert will be same for all the Post and Put requests
