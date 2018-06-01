package skill;

public class Skill {
	/*
	�o��class�O�D�n���ޯ�class�A�U�ӧޯ�class�[���ۤv��interact function �M�ۤv��ID,level
	�U�誺�T��static ID ���ܨϥΪ̿�ܤF���T�ӧޯ�
	�b�i�J�C���ɡA�ݭn�ϥΤU�誺createSkill �ӳгy�@��skill object
	createSkill �|�̾�skillID �Ӧ^�Ǥ��P���ޯ�class
	 */
	public static int ID1 = 1, ID2 = 2, ID3 = 3;
	public int CD;
	public int maxCD;

	public void interact() {
	}

	public static Skill createSkill(int skillID) {
		switch (skillID) {
		case 1:
			return (Skill) new Aoe();
		case 2:
			return (Skill) new Boost();
		case 3:
			return (Skill) new Recharge();
		case 4:
			return (Skill) new Heal();
		case 5:
			return (Skill) new Summon();
		default:
			return (Skill) new Aoe();
		}
	}
}