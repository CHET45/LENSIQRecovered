package p000;

import com.google.firebase.sessions.InterfaceC3625b;

/* JADX INFO: loaded from: classes5.dex */
public interface daf {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C4710a f29111a = C4710a.f29112a;

    /* JADX INFO: renamed from: daf$a */
    public static final class C4710a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C4710a f29112a = new C4710a();

        private C4710a() {
        }

        @yfb
        public final daf getInstance() {
            return ((InterfaceC3625b) xy5.getApp(hw5.f45141a).get(InterfaceC3625b.class)).getSharedSessionRepository();
        }
    }

    void appBackground();

    void appForeground();

    boolean isInForeground();
}
