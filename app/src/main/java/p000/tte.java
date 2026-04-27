package p000;

/* JADX INFO: loaded from: classes4.dex */
public interface tte extends q2b {

    /* JADX INFO: renamed from: a */
    public static final C13237a f85909a = C13237a.f85914c;

    /* JADX INFO: renamed from: b */
    public static final int f85910b = -100;

    /* JADX INFO: renamed from: c */
    public static final int f85911c = -99;

    /* JADX INFO: renamed from: tte$a */
    public static final class C13237a {

        /* JADX INFO: renamed from: a */
        public static final int f85912a = -100;

        /* JADX INFO: renamed from: b */
        public static final int f85913b = -99;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ C13237a f85914c = new C13237a();

        private C13237a() {
        }
    }

    /* JADX INFO: renamed from: tte$b */
    public static final class C13238b {
        public static int getItemType(tte tteVar) {
            return tteVar.isHeader() ? -99 : -100;
        }
    }

    @Override // p000.q2b
    int getItemType();

    boolean isHeader();
}
