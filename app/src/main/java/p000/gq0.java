package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gq0<V, O> implements InterfaceC9576mx<V, O> {

    /* JADX INFO: renamed from: a */
    public final List<hs8<V>> f40784a;

    public gq0(V v) {
        this(Collections.singletonList(new hs8(v)));
    }

    @Override // p000.InterfaceC9576mx
    public List<hs8<V>> getKeyframes() {
        return this.f40784a;
    }

    @Override // p000.InterfaceC9576mx
    public boolean isStatic() {
        if (this.f40784a.isEmpty()) {
            return true;
        }
        return this.f40784a.size() == 1 && this.f40784a.get(0).isStatic();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f40784a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f40784a.toArray()));
        }
        return sb.toString();
    }

    public gq0(List<hs8<V>> list) {
        this.f40784a = list;
    }
}
