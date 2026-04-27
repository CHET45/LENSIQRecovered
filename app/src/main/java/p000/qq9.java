package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mmkv.MMKV;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@dwf({"SMAP\nMMKVUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MMKVUtils.kt\ncom/eyevue/common/utils/MMKVUtils\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,211:1\n216#2,2:212\n1863#3,2:214\n1863#3,2:216\n*S KotlinDebug\n*F\n+ 1 MMKVUtils.kt\ncom/eyevue/common/utils/MMKVUtils\n*L\n118#1:212,2\n136#1:214,2\n163#1:216,2\n*E\n"})
@e0g(parameters = 0)
public final class qq9 {

    /* JADX INFO: renamed from: b */
    public static MMKV f75118b;

    /* JADX INFO: renamed from: a */
    @yfb
    public static final qq9 f75117a = new qq9();

    /* JADX INFO: renamed from: c */
    public static final int f75119c = 8;

    /* JADX INFO: renamed from: qq9$a */
    @e0g(parameters = 1)
    public static final class C11584a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C11584a f75120a = new C11584a();

        /* JADX INFO: renamed from: b */
        @yfb
        public static final String f75121b = "video_stabilization";

        /* JADX INFO: renamed from: c */
        @yfb
        public static final String f75122c = "image_up_scale";

        /* JADX INFO: renamed from: d */
        public static final int f75123d = 0;

