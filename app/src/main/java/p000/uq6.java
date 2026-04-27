package p000;

/* JADX INFO: loaded from: classes8.dex */
public class uq6 {

    /* JADX INFO: renamed from: d */
    public static uq6 f88761d = new uq6(null);

    /* JADX INFO: renamed from: a */
    public String f88762a;

    /* JADX INFO: renamed from: b */
    public Throwable f88763b;

    /* JADX INFO: renamed from: c */
    public Object[] f88764c;

    public uq6(String str) {
        this(str, null, null);
    }

    public Object[] getArgArray() {
        return this.f88764c;
    }

    public String getMessage() {
        return this.f88762a;
    }

    public Throwable getThrowable() {
        return this.f88763b;
    }

    public uq6(String str, Object[] objArr, Throwable th) {
        this.f88762a = str;
        this.f88763b = th;
        this.f88764c = objArr;
    }
}
