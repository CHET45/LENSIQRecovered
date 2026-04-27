package p000;

/* JADX INFO: loaded from: classes6.dex */
@j35(tableName = "transMachineMsg")
public class dbh {

    /* JADX INFO: renamed from: a */
    @dbd(autoGenerate = true)
    public Integer f29227a;

    /* JADX INFO: renamed from: b */
    public String f29228b;

    /* JADX INFO: renamed from: c */
    public String f29229c;

    /* JADX INFO: renamed from: d */
    public int f29230d;

    /* JADX INFO: renamed from: e */
    public int f29231e;

    /* JADX INFO: renamed from: f */
    public String f29232f;

    /* JADX INFO: renamed from: g */
    public long f29233g;

    /* JADX INFO: renamed from: h */
    public long f29234h;

    /* JADX INFO: renamed from: i */
    public boolean f29235i;

    /* JADX INFO: renamed from: j */
    public String f29236j;

    /* JADX INFO: renamed from: k */
    public int f29237k;

    /* JADX INFO: renamed from: l */
    public String f29238l;

    /* JADX INFO: renamed from: m */
    public String f29239m;

    /* JADX INFO: renamed from: n */
    public String f29240n;

    /* JADX INFO: renamed from: o */
    public boolean f29241o;

    public Integer getId() {
        return this.f29227a;
    }

    public int getIsGptOrXF() {
        return this.f29237k;
    }

    public String getIsLangCode() {
        return this.f29238l;
    }

    public long getMessageTime() {
        return this.f29234h;
    }

    public int getMultipleOptions() {
        return this.f29231e;
    }

    public String getResult() {
        return this.f29228b;
    }

    public String getSourceLanguage() {
        return this.f29239m;
    }

    public String getTransLanguage() {
        return this.f29240n;
    }

    public String getTransResult() {
        return this.f29229c;
    }

    public int getType() {
        return this.f29230d;
    }

    public String getVoiceName() {
        return this.f29236j;
    }

    public String getVoicePath() {
        return this.f29232f;
    }

    public long getVoiceTime() {
        return this.f29233g;
    }

    public boolean isLanguageChange() {
        return this.f29241o;
    }

    public boolean isPause() {
        return this.f29235i;
    }

    public void setId(Integer id) {
        this.f29227a = id;
    }

    public void setIsGptOrXF(int isGptOrXF) {
        this.f29237k = isGptOrXF;
    }

    public void setIsLangCode(String isLangCode) {
        this.f29238l = isLangCode;
    }

    public void setLanguageChange(boolean languageChange) {
        this.f29241o = languageChange;
    }

    public void setMessageTime(long messageTime) {
        this.f29234h = messageTime;
    }

    public void setMultipleOptions(int multipleOptions) {
        this.f29231e = multipleOptions;
    }

    public void setPause(boolean pause) {
        this.f29235i = pause;
    }

    public void setResult(String result) {
        this.f29228b = result;
    }

    public void setSourceLanguage(String sourceLanguage) {
        this.f29239m = sourceLanguage;
    }

    public void setTransLanguage(String transLanguage) {
        this.f29240n = transLanguage;
    }

    public void setTransResult(String transResult) {
        this.f29229c = transResult;
    }

    public void setType(int type) {
        this.f29230d = type;
    }

    public void setVoiceName(String voiceName) {
        this.f29236j = voiceName;
    }

    public void setVoicePath(String voicePath) {
        this.f29232f = voicePath;
    }

    public void setVoiceTime(long voiceTime) {
        this.f29233g = voiceTime;
    }
}
