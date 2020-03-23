package com.bit.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data


public class OrdersVO {
		private int orderid;
		private int custid;
		private int bookid;
		private int saleprice;
		private Date orderdate;
}
