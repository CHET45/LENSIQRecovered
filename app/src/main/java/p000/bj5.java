package p000;

import java.io.IOException;
import java.util.Map;
import p000.as5;
import p000.as5.InterfaceC1587c;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public abstract class bj5<T extends as5.InterfaceC1587c<T>> {
    /* JADX INFO: renamed from: a */
    public abstract int mo3199a(Map.Entry<?, ?> extension);

    /* JADX INFO: renamed from: b */
    public abstract Object mo3200b(zi5 extensionRegistry, qsa defaultInstance, int number);

    /* JADX INFO: renamed from: c */
    public abstract as5<T> mo3201c(Object message);

    /* JADX INFO: renamed from: d */
    public abstract as5<T> mo3202d(Object message);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo3203e(qsa prototype);

    /* JADX INFO: renamed from: f */
    public abstract void mo3204f(Object message);

    /* JADX INFO: renamed from: g */
    public abstract <UT, UB> UB mo3205g(Object containerMessage, hrd reader, Object extension, zi5 extensionRegistry, as5<T> extensions, UB unknownFields, rth<UT, UB> unknownFieldSchema) throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract void mo3206h(hrd reader, Object extension, zi5 extensionRegistry, as5<T> extensions) throws IOException;

    /* JADX INFO: renamed from: i */
    public abstract void mo3207i(vj1 data, Object extension, zi5 extensionRegistry, as5<T> extensions) throws IOException;

    /* JADX INFO: renamed from: j */
    public abstract void mo3208j(rsi writer, Map.Entry<?, ?> extension) throws IOException;

    /* JADX INFO: renamed from: k */
    public abstract void mo3209k(Object message, as5<T> extensions);
}
