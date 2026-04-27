package p000;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class u79<E> extends e82<E, Set<? extends E>, LinkedHashSet<E>> {

    /* JADX INFO: renamed from: b */
    @yfb
    public final f0f f86985b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u79(@yfb lp8<E> lp8Var) {
        super(lp8Var);
        md8.checkNotNullParameter(lp8Var, "eSerializer");
        this.f86985b = new t79(lp8Var.getDescriptor());
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> builder() {
        return new LinkedHashSet<>();
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int builderSize(@yfb LinkedHashSet<E> linkedHashSet) {
        md8.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void checkCapacity(@yfb LinkedHashSet<E> linkedHashSet, int i) {
        md8.checkNotNullParameter(linkedHashSet, "<this>");
    }

    @Override // p000.z72
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void insert(@yfb LinkedHashSet<E> linkedHashSet, int i, E e) {
        md8.checkNotNullParameter(linkedHashSet, "<this>");
        linkedHashSet.add(e);
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> toBuilder(@yfb Set<? extends E> set) {
        md8.checkNotNullParameter(set, "<this>");
        LinkedHashSet<E> linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet<>(set) : linkedHashSet;
    }

    @Override // p000.z72, p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return this.f86985b;
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set<E> toResult(@yfb LinkedHashSet<E> linkedHashSet) {
        md8.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
