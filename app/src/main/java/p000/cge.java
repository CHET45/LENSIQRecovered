package p000;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import p000.xfg;

/* JADX INFO: loaded from: classes3.dex */
public final class cge implements xfg.InterfaceC15048c {

    /* JADX INFO: renamed from: a */
    @gib
    public final String f16493a;

    /* JADX INFO: renamed from: b */
    @gib
    public final File f16494b;

    /* JADX INFO: renamed from: c */
    @gib
    public final Callable<InputStream> f16495c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final xfg.InterfaceC15048c f16496d;

    public cge(@gib String str, @gib File file, @gib Callable<InputStream> callable, @yfb xfg.InterfaceC15048c interfaceC15048c) {
        md8.checkNotNullParameter(interfaceC15048c, "mDelegate");
        this.f16493a = str;
        this.f16494b = file;
        this.f16495c = callable;
        this.f16496d = interfaceC15048c;
    }

    @Override // p000.xfg.InterfaceC15048c
    @yfb
    public xfg create(@yfb xfg.C15047b c15047b) {
        md8.checkNotNullParameter(c15047b, "configuration");
        return new bge(c15047b.f97668a, this.f16493a, this.f16494b, this.f16495c, c15047b.f97670c.f97666a, this.f16496d.create(c15047b));
    }
}
