package p000;

import java.io.IOException;
import java.util.Map;
import p000.zr5;
import p000.zr5.InterfaceC16225c;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public abstract class cj5<T extends zr5.InterfaceC16225c<T>> {
    /* JADX INFO: renamed from: a */
    public abstract int mo3990a(Map.Entry<?, ?> extension);

    /* JADX INFO: renamed from: b */
    public abstract Object mo3991b(yi5 extensionRegistry, psa defaultInstance, int number);

    /* JADX INFO: renamed from: c */
    public abstract zr5<T> mo3992c(Object message);

    /* JADX INFO: renamed from: d */
    public abstract zr5<T> mo3993d(Object message);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo3994e(psa prototype);

    /* JADX INFO: renamed from: f */
    public abstract void mo3995f(Object message);

    /* JADX INFO: renamed from: g */
    public abstract <UT, UB> UB mo3996g(Object containerMessage, ird reader, Object extension, yi5 extensionRegistry, zr5<T> extensions, UB unknownFields, sth<UT, UB> unknownFieldSchema) throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract void mo3997h(ird reader, Object extension, yi5 extensionRegistry, zr5<T> extensions) throws IOException;

    /* JADX INFO: renamed from: i */
    public abstract void mo3998i(wj1 data, Object extension, yi5 extensionRegistry, zr5<T> extensions) throws IOException;

    /* JADX INFO: renamed from: j */
    public abstract void mo3999j(qsi writer, Map.Entry<?, ?> extension) throws IOException;

    /* JADX INFO: renamed from: k */
    public abstract void mo4000k(Object message, zr5<T> extensions);
}
