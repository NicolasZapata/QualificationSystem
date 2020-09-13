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
public class Subject {
	private int id;
	private String name;
	private float total;
	private float cumulativePercentage;

	public Subject(int id, String name, float total, float cumulativePercentage) {
		this.id = id;
		this.name = name;
		this.total = total;
		this.cumulativePercentage = cumulativePercentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public float getCumulativePercentage() {
		return cumulativePercentage;
	}

	public void setCumulativePercentage(float cumulativePercentage) {
		this.cumulativePercentage = cumulativePercentage;
	}
  
}

