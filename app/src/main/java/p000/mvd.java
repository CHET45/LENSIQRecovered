package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class mvd<ElementKlass, Element extends ElementKlass> extends z72<Element, Element[], ArrayList<Element>> {

    /* JADX INFO: renamed from: b */
    @yfb
    public final oo8<ElementKlass> f62389b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final f0f f62390c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvd(@yfb oo8<ElementKlass> oo8Var, @yfb lp8<Element> lp8Var) {
        super(lp8Var, null);
        md8.checkNotNullParameter(oo8Var, "kClass");
        md8.checkNotNullParameter(lp8Var, "eSerializer");
        this.f62389b = oo8Var;
        this.f62390c = new t50(lp8Var.getDescriptor());
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> builder() {
        return new ArrayList<>();
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int builderSize(@yfb ArrayList<Element> arrayList) {
        md8.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void checkCapacity(@yfb ArrayList<Element> arrayList, int i) {
        md8.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i);
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Iterator<Element> collectionIterator(@yfb Element[] elementArr) {
        md8.checkNotNullParameter(elementArr, "<this>");
        return l60.iterator(elementArr);
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int collectionSize(@yfb Element[] elementArr) {
        md8.checkNotNullParameter(elementArr, "<this>");
        return elementArr.length;
    }

    @Override // p000.z72
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void insert(@yfb ArrayList<Element> arrayList, int i, Element element) {
        md8.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i, element);
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> toBuilder(@yfb Element[] elementArr) {
        md8.checkNotNullParameter(elementArr, "<this>");
        return new ArrayList<>(u70.asList(elementArr));
    }

    @Override // p000.z72, p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return this.f62390c;
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Element[] toResult(@yfb ArrayList<Element> arrayList) {
        md8.checkNotNullParameter(arrayList, "<this>");
        return (Element[]) exc.toNativeArrayImpl(arrayList, this.f62389b);
    }
}
