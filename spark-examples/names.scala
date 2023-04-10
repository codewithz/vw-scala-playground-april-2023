scala> val path:String="/home/lab-user/datasets/names.csv"
path: String = /home/lab-user/datasets/names.csv

scala> var df=spark.
     | read.
     | format("csv")
df: org.apache.spark.sql.DataFrameReader = org.apache.spark.sql.DataFrameReader@4d0ad526

scala> var df=spark.read.format("csv").option("header","true").load(path)
df: org.apache.spark.sql.DataFrame = [firstname: string, lastname: string]      

scala> df.show
+---------+---------+
|firstname| lastname|
+---------+---------+
|    Rohit|   Sharma|
|    Virat|    Kohli|
|   Sachin|Tendulkar|
|   Zaheer|     Khan|
|  Rishabh|     Pant|
| Mohammed|    Shami|
|       KL|    Rahul|





scala> import org.apache.spark.sql.functions._
import org.apache.spark.sql.functions._

scala> df=df.withColumn("name",concat(col("lastname"),lit(","),col("firstname")))
df: org.apache.spark.sql.DataFrame = [firstname: string, lastname: string ... 1 more field]

scala> df.show
+---------+---------+----------------+
|firstname| lastname|            name|
+---------+---------+----------------+
|    Rohit|   Sharma|    Sharma,Rohit|
|    Virat|    Kohli|     Kohli,Virat|
|   Sachin|Tendulkar|Tendulkar,Sachin|
|   Zaheer|     Khan|     Khan,Zaheer|
|  Rishabh|     Pant|    Pant,Rishabh|
| Mohammed|    Shami|  Shami,Mohammed|
|       KL|    Rahul|        Rahul,KL|
+---------+---------+----------------+
