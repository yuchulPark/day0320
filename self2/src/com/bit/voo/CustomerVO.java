package com.bit.voo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class CustomerVO {
	private int custid;
	private String name;
	private String address;
	private String phone;
}
