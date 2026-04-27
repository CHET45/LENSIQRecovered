package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class mb0 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final AtomicBoolean f60397a;

    public mb0(boolean z) {
        this.f60397a = new AtomicBoolean(z);
    }

    public final boolean get() {
        return this.f60397a.get();
    }

    public final void set(boolean z) {
        this.f60397a.set(z);
    }
}
