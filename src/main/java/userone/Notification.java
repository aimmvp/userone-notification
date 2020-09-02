package userone;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Notification_table")
public class Notification {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String userId;
    private String contents;
    private String sendDtm;

    @PostPersist
    public void onPostPersist(){
        EmailSent emailSent = new EmailSent();
        BeanUtils.copyProperties(this, emailSent);
        emailSent.publishAfterCommit();


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
