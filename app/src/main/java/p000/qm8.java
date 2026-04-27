package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.u0f;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonTreeDecoder\n+ 2 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 3 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt$tryCoerceValue$1\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n+ 6 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n*L\n1#1,334:1\n125#2,22:335\n147#2,4:358\n131#3:357\n1#4:362\n74#5:363\n271#6,8:364\n*S KotlinDebug\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonTreeDecoder\n*L\n200#1:335,22\n200#1:358,4\n200#1:357\n262#1:363\n262#1:364,8\n*E\n"})
public class qm8 extends AbstractC5049e2 {

    /* JADX INFO: renamed from: j */
    @yfb
    public final am8 f74917j;

    /* JADX INFO: renamed from: k */
    @gib
    public final f0f f74918k;

    /* JADX INFO: renamed from: l */
    public int f74919l;

    /* JADX INFO: renamed from: m */
    public boolean f74920m;

    public /* synthetic */ qm8(bk8 bk8Var, am8 am8Var, String str, f0f f0fVar, int i, jt3 jt3Var) {
        this(bk8Var, am8Var, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : f0fVar);
    }

    private final boolean absenceIsNull(f0f f0fVar, int i) {
        boolean z = (getJson().getConfiguration().getExplicitNulls() || f0fVar.isElementOptional(i) || !f0fVar.getElementDescriptor(i).isNullable()) ? false : true;
        this.f74920m = z;
        return z;
    }

    private final boolean coerceInputValue(f0f f0fVar, int i, String str) {
        bk8 json = getJson();
        boolean zIsElementOptional = f0fVar.isElementOptional(i);
        f0f elementDescriptor = f0fVar.getElementDescriptor(i);
        if (zIsElementOptional && !elementDescriptor.isNullable() && (mo9628o(str) instanceof xl8)) {
            return true;
        }
        if (md8.areEqual(elementDescriptor.getKind(), u0f.C13312b.f86523a) && (!elementDescriptor.isNullable() || !(mo9628o(str) instanceof xl8))) {
            sk8 sk8VarMo9628o = mo9628o(str);
            fm8 fm8Var = sk8VarMo9628o instanceof fm8 ? (fm8) sk8VarMo9628o : null;
            String contentOrNull = fm8Var != null ? uk8.getContentOrNull(fm8Var) : null;
            if (contentOrNull != null) {
                int jsonNameIndex = vl8.getJsonNameIndex(elementDescriptor, json, contentOrNull);
                boolean z = !json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
                if (jsonNameIndex == -3 && (zIsElementOptional || z)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.AbstractC5049e2, p000.wlg, p000.jl3
    @yfb
    public lm2 beginStructure(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        if (f0fVar != this.f74918k) {
            return super.beginStructure(f0fVar);
        }
        bk8 json = getJson();
        sk8 sk8VarM9629p = m9629p();
        String serialName = this.f74918k.getSerialName();
        if (sk8VarM9629p instanceof am8) {
            return new qm8(json, (am8) sk8VarM9629p, m9625D(), this.f74918k);
        }
        throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(am8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarM9629p.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + m11447n(), sk8VarM9629p.toString());
    }

    @Override // p000.lm2
    public int decodeElementIndex(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        while (this.f74919l < f0fVar.getElementsCount()) {
            int i = this.f74919l;
            this.f74919l = i + 1;
            String tag = getTag(f0fVar, i);
            int i2 = this.f74919l - 1;
            this.f74920m = false;
            if (getValue().containsKey((Object) tag) || absenceIsNull(f0fVar, i2)) {
                if (!this.f31579i.getCoerceInputValues() || !coerceInputValue(f0fVar, i2, tag)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    @Override // p000.AbstractC5049e2, p000.wlg, p000.jl3
    public boolean decodeNotNullMark() {
        return !this.f74920m && super.decodeNotNullMark();
    }

    @Override // p000.AbstractC5049e2, p000.wlg, p000.lm2
    public void endStructure(@yfb f0f f0fVar) {
        Set<String> setPlus;
        md8.checkNotNullParameter(f0fVar, "descriptor");
        if (this.f31579i.getIgnoreUnknownKeys() || (f0fVar.getKind() instanceof w3d)) {
            return;
        }
        wl8 wl8VarNamingStrategy = vl8.namingStrategy(f0fVar, getJson());
        if (wl8VarNamingStrategy == null && !this.f31579i.getUseAlternativeNames()) {
            setPlus = ll8.jsonCachedSerialNames(f0fVar);
        } else if (wl8VarNamingStrategy != null) {
            setPlus = vl8.deserializationNamesMap(getJson(), f0fVar).keySet();
        } else {
            Set<String> setJsonCachedSerialNames = ll8.jsonCachedSerialNames(f0fVar);
            Map map = (Map) km8.getSchemaCache(getJson()).get(f0fVar, vl8.getJsonDeserializationNamesKey());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = w6f.emptySet();
            }
            setPlus = x6f.plus((Set) setJsonCachedSerialNames, (Iterable) setKeySet);
        }
        for (String str : getValue().keySet()) {
            if (!setPlus.contains(str) && !md8.areEqual(str, m9625D())) {
                throw il8.UnknownKeyException(str, getValue().toString());
            }
        }
    }

    @Override // p000.g9b
    @yfb
    /* JADX INFO: renamed from: k */
    public String mo11444k(@yfb f0f f0fVar, int i) {
        Object next;
        md8.checkNotNullParameter(f0fVar, "descriptor");
        wl8 wl8VarNamingStrategy = vl8.namingStrategy(f0fVar, getJson());
        String elementName = f0fVar.getElementName(i);
        if (wl8VarNamingStrategy == null && (!this.f31579i.getUseAlternativeNames() || getValue().keySet().contains(elementName))) {
            return elementName;
        }
        Map<String, Integer> mapDeserializationNamesMap = vl8.deserializationNamesMap(getJson(), f0fVar);
        Iterator<T> it = getValue().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = mapDeserializationNamesMap.get((String) next);
            if (num != null && num.intValue() == i) {
                break;
            }
        }
        String str = (String) next;
        if (str != null) {
            return str;
        }
        String strSerialNameForJson = wl8VarNamingStrategy != null ? wl8VarNamingStrategy.serialNameForJson(f0fVar, i, elementName) : null;
        return strSerialNameForJson == null ? elementName : strSerialNameForJson;
    }

    @Override // p000.AbstractC5049e2
    @yfb
    /* JADX INFO: renamed from: o */
    public sk8 mo9628o(@yfb String str) {
        md8.checkNotNullParameter(str, "tag");
        return (sk8) xt9.getValue(getValue(), str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm8(@yfb bk8 bk8Var, @yfb am8 am8Var, @gib String str, @gib f0f f0fVar) {
        super(bk8Var, am8Var, str, null);
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(am8Var, "value");
        this.f74917j = am8Var;
        this.f74918k = f0fVar;
    }

    @Override // p000.AbstractC5049e2
    @yfb
    public am8 getValue() {
        return this.f74917j;
    }
}
