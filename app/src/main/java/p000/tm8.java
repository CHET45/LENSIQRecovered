package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class tm8 extends AbstractC6092g2 {

    /* JADX INFO: renamed from: g */
    @yfb
    public final ArrayList<sk8> f85318g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm8(@yfb bk8 bk8Var, @yfb qy6<? super sk8, bth> qy6Var) {
        super(bk8Var, qy6Var, null);
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(qy6Var, "nodeConsumer");
        this.f85318g = new ArrayList<>();
    }

    @Override // p000.AbstractC6092g2
    @yfb
    public sk8 getCurrent() {
        return new ck8(this.f85318g);
    }

    @Override // p000.AbstractC6092g2, p000.h9b
    @yfb
    /* JADX INFO: renamed from: h */
    public String mo11321h(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return String.valueOf(i);
    }

    @Override // p000.AbstractC6092g2
    public void putElement(@yfb String str, @yfb sk8 sk8Var) {
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(sk8Var, "element");
        this.f85318g.add(Integer.parseInt(str), sk8Var);
    }
}
