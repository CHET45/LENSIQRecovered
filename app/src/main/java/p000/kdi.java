package p000;

import p000.kdi;

/* JADX INFO: loaded from: classes.dex */
@vw7
public interface kdi {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C8290a f53675a = C8290a.f53676a;

    /* JADX INFO: renamed from: kdi$a */
    public static final class C8290a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C8290a f53676a = new C8290a();

        /* JADX INFO: renamed from: b */
        @yfb
        public static final kdi f53677b = new kdi() { // from class: jdi
            @Override // p000.kdi
            public final ieh filter(C9041lz c9041lz) {
                return kdi.C8290a.None$lambda$0(c9041lz);
            }
        };

        private C8290a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ieh None$lambda$0(C9041lz c9041lz) {
            return new ieh(c9041lz, nzb.f66113a.getIdentity());
        }

        @f0g
        public static /* synthetic */ void getNone$annotations() {
        }

        @yfb
        public final kdi getNone() {
            return f53677b;
        }
    }

    @yfb
    ieh filter(@yfb C9041lz c9041lz);
}
