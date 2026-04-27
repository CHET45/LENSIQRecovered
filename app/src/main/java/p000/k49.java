package p000;

/* JADX INFO: loaded from: classes8.dex */
public enum k49 {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* JADX INFO: renamed from: a */
    public int f52577a;

    /* JADX INFO: renamed from: b */
    public String f52578b;

    k49(int i, String str) {
        this.f52577a = i;
        this.f52578b = str;
    }

    public int toInt() {
        return this.f52577a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f52578b;
    }
}
