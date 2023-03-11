package org.jkv.bigdata.spark.loans.dto;

import lombok.Getter;
import lombok.Setter;
import scala.Int;

import java.math.BigDecimal;

@Getter
@Setter
public class CustomerLoanInfo {

    private Int id;
    private Long customerId;
    private String status;
    private BigDecimal loanAmount;
    private String filename;
}
