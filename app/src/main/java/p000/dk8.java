package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@rk8
public final class dk8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<sk8> f29873a = new ArrayList();

    @yjd
    public dk8() {
    }

    public final boolean add(@yfb sk8 sk8Var) {
        md8.checkNotNullParameter(sk8Var, "element");
        this.f29873a.add(sk8Var);
        return true;
    }

    @ph5
    public final boolean addAll(@yfb Collection<? extends sk8> collection) {
        md8.checkNotNullParameter(collection, "elements");
        return this.f29873a.addAll(collection);
    }

    @yfb
    @yjd
    public final ck8 build() {
        return new ck8(this.f29873a);
    }
}
