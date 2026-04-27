package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class rm8 extends AbstractC6092g2 {

    /* JADX INFO: renamed from: g */
    @yfb
    public final Map<String, sk8> f78726g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm8(@yfb bk8 bk8Var, @yfb qy6<? super sk8, bth> qy6Var) {
        super(bk8Var, qy6Var, null);
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(qy6Var, "nodeConsumer");
        this.f78726g = new LinkedHashMap();
    }

    @Override // p000.xlg, p000.om2
    public <T> void encodeNullableSerializableElement(@yfb f0f f0fVar, int i, @yfb e1f<? super T> e1fVar, @gib T t) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(e1fVar, "serializer");
        if (t != null || this.f38283d.getExplicitNulls()) {
            super.encodeNullableSerializableElement(f0fVar, i, e1fVar, t);
        }
    }

    @Override // p000.AbstractC6092g2
    @yfb
    public sk8 getCurrent() {
        return new am8(this.f78726g);
    }

    @Override // p000.AbstractC6092g2
    public void putElement(@yfb String str, @yfb sk8 sk8Var) {
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(sk8Var, "element");
        this.f78726g.put(str, sk8Var);
    }

    @yfb
    /* JADX INFO: renamed from: z */
    public final Map<String, sk8> m21427z() {
        return this.f78726g;
    }
}
