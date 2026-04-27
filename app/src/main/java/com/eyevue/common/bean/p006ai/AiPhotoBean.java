package com.eyevue.common.bean.p006ai;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AiPhotoBean {
    private String content;
    private List<ParamsDTO> params;
    private String query;
    private String type;

    public static class ParamsDTO {
        private String name;
        private String normValue;
        private String value;

        public String getName() {
            return this.name;
        }

        public String getNormValue() {
            return this.normValue;
        }

        public String getValue() {
            return this.value;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setNormValue(String normValue) {
            this.normValue = normValue;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public String getContent() {
        return this.content;
    }

    public List<ParamsDTO> getParams() {
        return this.params;
    }

    public String getQuery() {
        return this.query;
    }

    public String getType() {
        return this.type;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setParams(List<ParamsDTO> params) {
        this.params = params;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setType(String type) {
        this.type = type;
    }
}
