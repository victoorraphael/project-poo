package projeto;

public class MartialArt {

	private String jiuJitsu;
	private String muayThai;
	private String kickBox;

	public MartialArt(String jiuJitsu, String muayThai, String kickBox) {

		this.jiuJitsu = jiuJitsu;
		this.muayThai = muayThai;
		this.kickBox = kickBox;
	}

	public String getJiuJitsu() {
		return jiuJitsu;
	}

	public void setJiuJitsu(String jiuJitsu) {
		this.jiuJitsu = jiuJitsu;
	}

	public String getMuayThai() {
		return muayThai;
	}

	public void setMuayThai(String muayThai) {
		this.muayThai = muayThai;
	}

	public String getKickBox() {
		return kickBox;
	}

	public void setKickBox(String kickBox) {
		this.kickBox = kickBox;
	}

}
