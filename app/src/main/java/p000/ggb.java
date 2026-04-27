package p000;

import java.lang.annotation.Annotation;
import java.util.List;
import p000.f0f;
import p000.xag;

/* JADX INFO: loaded from: classes7.dex */
public final class ggb implements f0f {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final ggb f39773a = new ggb();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final u0f f39774b = xag.C15020d.f97390a;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final String f39775c = "kotlin.Nothing";

    private ggb() {
    }

    private final Void error() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public boolean equals(@gib Object obj) {
        return this == obj;
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
    public u0f getKind() {
        return f39774b;
    }

    @Override // p000.f0f
    @yfb
    public String getSerialName() {
        return f39775c;
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
        return "NothingSerialDescriptor";
    }
}
