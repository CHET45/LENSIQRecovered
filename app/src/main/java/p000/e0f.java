package p000;

/* JADX INFO: loaded from: classes3.dex */
public class e0f {

    /* JADX INFO: renamed from: a */
    public final e0f f31477a;

    /* JADX INFO: renamed from: b */
    public final Object f31478b;

    /* JADX INFO: renamed from: c */
    public final Object f31479c;

    /* JADX INFO: renamed from: d */
    public final int f31480d;

    public e0f(e0f e0fVar, Object obj, Object obj2, int i) {
        this.f31477a = e0fVar;
        this.f31478b = obj;
        this.f31479c = obj2;
        this.f31480d = i;
    }

    public String toString() {
        if (this.f31477a == null) {
            return "$";
        }
        if (!(this.f31479c instanceof Integer)) {
            return this.f31477a.toString() + "." + this.f31479c;
        }
        return this.f31477a.toString() + "[" + this.f31479c + "]";
    }
}
