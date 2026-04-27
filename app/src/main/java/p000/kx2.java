package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nkotlinx/serialization/descriptors/ContextAwareKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1#2:112\n1557#3:113\n1628#3,3:114\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nkotlinx/serialization/descriptors/ContextAwareKt\n*L\n76#1:113\n76#1:114,3\n*E\n"})
public final class kx2 {
    @gib
    public static final oo8<?> getCapturedKClass(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "<this>");
        if (f0fVar instanceof mx2) {
            return ((mx2) f0fVar).f62597b;
        }
        if (f0fVar instanceof g0f) {
            return getCapturedKClass(((g0f) f0fVar).getOriginal$kotlinx_serialization_core());
        }
        return null;
    }

    @ph5
    public static /* synthetic */ void getCapturedKClass$annotations(f0f f0fVar) {
    }

    @gib
    @ph5
    public static final f0f getContextualDescriptor(@yfb n2f n2fVar, @yfb f0f f0fVar) {
        lp8 contextual$default;
        md8.checkNotNullParameter(n2fVar, "<this>");
        md8.checkNotNullParameter(f0fVar, "descriptor");
        oo8<?> capturedKClass = getCapturedKClass(f0fVar);
        if (capturedKClass == null || (contextual$default = n2f.getContextual$default(n2fVar, capturedKClass, null, 2, null)) == null) {
            return null;
        }
        return contextual$default.getDescriptor();
    }

    @ph5
    @yfb
    public static final List<f0f> getPolymorphicDescriptors(@yfb n2f n2fVar, @yfb f0f f0fVar) {
        md8.checkNotNullParameter(n2fVar, "<this>");
        md8.checkNotNullParameter(f0fVar, "descriptor");
        oo8<?> capturedKClass = getCapturedKClass(f0fVar);
        if (capturedKClass == null) {
            return l82.emptyList();
        }
        Map<oo8<?>, lp8<?>> map = ((v0f) n2fVar).f89627b.get(capturedKClass);
        List listValues = map != null ? map.values() : null;
        if (listValues == null) {
            listValues = l82.emptyList();
        }
        Collection<lp8<?>> collection = listValues;
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((lp8) it.next()).getDescriptor());
        }
        return arrayList;
    }

    @yfb
    public static final f0f withContext(@yfb f0f f0fVar, @yfb oo8<?> oo8Var) {
        md8.checkNotNullParameter(f0fVar, "<this>");
        md8.checkNotNullParameter(oo8Var, "context");
        return new mx2(f0fVar, oo8Var);
    }
}
