package org.jkv.bigdata.spark;

import org.apache.spark.sql.SparkSession;
import org.jkv.bigdata.spark.loans.streaming.LoansIngestServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SparkSession sparkSession = SparkSession
                .builder()
                .appName("LoansIngestStreamingApp")
                .master("local[2]")
                .getOrCreate();

        LoansIngestServiceImpl loansIngestService = new LoansIngestServiceImpl();
        loansIngestService.executeLoansIngest(sparkSession);

    }
}
