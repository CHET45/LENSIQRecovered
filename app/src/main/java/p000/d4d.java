package p000;

import java.lang.annotation.Annotation;
import java.util.List;
import p000.u0f;
import p000.w3d;

/* JADX INFO: loaded from: classes7.dex */
public final class d4d<T> extends AbstractC12880t3<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final oo8<T> f28396a;

    /* JADX INFO: renamed from: b */
    @yfb
    public List<? extends Annotation> f28397b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final fx8 f28398c;

    public d4d(@yfb oo8<T> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "baseClass");
        this.f28396a = oo8Var;
        this.f28397b = l82.emptyList();
        this.f28398c = hz8.lazy(g39.f38326b, new ny6() { // from class: c4d
            @Override // p000.ny6
            public final Object invoke() {
                return d4d.descriptor_delegate$lambda$1(this.f15764a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0f descriptor_delegate$lambda$1(final d4d d4dVar) {
        return kx2.withContext(n0f.buildSerialDescriptor("kotlinx.serialization.Polymorphic", w3d.C14371a.f93179a, new f0f[0], new qy6() { // from class: b4d
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return d4d.descriptor_delegate$lambda$1$lambda$0(this.f12677a, (l12) obj);
            }
        }), d4dVar.getBaseClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth descriptor_delegate$lambda$1$lambda$0(d4d d4dVar, l12 l12Var) {
        md8.checkNotNullParameter(l12Var, "$this$buildSerialDescriptor");
        l12.element$default(l12Var, "type", hg1.serializer(l7g.f56714a).getDescriptor(), null, false, 12, null);
        l12.element$default(l12Var, "value", n0f.buildSerialDescriptor$default("kotlinx.serialization.Polymorphic<" + d4dVar.getBaseClass().getSimpleName() + '>', u0f.C13311a.f86522a, new f0f[0], null, 8, null), null, false, 12, null);
        l12Var.setAnnotations(d4dVar.f28397b);
        return bth.f14751a;
    }

    @Override // p000.AbstractC12880t3
    @yfb
    public oo8<T> getBaseClass() {
        return this.f28396a;
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return (f0f) this.f28398c.getValue();
    }

    @yfb
    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + getBaseClass() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yjd
    public d4d(@yfb oo8<T> oo8Var, @yfb Annotation[] annotationArr) {
        this(oo8Var);
        md8.checkNotNullParameter(oo8Var, "baseClass");
        md8.checkNotNullParameter(annotationArr, "classAnnotations");
        this.f28397b = u70.asList(annotationArr);
    }
}
