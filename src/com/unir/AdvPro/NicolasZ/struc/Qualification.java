/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unir.AdvPro.NicolasZ.struc;

/**
 *
 * @author NICOLÁS ZAPATA ÀLZATE
 */
public class Qualification {
	private int number;
	private int date;
	private int value;
	private int percentage;

	public Qualification(int number, int date, int value, int percentage) {
		this.number = number;
		this.date = date;
		this.value = value;
		this.percentage = percentage;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

}
