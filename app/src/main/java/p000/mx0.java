package p000;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mx0 implements g1f {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<ph8> f62582a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<Character> f62583b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c */
    public static final Character f62584c = Character.valueOf(C4584d2.f28238g);

    /* JADX INFO: renamed from: a */
    public final char m17644a(ph8 ph8Var, Object obj, char c) {
        ThreadLocal<ph8> threadLocal = f62582a;
        threadLocal.set(ph8Var);
        ThreadLocal<Character> threadLocal2 = f62583b;
        threadLocal2.set(Character.valueOf(c));
        writeBefore(obj);
        threadLocal.set(null);
        return threadLocal2.get().charValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m17645b(String str, Object obj) {
        ph8 ph8Var = f62582a.get();
        ThreadLocal<Character> threadLocal = f62583b;
        char cCharValue = threadLocal.get().charValue();
        ph8Var.m19493a(cCharValue, str, obj);
        if (cCharValue != ',') {
            threadLocal.set(f62584c);
        }
    }

    public abstract void writeBefore(Object obj);
}
