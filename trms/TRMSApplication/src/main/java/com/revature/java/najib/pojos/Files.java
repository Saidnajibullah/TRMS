package com.revature.java.najib.pojos;

import java.io.InputStream;

public class Files {
	private InputStream file1;
	private InputStream file2;
	public synchronized InputStream getFile1() {
		return file1;
	}
	public synchronized void setFile1(InputStream input1) {
		this.file1 = input1;
	}
	public synchronized InputStream getFile2() {
		return file2;
	}
	public synchronized void setFile2(InputStream file2) {
		this.file2 = file2;
	}

}
