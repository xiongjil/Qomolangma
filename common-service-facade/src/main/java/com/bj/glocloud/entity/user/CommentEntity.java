package com.bj.glocloud.entity.user;

import java.io.Serializable;

/**
 * @Author Xionge
 * @Date 2018/11/10
 */
public class CommentEntity implements Serializable {

    // Key
    private String id;

    // Comment
    private String comment;

    // Article Id
    private String articleId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    @Override
    public String toString() {
        return "CommentEntity{" +
                "id='" + id + '\'' +
                ", comment='" + comment + '\'' +
                ", articleId='" + articleId + '\'' +
                '}';
    }
}