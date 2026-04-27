package p000;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import p000.gsa;
import p000.y5g;

/* JADX INFO: loaded from: classes7.dex */
public final class n40 implements gsa.InterfaceC6484b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9690d f63226a;

    /* JADX INFO: renamed from: b */
    public final gsa.InterfaceC6484b f63227b;

    /* JADX INFO: renamed from: c */
    public final Queue<InputStream> f63228c = new ArrayDeque();

    /* JADX INFO: renamed from: n40$a */
    public class RunnableC9687a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f63229a;

        public RunnableC9687a(int i) {
            this.f63229a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            n40.this.f63227b.bytesRead(this.f63229a);
        }
    }

    /* JADX INFO: renamed from: n40$b */
    public class RunnableC9688b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f63231a;

        public RunnableC9688b(boolean z) {
            this.f63231a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            n40.this.f63227b.deframerClosed(this.f63231a);
        }
    }

    /* JADX INFO: renamed from: n40$c */
    public class RunnableC9689c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Throwable f63233a;

        public RunnableC9689c(Throwable th) {
            this.f63233a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            n40.this.f63227b.deframeFailed(this.f63233a);
        }
    }

    /* JADX INFO: renamed from: n40$d */
    public interface InterfaceC9690d {
        void runOnTransportThread(Runnable runnable);
    }

    public n40(gsa.InterfaceC6484b interfaceC6484b, InterfaceC9690d interfaceC9690d) {
        this.f63227b = (gsa.InterfaceC6484b) v7d.checkNotNull(interfaceC6484b, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f63226a = (InterfaceC9690d) v7d.checkNotNull(interfaceC9690d, "transportExecutor");
    }

    @Override // p000.gsa.InterfaceC6484b
    public void bytesRead(int i) {
        this.f63226a.runOnTransportThread(new RunnableC9687a(i));
    }

    @Override // p000.gsa.InterfaceC6484b
    public void deframeFailed(Throwable th) {
        this.f63226a.runOnTransportThread(new RunnableC9689c(th));
    }

    @Override // p000.gsa.InterfaceC6484b
    public void deframerClosed(boolean z) {
        this.f63226a.runOnTransportThread(new RunnableC9688b(z));
    }

    public InputStream messageReadQueuePoll() {
        return this.f63228c.poll();
    }

    @Override // p000.gsa.InterfaceC6484b
    public void messagesAvailable(y5g.InterfaceC15496a interfaceC15496a) {
        while (true) {
            InputStream next = interfaceC15496a.next();
            if (next == null) {
                return;
            } else {
                this.f63228c.add(next);
            }
        }
    }
}
