package p000;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.up0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface up0 {

    /* JADX INFO: renamed from: up0$a */
    public interface InterfaceC13636a {

        /* JADX INFO: renamed from: up0$a$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public final CopyOnWriteArrayList<C16541a> f88705a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: up0$a$a$a, reason: collision with other inner class name */
            public static final class C16541a {

                /* JADX INFO: renamed from: a */
                public final Handler f88706a;

                /* JADX INFO: renamed from: b */
                public final InterfaceC13636a f88707b;

                /* JADX INFO: renamed from: c */
                public boolean f88708c;

                public C16541a(Handler handler, InterfaceC13636a interfaceC13636a) {
                    this.f88706a = handler;
                    this.f88707b = interfaceC13636a;
                }

                public void release() {
                    this.f88708c = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void lambda$bandwidthSample$0(C16541a c16541a, int i, long j, long j2) {
                c16541a.f88707b.onBandwidthSample(i, j, j2);
            }

            public void addListener(Handler handler, InterfaceC13636a interfaceC13636a) {
                v80.checkNotNull(handler);
                v80.checkNotNull(interfaceC13636a);
                removeListener(interfaceC13636a);
                this.f88705a.add(new C16541a(handler, interfaceC13636a));
            }

            public void bandwidthSample(final int i, final long j, final long j2) {
                for (final C16541a c16541a : this.f88705a) {
                    if (!c16541a.f88708c) {
                        c16541a.f88706a.post(new Runnable() { // from class: tp0
                            @Override // java.lang.Runnable
                            public final void run() {
                                up0.InterfaceC13636a.a.lambda$bandwidthSample$0(c16541a, i, j, j2);
                            }
                        });
                    }
                }
            }

            public void removeListener(InterfaceC13636a interfaceC13636a) {
                for (C16541a c16541a : this.f88705a) {
                    if (c16541a.f88707b == interfaceC13636a) {
                        c16541a.release();
                        this.f88705a.remove(c16541a);
                    }
                }
            }
        }

        void onBandwidthSample(int i, long j, long j2);
    }

    void addEventListener(Handler handler, InterfaceC13636a interfaceC13636a);

    long getBitrateEstimate();

    default long getTimeToFirstByteEstimateUs() {
        return -9223372036854775807L;
    }

    @hib
    qdh getTransferListener();

    void removeEventListener(InterfaceC13636a interfaceC13636a);
}
