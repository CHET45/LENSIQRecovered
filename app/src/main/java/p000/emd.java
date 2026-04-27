package p000;

import java.util.concurrent.Executor;
import p000.uae;

/* JADX INFO: loaded from: classes3.dex */
public final class emd implements xfg, e44 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final xfg f33551a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Executor f33552b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final uae.InterfaceC13438g f33553c;

    public emd(@yfb xfg xfgVar, @yfb Executor executor, @yfb uae.InterfaceC13438g interfaceC13438g) {
        md8.checkNotNullParameter(xfgVar, "delegate");
        md8.checkNotNullParameter(executor, "queryCallbackExecutor");
        md8.checkNotNullParameter(interfaceC13438g, "queryCallback");
        this.f33551a = xfgVar;
        this.f33552b = executor;
        this.f33553c = interfaceC13438g;
    }

    @Override // p000.xfg, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f33551a.close();
    }

    @Override // p000.xfg
    @gib
    public String getDatabaseName() {
        return this.f33551a.getDatabaseName();
    }

    @Override // p000.e44
    @yfb
    public xfg getDelegate() {
        return this.f33551a;
    }

    @Override // p000.xfg
    @yfb
    public wfg getReadableDatabase() {
        return new dmd(getDelegate().getReadableDatabase(), this.f33552b, this.f33553c);
    }

    @Override // p000.xfg
    @yfb
    public wfg getWritableDatabase() {
        return new dmd(getDelegate().getWritableDatabase(), this.f33552b, this.f33553c);
    }

    @Override // p000.xfg
    @c5e(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f33551a.setWriteAheadLoggingEnabled(z);
    }
}
