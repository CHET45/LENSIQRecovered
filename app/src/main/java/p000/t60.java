package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@nb8
@yjd
public final class t60<E> extends e82<E, List<? extends E>, ArrayList<E>> {

    /* JADX INFO: renamed from: b */
    @yfb
    public final f0f f83773b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t60(@yfb lp8<E> lp8Var) {
        super(lp8Var);
        md8.checkNotNullParameter(lp8Var, "element");
        this.f83773b = new q60(lp8Var.getDescriptor());
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> builder() {
        return new ArrayList<>();
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int builderSize(@yfb ArrayList<E> arrayList) {
        md8.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void checkCapacity(@yfb ArrayList<E> arrayList, int i) {
        md8.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i);
    }

    @Override // p000.z72
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void insert(@yfb ArrayList<E> arrayList, int i, E e) {
        md8.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i, e);
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> toBuilder(@yfb List<? extends E> list) {
        md8.checkNotNullParameter(list, "<this>");
        ArrayList<E> arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList<>(list) : arrayList;
    }

    @Override // p000.z72, p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return this.f83773b;
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<E> toResult(@yfb ArrayList<E> arrayList) {
        md8.checkNotNullParameter(arrayList, "<this>");
        return arrayList;
    }
}
