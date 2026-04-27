package p000;

import com.google.firebase.sessions.InterfaceC3625b;

/* JADX INFO: loaded from: classes5.dex */
public interface i5f {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C7154a f45804a = C7154a.f45805a;

    /* JADX INFO: renamed from: i5f$a */
    public static final class C7154a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C7154a f45805a = new C7154a();

        private C7154a() {
        }

        @yfb
        public final i5f getInstance() {
            return ((InterfaceC3625b) xy5.getApp(hw5.f45141a).get(InterfaceC3625b.class)).getSessionFirelogPublisher();
        }
    }

    void mayLogSession(@yfb d5f d5fVar);
}
