package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,421:1\n78#2:422\n78#2:423\n78#2:430\n78#2:431\n1557#3:424\n1628#3,3:425\n1557#3:432\n1628#3,3:433\n1557#3:436\n1628#3,3:437\n78#4:428\n78#4:429\n37#5,2:440\n*S KotlinDebug\n*F\n+ 1 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n*L\n35#1:422\n54#1:423\n232#1:430\n256#1:431\n190#1:424\n190#1:425,3\n267#1:432\n267#1:433,3\n269#1:436\n269#1:437,3\n223#1:428\n230#1:429\n334#1:440,2\n*E\n"})
public final /* synthetic */ class m2f {
    private static final lp8<? extends Object> builtinParametrizedSerializer$SerializersKt__SerializersKt(oo8<Object> oo8Var, List<? extends lp8<Object>> list, ny6<? extends ro8> ny6Var) {
        if (md8.areEqual(oo8Var, vvd.getOrCreateKotlinClass(Collection.class)) || md8.areEqual(oo8Var, vvd.getOrCreateKotlinClass(List.class)) || md8.areEqual(oo8Var, vvd.getOrCreateKotlinClass(List.class)) || md8.areEqual(oo8Var, vvd.getOrCreateKotlinClass(ArrayList.class))) {
            return new t60(list.get(0));
        }
        if (md8.areEqual(oo8Var, vvd.getOrCreateKotlinClass(HashSet.class))) {
            return new uh7(list.get(0));
        }
        if (md8.areEqual(oo8Var, vvd.getOrCreateKotlinClass(Set.class)) || md8.areEqual(oo8Var, vvd.getOrCreateKotlinClass(Set.class)) || md8.areEqual(oo8Var, vvd.getOrCreateKotlinClass(LinkedHashSet.class))) {
            return new u79(list.get(0));
        }
        if (md8.areEqual(oo8Var, vvd.getOrCreateKotlinClass(HashMap.class))) {
            return new nh7(list.get(0), list.get(1));
        }
        if (md8.areEqual(oo8Var, vvd.getOrCreateKotlinClass(Map.class)) || md8.areEqual(oo8Var, vvd.getOrCreateKotlinClass(Map.class)) || md8.areEqual(oo8Var, vvd.getOrCreateKotlinClass(LinkedHashMap.class))) {
            return new p79(list.get(0), list.get(1));
        }
        if (md8.areEqual(oo8Var, vvd.getOrCreateKotlinClass(Map.Entry.class))) {
            return hg1.MapEntrySerializer(list.get(0), list.get(1));
        }
        if (md8.areEqual(oo8Var, vvd.getOrCreateKotlinClass(scc.class))) {
            return hg1.PairSerializer(list.get(0), list.get(1));
        }
        if (md8.areEqual(oo8Var, vvd.getOrCreateKotlinClass(djh.class))) {
            return hg1.TripleSerializer(list.get(0), list.get(1), list.get(2));
        }
        if (!exc.isReferenceArray(oo8Var)) {
            return null;
        }
        ro8 ro8VarInvoke = ny6Var.invoke();
        md8.checkNotNull(ro8VarInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return hg1.ArraySerializer((oo8) ro8VarInvoke, list.get(0));
    }

    private static final lp8<? extends Object> compiledParametrizedSerializer$SerializersKt__SerializersKt(oo8<Object> oo8Var, List<? extends lp8<Object>> list) {
        lp8[] lp8VarArr = (lp8[]) list.toArray(new lp8[0]);
        return exc.constructSerializerForGivenTypeArgs(oo8Var, (lp8<Object>[]) Arrays.copyOf(lp8VarArr, lp8VarArr.length));
    }

    @yfb
    @yjd
    public static final lp8<?> moduleThenPolymorphic(@yfb n2f n2fVar, @yfb oo8<?> oo8Var) {
        md8.checkNotNullParameter(n2fVar, "module");
        md8.checkNotNullParameter(oo8Var, "kClass");
        lp8<?> contextual$default = n2f.getContextual$default(n2fVar, oo8Var, null, 2, null);
        return contextual$default == null ? new d4d(oo8Var) : contextual$default;
    }

    @yfb
    @yjd
    public static final lp8<?> noCompiledSerializer(@yfb String str) {
        md8.checkNotNullParameter(str, "forClass");
        throw new d1f(hyc.notRegisteredMessage(str));
    }

    private static final <T> lp8<T> nullable$SerializersKt__SerializersKt(lp8<T> lp8Var, boolean z) {
        if (z) {
            return hg1.getNullable(lp8Var);
        }
        md8.checkNotNull(lp8Var, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return lp8Var;
    }

    @gib
    public static final lp8<? extends Object> parametrizedSerializerOrNull(@yfb oo8<Object> oo8Var, @yfb List<? extends lp8<Object>> list, @yfb ny6<? extends ro8> ny6Var) {
        md8.checkNotNullParameter(oo8Var, "<this>");
        md8.checkNotNullParameter(list, "serializers");
        md8.checkNotNullParameter(ny6Var, "elementClassifierIfArray");
        lp8<? extends Object> lp8VarBuiltinParametrizedSerializer$SerializersKt__SerializersKt = builtinParametrizedSerializer$SerializersKt__SerializersKt(oo8Var, list, ny6Var);
        return lp8VarBuiltinParametrizedSerializer$SerializersKt__SerializersKt == null ? compiledParametrizedSerializer$SerializersKt__SerializersKt(oo8Var, list) : lp8VarBuiltinParametrizedSerializer$SerializersKt__SerializersKt;
    }

    public static final /* synthetic */ <T> lp8<T> serializer() {
        md8.reifiedOperationMarker(6, "T");
        lp8<T> lp8Var = (lp8<T>) i2f.serializer((mp8) null);
        md8.checkNotNull(lp8Var, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return lp8Var;
    }

    private static final lp8<Object> serializerByKClassImpl$SerializersKt__SerializersKt(n2f n2fVar, oo8<Object> oo8Var, List<? extends lp8<Object>> list, boolean z) {
        lp8<? extends Object> contextual;
        if (list.isEmpty()) {
            contextual = i2f.serializerOrNull(oo8Var);
            if (contextual == null) {
                contextual = n2f.getContextual$default(n2fVar, oo8Var, null, 2, null);
            }
        } else {
            try {
                lp8<? extends Object> lp8VarParametrizedSerializerOrNull = i2f.parametrizedSerializerOrNull(oo8Var, list, new ny6() { // from class: k2f
                    @Override // p000.ny6
                    public final Object invoke() {
                        return m2f.serializerByKClassImpl$lambda$1$SerializersKt__SerializersKt();
                    }
                });
                contextual = lp8VarParametrizedSerializerOrNull == null ? n2fVar.getContextual(oo8Var, list) : lp8VarParametrizedSerializerOrNull;
            } catch (IndexOutOfBoundsException e) {
                throw new d1f("Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", e);
            }
        }
        if (contextual != null) {
            return nullable$SerializersKt__SerializersKt(contextual, z);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ro8 serializerByKClassImpl$lambda$1$SerializersKt__SerializersKt() {
        throw new d1f("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final p000.lp8<java.lang.Object> serializerByKTypeImpl$SerializersKt__SerializersKt(p000.n2f r6, p000.mp8 r7, boolean r8) {
        /*
            oo8 r0 = p000.hyc.kclass(r7)
            boolean r1 = r7.isMarkedNullable()
            java.util.List r7 = r7.getArguments()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p000.m82.collectionSizeOrDefault(r7, r3)
            r2.<init>(r3)
            java.util.Iterator r7 = r7.iterator()
        L1d:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r7.next()
            pp8 r3 = (p000.pp8) r3
            mp8 r3 = p000.hyc.typeOrThrow(r3)
            r2.add(r3)
            goto L1d
        L31:
            boolean r7 = r2.isEmpty()
            r3 = 2
            r4 = 0
            if (r7 == 0) goto L4c
            boolean r7 = p000.exc.isInterface(r0)
            if (r7 == 0) goto L47
            lp8 r7 = p000.n2f.getContextual$default(r6, r0, r4, r3, r4)
            if (r7 == 0) goto L47
        L45:
            r7 = r4
            goto L60
        L47:
            lp8 r7 = p000.h2f.findCachedSerializer(r0, r1)
            goto L60
        L4c:
            boolean r7 = r6.getHasInterfaceContextualSerializers$kotlinx_serialization_core()
            if (r7 == 0) goto L53
            goto L45
        L53:
            java.lang.Object r7 = p000.h2f.findParametrizedCachedSerializer(r0, r2, r1)
            boolean r5 = p000.v7e.m32729isFailureimpl(r7)
            if (r5 == 0) goto L5e
            r7 = r4
        L5e:
            lp8 r7 = (p000.lp8) r7
        L60:
            if (r7 == 0) goto L63
            return r7
        L63:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L84
            lp8 r7 = p000.i2f.serializerOrNull(r0)
            if (r7 != 0) goto La9
            lp8 r7 = p000.n2f.getContextual$default(r6, r0, r4, r3, r4)
            if (r7 != 0) goto La9
            boolean r6 = p000.exc.isInterface(r0)
            if (r6 == 0) goto L82
            d4d r6 = new d4d
            r6.<init>(r0)
        L80:
            r7 = r6
            goto La9
        L82:
            r7 = r4
            goto La9
        L84:
            java.util.List r7 = p000.i2f.serializersForParameters(r6, r2, r8)
            if (r7 != 0) goto L8b
            return r4
        L8b:
            l2f r8 = new l2f
            r8.<init>()
            lp8 r8 = p000.i2f.parametrizedSerializerOrNull(r0, r7, r8)
            if (r8 != 0) goto La8
            lp8 r7 = r6.getContextual(r0, r7)
            if (r7 != 0) goto La9
            boolean r6 = p000.exc.isInterface(r0)
            if (r6 == 0) goto L82
            d4d r6 = new d4d
            r6.<init>(r0)
            goto L80
        La8:
            r7 = r8
        La9:
            if (r7 == 0) goto Laf
            lp8 r4 = nullable$SerializersKt__SerializersKt(r7, r1)
        Laf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m2f.serializerByKTypeImpl$SerializersKt__SerializersKt(n2f, mp8, boolean):lp8");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ro8 serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt(List list) {
        return ((mp8) list.get(0)).getClassifier();
    }

    @gib
    public static final lp8<Object> serializerOrNull(@yfb mp8 mp8Var) {
        md8.checkNotNullParameter(mp8Var, "type");
        return i2f.serializerOrNull(p2f.EmptySerializersModule(), mp8Var);
    }

    @gib
    public static final List<lp8<Object>> serializersForParameters(@yfb n2f n2fVar, @yfb List<? extends mp8> list, boolean z) {
        ArrayList arrayList;
        md8.checkNotNullParameter(n2fVar, "<this>");
        md8.checkNotNullParameter(list, "typeArguments");
        if (z) {
            List<? extends mp8> list2 = list;
            arrayList = new ArrayList(m82.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(i2f.serializer(n2fVar, (mp8) it.next()));
            }
        } else {
            List<? extends mp8> list3 = list;
            arrayList = new ArrayList(m82.collectionSizeOrDefault(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                lp8<Object> lp8VarSerializerOrNull = i2f.serializerOrNull(n2fVar, (mp8) it2.next());
                if (lp8VarSerializerOrNull == null) {
                    return null;
                }
                arrayList.add(lp8VarSerializerOrNull);
            }
        }
        return arrayList;
    }

    @yfb
    @yjd
    public static final lp8<?> moduleThenPolymorphic(@yfb n2f n2fVar, @yfb oo8<?> oo8Var, @yfb lp8<?>[] lp8VarArr) {
        md8.checkNotNullParameter(n2fVar, "module");
        md8.checkNotNullParameter(oo8Var, "kClass");
        md8.checkNotNullParameter(lp8VarArr, "argSerializers");
        lp8<?> contextual = n2fVar.getContextual(oo8Var, u70.asList(lp8VarArr));
        return contextual == null ? new d4d(oo8Var) : contextual;
    }

    @yfb
    @yjd
    public static final lp8<?> noCompiledSerializer(@yfb n2f n2fVar, @yfb oo8<?> oo8Var) {
        md8.checkNotNullParameter(n2fVar, "module");
        md8.checkNotNullParameter(oo8Var, "kClass");
        lp8<?> contextual$default = n2f.getContextual$default(n2fVar, oo8Var, null, 2, null);
        if (contextual$default != null) {
            return contextual$default;
        }
        hyc.serializerNotRegistered(oo8Var);
        throw new us8();
    }

    @gib
    public static final lp8<Object> serializerOrNull(@yfb n2f n2fVar, @yfb mp8 mp8Var) {
        md8.checkNotNullParameter(n2fVar, "<this>");
        md8.checkNotNullParameter(mp8Var, "type");
        return serializerByKTypeImpl$SerializersKt__SerializersKt(n2fVar, mp8Var, false);
    }

    @yfb
    @yjd
    public static final lp8<?> noCompiledSerializer(@yfb n2f n2fVar, @yfb oo8<?> oo8Var, @yfb lp8<?>[] lp8VarArr) {
        md8.checkNotNullParameter(n2fVar, "module");
        md8.checkNotNullParameter(oo8Var, "kClass");
        md8.checkNotNullParameter(lp8VarArr, "argSerializers");
        lp8<?> contextual = n2fVar.getContextual(oo8Var, u70.asList(lp8VarArr));
        if (contextual != null) {
            return contextual;
        }
        hyc.serializerNotRegistered(oo8Var);
        throw new us8();
    }

    public static final /* synthetic */ <T> lp8<T> serializer(n2f n2fVar) {
        md8.checkNotNullParameter(n2fVar, "<this>");
        md8.reifiedOperationMarker(6, "T");
        lp8<T> lp8Var = (lp8<T>) i2f.serializer(n2fVar, (mp8) null);
        md8.checkNotNull(lp8Var, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return lp8Var;
    }

    @gib
    @nb8
    public static final <T> lp8<T> serializerOrNull(@yfb oo8<T> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "<this>");
        lp8<T> lp8VarCompiledSerializerImpl = exc.compiledSerializerImpl(oo8Var);
        return lp8VarCompiledSerializerImpl == null ? ubd.builtinSerializerOrNull(oo8Var) : lp8VarCompiledSerializerImpl;
    }

    @yfb
    public static final lp8<Object> serializer(@yfb mp8 mp8Var) {
        md8.checkNotNullParameter(mp8Var, "type");
        return i2f.serializer(p2f.EmptySerializersModule(), mp8Var);
    }

    @ph5
    @yfb
    public static final lp8<Object> serializer(@yfb oo8<?> oo8Var, @yfb List<? extends lp8<?>> list, boolean z) {
        md8.checkNotNullParameter(oo8Var, "kClass");
        md8.checkNotNullParameter(list, "typeArgumentsSerializers");
        return i2f.serializer(p2f.EmptySerializersModule(), oo8Var, list, z);
    }

    @yfb
    public static final lp8<Object> serializer(@yfb n2f n2fVar, @yfb mp8 mp8Var) {
        md8.checkNotNullParameter(n2fVar, "<this>");
        md8.checkNotNullParameter(mp8Var, "type");
        lp8<Object> lp8VarSerializerByKTypeImpl$SerializersKt__SerializersKt = serializerByKTypeImpl$SerializersKt__SerializersKt(n2fVar, mp8Var, true);
        if (lp8VarSerializerByKTypeImpl$SerializersKt__SerializersKt != null) {
            return lp8VarSerializerByKTypeImpl$SerializersKt__SerializersKt;
        }
        exc.platformSpecificSerializerNotRegistered(hyc.kclass(mp8Var));
        throw new us8();
    }

    @ph5
    @yfb
    public static final lp8<Object> serializer(@yfb n2f n2fVar, @yfb oo8<?> oo8Var, @yfb List<? extends lp8<?>> list, boolean z) {
        md8.checkNotNullParameter(n2fVar, "<this>");
        md8.checkNotNullParameter(oo8Var, "kClass");
        md8.checkNotNullParameter(list, "typeArgumentsSerializers");
        lp8<Object> lp8VarSerializerByKClassImpl$SerializersKt__SerializersKt = serializerByKClassImpl$SerializersKt__SerializersKt(n2fVar, oo8Var, list, z);
        if (lp8VarSerializerByKClassImpl$SerializersKt__SerializersKt != null) {
            return lp8VarSerializerByKClassImpl$SerializersKt__SerializersKt;
        }
        exc.platformSpecificSerializerNotRegistered(oo8Var);
        throw new us8();
    }

    @nb8
    @yfb
    public static final <T> lp8<T> serializer(@yfb oo8<T> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "<this>");
        lp8<T> lp8VarSerializerOrNull = i2f.serializerOrNull(oo8Var);
        if (lp8VarSerializerOrNull != null) {
            return lp8VarSerializerOrNull;
        }
        hyc.serializerNotRegistered(oo8Var);
        throw new us8();
    }
}
