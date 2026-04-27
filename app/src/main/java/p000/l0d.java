package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l0d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8571b f55874a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8570a f55875b;

    /* JADX INFO: renamed from: c */
    public final h52 f55876c;

    /* JADX INFO: renamed from: d */
    public final t1h f55877d;

    /* JADX INFO: renamed from: e */
    public int f55878e;

    /* JADX INFO: renamed from: f */
    @hib
    public Object f55879f;

    /* JADX INFO: renamed from: g */
    public Looper f55880g;

    /* JADX INFO: renamed from: h */
    public int f55881h;

    /* JADX INFO: renamed from: i */
    public long f55882i = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public boolean f55883j = true;

    /* JADX INFO: renamed from: k */
    public boolean f55884k;

    /* JADX INFO: renamed from: l */
    public boolean f55885l;

    /* JADX INFO: renamed from: m */
    public boolean f55886m;

    /* JADX INFO: renamed from: n */
    public boolean f55887n;

    /* JADX INFO: renamed from: l0d$a */
    public interface InterfaceC8570a {
        void sendMessage(l0d l0dVar);
    }

    /* JADX INFO: renamed from: l0d$b */
    public interface InterfaceC8571b {
        void handleMessage(int i, @hib Object obj) throws ba5;
    }

    public l0d(InterfaceC8570a interfaceC8570a, InterfaceC8571b interfaceC8571b, t1h t1hVar, int i, h52 h52Var, Looper looper) {
        this.f55875b = interfaceC8570a;
        this.f55874a = interfaceC8571b;
        this.f55877d = t1hVar;
        this.f55880g = looper;
        this.f55876c = h52Var;
        this.f55881h = i;
    }

    public synchronized boolean blockUntilDelivered() throws InterruptedException {
        try {
            u80.checkState(this.f55884k);
            u80.checkState(this.f55880g.getThread() != Thread.currentThread());
            while (!this.f55886m) {
                wait();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f55885l;
    }

    @op1
    public synchronized l0d cancel() {
        u80.checkState(this.f55884k);
        this.f55887n = true;
        markAsProcessed(false);
        return this;
    }

    public boolean getDeleteAfterDelivery() {
        return this.f55883j;
    }

    public Looper getLooper() {
        return this.f55880g;
    }

    public int getMediaItemIndex() {
        return this.f55881h;
    }

    @hib
    public Object getPayload() {
        return this.f55879f;
    }

    public long getPositionMs() {
        return this.f55882i;
    }

    public InterfaceC8571b getTarget() {
        return this.f55874a;
    }

    public t1h getTimeline() {
        return this.f55877d;
    }

    public int getType() {
        return this.f55878e;
    }

    public synchronized boolean isCanceled() {
        return this.f55887n;
    }

    public synchronized void markAsProcessed(boolean z) {
        this.f55885l = z | this.f55885l;
        this.f55886m = true;
        notifyAll();
    }

    @op1
    public l0d send() {
        u80.checkState(!this.f55884k);
        if (this.f55882i == -9223372036854775807L) {
            u80.checkArgument(this.f55883j);
        }
        this.f55884k = true;
        this.f55875b.sendMessage(this);
        return this;
    }

    @op1
    public l0d setDeleteAfterDelivery(boolean z) {
        u80.checkState(!this.f55884k);
        this.f55883j = z;
        return this;
    }

    @op1
    @Deprecated
    public l0d setHandler(Handler handler) {
        return setLooper(handler.getLooper());
    }

    @op1
    public l0d setLooper(Looper looper) {
        u80.checkState(!this.f55884k);
        this.f55880g = looper;
        return this;
    }

    @op1
    public l0d setPayload(@hib Object obj) {
        u80.checkState(!this.f55884k);
        this.f55879f = obj;
        return this;
    }

    @op1
    public l0d setPosition(long j) {
        u80.checkState(!this.f55884k);
        this.f55882i = j;
        return this;
    }

    @op1
    public l0d setType(int i) {
        u80.checkState(!this.f55884k);
        this.f55878e = i;
        return this;
    }

    @op1
    public l0d setPosition(int i, long j) {
        u80.checkState(!this.f55884k);
        u80.checkArgument(j != -9223372036854775807L);
        if (i >= 0 && (this.f55877d.isEmpty() || i < this.f55877d.getWindowCount())) {
            this.f55881h = i;
            this.f55882i = j;
            return this;
        }
        throw new ls7(this.f55877d, i, j);
    }

    public synchronized boolean blockUntilDelivered(long j) throws InterruptedException, TimeoutException {
        boolean z;
        try {
            u80.checkState(this.f55884k);
            u80.checkState(this.f55880g.getThread() != Thread.currentThread());
            long jElapsedRealtime = this.f55876c.elapsedRealtime() + j;
            while (true) {
                z = this.f55886m;
                if (z || j <= 0) {
                    break;
                }
                this.f55876c.onThreadBlocked();
                wait(j);
                j = jElapsedRealtime - this.f55876c.elapsedRealtime();
            }
            if (!z) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f55885l;
    }
}
