package p000;

/* JADX INFO: loaded from: classes.dex */
public interface nzb {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C10123a f66113a = C10123a.f66114a;

    /* JADX INFO: renamed from: nzb$a */
    public static final class C10123a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C10123a f66114a = new C10123a();

        /* JADX INFO: renamed from: b */
        @yfb
        public static final nzb f66115b = new a();

        /* JADX INFO: renamed from: nzb$a$a */
        public static final class a implements nzb {
            @Override // p000.nzb
            public int originalToTransformed(int i) {
                return i;
            }

            @Override // p000.nzb
            public int transformedToOriginal(int i) {
                return i;
            }
        }

        private C10123a() {
        }

        @yfb
        public final nzb getIdentity() {
            return f66115b;
        }
    }

    int originalToTransformed(int i);

    int transformedToOriginal(int i);
}
