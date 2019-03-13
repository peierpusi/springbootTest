package com.baizhi.entity;

import java.io.Serializable;

public class Album implements Serializable {
    private String id;//1	id          	主键
    private String title;//2	title          	名称
    private int score;//3	score      	分数
    private String brodcast;//4	brodcast    	播音
    private String author;//5	author  	作者
    private String brief;//6	brief  	简介
    private String publicTime;//7	publicTime   	发布日期
    private int count;//8	count     	集数
    private String coverImg;//9	coverImg 	封面
    private String status;//10	status     	状态

    public Album(String id, String title, int score, String brodcast, String author, String brief, String publicTime, int count, String coverImg, String status) {
        this.id = id;
        this.title = title;
        this.score = score;
        this.brodcast = brodcast;
        this.author = author;
        this.brief = brief;
        this.publicTime = publicTime;
        this.count = count;
        this.coverImg = coverImg;
        this.status = status;
    }

    public Album() {
        super();
    }

    @Override
    public String toString() {
        return "Album{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", score=" + score +
                ", brodcast='" + brodcast + '\'' +
                ", author='" + author + '\'' +
                ", brief='" + brief + '\'' +
                ", publicTime='" + publicTime + '\'' +
                ", count=" + count +
                ", coverImg='" + coverImg + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getBrodcast() {
        return brodcast;
    }

    public void setBrodcast(String brodcast) {
        this.brodcast = brodcast;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(String publicTime) {
        this.publicTime = publicTime;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
