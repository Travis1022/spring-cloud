package com.dsx.consumer.viewobject;


import java.math.BigDecimal;
import java.util.Date;

/**
 * BookVo 视图对象类
 * create by dsx on 2018-08-25
 */
public class BookVo {

    private Integer bookId;

    private String bookName;

    private String bookAuthor;

    private BigDecimal price;

    private Date createDate;


    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
