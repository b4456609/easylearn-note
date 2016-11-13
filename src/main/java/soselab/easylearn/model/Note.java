package soselab.easylearn.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Note {

    @Id
    private String id;
    private String content;
    private long createTime;
    private String userId;
    private String userName;
    private String versionId;
    private List<Comment> comment;

    public Note() {
    }

    public Note(String id, String content, long createTime, String userId, String userName, String versionId, List<Comment> comment) {
        this.id = id;
        this.content = content;
        this.createTime = createTime;
        this.userId = userId;
        this.userName = userName;
        this.versionId = versionId;
        this.comment = comment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }
}
