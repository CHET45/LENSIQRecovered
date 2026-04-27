package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class y86<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final nr2<? extends T> f100748b;

    /* JADX INFO: renamed from: c */
    public final int f100749c;

    /* JADX INFO: renamed from: d */
    public final tu2<? super mf4> f100750d;

    /* JADX INFO: renamed from: e */
    public final AtomicInteger f100751e = new AtomicInteger();

    public y86(nr2<? extends T> nr2Var, int i, tu2<? super mf4> tu2Var) {
        this.f100748b = nr2Var;
        this.f100749c = i;
        this.f100750d = tu2Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f100748b.subscribe((ycg<? super Object>) ycgVar);
        if (this.f100751e.incrementAndGet() == this.f100749c) {
            this.f100748b.connect(this.f100750d);
        }
    }
}
