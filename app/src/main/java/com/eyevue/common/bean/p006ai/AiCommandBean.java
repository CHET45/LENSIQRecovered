package com.eyevue.common.bean.p006ai;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AiCommandBean {
    private String content;
    private String query;
    private List<QueryDescDTO> queryDesc;
    private String type;

    public static class QueryDescDTO {
        private String content;
        private String time;

        public String getContent() {
            return this.content;
        }

        public String getTime() {
            return this.time;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public String getContent() {
        return this.content;
    }

    public String getQuery() {
        return this.query;
    }

    public List<QueryDescDTO> getQueryDesc() {
        return this.queryDesc;
    }

    public String getType() {
        return this.type;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setQueryDesc(List<QueryDescDTO> queryDesc) {
        this.queryDesc = queryDesc;
    }

    public void setType(String type) {
        this.type = type;
    }
}
