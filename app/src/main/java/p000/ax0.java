package p000;

import com.google.auto.value.AutoValue;
import java.util.List;
import p000.c15;

/* JADX INFO: loaded from: classes4.dex */
@c15
@AutoValue
public abstract class ax0 {
    @efb
    public static ax0 create(@efb List<ni9> list) {
        return new kj0(list);
    }

    @efb
    public static zf3 createDataEncoder() {
        return new mk8().configureWith(ni0.f64584b).ignoreNullValues(true).build();
    }

    @efb
    @c15.InterfaceC2147a(name = "logRequest")
    public abstract List<ni9> getLogRequests();
}
