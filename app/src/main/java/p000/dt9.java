package p000;

import java.lang.annotation.Annotation;
import java.util.List;
import p000.f0f;
import p000.xag;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCollectionDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionDescriptors.kt\nkotlinx/serialization/internal/MapLikeDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
public abstract class dt9 implements f0f {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f30842a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final f0f f30843b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final f0f f30844c;

    /* JADX INFO: renamed from: d */
    public final int f30845d;

    public /* synthetic */ dt9(String str, f0f f0fVar, f0f f0fVar2, jt3 jt3Var) {
        this(str, f0fVar, f0fVar2);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt9)) {
            return false;
        }
        dt9 dt9Var = (dt9) obj;
        return md8.areEqual(getSerialName(), dt9Var.getSerialName()) && md8.areEqual(this.f30843b, dt9Var.f30843b) && md8.areEqual(this.f30844c, dt9Var.f30844c);
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

    @Override // p000.f0f
    @yfb
    public f0f getElementDescriptor(int i) {
        if (i >= 0) {
            int i2 = i % 2;
            if (i2 == 0) {
                return this.f30843b;
            }
            if (i2 == 1) {
                return this.f30844c;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + getSerialName() + " expects only non-negative indices").toString());
    }

    @Override // p000.f0f
    public int getElementIndex(@yfb String str) {
        md8.checkNotNullParameter(str, "name");
        Integer intOrNull = g9g.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid map index");
    }

    @Override // p000.f0f
    @yfb
    public String getElementName(int i) {
        return String.valueOf(i);
    }

    @Override // p000.f0f
    public int getElementsCount() {
        return this.f30845d;
    }

    @yfb
    public final f0f getKeyDescriptor() {
        return this.f30843b;
    }

    @Override // p000.f0f
    @yfb
    public u0f getKind() {
        return xag.C15019c.f97389a;
    }

    @Override // p000.f0f
    @yfb
    public String getSerialName() {
        return this.f30842a;
    }

    @yfb
    public final f0f getValueDescriptor() {
        return this.f30844c;
    }

    public int hashCode() {
        return (((getSerialName().hashCode() * 31) + this.f30843b.hashCode()) * 31) + this.f30844c.hashCode();
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
        return getSerialName() + '(' + this.f30843b + ", " + this.f30844c + ')';
    }

    private dt9(String str, f0f f0fVar, f0f f0fVar2) {
        this.f30842a = str;
        this.f30843b = f0fVar;
        this.f30844c = f0fVar2;
        this.f30845d = 2;
    }
}
