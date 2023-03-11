package org.jkv.bigdata.spark.loans.streaming;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.SparkSession;
import org.jkv.bigdata.spark.loans.dto.CustomerLoanInfo;

public class LoansIngestServiceImpl {

    public void executeLoansIngest(SparkSession sparkSession) {

        // Java Bean (data class) used to apply schema to JSON data
        Encoder<CustomerLoanInfo> customerLoanInfoEncoder = Encoders.bean(CustomerLoanInfo.class);
        Dataset<CustomerLoanInfo> customerLoans = sparkSession.read().json("src/main/resources/mock-loans-dataset").as(customerLoanInfoEncoder);
        customerLoans.show(1000);
        customerLoans.printSchema();

    }
}
