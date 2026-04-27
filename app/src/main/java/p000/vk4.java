package p000;

/* JADX INFO: loaded from: classes6.dex */
public class vk4 {

    /* JADX INFO: renamed from: a */
    public String f91494a;

    /* JADX INFO: renamed from: b */
    public String f91495b;

    /* JADX INFO: renamed from: c */
    public int f91496c;

    /* JADX INFO: renamed from: d */
    public String f91497d;

    /* JADX INFO: renamed from: e */
    public String f91498e;

    /* JADX INFO: renamed from: f */
    public String f91499f;

    /* JADX INFO: renamed from: g */
    public zm4 f91500g = zm4.NOT_START;

    public zm4 getDownloadStatus() {
        return this.f91500g;
    }

    public String getName() {
        return this.f91495b;
    }

    public int getProgress() {
        return this.f91496c;
    }

    public String getResourceCode() {
        return this.f91498e;
    }

    public String getSize() {
        return this.f91499f;
    }

    public String getTaskId() {
        return this.f91494a;
    }

    public String getUrl() {
        return this.f91497d;
    }

    public void setDownloadStatus(zm4 zm4Var) {
        this.f91500g = zm4Var;
    }

    public void setName(String str) {
        this.f91495b = str;
    }

    public void setProgress(int i) {
        this.f91496c = i;
    }

    public void setResourceCode(String str) {
        this.f91498e = str;
    }

    public void setSize(String str) {
        this.f91499f = str;
    }

    public void setTaskId(String str) {
        this.f91494a = str;
    }

    public void setUrl(String str) {
        this.f91497d = str;
    }

    public String toString() {
        return "DownloadBean{taskId='" + this.f91494a + "', name='" + this.f91495b + "', progress=" + this.f91496c + ", url='" + this.f91497d + "', resourceCode='" + this.f91498e + "', downloadStatus=" + this.f91500g + '}';
    }
}
