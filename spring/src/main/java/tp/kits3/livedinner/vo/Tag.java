package tp.kits3.livedinner.vo;

public class Tag {

    private Integer tagid;

    private String tgname;

    public Integer getTagid() {
        return tagid;
    }

    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }

    public String getTgname() {
        return tgname;
    }

    public void setTgname(String tgname) {
        this.tgname = tgname;
    }

    public Tag(Integer tagid, String tgname) {
		super();
		this.tagid = tagid;
		this.tgname = tgname;
	}

	// Tag 모델 복사
    public void CopyData(Tag param)
    {
        this.tagid = param.getTagid();
        this.tgname = param.getTgname();
    }
}