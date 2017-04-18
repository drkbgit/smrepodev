package com.smp.beans;


public class TrainingInfo {
	
   private String id;   
   private String trainingName;
   private String trainingCategory;
   private String trainingCostType;
   private String trainingPrice;
   private String trainingDuration;
   private String skillName;
   private String roleName;    
 
   public TrainingInfo() {
        
   }
   
   public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public String getTrainingCategory() {
		return trainingCategory;
	}

	public void setTrainingCategory(String trainingCategory) {
		this.trainingCategory = trainingCategory;
	}
	
	public String getTrainingCostType() {
		return trainingCostType;
	}

	public void setTrainingCostType(String costType) {
		this.trainingCostType = costType;
	}

	public String getTrainingPrice() {
		return trainingPrice;
	}

	public void setTrainingPrice(String trainingPrice) {
		this.trainingPrice = trainingPrice;
	}

	public String getTrainingDuration() {
		return trainingDuration;
	}

	public void setTrainingDuration(String trainingDuration) {
		this.trainingDuration = trainingDuration;
	}
	
	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
 
}