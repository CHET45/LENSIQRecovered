package p000;

/* JADX INFO: loaded from: classes6.dex */
@j35(tableName = "offline_language_pack")
public class zxb {

    /* JADX INFO: renamed from: a */
    public String f106333a;

    /* JADX INFO: renamed from: b */
    public String f106334b;

    /* JADX INFO: renamed from: c */
    public String f106335c;

    /* JADX INFO: renamed from: d */
    public String f106336d;

    /* JADX INFO: renamed from: e */
    public long f106337e;

    /* JADX INFO: renamed from: f */
    public long f106338f;

    /* JADX INFO: renamed from: g */
    public EnumC16301a f106339g = EnumC16301a.NOT_DOWNLOADED;

    /* JADX INFO: renamed from: h */
    public String f106340h;

    /* JADX INFO: renamed from: zxb$a */
    public enum EnumC16301a {
        NOT_DOWNLOADED,
        WAITING,
        DOWNLOADING,
        DOWNLOADED,
        DOWNLOAD_FAILED,
        PARSE_FAILED
    }

    public String getDownloadUrl() {
        return this.f106335c;
    }

    public long getDownloadedSize() {
        return this.f106338f;
    }

    public String getErrorMessage() {
        return this.f106340h;
    }

    public String getId() {
        return this.f106333a;
    }

    public String getLocalPath() {
        return this.f106336d;
    }

    public String getName() {
        return this.f106334b;
    }

    public EnumC16301a getState() {
        return this.f106339g;
    }

    public long getTotalSize() {
        return this.f106337e;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.f106335c = downloadUrl;
    }

    public void setDownloadedSize(long downloadedSize) {
        this.f106338f = downloadedSize;
    }

    public void setErrorMessage(String errorMessage) {
        this.f106340h = errorMessage;
    }

    public void setId(String id) {
        this.f106333a = id;
    }

    public void setLocalPath(String localPath) {
        this.f106336d = localPath;
    }

    public void setName(String name) {
        this.f106334b = name;
    }

    public void setState(EnumC16301a state) {
        this.f106339g = state;
    }

    public void setTotalSize(long totalSize) {
        this.f106337e = totalSize;
    }

    public String toString() {
        return "LanguagePack{id='" + this.f106333a + "', name='" + this.f106334b + "', downloadUrl='" + this.f106335c + "', localPath='" + this.f106336d + "', totalSize=" + this.f106337e + ", downloadedSize=" + this.f106338f + ", state=" + this.f106339g + ", errorMessage='" + this.f106340h + "'}";
    }
}
