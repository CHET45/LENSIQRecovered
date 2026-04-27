package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: p0 */
/* JADX INFO: loaded from: classes7.dex */
@nb8
public abstract class AbstractC10728p0<Element, Collection, Builder> implements lp8<Collection> {
    public /* synthetic */ AbstractC10728p0(jt3 jt3Var) {
        this();
    }

    public static /* synthetic */ void readElement$default(AbstractC10728p0 abstractC10728p0, lm2 lm2Var, int i, Object obj, boolean z, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        abstractC10728p0.readElement(lm2Var, i, obj, z);
    }

    private final int readSize(lm2 lm2Var, Builder builder) {
        int iDecodeCollectionSize = lm2Var.decodeCollectionSize(getDescriptor());
        checkCapacity(builder, iDecodeCollectionSize);
        return iDecodeCollectionSize;
    }

    public abstract Builder builder();

    public abstract int builderSize(Builder builder);

    public abstract void checkCapacity(Builder builder, int i);

    @yfb
    public abstract Iterator<Element> collectionIterator(Collection collection);

    public abstract int collectionSize(Collection collection);

    public Collection deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return merge(jl3Var, null);
    }

    @nb8
    public final Collection merge(@yfb jl3 jl3Var, @gib Collection collection) {
        Builder builder;
        md8.checkNotNullParameter(jl3Var, "decoder");
        if (collection == null || (builder = toBuilder(collection)) == null) {
            builder = builder();
        }
        int iBuilderSize = builderSize(builder);
        lm2 lm2VarBeginStructure = jl3Var.beginStructure(getDescriptor());
        if (!lm2VarBeginStructure.decodeSequentially()) {
            while (true) {
                int iDecodeElementIndex = lm2VarBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    break;
                }
                readElement$default(this, lm2VarBeginStructure, iBuilderSize + iDecodeElementIndex, builder, false, 8, null);
            }
        } else {
            readAll(lm2VarBeginStructure, builder, iBuilderSize, readSize(lm2VarBeginStructure, builder));
        }
        lm2VarBeginStructure.endStructure(getDescriptor());
        return toResult(builder);
    }

    public abstract void readAll(@yfb lm2 lm2Var, Builder builder, int i, int i2);

    public abstract void readElement(@yfb lm2 lm2Var, int i, Builder builder, boolean z);

    @Override // p000.e1f
    public abstract void serialize(@yfb m15 m15Var, Collection collection);

    public abstract Builder toBuilder(Collection collection);

    public abstract Collection toResult(Builder builder);

    private AbstractC10728p0() {
    }
}
