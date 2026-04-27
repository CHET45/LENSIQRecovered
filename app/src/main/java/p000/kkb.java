package p000;

import java.lang.annotation.Annotation;
import java.util.List;
import p000.xag;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nObjectSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectSerializer.kt\nkotlinx/serialization/internal/ObjectSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,57:1\n570#2,4:58\n*S KotlinDebug\n*F\n+ 1 ObjectSerializer.kt\nkotlinx/serialization/internal/ObjectSerializer\n*L\n43#1:58,4\n*E\n"})
@yjd
public final class kkb<T> implements lp8<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final T f54553a;

    /* JADX INFO: renamed from: b */
    @yfb
    public List<? extends Annotation> f54554b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final fx8 f54555c;

    public kkb(@yfb final String str, @yfb T t) {
        md8.checkNotNullParameter(str, "serialName");
        md8.checkNotNullParameter(t, "objectInstance");
        this.f54553a = t;
        this.f54554b = l82.emptyList();
        this.f54555c = hz8.lazy(g39.f38326b, new ny6() { // from class: ikb
            @Override // p000.ny6
            public final Object invoke() {
                return kkb.descriptor_delegate$lambda$1(str, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0f descriptor_delegate$lambda$1(String str, final kkb kkbVar) {
        return n0f.buildSerialDescriptor(str, xag.C15020d.f97390a, new f0f[0], new qy6() { // from class: jkb
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return kkb.descriptor_delegate$lambda$1$lambda$0(this.f51027a, (l12) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth descriptor_delegate$lambda$1$lambda$0(kkb kkbVar, l12 l12Var) {
        md8.checkNotNullParameter(l12Var, "$this$buildSerialDescriptor");
        l12Var.setAnnotations(kkbVar.f54554b);
        return bth.f14751a;
    }

    @Override // p000.t74
    @yfb
    public T deserialize(@yfb jl3 jl3Var) {
        int iDecodeElementIndex;
        md8.checkNotNullParameter(jl3Var, "decoder");
        f0f descriptor = getDescriptor();
        lm2 lm2VarBeginStructure = jl3Var.beginStructure(descriptor);
        if (lm2VarBeginStructure.decodeSequentially() || (iDecodeElementIndex = lm2VarBeginStructure.decodeElementIndex(getDescriptor())) == -1) {
            bth bthVar = bth.f14751a;
            lm2VarBeginStructure.endStructure(descriptor);
            return this.f54553a;
        }
        throw new d1f("Unexpected index " + iDecodeElementIndex);
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return (f0f) this.f54555c.getValue();
    }

    @Override // p000.e1f
    public void serialize(@yfb m15 m15Var, @yfb T t) {
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(t, "value");
        m15Var.beginStructure(getDescriptor()).endStructure(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yjd
    public kkb(@yfb String str, @yfb T t, @yfb Annotation[] annotationArr) {
        this(str, t);
        md8.checkNotNullParameter(str, "serialName");
        md8.checkNotNullParameter(t, "objectInstance");
        md8.checkNotNullParameter(annotationArr, "classAnnotations");
        this.f54554b = u70.asList(annotationArr);
    }
}
