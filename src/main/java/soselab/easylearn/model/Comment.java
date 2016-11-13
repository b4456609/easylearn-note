package soselab.easylearn.model;

/**
 * Created by bernie on 2016/11/13.
 */
public class Comment {

    private String id;
    private String content;
    private long createTime;
    private String userId;
    private String userName;
    private String noteId;

    public Comment() {
    }

    public Comment(String id, String content, long createTime, String userId, String userName, String noteId) {
        this.id = id;
        this.content = content;
        this.createTime = createTime;
        this.userId = userId;
        this.userName = userName;
        this.noteId = noteId;
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

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }
}
