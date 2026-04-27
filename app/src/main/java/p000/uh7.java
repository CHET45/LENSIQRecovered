package p000;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class uh7<E> extends e82<E, Set<? extends E>, HashSet<E>> {

    /* JADX INFO: renamed from: b */
    @yfb
    public final f0f f88012b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh7(@yfb lp8<E> lp8Var) {
        super(lp8Var);
        md8.checkNotNullParameter(lp8Var, "eSerializer");
        this.f88012b = new th7(lp8Var.getDescriptor());
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public HashSet<E> builder() {
        return new HashSet<>();
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int builderSize(@yfb HashSet<E> hashSet) {
        md8.checkNotNullParameter(hashSet, "<this>");
        return hashSet.size();
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void checkCapacity(@yfb HashSet<E> hashSet, int i) {
        md8.checkNotNullParameter(hashSet, "<this>");
    }

    @Override // p000.z72
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void insert(@yfb HashSet<E> hashSet, int i, E e) {
        md8.checkNotNullParameter(hashSet, "<this>");
        hashSet.add(e);
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public HashSet<E> toBuilder(@yfb Set<? extends E> set) {
        md8.checkNotNullParameter(set, "<this>");
        HashSet<E> hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet<>(set) : hashSet;
    }

    @Override // p000.z72, p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return this.f88012b;
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set<E> toResult(@yfb HashSet<E> hashSet) {
        md8.checkNotNullParameter(hashSet, "<this>");
        return hashSet;
    }
}
