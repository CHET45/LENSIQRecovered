package p000;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class hri implements f0f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ f0f f44672a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f44673b;

    public hri(@yfb String str, @yfb f0f f0fVar) {
        md8.checkNotNullParameter(str, "serialName");
        md8.checkNotNullParameter(f0fVar, "original");
        this.f44672a = f0fVar;
        this.f44673b = str;
    }

    @Override // p000.f0f
    @yfb
    public List<Annotation> getAnnotations() {
        return this.f44672a.getAnnotations();
    }

    @Override // p000.f0f
    @ph5
    @yfb
    public List<Annotation> getElementAnnotations(int i) {
        return this.f44672a.getElementAnnotations(i);
    }

    @Override // p000.f0f
    @ph5
    @yfb
    public f0f getElementDescriptor(int i) {
        return this.f44672a.getElementDescriptor(i);
    }

    @Override // p000.f0f
    @ph5
    public int getElementIndex(@yfb String str) {
        md8.checkNotNullParameter(str, "name");
        return this.f44672a.getElementIndex(str);
    }

    @Override // p000.f0f
    @ph5
    @yfb
    public String getElementName(int i) {
        return this.f44672a.getElementName(i);
    }

    @Override // p000.f0f
    public int getElementsCount() {
        return this.f44672a.getElementsCount();
    }

    @Override // p000.f0f
    @yfb
    public u0f getKind() {
        return this.f44672a.getKind();
    }

    @Override // p000.f0f
    @yfb
    public String getSerialName() {
        return this.f44673b;
    }

    @Override // p000.f0f
    @ph5
    public boolean isElementOptional(int i) {
        return this.f44672a.isElementOptional(i);
    }

    @Override // p000.f0f
    public boolean isInline() {
        return this.f44672a.isInline();
    }

    @Override // p000.f0f
    public boolean isNullable() {
        return this.f44672a.isNullable();
    }
}
