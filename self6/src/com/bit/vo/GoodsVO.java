package com.bit.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class GoodsVO {
	private int no; private String item; private int price;
	private int qty; private String fname; private String detail; 
}
