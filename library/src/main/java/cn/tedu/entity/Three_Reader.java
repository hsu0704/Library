package cn.tedu.entity;

public class Three_Reader {
	private int readercarid ;
	private String readername ;
	private String readertype;
	private String readerid;
	private int readerphoto;
	public Three_Reader(int readercarid, String readername, String readertype, String readerid, int readerphoto) {
		this.readercarid = readercarid;
		this.readername = readername;
		this.readertype = readertype;
		this.readerid = readerid;
		this.readerphoto = readerphoto;
	}
	@Override
	public String toString() {
		return "Three_Reader [readercarid=" + readercarid + ", readername=" + readername + ", readertype=" + readertype
				+ ", readerid=" + readerid + ", readerphoto=" + readerphoto + "]";
	}
	public int getReadercarid() {
		return readercarid;
	}
	public void setReadercarid(int readercarid) {
		this.readercarid = readercarid;
	}
	public String getReadername() {
		return readername;
	}
	public void setReadername(String readername) {
		this.readername = readername;
	}
	public String getReadertype() {
		return readertype;
	}
	public void setReadertype(String readertype) {
		this.readertype = readertype;
	}
	public String getReaderid() {
		return readerid;
	}
	public void setReaderid(String readerid) {
		this.readerid = readerid;
	}
	public int getReaderphoto() {
		return readerphoto;
	}
	public void setReaderphoto(int readerphoto) {
		this.readerphoto = readerphoto;
	}

}
