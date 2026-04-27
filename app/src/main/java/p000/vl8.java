package p000;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p000.p74;
import p000.u0f;
import p000.xag;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nJsonNamesMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n808#2,11:153\n13409#3,2:164\n1#4:166\n*S KotlinDebug\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n*L\n35#1:153,11\n35#1:164,2\n*E\n"})
public final class vl8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final p74.C10811a<Map<String, Integer>> f91591a = new p74.C10811a<>();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final p74.C10811a<String[]> f91592b = new p74.C10811a<>();

    /* JADX INFO: renamed from: vl8$a */
    public static final class C14152a implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public static final C14152a f91593a = new C14152a();

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Integer> buildDeserializationNamesMap(f0f f0fVar, bk8 bk8Var) {
        String strSerialNameForJson;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zDecodeCaseInsensitive = decodeCaseInsensitive(bk8Var, f0fVar);
        wl8 wl8VarNamingStrategy = namingStrategy(f0fVar, bk8Var);
        int elementsCount = f0fVar.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            List<Annotation> elementAnnotations = f0fVar.getElementAnnotations(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj : elementAnnotations) {
                if (obj instanceof sl8) {
                    arrayList.add(obj);
                }
            }
            sl8 sl8Var = (sl8) v82.singleOrNull((List) arrayList);
            if (sl8Var != null && (strArrNames = sl8Var.names()) != null) {
                for (String lowerCase : strArrNames) {
                    if (zDecodeCaseInsensitive) {
                        lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                        md8.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    }
                    buildDeserializationNamesMap$putOrThrow(linkedHashMap, f0fVar, lowerCase, i);
                }
            }
            if (zDecodeCaseInsensitive) {
                strSerialNameForJson = f0fVar.getElementName(i).toLowerCase(Locale.ROOT);
                md8.checkNotNullExpressionValue(strSerialNameForJson, "toLowerCase(...)");
            } else {
                strSerialNameForJson = wl8VarNamingStrategy != null ? wl8VarNamingStrategy.serialNameForJson(f0fVar, i, f0fVar.getElementName(i)) : null;
            }
            if (strSerialNameForJson != null) {
                buildDeserializationNamesMap$putOrThrow(linkedHashMap, f0fVar, strSerialNameForJson, i);
            }
        }
        return linkedHashMap.isEmpty() ? xt9.emptyMap() : linkedHashMap;
    }

    private static final void buildDeserializationNamesMap$putOrThrow(Map<String, Integer> map, f0f f0fVar, String str, int i) {
        String str2 = md8.areEqual(f0fVar.getKind(), u0f.C13312b.f86523a) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i));
            return;
        }
        throw new hl8("The suggested name '" + str + "' for " + str2 + ' ' + f0fVar.getElementName(i) + " is already one of the names for " + str2 + ' ' + f0fVar.getElementName(((Number) xt9.getValue(map, str)).intValue()) + " in " + f0fVar);
    }

    private static final boolean decodeCaseInsensitive(bk8 bk8Var, f0f f0fVar) {
        return bk8Var.getConfiguration().getDecodeEnumsCaseInsensitive() && md8.areEqual(f0fVar.getKind(), u0f.C13312b.f86523a);
    }

    @yfb
    public static final Map<String, Integer> deserializationNamesMap(@yfb final bk8 bk8Var, @yfb final f0f f0fVar) {
        md8.checkNotNullParameter(bk8Var, "<this>");
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return (Map) km8.getSchemaCache(bk8Var).getOrPut(f0fVar, f91591a, new ny6() { // from class: tl8
            @Override // p000.ny6
            public final Object invoke() {
                return vl8.buildDeserializationNamesMap(f0fVar, bk8Var);
            }
        });
    }

    @yfb
    public static final p74.C10811a<Map<String, Integer>> getJsonDeserializationNamesKey() {
        return f91591a;
    }

    @yfb
    public static final String getJsonElementName(@yfb f0f f0fVar, @yfb bk8 bk8Var, int i) {
        md8.checkNotNullParameter(f0fVar, "<this>");
        md8.checkNotNullParameter(bk8Var, "json");
        wl8 wl8VarNamingStrategy = namingStrategy(f0fVar, bk8Var);
        return wl8VarNamingStrategy == null ? f0fVar.getElementName(i) : serializationNamesIndices(f0fVar, bk8Var, wl8VarNamingStrategy)[i];
    }

    public static final int getJsonNameIndex(@yfb f0f f0fVar, @yfb bk8 bk8Var, @yfb String str) {
        md8.checkNotNullParameter(f0fVar, "<this>");
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(str, "name");
        if (decodeCaseInsensitive(bk8Var, f0fVar)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            md8.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return getJsonNameIndexSlowPath(f0fVar, bk8Var, lowerCase);
        }
        if (namingStrategy(f0fVar, bk8Var) != null) {
            return getJsonNameIndexSlowPath(f0fVar, bk8Var, str);
        }
        int elementIndex = f0fVar.getElementIndex(str);
        return (elementIndex == -3 && bk8Var.getConfiguration().getUseAlternativeNames()) ? getJsonNameIndexSlowPath(f0fVar, bk8Var, str) : elementIndex;
    }

    public static final int getJsonNameIndexOrThrow(@yfb f0f f0fVar, @yfb bk8 bk8Var, @yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(f0fVar, "<this>");
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(str, "name");
        md8.checkNotNullParameter(str2, "suffix");
        int jsonNameIndex = getJsonNameIndex(f0fVar, bk8Var, str);
        if (jsonNameIndex != -3) {
            return jsonNameIndex;
        }
        throw new d1f(f0fVar.getSerialName() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static /* synthetic */ int getJsonNameIndexOrThrow$default(f0f f0fVar, bk8 bk8Var, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return getJsonNameIndexOrThrow(f0fVar, bk8Var, str, str2);
    }

    private static final int getJsonNameIndexSlowPath(f0f f0fVar, bk8 bk8Var, String str) {
        Integer num = deserializationNamesMap(bk8Var, f0fVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @yfb
    public static final p74.C10811a<String[]> getJsonSerializationNamesKey() {
        return f91592b;
    }

    @gib
    public static final wl8 namingStrategy(@yfb f0f f0fVar, @yfb bk8 bk8Var) {
        md8.checkNotNullParameter(f0fVar, "<this>");
        md8.checkNotNullParameter(bk8Var, "json");
        if (md8.areEqual(f0fVar.getKind(), xag.C15017a.f97387a)) {
            return bk8Var.getConfiguration().getNamingStrategy();
        }
        return null;
    }

    @yfb
    public static final String[] serializationNamesIndices(@yfb final f0f f0fVar, @yfb bk8 bk8Var, @yfb final wl8 wl8Var) {
        md8.checkNotNullParameter(f0fVar, "<this>");
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(wl8Var, "strategy");
        return (String[]) km8.getSchemaCache(bk8Var).getOrPut(f0fVar, f91592b, new ny6() { // from class: ul8
            @Override // p000.ny6
            public final Object invoke() {
                return vl8.serializationNamesIndices$lambda$4(f0fVar, wl8Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] serializationNamesIndices$lambda$4(f0f f0fVar, wl8 wl8Var) {
        int elementsCount = f0fVar.getElementsCount();
        String[] strArr = new String[elementsCount];
        for (int i = 0; i < elementsCount; i++) {
            strArr[i] = wl8Var.serialNameForJson(f0fVar, i, f0fVar.getElementName(i));
        }
        return strArr;
    }

    public static final boolean tryCoerceValue(@yfb bk8 bk8Var, @yfb f0f f0fVar, int i, @yfb qy6<? super Boolean, Boolean> qy6Var, @yfb ny6<String> ny6Var, @yfb ny6<bth> ny6Var2) {
        String strInvoke;
        md8.checkNotNullParameter(bk8Var, "<this>");
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(qy6Var, "peekNull");
        md8.checkNotNullParameter(ny6Var, "peekString");
        md8.checkNotNullParameter(ny6Var2, "onEnumCoercing");
        boolean zIsElementOptional = f0fVar.isElementOptional(i);
        f0f elementDescriptor = f0fVar.getElementDescriptor(i);
        if (zIsElementOptional && !elementDescriptor.isNullable() && qy6Var.invoke(Boolean.TRUE).booleanValue()) {
            return true;
        }
        if (!md8.areEqual(elementDescriptor.getKind(), u0f.C13312b.f86523a) || ((elementDescriptor.isNullable() && qy6Var.invoke(Boolean.FALSE).booleanValue()) || (strInvoke = ny6Var.invoke()) == null)) {
            return false;
        }
        int jsonNameIndex = getJsonNameIndex(elementDescriptor, bk8Var, strInvoke);
        boolean z = !bk8Var.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
        if (jsonNameIndex == -3 && (zIsElementOptional || z)) {
            ny6Var2.invoke();
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean tryCoerceValue$default(bk8 bk8Var, f0f f0fVar, int i, qy6 qy6Var, ny6 ny6Var, ny6 ny6Var2, int i2, Object obj) {
        String str;
        if ((i2 & 16) != 0) {
            ny6Var2 = C14152a.f91593a;
        }
        md8.checkNotNullParameter(bk8Var, "<this>");
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(qy6Var, "peekNull");
        md8.checkNotNullParameter(ny6Var, "peekString");
        md8.checkNotNullParameter(ny6Var2, "onEnumCoercing");
        boolean zIsElementOptional = f0fVar.isElementOptional(i);
        f0f elementDescriptor = f0fVar.getElementDescriptor(i);
        if (zIsElementOptional && !elementDescriptor.isNullable() && ((Boolean) qy6Var.invoke(Boolean.TRUE)).booleanValue()) {
            return true;
        }
        if (!md8.areEqual(elementDescriptor.getKind(), u0f.C13312b.f86523a) || ((elementDescriptor.isNullable() && ((Boolean) qy6Var.invoke(Boolean.FALSE)).booleanValue()) || (str = (String) ny6Var.invoke()) == null)) {
            return false;
        }
        int jsonNameIndex = getJsonNameIndex(elementDescriptor, bk8Var, str);
        boolean z = !bk8Var.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
        if (jsonNameIndex == -3 && (zIsElementOptional || z)) {
            ny6Var2.invoke();
            return true;
        }
        return false;
    }
}
