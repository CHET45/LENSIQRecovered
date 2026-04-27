package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ul7 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C13583a f88359a = new C13583a(null);

    /* JADX INFO: renamed from: ul7$a */
    public static final class C13583a {
        public /* synthetic */ C13583a(jt3 jt3Var) {
            this();
        }

        private final void loadStateAndCompose(Object obj) {
            wsd.f95339z.loadStateAndComposeForHotReload$runtime_release(obj);
        }

        private final Object saveStateAndDispose(Object obj) {
            return wsd.f95339z.saveStateAndDisposeForHotReload$runtime_release();
        }

        @dpg
        public final void clearErrors$runtime_release() {
            wsd.f95339z.clearErrors$runtime_release();
        }

        @yfb
        @dpg
        public final List<xsd> getCurrentErrors$runtime_release() {
            return wsd.f95339z.getCurrentErrors$runtime_release();
        }

        @dpg
        public final void invalidateGroupsWithKey$runtime_release(int i) {
            wsd.f95339z.invalidateGroupsWithKey$runtime_release(i);
        }

        @dpg
        public final void simulateHotReload$runtime_release(@yfb Object obj) {
            loadStateAndCompose(saveStateAndDispose(obj));
        }

        private C13583a() {
        }
    }
}
