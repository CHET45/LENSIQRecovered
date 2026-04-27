package p000;

import java.util.Iterator;
import p000.fbd;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/PrimitiveArraySerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n*L\n1#1,283:1\n488#2,4:284\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/PrimitiveArraySerializer\n*L\n174#1:284,4\n*E\n"})
@yjd
public abstract class hbd<Element, Array, Builder extends fbd<Array>> extends z72<Element, Array, Builder> {

    /* JADX INFO: renamed from: b */
    @yfb
    public final f0f f43099b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbd(@yfb lp8<Element> lp8Var) {
        super(lp8Var, null);
        md8.checkNotNullParameter(lp8Var, "primitiveSerializer");
        this.f43099b = new gbd(lp8Var.getDescriptor());
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Builder builder() {
        return toBuilder(empty());
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int builderSize(@yfb Builder builder) {
        md8.checkNotNullParameter(builder, "<this>");
        return builder.getPosition$kotlinx_serialization_core();
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void checkCapacity(@yfb Builder builder, int i) {
        md8.checkNotNullParameter(builder, "<this>");
        builder.ensureCapacity$kotlinx_serialization_core(i);
    }

    @Override // p000.AbstractC10728p0
    @yfb
    public final Iterator<Element> collectionIterator(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // p000.z72
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void insert(@yfb Builder builder, int i, Element element) {
        md8.checkNotNullParameter(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // p000.AbstractC10728p0, p000.t74
    public final Array deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return merge(jl3Var, null);
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Array toResult(@yfb Builder builder) {
        md8.checkNotNullParameter(builder, "<this>");
        return (Array) builder.build$kotlinx_serialization_core();
    }

    public abstract Array empty();

    @Override // p000.z72, p000.lp8, p000.e1f, p000.t74
    @yfb
    public final f0f getDescriptor() {
        return this.f43099b;
    }

    public abstract void readElement(@yfb lm2 lm2Var, int i, @yfb Builder builder, boolean z);

    @Override // p000.z72, p000.AbstractC10728p0, p000.e1f
    public final void serialize(@yfb m15 m15Var, Array array) {
        md8.checkNotNullParameter(m15Var, "encoder");
        int iCollectionSize = collectionSize(array);
        f0f f0fVar = this.f43099b;
        om2 om2VarBeginCollection = m15Var.beginCollection(f0fVar, iCollectionSize);
        writeContent(om2VarBeginCollection, array, iCollectionSize);
        om2VarBeginCollection.endStructure(f0fVar);
    }

    public abstract void writeContent(@yfb om2 om2Var, Array array, int i);
}
