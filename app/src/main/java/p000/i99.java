package p000;

import java.lang.annotation.Annotation;
import java.util.List;
import p000.f0f;
import p000.xag;

/* JADX INFO: loaded from: classes7.dex */
@ph5
@dwf({"SMAP\nCollectionDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionDescriptors.kt\nkotlinx/serialization/internal/ListLikeDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
public abstract class i99 implements f0f {

    /* JADX INFO: renamed from: a */
    @yfb
    public final f0f f46139a;

    /* JADX INFO: renamed from: b */
    public final int f46140b;

    public /* synthetic */ i99(f0f f0fVar, jt3 jt3Var) {
        this(f0fVar);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i99)) {
            return false;
        }
        i99 i99Var = (i99) obj;
        return md8.areEqual(this.f46139a, i99Var.f46139a) && md8.areEqual(getSerialName(), i99Var.getSerialName());
    }

    @Override // p000.f0f
    @yfb
    public List<Annotation> getAnnotations() {
        return f0f.C5539a.getAnnotations(this);
    }

    @Override // p000.f0f
    @yfb
    public List<Annotation> getElementAnnotations(int i) {
        if (i >= 0) {
            return l82.emptyList();
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + getSerialName() + " expects only non-negative indices").toString());
    }

    @yfb
    public final f0f getElementDescriptor() {
        return this.f46139a;
    }

    @Override // p000.f0f
    public int getElementIndex(@yfb String str) {
        md8.checkNotNullParameter(str, "name");
        Integer intOrNull = g9g.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid list index");
    }

    @Override // p000.f0f
    @yfb
    public String getElementName(int i) {
        return String.valueOf(i);
    }

    @Override // p000.f0f
    public int getElementsCount() {
        return this.f46140b;
    }

    @Override // p000.f0f
    @yfb
    public u0f getKind() {
        return xag.C15018b.f97388a;
    }

    public int hashCode() {
        return (this.f46139a.hashCode() * 31) + getSerialName().hashCode();
    }

    @Override // p000.f0f
    public boolean isElementOptional(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + getSerialName() + " expects only non-negative indices").toString());
    }

    @Override // p000.f0f
    public boolean isInline() {
        return f0f.C5539a.isInline(this);
    }

    @Override // p000.f0f
    public boolean isNullable() {
        return f0f.C5539a.isNullable(this);
    }

    @yfb
    public String toString() {
        return getSerialName() + '(' + this.f46139a + ')';
    }

    private i99(f0f f0fVar) {
        this.f46139a = f0fVar;
        this.f46140b = 1;
    }

    @Override // p000.f0f
    @yfb
    public f0f getElementDescriptor(int i) {
        if (i >= 0) {
            return this.f46139a;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + getSerialName() + " expects only non-negative indices").toString());
    }
}
