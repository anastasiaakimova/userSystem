db.createCollection("users")

db.users.insertOne(
    {
        "id": "0cf6e724-fff4-11eb-9a03-0242ac130003",
        "name": "Tom",
        "password": "1234",
        "phone": "1234",
        "isActive": false
    }
    )

db.users.createIndex({id:1}, {unique: true})

db.users.insertMany([
    {
        "id": "e5bc1800-fff3-11eb-9a03-0242ac130003",
        "name": "Kate",
        "password": "0987",
        "phone": "7896",
        "isActive": true
    },

    {
        "id": "ffb301e2-fff3-11eb-9a03-0242ac130003",
        "name": "Alex",
        "password": "0987rtyu",
        "phone": "789624357",
        "isActive": false
    },

    {
        "id": "06256fc4-fff4-11eb-9a03-0242ac130003",
        "name": "Mary",
        "password": "qwer0912387rtyu",
        "phone": "700000",
        "isActive": true
    }
])
