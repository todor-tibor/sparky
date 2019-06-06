import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.Arrays;

public class SparkApplication {
    public static void main(String[] args) {
        SparkConf sparkConf = new SparkConf();

        sparkConf.setAppName("Sparky");
        sparkConf.setMaster("local");
        sparkConf.set("spark.driver.memory", "4g");

        JavaSparkContext context = new JavaSparkContext(sparkConf);


        context.close();
    }
}
