package com.watchfun.transcommon.bean.p012ai;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class MsgAiInfo implements Serializable {
    public static final int RECEIVE_MSG = 1;
    public static final int RECEIVE_TEXT = 2;
    public static final int RECEIVE_VOICE = 4;
    public static final int SEND_MSG = 2;
    public static final int SEND_TEXT = 1;
    public static final int SEND_VOICE = 3;
    public static final int SYSTEM_MSG = 0;
    public static final int TEXT = 1;
    public static final int VOICE = 2;
    private int ban_round;
    private int created;
    private String finish_reason;
    private int flag;

    /* JADX INFO: renamed from: id */
    private String f25976id;
    private boolean is_end;
    private boolean is_truncated;
    private int messageId;
    private boolean need_clear_history;
    private String object;
    private String result;
    private SearchInfoBean search_info;
    private int sentence_id;
    private int type;
    private Usage usage;

    public MsgAiInfo(String str, int i) {
        this.result = str;
        this.type = i;
    }

    public int getBan_round() {
        return this.ban_round;
    }

    public int getCreated() {
        return this.created;
    }

    public String getFinish_reason() {
        return this.finish_reason;
    }

    public int getFlag() {
        return this.flag;
    }

    public String getId() {
        return this.f25976id;
    }

    public int getMessageId() {
        return this.messageId;
    }

    public String getObject() {
        return this.object;
    }

    public String getResult() {
        return this.result;
    }

    public SearchInfoBean getSearch_info() {
        return this.search_info;
    }

    public int getSentence_id() {
        return this.sentence_id;
    }

    public int getType() {
        return this.type;
    }

    public Usage getUsage() {
        return this.usage;
    }

    public boolean isIs_end() {
        return this.is_end;
    }

    public boolean isIs_truncated() {
        return this.is_truncated;
    }

    public boolean isNeed_clear_history() {
        return this.need_clear_history;
    }

    public void setBan_round(int i) {
        this.ban_round = i;
    }

    public void setCreated(int i) {
        this.created = i;
    }

    public void setData(int i, String str) {
        this.type = i;
        this.result = str;
    }

    public void setFinish_reason(String str) {
        this.finish_reason = str;
    }

    public void setFlag(int i) {
        this.flag = i;
    }

    public void setId(String str) {
        this.f25976id = str;
    }

    public void setIs_end(boolean z) {
        this.is_end = z;
    }

    public void setIs_truncated(boolean z) {
        this.is_truncated = z;
    }

    public void setMessageId(int i) {
        this.messageId = i;
    }

    public void setNeed_clear_history(boolean z) {
        this.need_clear_history = z;
    }

    public void setObject(String str) {
        this.object = str;
    }

    public void setResult(String str) {
        this.result = str;
    }

    public void setSearch_info(SearchInfoBean searchInfoBean) {
        this.search_info = searchInfoBean;
    }

    public void setSentence_id(int i) {
        this.sentence_id = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }
}
