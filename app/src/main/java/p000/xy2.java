package p000;

import java.lang.annotation.Annotation;
import java.util.List;
import p000.u0f;

/* JADX INFO: loaded from: classes7.dex */
@ph5
public final class xy2<T> implements lp8<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final oo8<T> f99650a;

    /* JADX INFO: renamed from: b */
    @gib
    public final lp8<T> f99651b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final List<lp8<?>> f99652c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final f0f f99653d;

    public xy2(@yfb oo8<T> oo8Var, @gib lp8<T> lp8Var, @yfb lp8<?>[] lp8VarArr) {
        md8.checkNotNullParameter(oo8Var, "serializableClass");
        md8.checkNotNullParameter(lp8VarArr, "typeArgumentsSerializers");
        this.f99650a = oo8Var;
        this.f99651b = lp8Var;
        this.f99652c = u70.asList(lp8VarArr);
        this.f99653d = kx2.withContext(n0f.buildSerialDescriptor("kotlinx.serialization.ContextualSerializer", u0f.C13311a.f86522a, new f0f[0], new qy6() { // from class: wy2
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return xy2.descriptor$lambda$0(this.f95697a, (l12) obj);
            }
        }), oo8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth descriptor$lambda$0(xy2 xy2Var, l12 l12Var) {
        f0f descriptor;
        md8.checkNotNullParameter(l12Var, "$this$buildSerialDescriptor");
        lp8<T> lp8Var = xy2Var.f99651b;
        List<Annotation> annotations = (lp8Var == null || (descriptor = lp8Var.getDescriptor()) == null) ? null : descriptor.getAnnotations();
        if (annotations == null) {
            annotations = l82.emptyList();
        }
        l12Var.setAnnotations(annotations);
        return bth.f14751a;
    }

    private final lp8<T> serializer(n2f n2fVar) {
        lp8<T> contextual = n2fVar.getContextual(this.f99650a, this.f99652c);
        if (contextual != null || (contextual = this.f99651b) != null) {
            return contextual;
        }
        hyc.serializerNotRegistered(this.f99650a);
        throw new us8();
    }

    @Override // p000.t74
    @yfb
    public T deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return (T) jl3Var.decodeSerializableValue(serializer(jl3Var.getSerializersModule()));
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return this.f99653d;
    }

    @Override // p000.e1f
    public void serialize(@yfb m15 m15Var, @yfb T t) {
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(t, "value");
        m15Var.encodeSerializableValue(serializer(m15Var.getSerializersModule()), t);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xy2(@yfb oo8<T> oo8Var) {
        this(oo8Var, null, j1d.f49358a);
        md8.checkNotNullParameter(oo8Var, "serializableClass");
    }
}
