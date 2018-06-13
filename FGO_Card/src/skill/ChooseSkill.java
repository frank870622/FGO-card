package skill;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import menu.MainWindow;

public class ChooseSkill {
	public static int[] chooseSkillID = new int[3];
	public static int[] skillLevel = new int[5];
	public static int[] skillPower = new int[5];
	public static int[] skillCD = new int[] {10, 8, 12, 10, 15};
	private static final int levelUpGold[] = {100, 200, 500, 1000};
	private static final ImageIcon[] skillImage = {
			new ImageIcon(MainWindow.class.getResource("/Image/Skill_AllDamage.png")),
			new ImageIcon(MainWindow.class.getResource("/Image/Skill_WeaponUp.png")),
			new ImageIcon(MainWindow.class.getResource("/Image/Skill_ReduceCharge.png")),
			new ImageIcon(MainWindow.class.getResource("/Image/Skill_HealthUp.png")),
			new ImageIcon(MainWindow.class.getResource("/Image/Skill_SumonSword.png"))
	};
	
	
	//get the skillID of three skill you choice
	public static int[] getChooseID() {
		return chooseSkillID;
	}
	//get the skill MaxCD of three skill you choice
	public static int[] getChooseSkillMaxCD() {
		return new int[] {skillLevel[chooseSkillID[0]], skillLevel[chooseSkillID[1]], skillLevel[chooseSkillID[2]]};
	}
	//get the skill level of three skill you choice
	public static int[] getChooseLevel() {
		return new int[] {skillLevel[chooseSkillID[0]], skillLevel[chooseSkillID[1]], skillLevel[chooseSkillID[2]]};
	}
	//get the skill power of three skill you choice
	public static int[] getChoosePower() {
		return new int[] {skillPower[chooseSkillID[0]], skillPower[chooseSkillID[1]], skillPower[chooseSkillID[2]]};
	}
	
	//return the maxCD of skill
	public static int getSkillMaxCD(int ID){
		return skillCD[ID-1];
	}
	//return the power of skill
	public static int getSkillPower(int ID){
		return skillPower[ID-1];
	}
	//return the level of skill
	public static int getSkilllevel(int ID){
		return skillLevel[ID-1];
	}
	
	//the partition is for user choose skill 1,2,3
	public static void setChooseSkill(int ID, int i) {
		chooseSkillID[i] = ID;
	}
	
	//to set the skill level
	public static void setLevel(int ID, int level) {
		skillLevel[ID-1] = level;
	}
	//to set the skill power
	public static void setPower(int ID, int power) {
		skillPower[ID-1] = power;
	}
	/**
	 * for press the levelup button to upgrade the skil
	 */
	public static int levelUp(Icon img, int gold) {
		if(img.equals(skillImage[0]) && skillLevel[0] < 5) {
			if(levelUpGold[skillLevel[0]-1] <= gold) {
				skillLevel[0]++;
				skillPower[0] = skillLevel[0];
				return gold-levelUpGold[skillLevel[0]-2];
			}
			else
				return gold;
		}
		else if(img.equals(skillImage[1]) && skillLevel[1] < 5) {
			if(levelUpGold[skillLevel[1]-1] <= gold) {
				skillLevel[1]++;
				skillPower[1] = 3 + skillLevel[1];
				return gold-levelUpGold[skillLevel[1]-2];
			}
			else
				return gold;
		}
		else if(img.equals(skillImage[2]) && skillLevel[2] < 5) {
			if(levelUpGold[skillLevel[2]-1] <= gold) {
				skillLevel[2]++;
				skillPower[2] = skillLevel[2];
				return gold-levelUpGold[skillLevel[2]-2];
			}
			else
				return gold;
		}
		else if(img.equals(skillImage[3]) && skillLevel[3] < 5) {
			if(levelUpGold[skillLevel[3]-1] <= gold) {
				skillLevel[3]++;
				skillPower[3] = 2 * skillLevel[3];
				return gold-levelUpGold[skillLevel[3]-2];
			}
			else
				return gold;
		}
		else if(img.equals(skillImage[4]) && skillLevel[4] < 5) {
			if(levelUpGold[skillLevel[4]-1] <= gold) {
				skillLevel[4]++;
				skillPower[4] = 5 + 2 * skillLevel[4];
				return gold-levelUpGold[skillLevel[4]-2];
			}
			else
				return gold;
		}
		else 
			return gold;		
	}
	
}
