package p000;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface iz1 {

    /* JADX INFO: renamed from: iz1$a */
    public interface InterfaceC7668a {
        @hib
        iz1 createProgressiveMediaExtractor(int i, kq6 kq6Var, boolean z, List<kq6> list, @hib r6h r6hVar, k0d k0dVar);
    }

    /* JADX INFO: renamed from: iz1$b */
    public interface InterfaceC7669b {
        r6h track(int i, int i2);
    }

    @hib
    lz1 getChunkIndex();

    @hib
    kq6[] getSampleFormats();

    void init(@hib InterfaceC7669b interfaceC7669b, long j, long j2);

    boolean read(zj5 zj5Var) throws IOException;

    void release();
}
