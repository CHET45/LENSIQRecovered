package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface w3f extends n5g {
    void cancel(n4g n4gVar);

    void close(n4g n4gVar, fta ftaVar);

    sc0 getAttributes();

    @eib
    String getAuthority();

    void setDecompressor(am3 am3Var);

    void setListener(x3f x3fVar);

    k4g statsTraceContext();

    int streamId();

    void writeHeaders(fta ftaVar, boolean z);
}
