package com.glodon.modules.model;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.sql.Blob;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author LC
 * @since 2021-03-15
 */
public class AttachFile extends Model<AttachFile> {

    private static final long serialVersionUID=1L;

    private String id;

    private String type;

    /**
     * 附件ID【类型】-【序号】-【流水号】
     */
    private String attachFileId;

    /**
     * 规范号
     */
    private String standardNum;

    /**
     * 条文号
     */
    private String articleNum;

    /**
     * 附图附表
     */
    private Blob attachFile;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAttachFileId() {
        return attachFileId;
    }

    public void setAttachFileId(String attachFileId) {
        this.attachFileId = attachFileId;
    }

    public String getStandardNum() {
        return standardNum;
    }

    public void setStandardNum(String standardNum) {
        this.standardNum = standardNum;
    }

    public String getArticleNum() {
        return articleNum;
    }

    public void setArticleNum(String articleNum) {
        this.articleNum = articleNum;
    }

    public Blob getAttachFile() {
        return attachFile;
    }

    public void setAttachFile(Blob attachFile) {
        this.attachFile = attachFile;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "AttachFile{" +
        "id=" + id +
        ", type=" + type +
        ", attachFileId=" + attachFileId +
        ", standardNum=" + standardNum +
        ", articleNum=" + articleNum +
        ", attachFile=" + attachFile +
        "}";
    }
}
