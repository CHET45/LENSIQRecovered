package p000;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.u0f;
import p000.w3d;

/* JADX INFO: loaded from: classes7.dex */
@nb8
@dwf({"SMAP\nSealedSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,154:1\n1544#2:155\n1246#2,4:165\n53#3:156\n80#3,6:157\n462#4:163\n412#4:164\n82#5:169\n216#6,2:170\n*S KotlinDebug\n*F\n+ 1 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n*L\n130#1:155\n140#1:165,4\n131#1:156\n131#1:157,6\n140#1:163\n140#1:164\n151#1:169\n109#1:170,2\n*E\n"})
public final class nse<T> extends AbstractC12880t3<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final oo8<T> f65520a;

    /* JADX INFO: renamed from: b */
    @yfb
    public List<? extends Annotation> f65521b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final fx8 f65522c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final Map<oo8<? extends T>, lp8<? extends T>> f65523d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final Map<String, lp8<? extends T>> f65524e;

    /* JADX INFO: renamed from: nse$a */
    @dwf({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1\n+ 2 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n*L\n1#1,1546:1\n130#2:1547\n*E\n"})
    public static final class C10044a implements wb7<Map.Entry<? extends oo8<? extends T>, ? extends lp8<? extends T>>, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterable f65525a;

        public C10044a(Iterable iterable) {
            this.f65525a = iterable;
        }

        @Override // p000.wb7
        public String keyOf(Map.Entry<? extends oo8<? extends T>, ? extends lp8<? extends T>> entry) {
            return entry.getValue().getDescriptor().getSerialName();
        }

        @Override // p000.wb7
        public Iterator<Map.Entry<? extends oo8<? extends T>, ? extends lp8<? extends T>>> sourceIterator() {
            return this.f65525a.iterator();
        }
    }

    public nse(@yfb final String str, @yfb oo8<T> oo8Var, @yfb oo8<? extends T>[] oo8VarArr, @yfb lp8<? extends T>[] lp8VarArr) {
        md8.checkNotNullParameter(str, "serialName");
        md8.checkNotNullParameter(oo8Var, "baseClass");
        md8.checkNotNullParameter(oo8VarArr, "subclasses");
        md8.checkNotNullParameter(lp8VarArr, "subclassSerializers");
        this.f65520a = oo8Var;
        this.f65521b = l82.emptyList();
        this.f65522c = hz8.lazy(g39.f38326b, new ny6() { // from class: kse
            @Override // p000.ny6
            public final Object invoke() {
                return nse.descriptor_delegate$lambda$3(str, this);
            }
        });
        if (oo8VarArr.length != lp8VarArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + getBaseClass().getSimpleName() + " should be marked @Serializable");
        }
        Map<oo8<? extends T>, lp8<? extends T>> map = xt9.toMap(e80.zip(oo8VarArr, lp8VarArr));
        this.f65523d = map;
        wb7 c10044a = new C10044a(map.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itSourceIterator = c10044a.sourceIterator();
        while (itSourceIterator.hasNext()) {
            T next = itSourceIterator.next();
            Object objKeyOf = c10044a.keyOf(next);
            Object obj = linkedHashMap.get(objKeyOf);
            if (obj == null) {
                linkedHashMap.containsKey(objKeyOf);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str2 = (String) objKeyOf;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + getBaseClass() + "' have the same serial name '" + str2 + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(objKeyOf, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(wt9.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (lp8) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f65524e = linkedHashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0f descriptor_delegate$lambda$3(String str, final nse nseVar) {
        return n0f.buildSerialDescriptor(str, w3d.C14372b.f93180a, new f0f[0], new qy6() { // from class: lse
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return nse.descriptor_delegate$lambda$3$lambda$2(this.f58622a, (l12) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth descriptor_delegate$lambda$3$lambda$2(final nse nseVar, l12 l12Var) {
        md8.checkNotNullParameter(l12Var, "$this$buildSerialDescriptor");
        l12.element$default(l12Var, "type", hg1.serializer(l7g.f56714a).getDescriptor(), null, false, 12, null);
        l12.element$default(l12Var, "value", n0f.buildSerialDescriptor("kotlinx.serialization.Sealed<" + nseVar.getBaseClass().getSimpleName() + '>', u0f.C13311a.f86522a, new f0f[0], new qy6() { // from class: mse
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return nse.descriptor_delegate$lambda$3$lambda$2$lambda$1(this.f61955a, (l12) obj);
            }
        }), null, false, 12, null);
        l12Var.setAnnotations(nseVar.f65521b);
        return bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth descriptor_delegate$lambda$3$lambda$2$lambda$1(nse nseVar, l12 l12Var) {
        md8.checkNotNullParameter(l12Var, "$this$buildSerialDescriptor");
        for (Map.Entry<String, lp8<? extends T>> entry : nseVar.f65524e.entrySet()) {
            l12.element$default(l12Var, entry.getKey(), entry.getValue().getDescriptor(), null, false, 12, null);
        }
        return bth.f14751a;
    }

    @Override // p000.AbstractC12880t3
    @gib
    public t74<T> findPolymorphicSerializerOrNull(@yfb lm2 lm2Var, @gib String str) {
        md8.checkNotNullParameter(lm2Var, "decoder");
        lp8<? extends T> lp8Var = this.f65524e.get(str);
        return lp8Var != null ? lp8Var : super.findPolymorphicSerializerOrNull(lm2Var, str);
    }

    @Override // p000.AbstractC12880t3
    @yfb
    public oo8<T> getBaseClass() {
        return this.f65520a;
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return (f0f) this.f65522c.getValue();
    }

    @Override // p000.AbstractC12880t3
    @gib
    public e1f<T> findPolymorphicSerializerOrNull(@yfb m15 m15Var, @yfb T t) {
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(t, "value");
        lp8<? extends T> lp8VarFindPolymorphicSerializerOrNull = this.f65523d.get(vvd.getOrCreateKotlinClass(t.getClass()));
        if (lp8VarFindPolymorphicSerializerOrNull == null) {
            lp8VarFindPolymorphicSerializerOrNull = super.findPolymorphicSerializerOrNull(m15Var, t);
        }
        if (lp8VarFindPolymorphicSerializerOrNull != null) {
            return lp8VarFindPolymorphicSerializerOrNull;
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yjd
    public nse(@yfb String str, @yfb oo8<T> oo8Var, @yfb oo8<? extends T>[] oo8VarArr, @yfb lp8<? extends T>[] lp8VarArr, @yfb Annotation[] annotationArr) {
        this(str, oo8Var, oo8VarArr, lp8VarArr);
        md8.checkNotNullParameter(str, "serialName");
        md8.checkNotNullParameter(oo8Var, "baseClass");
        md8.checkNotNullParameter(oo8VarArr, "subclasses");
        md8.checkNotNullParameter(lp8VarArr, "subclassSerializers");
        md8.checkNotNullParameter(annotationArr, "classAnnotations");
        this.f65521b = u70.asList(annotationArr);
    }
}
