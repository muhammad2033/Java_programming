import mysql.connector
from datetime import datetime
kkkkk
mydb= mysql.connector.connect(

	host = "localhost",
	user = "root",
	passwd = "password123",
	database = "testdatabase"
	)
print(mydb)

mycursor.execute("CREATE DATABASE testdatabase")
