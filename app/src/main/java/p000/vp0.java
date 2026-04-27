package p000;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.vp0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface vp0 {

    /* JADX INFO: renamed from: vp0$a */
    public interface InterfaceC14197a {

        /* JADX INFO: renamed from: vp0$a$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public final CopyOnWriteArrayList<C16543a> f91898a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: vp0$a$a$a, reason: collision with other inner class name */
            public static final class C16543a {

                /* JADX INFO: renamed from: a */
                public final Handler f91899a;

                /* JADX INFO: renamed from: b */
                public final InterfaceC14197a f91900b;

                /* JADX INFO: renamed from: c */
                public boolean f91901c;

                public C16543a(Handler handler, InterfaceC14197a interfaceC14197a) {
                    this.f91899a = handler;
                    this.f91900b = interfaceC14197a;
                }

                public void release() {
                    this.f91901c = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void lambda$bandwidthSample$0(C16543a c16543a, int i, long j, long j2) {
                c16543a.f91900b.onBandwidthSample(i, j, j2);
            }

            public void addListener(Handler handler, InterfaceC14197a interfaceC14197a) {
                u80.checkNotNull(handler);
                u80.checkNotNull(interfaceC14197a);
                removeListener(interfaceC14197a);
                this.f91898a.add(new C16543a(handler, interfaceC14197a));
            }

            public void bandwidthSample(final int i, final long j, final long j2) {
                for (final C16543a c16543a : this.f91898a) {
                    if (!c16543a.f91901c) {
                        c16543a.f91899a.post(new Runnable() { // from class: sp0
                            @Override // java.lang.Runnable
                            public final void run() {
                                vp0.InterfaceC14197a.a.lambda$bandwidthSample$0(c16543a, i, j, j2);
                            }
                        });
                    }
                }
            }

            public void removeListener(InterfaceC14197a interfaceC14197a) {
                for (C16543a c16543a : this.f91898a) {
                    if (c16543a.f91900b == interfaceC14197a) {
                        c16543a.release();
                        this.f91898a.remove(c16543a);
                    }
                }
            }
        }

        void onBandwidthSample(int i, long j, long j2);
    }

    void addEventListener(Handler handler, InterfaceC14197a interfaceC14197a);

    long getBitrateEstimate();

    default long getTimeToFirstByteEstimateUs() {
        return -9223372036854775807L;
    }

    @hib
    pdh getTransferListener();

    void removeEventListener(InterfaceC14197a interfaceC14197a);
}
