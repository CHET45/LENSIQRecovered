package p000;

import android.os.Looper;
import androidx.media3.common.C1213a;
import p000.ar4;
import p000.nr4;
import p000.or4;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface or4 {

    /* JADX INFO: renamed from: a */
    public static final or4 f68367a = new C10510a();

    /* JADX INFO: renamed from: or4$a */
    public class C10510a implements or4 {
        @Override // p000.or4
        @hib
        public ar4 acquireSession(@hib nr4.C10020a c10020a, C1213a c1213a) {
            if (c1213a.f8295s == null) {
                return null;
            }
            return new j55(new ar4.C1571a(new rvh(1), 6001));
        }

        @Override // p000.or4
        public int getCryptoType(C1213a c1213a) {
            return c1213a.f8295s != null ? 1 : 0;
        }

        @Override // p000.or4
        public void setPlayer(Looper looper, j0d j0dVar) {
        }
    }

    /* JADX INFO: renamed from: or4$b */
    public interface InterfaceC10511b {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC10511b f68368a = new InterfaceC10511b() { // from class: qr4
            @Override // p000.or4.InterfaceC10511b
            public final void release() {
                or4.InterfaceC10511b.lambda$static$0();
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$static$0() {
        }

        void release();
    }

    @hib
    ar4 acquireSession(@hib nr4.C10020a c10020a, C1213a c1213a);

    int getCryptoType(C1213a c1213a);

    default InterfaceC10511b preacquireSession(@hib nr4.C10020a c10020a, C1213a c1213a) {
        return InterfaceC10511b.f68368a;
    }

    default void prepare() {
    }

    default void release() {
    }

    void setPlayer(Looper looper, j0d j0dVar);
}
