package p000;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class g0f implements f0f, xm1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final f0f f38190a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f38191b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Set<String> f38192c;

    public g0f(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "original");
        this.f38190a = f0fVar;
        this.f38191b = f0fVar.getSerialName() + '?';
        this.f38192c = hyc.cachedSerialNames(f0fVar);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0f) && md8.areEqual(this.f38190a, ((g0f) obj).f38190a);
    }

    @Override // p000.f0f
    @yfb
    public List<Annotation> getAnnotations() {
        return this.f38190a.getAnnotations();
    }

    @Override // p000.f0f
    @ph5
    @yfb
    public List<Annotation> getElementAnnotations(int i) {
        return this.f38190a.getElementAnnotations(i);
    }

    @Override // p000.f0f
    @ph5
    @yfb
    public f0f getElementDescriptor(int i) {
        return this.f38190a.getElementDescriptor(i);
    }

    @Override // p000.f0f
    @ph5
    public int getElementIndex(@yfb String str) {
        md8.checkNotNullParameter(str, "name");
        return this.f38190a.getElementIndex(str);
    }

    @Override // p000.f0f
    @ph5
    @yfb
    public String getElementName(int i) {
        return this.f38190a.getElementName(i);
    }

    @Override // p000.f0f
    public int getElementsCount() {
        return this.f38190a.getElementsCount();
    }

    @Override // p000.f0f
    @yfb
    public u0f getKind() {
        return this.f38190a.getKind();
    }

    @yfb
    public final f0f getOriginal$kotlinx_serialization_core() {
        return this.f38190a;
    }

    @Override // p000.f0f
    @yfb
    public String getSerialName() {
        return this.f38191b;
    }

    @Override // p000.xm1
    @yfb
    public Set<String> getSerialNames() {
        return this.f38192c;
    }

    public int hashCode() {
        return this.f38190a.hashCode() * 31;
    }

    @Override // p000.f0f
    @ph5
    public boolean isElementOptional(int i) {
        return this.f38190a.isElementOptional(i);
    }

    @Override // p000.f0f
    public boolean isInline() {
        return this.f38190a.isInline();
    }

    @Override // p000.f0f
    public boolean isNullable() {
        return true;
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f38190a);
        sb.append('?');
        return sb.toString();
    }
}
