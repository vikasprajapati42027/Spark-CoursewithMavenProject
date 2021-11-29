package SimplePackage
import org.apache.spark.{SparkConf, SparkContext}
object HelloWorld {
  def main(args:Array[String]): Unit = {
    val sparkConf = new SparkConf()
    sparkConf.setAppName("First Project")
    sparkConf.setMaster("local")
    val sc =new SparkContext(sparkConf)
    val array=Array(1,2,3,4,5,6,7,8,9,0,"vikas")
    val arrayRDD = sc.parallelize(array,2)
    println("Num of elements in RDD : ",arrayRDD.count())
    arrayRDD.foreach(println)

  }
}
