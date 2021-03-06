package kr.dsm.wherehere.dto;

import java.util.List;

/**
 * Created by BeINone on 2017-03-31.
 */

public class Map {

    private int postNum;
    private String content;
    private String title;
    private String writer;
    private double x;
    private double y;
    private List<String> images;
    private int recommend;
    private int unRecommend;

    public Map(int postNum, String content, String title, String writer, double x, double y,
               List<String> images, int recommend, int unRecommend) {
        this.postNum = postNum;
        this.content = content;
        this.title = title;
        this.writer = writer;
        this.x = x;
        this.y = y;
        this.images = images;
        this.recommend = recommend;
        this.unRecommend = unRecommend;
    }

    public Map(int postNum, String content, String title, String writer, double x, double y,
               int recommend, int unRecommend) {
        this.postNum = postNum;
        this.content = content;
        this.title = title;
        this.writer = writer;
        this.x = x;
        this.y = y;
        this.recommend = recommend;
        this.unRecommend = unRecommend;
    }

    public int getPostNum() {
        return postNum;
    }

    public void setPostNum(int postNum) {
        this.postNum = postNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public int getRecommend() {
        return recommend;
    }

    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }

    public int getUnRecommend() {
        return unRecommend;
    }

    public void setUnRecommend(int unRecommend) {
        this.unRecommend = unRecommend;
    }

    @Override
    public String toString() {
        return "postNum: " + postNum + ", content: " + content + ", title: " + title +
                ", writer: " + writer + ", x: " + x + ", y: " + y + ", image: " + images +
                ", recommend: " + recommend + ", unRecommend: " + unRecommend;
    }
}
