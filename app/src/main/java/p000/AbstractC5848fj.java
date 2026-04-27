package p000;

/* JADX INFO: renamed from: fj */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5848fj implements g1f {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<ph8> f36841a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<Character> f36842b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c */
    public static final Character f36843c = Character.valueOf(C4584d2.f28238g);

    /* JADX INFO: renamed from: a */
    public final char m10943a(ph8 ph8Var, Object obj, char c) {
        ThreadLocal<ph8> threadLocal = f36841a;
        threadLocal.set(ph8Var);
        ThreadLocal<Character> threadLocal2 = f36842b;
        threadLocal2.set(Character.valueOf(c));
        writeAfter(obj);
        threadLocal.set(null);
        return threadLocal2.get().charValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m10944b(String str, Object obj) {
        ph8 ph8Var = f36841a.get();
        ThreadLocal<Character> threadLocal = f36842b;
        char cCharValue = threadLocal.get().charValue();
        ph8Var.m19493a(cCharValue, str, obj);
        if (cCharValue != ',') {
            threadLocal.set(f36843c);
        }
    }

    public abstract void writeAfter(Object obj);
}
