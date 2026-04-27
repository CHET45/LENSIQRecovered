package p000;

import java.util.Iterator;
import java.util.Map;
import p000.lm2;

/* JADX INFO: loaded from: classes7.dex */
@nb8
@dwf({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/MapLikeSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 4 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,283:1\n1#2:284\n488#3,2:285\n490#3,2:289\n32#4,2:287\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/MapLikeSerializer\n*L\n118#1:285,2\n118#1:289,2\n121#1:287,2\n*E\n"})
public abstract class et9<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractC10728p0<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final lp8<Key> f34007a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final lp8<Value> f34008b;

    public /* synthetic */ et9(lp8 lp8Var, lp8 lp8Var2, jt3 jt3Var) {
        this(lp8Var, lp8Var2);
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void readAll(@yfb lm2 lm2Var, @yfb Builder builder, int i, int i2) {
        md8.checkNotNullParameter(lm2Var, "decoder");
        md8.checkNotNullParameter(builder, "builder");
        if (i2 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        d78 d78VarStep = kpd.step(kpd.until(0, i2 * 2), 2);
        int first = d78VarStep.getFirst();
        int last = d78VarStep.getLast();
        int step = d78VarStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return;
        }
        while (true) {
            readElement(lm2Var, i + first, builder, false);
            if (first == last) {
                return;
            } else {
                first += step;
            }
        }
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void readElement(@yfb lm2 lm2Var, int i, @yfb Builder builder, boolean z) {
        int iDecodeElementIndex;
        md8.checkNotNullParameter(lm2Var, "decoder");
        md8.checkNotNullParameter(builder, "builder");
        Object objDecodeSerializableElement$default = lm2.C8896b.decodeSerializableElement$default(lm2Var, getDescriptor(), i, this.f34007a, null, 8, null);
        if (z) {
            iDecodeElementIndex = lm2Var.decodeElementIndex(getDescriptor());
            if (iDecodeElementIndex != i + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i + ", returned index for value: " + iDecodeElementIndex).toString());
            }
        } else {
            iDecodeElementIndex = i + 1;
        }
        int i2 = iDecodeElementIndex;
        builder.put(objDecodeSerializableElement$default, (!builder.containsKey(objDecodeSerializableElement$default) || (this.f34008b.getDescriptor().getKind() instanceof jbd)) ? lm2.C8896b.decodeSerializableElement$default(lm2Var, getDescriptor(), i2, this.f34008b, null, 8, null) : lm2Var.decodeSerializableElement(getDescriptor(), i2, this.f34008b, xt9.getValue(builder, objDecodeSerializableElement$default)));
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public abstract f0f getDescriptor();

    @yfb
    public final lp8<Key> getKeySerializer() {
        return this.f34007a;
    }

    @yfb
    public final lp8<Value> getValueSerializer() {
        return this.f34008b;
    }

    public abstract void insertKeyValuePair(@yfb Builder builder, int i, Key key, Value value);

    @Override // p000.AbstractC10728p0, p000.e1f
    public void serialize(@yfb m15 m15Var, Collection collection) {
        md8.checkNotNullParameter(m15Var, "encoder");
        int iCollectionSize = collectionSize(collection);
        f0f descriptor = getDescriptor();
        om2 om2VarBeginCollection = m15Var.beginCollection(descriptor, iCollectionSize);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itCollectionIterator = collectionIterator(collection);
        int i = 0;
        while (itCollectionIterator.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itCollectionIterator.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i2 = i + 1;
            om2VarBeginCollection.encodeSerializableElement(getDescriptor(), i, getKeySerializer(), key);
            i += 2;
            om2VarBeginCollection.encodeSerializableElement(getDescriptor(), i2, getValueSerializer(), value);
        }
        om2VarBeginCollection.endStructure(descriptor);
    }

    private et9(lp8<Key> lp8Var, lp8<Value> lp8Var2) {
        super(null);
        this.f34007a = lp8Var;
        this.f34008b = lp8Var2;
    }
}
