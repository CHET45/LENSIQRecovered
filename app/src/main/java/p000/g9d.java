package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.d9d;
import p000.l9d;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nPreferencesFileSerializer.jvmAndroid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferencesFileSerializer.jvmAndroid.kt\nandroidx/datastore/preferences/core/PreferencesFileSerializer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,114:1\n215#2,2:115\n*S KotlinDebug\n*F\n+ 1 PreferencesFileSerializer.jvmAndroid.kt\nandroidx/datastore/preferences/core/PreferencesFileSerializer\n*L\n50#1:115,2\n*E\n"})
public final class g9d implements w1f<d9d> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final g9d f39058a = new g9d();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f39059b = "preferences_pb";

    /* JADX INFO: renamed from: g9d$a */
    public /* synthetic */ class C6175a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39060a;

        static {
            int[] iArr = new int[l9d.C8733f.b.values().length];
            try {
                iArr[l9d.C8733f.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l9d.C8733f.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l9d.C8733f.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l9d.C8733f.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l9d.C8733f.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l9d.C8733f.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[l9d.C8733f.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[l9d.C8733f.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[l9d.C8733f.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f39060a = iArr;
        }
    }

    private g9d() {
    }

    private final void addProtoEntryToPreferences(String str, l9d.C8733f c8733f, i6b i6bVar) throws d23 {
        l9d.C8733f.b valueCase = c8733f.getValueCase();
        switch (valueCase == null ? -1 : C6175a.f39060a[valueCase.ordinal()]) {
            case -1:
                throw new d23("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new ceb();
            case 1:
                i6bVar.set(i9d.booleanKey(str), Boolean.valueOf(c8733f.getBoolean()));
                return;
            case 2:
                i6bVar.set(i9d.floatKey(str), Float.valueOf(c8733f.getFloat()));
                return;
            case 3:
                i6bVar.set(i9d.doubleKey(str), Double.valueOf(c8733f.getDouble()));
                return;
            case 4:
                i6bVar.set(i9d.intKey(str), Integer.valueOf(c8733f.getInteger()));
                return;
            case 5:
                i6bVar.set(i9d.longKey(str), Long.valueOf(c8733f.getLong()));
                return;
            case 6:
                d9d.C4675a<String> c4675aStringKey = i9d.stringKey(str);
                String string = c8733f.getString();
                md8.checkNotNullExpressionValue(string, "value.string");
                i6bVar.set(c4675aStringKey, string);
                return;
            case 7:
                d9d.C4675a<Set<String>> c4675aStringSetKey = i9d.stringSetKey(str);
                List<String> stringsList = c8733f.getStringSet().getStringsList();
                md8.checkNotNullExpressionValue(stringsList, "value.stringSet.stringsList");
                i6bVar.set(c4675aStringSetKey, v82.toSet(stringsList));
                return;
            case 8:
                d9d.C4675a<byte[]> c4675aByteArrayKey = i9d.byteArrayKey(str);
                byte[] byteArray = c8733f.getBytes().toByteArray();
                md8.checkNotNullExpressionValue(byteArray, "value.bytes.toByteArray()");
                i6bVar.set(c4675aByteArrayKey, byteArray);
                return;
            case 9:
                throw new d23("Value not set.", null, 2, null);
        }
    }

    private final l9d.C8733f getValueProto(Object obj) {
        if (obj instanceof Boolean) {
            l9d.C8733f c8733fBuild = l9d.C8733f.newBuilder().setBoolean(((Boolean) obj).booleanValue()).build();
            md8.checkNotNullExpressionValue(c8733fBuild, "newBuilder().setBoolean(value).build()");
            return c8733fBuild;
        }
        if (obj instanceof Float) {
            l9d.C8733f c8733fBuild2 = l9d.C8733f.newBuilder().setFloat(((Number) obj).floatValue()).build();
            md8.checkNotNullExpressionValue(c8733fBuild2, "newBuilder().setFloat(value).build()");
            return c8733fBuild2;
        }
        if (obj instanceof Double) {
            l9d.C8733f c8733fBuild3 = l9d.C8733f.newBuilder().setDouble(((Number) obj).doubleValue()).build();
            md8.checkNotNullExpressionValue(c8733fBuild3, "newBuilder().setDouble(value).build()");
            return c8733fBuild3;
        }
        if (obj instanceof Integer) {
            l9d.C8733f c8733fBuild4 = l9d.C8733f.newBuilder().setInteger(((Number) obj).intValue()).build();
            md8.checkNotNullExpressionValue(c8733fBuild4, "newBuilder().setInteger(value).build()");
            return c8733fBuild4;
        }
        if (obj instanceof Long) {
            l9d.C8733f c8733fBuild5 = l9d.C8733f.newBuilder().setLong(((Number) obj).longValue()).build();
            md8.checkNotNullExpressionValue(c8733fBuild5, "newBuilder().setLong(value).build()");
            return c8733fBuild5;
        }
        if (obj instanceof String) {
            l9d.C8733f c8733fBuild6 = l9d.C8733f.newBuilder().setString((String) obj).build();
            md8.checkNotNullExpressionValue(c8733fBuild6, "newBuilder().setString(value).build()");
            return c8733fBuild6;
        }
        if (obj instanceof Set) {
            l9d.C8733f.a aVarNewBuilder = l9d.C8733f.newBuilder();
            l9d.C8731d.a aVarNewBuilder2 = l9d.C8731d.newBuilder();
            md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            l9d.C8733f c8733fBuild7 = aVarNewBuilder.setStringSet(aVarNewBuilder2.addAllStrings((Set) obj)).build();
            md8.checkNotNullExpressionValue(c8733fBuild7, "newBuilder()\n           …                 .build()");
            return c8733fBuild7;
        }
        if (obj instanceof byte[]) {
            l9d.C8733f c8733fBuild8 = l9d.C8733f.newBuilder().setBytes(wj1.copyFrom((byte[]) obj)).build();
            md8.checkNotNullExpressionValue(c8733fBuild8, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return c8733fBuild8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
    }

    @Override // p000.w1f
    @gib
    public Object readFrom(@yfb InputStream inputStream, @yfb zy2<? super d9d> zy2Var) throws IOException {
        l9d.C8729b from = k9d.f53374a.readFrom(inputStream);
        i6b i6bVarCreateMutable = f9d.createMutable(new d9d.C4676b[0]);
        Map<String, l9d.C8733f> preferencesMap = from.getPreferencesMap();
        md8.checkNotNullExpressionValue(preferencesMap, "preferencesProto.preferencesMap");
        for (Map.Entry<String, l9d.C8733f> entry : preferencesMap.entrySet()) {
            String key = entry.getKey();
            l9d.C8733f value = entry.getValue();
            g9d g9dVar = f39058a;
            md8.checkNotNullExpressionValue(key, "name");
            md8.checkNotNullExpressionValue(value, "value");
            g9dVar.addProtoEntryToPreferences(key, value, i6bVarCreateMutable);
        }
        return i6bVarCreateMutable.toPreferences();
    }

    @Override // p000.w1f
    public /* bridge */ /* synthetic */ Object writeTo(d9d d9dVar, OutputStream outputStream, zy2 zy2Var) {
        return writeTo2(d9dVar, outputStream, (zy2<? super bth>) zy2Var);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.w1f
    @yfb
    public d9d getDefaultValue() {
        return f9d.createEmpty();
    }

    @gib
    /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(@yfb d9d d9dVar, @yfb OutputStream outputStream, @yfb zy2<? super bth> zy2Var) throws IOException {
        Map<d9d.C4675a<?>, Object> mapAsMap = d9dVar.asMap();
        l9d.C8729b.a aVarNewBuilder = l9d.C8729b.newBuilder();
        for (Map.Entry<d9d.C4675a<?>, Object> entry : mapAsMap.entrySet()) {
            aVarNewBuilder.putPreferences(entry.getKey().getName(), getValueProto(entry.getValue()));
        }
        aVarNewBuilder.build().writeTo(outputStream);
        return bth.f14751a;
    }
}
