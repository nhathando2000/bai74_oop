package donguyennhathan.com.model;

public enum XepLoai {
	Gioi ("Excellent"),
	Kha ("Good"),
	TrungBinh ("OK"),
	Yeu ("Bad");
	private String msg;
	private XepLoai(String msg) {
		this.msg=msg;
	}
	public String description()
	{
		return this.msg;
	}
}
