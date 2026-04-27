package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,507:1\n488#1,2:508\n490#1,2:513\n1872#2,3:510\n*S KotlinDebug\n*F\n+ 1 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n*L\n501#1:508,2\n501#1:513,2\n502#1:510,3\n*E\n"})
public final class u15 {
    public static final void encodeCollection(@yfb m15 m15Var, @yfb f0f f0fVar, int i, @yfb qy6<? super om2, bth> qy6Var) {
        md8.checkNotNullParameter(m15Var, "<this>");
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(qy6Var, "block");
        om2 om2VarBeginCollection = m15Var.beginCollection(f0fVar, i);
        qy6Var.invoke(om2VarBeginCollection);
        om2VarBeginCollection.endStructure(f0fVar);
    }

    public static final void encodeStructure(@yfb m15 m15Var, @yfb f0f f0fVar, @yfb qy6<? super om2, bth> qy6Var) {
        md8.checkNotNullParameter(m15Var, "<this>");
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(qy6Var, "block");
        om2 om2VarBeginStructure = m15Var.beginStructure(f0fVar);
        qy6Var.invoke(om2VarBeginStructure);
        om2VarBeginStructure.endStructure(f0fVar);
    }

    public static final <E> void encodeCollection(@yfb m15 m15Var, @yfb f0f f0fVar, @yfb Collection<? extends E> collection, @yfb kz6<? super om2, ? super Integer, ? super E, bth> kz6Var) {
        md8.checkNotNullParameter(m15Var, "<this>");
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(collection, "collection");
        md8.checkNotNullParameter(kz6Var, "block");
        om2 om2VarBeginCollection = m15Var.beginCollection(f0fVar, collection.size());
        Iterator<T> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            InterfaceC0000a interfaceC0000a = (Object) it.next();
            int i2 = i + 1;
            if (i < 0) {
                l82.throwIndexOverflow();
            }
            kz6Var.invoke(om2VarBeginCollection, Integer.valueOf(i), interfaceC0000a);
            i = i2;
        }
        om2VarBeginCollection.endStructure(f0fVar);
    }
}