        private C11584a() {
        }
    }

    private qq9() {
    }

    public static /* synthetic */ boolean getBoolean$default(qq9 qq9Var, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return qq9Var.getBoolean(str, z);
    }

    public static /* synthetic */ float getFloat$default(qq9 qq9Var, String str, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return qq9Var.getFloat(str, f);
    }

    public static /* synthetic */ int getInt$default(qq9 qq9Var, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return qq9Var.getInt(str, i);
    }

    public static /* synthetic */ long getLong$default(qq9 qq9Var, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return qq9Var.getLong(str, j);
    }

    public static /* synthetic */ String getString$default(qq9 qq9Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return qq9Var.getString(str, str2);
    }

    private final Object getValueByKey(String str) {
        MMKV mmkv = f75118b;
        if (mmkv == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv = null;
        }
        if (!mmkv.contains(str)) {
            return null;
        }
        MMKV mmkv2 = f75118b;
        if (mmkv2 == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv2 = null;
        }
        if (mmkv2.decodeString(str, null) != null) {
            return getString$default(this, str, null, 2, null);
        }
        MMKV mmkv3 = f75118b;
        if (mmkv3 == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv3 = null;
        }
        if (mmkv3.decodeInt(str, Integer.MIN_VALUE) != Integer.MIN_VALUE) {
            return Integer.valueOf(getInt$default(this, str, 0, 2, null));
        }
        MMKV mmkv4 = f75118b;
        if (mmkv4 == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv4 = null;
        }
        return mmkv4.decodeLong(str, Long.MIN_VALUE) != Long.MIN_VALUE ? Long.valueOf(getLong$default(this, str, 0L, 2, null)) : Float.valueOf(getFloat$default(this, str, 0.0f, 2, null));
    }

    public final void clearAll() {
        MMKV mmkv = f75118b;
        if (mmkv == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv = null;
        }
        mmkv.clearAll();
    }

    public final boolean contains(@yfb String str) {
        md8.checkNotNullParameter(str, "key");
        MMKV mmkv = f75118b;
        if (mmkv == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv = null;
        }
        return mmkv.contains(str);
    }

    @yfb
    public final Map<String, Object> getAll(@yfb List<String> list) {
        md8.checkNotNullParameter(list, "keys");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : list) {
            linkedHashMap.put(str, f75117a.getValueByKey(str));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public final Set<String> getAllKeys() {
        MMKV mmkv = f75118b;
        if (mmkv == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv = null;
        }
        String[] strArrAllKeys = mmkv.allKeys();
        md8.checkNotNull(strArrAllKeys, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        return (Set) strArrAllKeys;
    }

    public final boolean getBoolean(@yfb String str, boolean z) {
        md8.checkNotNullParameter(str, "key");
        MMKV mmkv = f75118b;
        if (mmkv == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv = null;
        }
        return mmkv.decodeBool(str, z);
    }

    public final int getCount() {
        MMKV mmkv = f75118b;
        if (mmkv == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv = null;
        }
        String[] strArrAllKeys = mmkv.allKeys();
        if (strArrAllKeys != null) {
            return strArrAllKeys.length;
        }
        return 0;
    }

    public final float getFloat(@yfb String str, float f) {
        md8.checkNotNullParameter(str, "key");
        MMKV mmkv = f75118b;
        if (mmkv == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv = null;
        }
        return mmkv.decodeFloat(str, f);
    }

    public final int getInt(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "key");
        MMKV mmkv = f75118b;
        if (mmkv == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv = null;
        }
        return mmkv.decodeInt(str, i);
    }

    public final long getLong(@yfb String str, long j) {
        md8.checkNotNullParameter(str, "key");
        MMKV mmkv = f75118b;
        if (mmkv == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv = null;
        }
        return mmkv.decodeLong(str, j);
    }

    @yfb
    public final String getString(@yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(str2, "defaultValue");
        MMKV mmkv = f75118b;
        if (mmkv == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv = null;
        }
        String strDecodeString = mmkv.decodeString(str, str2);
        return strDecodeString == null ? str2 : strDecodeString;
    }

    public final void init(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        System.out.println((Object) ("MMKV root: " + MMKV.initialize(context)));
        f75118b = MMKV.defaultMMKV();
    }

    public final void initWithId(@yfb Context context, @yfb String str) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(str, "mmkvId");
        MMKV.initialize(context);
        f75118b = MMKV.mmkvWithID(str, 2);
    }

    public final void putAll(@yfb Map<String, ? extends Object> map) {
        md8.checkNotNullParameter(map, "data");
        MMKV mmkv = f75118b;
        if (mmkv == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv = null;
        }
        SharedPreferences.Editor editorEdit = mmkv.edit();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                editorEdit.putString(key, (String) value);
            } else if (value instanceof Integer) {
                editorEdit.putInt(key, ((Number) value).intValue());
            } else if (value instanceof Boolean) {
                editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Float) {
                editorEdit.putFloat(key, ((Number) value).floatValue());
            } else {
                if (!(value instanceof Long)) {
                    throw new IllegalArgumentException("Unsupported type: " + value.getClass().getSimpleName());
                }
                editorEdit.putLong(key, ((Number) value).longValue());
            }
        }
        editorEdit.apply();
    }

    public final void putBoolean(@yfb String str, boolean z) {
        md8.checkNotNullParameter(str, "key");
        MMKV mmkv = f75118b;
        if (mmkv == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv = null;
        }
        mmkv.encode(str, z);
    }

    public final void putFloat(@yfb String str, float f) {
        md8.checkNotNullParameter(str, "key");
        MMKV mmkv = f75118b;
        if (mmkv == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv = null;
        }
        mmkv.encode(str, f);
    }

    public final void putInt(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "key");
        MMKV mmkv = f75118b;
        if (mmkv == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv = null;
        }
        mmkv.encode(str, i);
    }

    public final void putLong(@yfb String str, long j) {
        md8.checkNotNullParameter(str, "key");
        MMKV mmkv = f75118b;
        if (mmkv == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv = null;
        }
        mmkv.encode(str, j);
    }

    public final void putString(@yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(str2, "value");
        MMKV mmkv = f75118b;
        if (mmkv == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv = null;
        }
        mmkv.encode(str, str2);
    }

    public final void remove(@yfb String str) {
        md8.checkNotNullParameter(str, "key");
        MMKV mmkv = f75118b;
        if (mmkv == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv = null;
        }
        mmkv.removeValueForKey(str);
    }

    public final void removeKeys(@yfb List<String> list) {
        md8.checkNotNullParameter(list, "keys");
        MMKV mmkv = f75118b;
        if (mmkv == null) {
            md8.throwUninitializedPropertyAccessException("mmkv");
            mmkv = null;
        }
        SharedPreferences.Editor editorEdit = mmkv.edit();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
    }
}
