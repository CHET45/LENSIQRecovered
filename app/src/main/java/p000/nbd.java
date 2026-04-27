package p000;

import java.lang.annotation.Annotation;
import java.util.List;
import p000.f0f;

/* JADX INFO: loaded from: classes7.dex */
public final class nbd implements f0f {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f63913a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final jbd f63914b;

    public nbd(@yfb String str, @yfb jbd jbdVar) {
        md8.checkNotNullParameter(str, "serialName");
        md8.checkNotNullParameter(jbdVar, "kind");
        this.f63913a = str;
        this.f63914b = jbdVar;
    }

    private final Void error() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbd)) {
            return false;
        }
        nbd nbdVar = (nbd) obj;
        return md8.areEqual(getSerialName(), nbdVar.getSerialName()) && md8.areEqual(getKind(), nbdVar.getKind());
    }

    @Override // p000.f0f
    @yfb
    public List<Annotation> getAnnotations() {
        return f0f.C5539a.getAnnotations(this);
    }

    @Override // p000.f0f
    @yfb
    public List<Annotation> getElementAnnotations(int i) {
        error();
        throw new us8();
    }

    @Override // p000.f0f
    @yfb
    public f0f getElementDescriptor(int i) {
        error();
        throw new us8();
    }

    @Override // p000.f0f
    public int getElementIndex(@yfb String str) {
        md8.checkNotNullParameter(str, "name");
        error();
        throw new us8();
    }

    @Override // p000.f0f
    @yfb
    public String getElementName(int i) {
        error();
        throw new us8();
    }

    @Override // p000.f0f
    public int getElementsCount() {
        return 0;
    }

    @Override // p000.f0f
    @yfb
    public String getSerialName() {
        return this.f63913a;
    }

    public int hashCode() {
        return getSerialName().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // p000.f0f
    public boolean isElementOptional(int i) {
        error();
        throw new us8();
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
        return "PrimitiveDescriptor(" + getSerialName() + ')';
    }

    @Override // p000.f0f
    @yfb
    public jbd getKind() {
        return this.f63914b;
    }
}
