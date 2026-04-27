package p000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
@c15
public abstract class dhd {

    /* JADX INFO: renamed from: a */
    public static final rhd f29679a = rhd.builder().configureWith(aj0.f1687b).build();

    private dhd() {
    }

    public static byte[] encode(Object obj) {
        return f29679a.encode(obj);
    }

    public abstract f42 getClientMetrics();

    public static void encode(Object obj, OutputStream outputStream) throws IOException {
        f29679a.encode(obj, outputStream);
    }
}
