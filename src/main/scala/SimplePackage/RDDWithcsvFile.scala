package SimplePackage

import org.apache.spark.sql.SparkSession

object RDDWithcsvFile {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
    .appName("Creating RDD with CSV Files")
      .master("local")
      .getOrCreate()

    val csvRDD = spark.sparkContext.textFile("src/test/csv123/vikas123.csv")
    csvRDD.foreach(println)
    val header = csvRDD.first()

    //val csvRDDWithoutHeader = csvRDD.filter(line => line ! =header)
    val csvRDDWithoutHeader = csvRDD.filter(_ !=header)
    csvRDDWithoutHeader.foreach(println)

  }

}
