package p000;

import java.util.Iterator;
import p000.lm2;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/CollectionLikeSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,283:1\n488#2,4:284\n1#3:288\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/CollectionLikeSerializer\n*L\n66#1:284,4\n*E\n"})
@yjd
public abstract class z72<Element, Collection, Builder> extends AbstractC10728p0<Element, Collection, Builder> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final lp8<Element> f104314a;

    public /* synthetic */ z72(lp8 lp8Var, jt3 jt3Var) {
        this(lp8Var);
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public abstract f0f getDescriptor();

    public abstract void insert(Builder builder, int i, Element element);

    @Override // p000.AbstractC10728p0
    public final void readAll(@yfb lm2 lm2Var, Builder builder, int i, int i2) {
        md8.checkNotNullParameter(lm2Var, "decoder");
        if (i2 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            readElement(lm2Var, i + i3, builder, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC10728p0
    public void readElement(@yfb lm2 lm2Var, int i, Builder builder, boolean z) {
        md8.checkNotNullParameter(lm2Var, "decoder");
        insert(builder, i, lm2.C8896b.decodeSerializableElement$default(lm2Var, getDescriptor(), i, this.f104314a, null, 8, null));
    }

    @Override // p000.AbstractC10728p0, p000.e1f
    public void serialize(@yfb m15 m15Var, Collection collection) {
        md8.checkNotNullParameter(m15Var, "encoder");
        int iCollectionSize = collectionSize(collection);
        f0f descriptor = getDescriptor();
        om2 om2VarBeginCollection = m15Var.beginCollection(descriptor, iCollectionSize);
        Iterator<Element> itCollectionIterator = collectionIterator(collection);
        for (int i = 0; i < iCollectionSize; i++) {
            om2VarBeginCollection.encodeSerializableElement(getDescriptor(), i, this.f104314a, itCollectionIterator.next());
        }
        om2VarBeginCollection.endStructure(descriptor);
    }

    private z72(lp8<Element> lp8Var) {
        super(null);
        this.f104314a = lp8Var;
    }
}
