package com.unir.AdvPro.NicolasZ.struc;

/**
 *
 * @author NICOLÁS ZAPATA ÀLZATE
 */
public class Qualification {
	private int number;
	private String date;
	private int value;
	private int percentage;
  private Subject subject;

  /**
   * The Qualifications that the teacher gives to the student
   * 
   * @param number
   * @param date
   * @param value
   * @param percentage 
   */
	public Qualification() {

  }

  public Subject getSubject() {
    return subject;
  }

  public void setSubject(Subject subject) {
    this.subject = subject;
  }

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
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
