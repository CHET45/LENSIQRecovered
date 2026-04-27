package p000;

import java.util.concurrent.TimeUnit;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class rw7 extends voe {

    /* JADX INFO: renamed from: c */
    public static final voe f79930c = new rw7();

    /* JADX INFO: renamed from: d */
    public static final voe.AbstractC14185c f79931d = new C12330a();

    /* JADX INFO: renamed from: e */
    public static final mf4 f79932e;

    static {
        mf4 mf4VarEmpty = pg4.empty();
        f79932e = mf4VarEmpty;
        mf4VarEmpty.dispose();
    }

    private rw7() {
    }

    @Override // p000.voe
    @bfb
    public voe.AbstractC14185c createWorker() {
        return f79931d;
    }

    @Override // p000.voe
    @bfb
    public mf4 scheduleDirect(@bfb Runnable runnable) {
        runnable.run();
        return f79932e;
    }

    @Override // p000.voe
    @bfb
    public mf4 schedulePeriodicallyDirect(@bfb Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }

    /* JADX INFO: renamed from: rw7$a */
    public static final class C12330a extends voe.AbstractC14185c {
        @Override // p000.mf4
        public void dispose() {
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return false;
        }

        @Override // p000.voe.AbstractC14185c
        @bfb
        public mf4 schedule(@bfb Runnable runnable) {
            runnable.run();
            return rw7.f79932e;
        }

        @Override // p000.voe.AbstractC14185c
        @bfb
        public mf4 schedulePeriodically(@bfb Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
        }

        @Override // p000.voe.AbstractC14185c
        @bfb
        public mf4 schedule(@bfb Runnable runnable, long j, @bfb TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
        }
    }

    @Override // p000.voe
    @bfb
    public mf4 scheduleDirect(@bfb Runnable runnable, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }
}
