package com.eyevue.common.bean.guid;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class NewGuidDataBean {
    private List<NewGuidBean> list;
    private int pageNum;
    private int pageSize;

    @SerializedName("totalPage")
    private int pages;

    @SerializedName("totalSize")
    private int total;

    public List<NewGuidBean> getList() {
        return this.list;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getPages() {
        return this.pages;
    }

    public int getTotal() {
        return this.total;
    }

    public void setList(List<NewGuidBean> data) {
        this.list = data;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
