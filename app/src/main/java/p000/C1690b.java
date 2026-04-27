package p000;

/* JADX INFO: renamed from: b */
/* JADX INFO: loaded from: classes6.dex */
public class C1690b {

    /* JADX INFO: renamed from: a */
    public Object f12312a;

    /* JADX INFO: renamed from: b */
    public String f12313b;

    /* JADX INFO: renamed from: c */
    public int f12314c;

    /* JADX INFO: renamed from: d */
    public int f12315d = 0;

    public C1690b(Object obj, String str, int i) {
        this.f12312a = obj;
        this.f12313b = str;
        this.f12314c = i;
    }

    public String getAbilityId() {
        return this.f12313b;
    }

    public int getHandleId() {
        return this.f12314c;
    }

    public Object getUsrContext() {
        return this.f12312a;
    }

    public int getUsrContextIndex() {
        return this.f12315d;
    }

    public C1690b setUsrContextIndex(int i) {
        this.f12315d = i;
        return this;
    }
}
