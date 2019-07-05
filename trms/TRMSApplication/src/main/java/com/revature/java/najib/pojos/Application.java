package com.revature.java.najib.pojos;

import java.io.InputStream;

public class Application {
	private String employeeid;
	private String supervisorid;
	private String fullname;
	private String event;
	private String location;
	private String date;
	private double cost;
	private double amount;
	private String grade;
	private String presentation;
	private String justificaion;
	private String supprotd1;
	private String supprort2;
	private boolean supconfirm;
	private boolean headconfirm;
	private boolean bencoconfirm;
	private InputStream file1;
	private InputStream file2;
	public synchronized String getEmployeeid() {
		return employeeid;
	}
	public synchronized void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public synchronized String getSupervisorid() {
		return supervisorid;
	}
	public synchronized void setSupervisorid(String supervisorid) {
		this.supervisorid = supervisorid;
	}
	public synchronized String getFullname() {
		return fullname;
	}
	public synchronized void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public synchronized String getEvent() {
		return event;
	}
	public synchronized void setEvent(String event) {
		this.event = event;
	}
	public synchronized String getLocation() {
		return location;
	}
	public synchronized void setLocation(String location) {
		this.location = location;
	}
	public synchronized String getdate() {
		return date;
	}
	public synchronized void setdate(String date) {
		this.date = date;
	}
	public synchronized double getCost() {
		return cost;
	}
	public synchronized void setCost(double cost) {
		this.cost = cost;
	}
	public synchronized double getAmount() {
		return amount;
	}
	public synchronized void setAmount(double amount) {
		this.amount = amount;
	}
	public synchronized String getGrade() {
		return grade;
	}
	public synchronized void setGrade(String grade) {
		this.grade = grade;
	}
	public synchronized String getPresentation() {
		return presentation;
	}
	public synchronized void setPresentation(String presentation) {
		this.presentation = presentation;
	}
	public synchronized String getJustification() {
		return justificaion;
	}
	public synchronized void setJustification(String justification) {
		this.justificaion = justification;
	}
	public synchronized String getSupprotd1() {
		return supprotd1;
	}
	public synchronized void setSupprotd1(String supprotd1) {
		this.supprotd1 = supprotd1;
	}
	public synchronized String getSupprort2() {
		return supprort2;
	}
	public synchronized void setSupprort2(String supprort2) {
		this.supprort2 = supprort2;
	}
	public synchronized boolean isSupconfirm() {
		return supconfirm;
	}
	public synchronized void setSupconfirm(boolean supconfirm) {
		this.supconfirm = supconfirm;
	}
	public synchronized boolean isHeadconfirm() {
		return headconfirm;
	}
	public synchronized void setHeadconfirm(boolean headconfirm) {
		this.headconfirm = headconfirm;
	}
	public synchronized boolean isBencoconfirm() {
		return bencoconfirm;
	}
	public synchronized void setBencoconfirm(boolean bencoconfirm) {
		this.bencoconfirm = bencoconfirm;
	}
	public synchronized InputStream getFile1() {
		return file1;
	}
	public synchronized void setFile1(InputStream file1) {
		this.file1 = file1;
	}
	public synchronized InputStream getFile2() {
		return file2;
	}
	public synchronized void setFile2(InputStream file2) {
		this.file2 = file2;
	}
	

}
