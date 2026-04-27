package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@rk8
public final class bm8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Map<String, sk8> f14136a = new LinkedHashMap();

    @yjd
    public bm8() {
    }

    @yfb
    @yjd
    public final am8 build() {
        return new am8(this.f14136a);
    }

    @gib
    public final sk8 put(@yfb String str, @yfb sk8 sk8Var) {
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(sk8Var, "element");
        return this.f14136a.put(str, sk8Var);
    }
}
