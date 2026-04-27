package p000;

/* JADX INFO: loaded from: classes6.dex */
@j35(primaryKeys = {"id", "msgId"}, tableName = "gptAiChat")
public class b27 {

    /* JADX INFO: renamed from: a */
    public int f12451a;

    /* JADX INFO: renamed from: b */
    public String f12452b;

    /* JADX INFO: renamed from: c */
    public String f12453c;

    /* JADX INFO: renamed from: d */
    public String f12454d;

    /* JADX INFO: renamed from: e */
    public int f12455e;

    /* JADX INFO: renamed from: f */
    public int f12456f;

    /* JADX INFO: renamed from: g */
    public String f12457g;

    /* JADX INFO: renamed from: h */
    @efb
    public String f12458h;

    /* JADX INFO: renamed from: i */
    public long f12459i;

    /* JADX INFO: renamed from: j */
    public long f12460j;

    /* JADX INFO: renamed from: k */
    public boolean f12461k;

    public String getDefaultCharacters() {
        return this.f12452b;
    }

    public int getId() {
        return this.f12451a;
    }

    public long getMessageTime() {
        return this.f12460j;
    }

    public String getMsgId() {
        return this.f12458h;
    }

    public int getMultipleOptions() {
        return this.f12456f;
    }

    public String getReasoningResult() {
        return this.f12453c;
    }

    public String getResult() {
        return this.f12454d;
    }

    public int getType() {
        return this.f12455e;
    }

    public String getVoicePath() {
        return this.f12457g;
    }

    public long getVoiceTime() {
        return this.f12459i;
    }

    public boolean isPause() {
        return this.f12461k;
    }

    public void setDefaultCharacters(String str) {
        this.f12452b = str;
    }

    public void setId(int i) {
        this.f12451a = i;
    }

    public void setMessageTime(long j) {
        this.f12460j = j;
    }

    public void setMsgId(String str) {
        this.f12458h = str;
    }

    public void setMultipleOptions(int i) {
        this.f12456f = i;
    }

    public void setPause(boolean z) {
        this.f12461k = z;
    }

    public void setReasoningResult(String str) {
        this.f12453c = str;
    }

    public void setResult(String str) {
        this.f12454d = str;
    }

    public void setType(int i) {
        this.f12455e = i;
    }

    public void setVoicePath(String str) {
        this.f12457g = str;
    }

    public void setVoiceTime(long j) {
        this.f12459i = j;
    }
}
