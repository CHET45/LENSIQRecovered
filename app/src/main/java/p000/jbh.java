package p000;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@j35(tableName = "transMachineRecord")
@olh({osa.class})
public class jbh {

    /* JADX INFO: renamed from: a */
    @dbd(autoGenerate = true)
    public long f50263a;

    /* JADX INFO: renamed from: b */
    public String f50264b;

    /* JADX INFO: renamed from: c */
    public String f50265c;

    /* JADX INFO: renamed from: d */
    public long f50266d;

    /* JADX INFO: renamed from: e */
    public String f50267e;

    /* JADX INFO: renamed from: f */
    public String f50268f;

    /* JADX INFO: renamed from: g */
    public String f50269g;

    /* JADX INFO: renamed from: h */
    public String f50270h;

    /* JADX INFO: renamed from: i */
    public long f50271i;

    public jbh() {
    }

    public String getDate() {
        return this.f50265c;
    }

    public long getDuration() {
        return this.f50271i;
    }

    public long getId() {
        return this.f50263a;
    }

    public List<dbh> getMessageList() {
        return osa.toMessageList(this.f50270h);
    }

    public String getMessageListJson() {
        return this.f50270h;
    }

    public String getName() {
        return this.f50264b;
    }

    public String getSourcePcmPath() {
        return this.f50267e;
    }

    public String getSourceVoicePath() {
        return this.f50268f;
    }

    public long getTime() {
        return this.f50266d;
    }

    public String getTransVoicePath() {
        return this.f50269g;
    }

    public void setDate(String date) {
        this.f50265c = date;
    }

    public void setDuration(long duration) {
        this.f50271i = duration;
    }

    public void setId(long id) {
        this.f50263a = id;
    }

    public void setMessageList(List<dbh> messageList) {
        this.f50270h = osa.fromMessageList(messageList);
    }

    public void setMessageListJson(String messageListJson) {
        this.f50270h = messageListJson;
    }

    public void setName(String name) {
        this.f50264b = name;
    }

    public void setSourcePcmPath(String sourcePcmPath) {
        this.f50267e = sourcePcmPath;
    }

    public void setSourceVoicePath(String sourceVoicePath) {
        this.f50268f = sourceVoicePath;
    }

    public void setTime(long time) {
        this.f50266d = time;
    }

    public void setTransVoicePath(String transVoicePath) {
        this.f50269g = transVoicePath;
    }

    @sr7
    public jbh(String name, String date, long time, String sourceVoicePath) {
        this.f50264b = name;
        this.f50265c = date;
        this.f50266d = time;
        this.f50268f = sourceVoicePath;
    }
}
