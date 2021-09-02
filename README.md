###Start startup.sh to run the app

####Request example
`POST http://localhost:9000/booking`

`{
"passenger": {
"name": "name",
"contactNumber": "12345678"
},
"pickupTime": "2021-09-01 09:00:00",
"asap": true,
"waitingTime": 10,
"numberOfPassengers": 4,
"price": 100.99,
"rating": 4.5,
"createdOn": "2021-09-01 09:00:00",
"lastModifiedOn": "2009-09-01 09:00:00",
"tripWaypoints": [
{
"locality": "abc",
"latitude": 23.3123253,
"longitude": 33.123123
},
{
"locality": "def",
"latitude": 37.312323,
"longitude": 33.123123
}
]
}`
