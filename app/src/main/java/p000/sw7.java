package p000;

import java.util.concurrent.TimeUnit;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class sw7 extends woe {

    /* JADX INFO: renamed from: c */
    public static final woe f83154c = new sw7();

    /* JADX INFO: renamed from: d */
    public static final woe.AbstractC14729c f83155d = new C12816a();

    /* JADX INFO: renamed from: e */
    public static final lf4 f83156e;

    static {
        lf4 lf4VarEmpty = lf4.empty();
        f83156e = lf4VarEmpty;
        lf4VarEmpty.dispose();
    }

    private sw7() {
    }

    @Override // p000.woe
    @cfb
    public woe.AbstractC14729c createWorker() {
        return f83155d;
    }

    @Override // p000.woe
    @cfb
    public lf4 scheduleDirect(@cfb Runnable run) {
        run.run();
        return f83156e;
    }

    @Override // p000.woe
    @cfb
    public lf4 schedulePeriodicallyDirect(@cfb Runnable run, long initialDelay, long period, TimeUnit unit) {
        throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }

    /* JADX INFO: renamed from: sw7$a */
    public static final class C12816a extends woe.AbstractC14729c {
        @Override // p000.lf4
        public void dispose() {
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return false;
        }

        @Override // p000.woe.AbstractC14729c
        @cfb
        public lf4 schedule(@cfb Runnable run) {
            run.run();
            return sw7.f83156e;
        }

        @Override // p000.woe.AbstractC14729c
        @cfb
        public lf4 schedulePeriodically(@cfb Runnable run, long initialDelay, long period, TimeUnit unit) {
            throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
        }

        @Override // p000.woe.AbstractC14729c
        @cfb
        public lf4 schedule(@cfb Runnable run, long delay, @cfb TimeUnit unit) {
            throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
        }
    }

    @Override // p000.woe
    @cfb
    public lf4 scheduleDirect(@cfb Runnable run, long delay, TimeUnit unit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }
}
