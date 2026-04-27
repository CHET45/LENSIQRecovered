package p000;

/* JADX INFO: loaded from: classes7.dex */
@jl8
public interface ab8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C0147a f946a = C0147a.f947a;

    /* JADX INFO: renamed from: ab8$a */
    public static final class C0147a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C0147a f947a = new C0147a();

        private C0147a() {
        }

        public final void doWriteEscaping(@yfb String str, @yfb kz6<? super String, ? super Integer, ? super Integer, bth> kz6Var) {
            md8.checkNotNullParameter(str, "text");
            md8.checkNotNullParameter(kz6Var, "writeImpl");
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt < e8g.getESCAPE_STRINGS().length && e8g.getESCAPE_STRINGS()[cCharAt] != null) {
                    kz6Var.invoke(str, Integer.valueOf(i), Integer.valueOf(i2));
                    String str2 = e8g.getESCAPE_STRINGS()[cCharAt];
                    md8.checkNotNull(str2);
                    kz6Var.invoke(str2, 0, Integer.valueOf(str2.length()));
                    i = i2 + 1;
                }
            }
            kz6Var.invoke(str, Integer.valueOf(i), Integer.valueOf(str.length()));
        }
    }

    void release();

    void write(@yfb String str);

    void writeChar(char c);

    void writeLong(long j);

    void writeQuoted(@yfb String str);
}
