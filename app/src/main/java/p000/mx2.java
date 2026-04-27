package p000;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class mx2 implements f0f {

    /* JADX INFO: renamed from: a */
    @yfb
    public final f0f f62596a;

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public final oo8<?> f62597b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final String f62598c;

    public mx2(@yfb f0f f0fVar, @yfb oo8<?> oo8Var) {
        md8.checkNotNullParameter(f0fVar, "original");
        md8.checkNotNullParameter(oo8Var, "kClass");
        this.f62596a = f0fVar;
        this.f62597b = oo8Var;
        this.f62598c = f0fVar.getSerialName() + '<' + oo8Var.getSimpleName() + '>';
    }

    public boolean equals(@gib Object obj) {
        mx2 mx2Var = obj instanceof mx2 ? (mx2) obj : null;
        return mx2Var != null && md8.areEqual(this.f62596a, mx2Var.f62596a) && md8.areEqual(mx2Var.f62597b, this.f62597b);
    }

    @Override // p000.f0f
    @yfb
    public List<Annotation> getAnnotations() {
        return this.f62596a.getAnnotations();
    }

    @Override // p000.f0f
    @ph5
    @yfb
    public List<Annotation> getElementAnnotations(int i) {
        return this.f62596a.getElementAnnotations(i);
    }

    @Override // p000.f0f
    @ph5
    @yfb
    public f0f getElementDescriptor(int i) {
        return this.f62596a.getElementDescriptor(i);
    }

    @Override // p000.f0f
    @ph5
    public int getElementIndex(@yfb String str) {
        md8.checkNotNullParameter(str, "name");
        return this.f62596a.getElementIndex(str);
    }

    @Override // p000.f0f
    @ph5
    @yfb
    public String getElementName(int i) {
        return this.f62596a.getElementName(i);
    }

    @Override // p000.f0f
    public int getElementsCount() {
        return this.f62596a.getElementsCount();
    }

    @Override // p000.f0f
    @yfb
    public u0f getKind() {
        return this.f62596a.getKind();
    }

    @Override // p000.f0f
    @yfb
    public String getSerialName() {
        return this.f62598c;
    }

    public int hashCode() {
        return (this.f62597b.hashCode() * 31) + getSerialName().hashCode();
    }

    @Override // p000.f0f
    @ph5
    public boolean isElementOptional(int i) {
        return this.f62596a.isElementOptional(i);
    }

    @Override // p000.f0f
    public boolean isInline() {
        return this.f62596a.isInline();
    }

    @Override // p000.f0f
    public boolean isNullable() {
        return this.f62596a.isNullable();
    }

    @yfb
    public String toString() {
        return "ContextDescriptor(kClass: " + this.f62597b + ", original: " + this.f62596a + ')';
    }
}
