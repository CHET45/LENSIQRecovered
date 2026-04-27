package p000;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@ux4
public final class twc {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<char[]> f86198a = new C13259a();

    /* JADX INFO: renamed from: twc$a */
    public class C13259a extends ThreadLocal<char[]> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public char[] initialValue() {
            return new char[1024];
        }
    }

    private twc() {
    }

    /* JADX INFO: renamed from: a */
    public static char[] m22888a() {
        return f86198a.get();
    }
}
