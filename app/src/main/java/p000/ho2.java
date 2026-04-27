package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p000.b72;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/1704")
@kyg
public final class ho2 {

    /* JADX INFO: renamed from: b */
    public static final ho2 f44249b = new ho2(new b72.C1760a(), b72.C1761b.f12832a);

    /* JADX INFO: renamed from: a */
    public final ConcurrentMap<String, go2> f44250a = new ConcurrentHashMap();

    @gdi
    public ho2(go2... go2VarArr) {
        for (go2 go2Var : go2VarArr) {
            this.f44250a.put(go2Var.getMessageEncoding(), go2Var);
        }
    }

    public static ho2 getDefaultInstance() {
        return f44249b;
    }

    public static ho2 newEmptyInstance() {
        return new ho2(new go2[0]);
    }

    @eib
    public go2 lookupCompressor(String str) {
        return this.f44250a.get(str);
    }

    public void register(go2 go2Var) {
        String messageEncoding = go2Var.getMessageEncoding();
        v7d.checkArgument(!messageEncoding.contains(","), "Comma is currently not allowed in message encoding");
        this.f44250a.put(messageEncoding, go2Var);
    }
}
