package userone;

public class EmailSent extends AbstractEvent {

    private Long id;
    private String userId;
    private String contents;
    private String sendDtm;

    public EmailSent(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
    public String getSendDtm() {
        return sendDtm;
    }

    public void setSendDtm(String sendDtm) {
        this.sendDtm = sendDtm;
    }
}
