package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface jaf {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C7827a f50125a = C7827a.f50126a;

    /* JADX INFO: renamed from: jaf$a */
    public static final class C7827a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C7827a f50126a = new C7827a();

        /* JADX INFO: renamed from: b */
        @yfb
        public static final jaf f50127b = new z1g();

        /* JADX INFO: renamed from: c */
        @yfb
        public static final jaf f50128c = new a2g();

        private C7827a() {
        }

        public static /* synthetic */ jaf WhileSubscribed$default(C7827a c7827a, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 0;
            }
            if ((i & 2) != 0) {
                j2 = Long.MAX_VALUE;
            }
            return c7827a.WhileSubscribed(j, j2);
        }

        @yfb
        public final jaf WhileSubscribed(long j, long j2) {
            return new b2g(j, j2);
        }

        @yfb
        public final jaf getEagerly() {
            return f50127b;
        }

        @yfb
        public final jaf getLazily() {
            return f50128c;
        }
    }

    @yfb
    y56<haf> command(@yfb l2g<Integer> l2gVar);
}
