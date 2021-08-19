package com.test.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TestDto {

	@ApiModelProperty(notes = "Enter First Number", required = true)
	private Double num1;

	@ApiModelProperty(notes = "Enter Second Number", required = true)
	private Double num2;

	@ApiModelProperty(required = true)
	private String operation;
}
