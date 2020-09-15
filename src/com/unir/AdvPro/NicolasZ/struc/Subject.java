package com.unir.AdvPro.NicolasZ.struc;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author NICOLÁS ZAPATA ÀLZATE
 */
public class Subject {
	private int id;
	private String name;
	private float total;
	private float cumulativePercentage;

  /**
   * This the Subject Courses when the teacher get the qualification
   * 
   * @param id
   * @param name
   * @param total
   * @param cumulativePercentage 
   */
	public Subject() {
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
  
  public void PrintQualification(List<Qualification> qualification){
    
    
    
    try{

      StringBuilder stringBuilder = new StringBuilder();
      for (int i = 0; i < qualification.size(); i++) {
        stringBuilder.append(qualification.get(i).getValue());
        stringBuilder.append(" ");
        stringBuilder.append("\n");
        stringBuilder.append(qualification.get(i).getSubject().getName());
      }
      

      JOptionPane.showMessageDialog(null, stringBuilder.toString());
    }catch(Exception e){
      JOptionPane.showConfirmDialog(null, 
              "Something is not working in the subject provide, please, make sure you type the data correctly",
              "Error",JOptionPane.ERROR);
    }
    
  }
  
}

