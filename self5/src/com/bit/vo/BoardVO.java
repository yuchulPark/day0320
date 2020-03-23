package com.bit.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class BoardVO {
	private int no;
	private String title;
	private String writer;
	private String pwd;
	private int hit;
	private Date regidate;
	private String content;
	private String fname;
	private String ip;
	private int b_ref;
	private int b_level;
	private int b_step;
}
