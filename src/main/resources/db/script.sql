db.createCollection("users")

db.users.insertOne(
    {
        "id": "1",
        "name": "Tom",
        "password": "1234",
        "telephone": "1234",
        "isActive": false
    }
    )

db.users.createIndex({id:1}, {unique: true})

db.users.insertMany([
    {
        "id": "2",
        "name": "Kate",
        "password": "0987",
        "telephone": "7896",
        "isActive": true
    },

    {
        "id": "3",
        "name": "Alex",
        "password": "0987rtyu",
        "telephone": "789624357",
        "isActive": false
    },

    {
        "id": "4",
        "name": "Mary",
        "password": "qwer0912387rtyu",
        "telephone": "700000",
        "isActive": true
    }
])
