package com.bit.exam;

import java.util.List;

public class ProtocolHandler {
	private List<Filter> filters;

	public void setFilter(List<Filter> filters) {
		this.filters = filters;
	}
	public void execute() {
		for(Filter f : filters) {
			f.pro();
		}
	}
}
