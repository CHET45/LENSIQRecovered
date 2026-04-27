package p000;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nSharedPreferencesMigration.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/migrations/SharedPreferencesView\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,323:1\n515#2:324\n500#2,6:325\n442#2:331\n392#2:332\n1238#3,4:333\n1#4:337\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/migrations/SharedPreferencesView\n*L\n303#1:324\n303#1:325,6\n305#1:331\n305#1:332\n305#1:333,4\n*E\n"})
public final class z9f {

    /* JADX INFO: renamed from: a */
    @yfb
    public final SharedPreferences f104503a;

    /* JADX INFO: renamed from: b */
    @gib
    public final Set<String> f104504b;

    public z9f(@yfb SharedPreferences sharedPreferences, @gib Set<String> set) {
        md8.checkNotNullParameter(sharedPreferences, "prefs");
        this.f104503a = sharedPreferences;
        this.f104504b = set;
    }

    private final String checkKey(String str) {
        Set<String> set = this.f104504b;
        if (set == null || set.contains(str)) {
            return str;
        }
        throw new IllegalStateException(("Can't access key outside migration: " + str).toString());
    }

    public static /* synthetic */ String getString$default(z9f z9fVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return z9fVar.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set getStringSet$default(z9f z9fVar, String str, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        return z9fVar.getStringSet(str, set);
    }

    public final boolean contains(@yfb String str) {
        md8.checkNotNullParameter(str, "key");
        return this.f104503a.contains(checkKey(str));
    }

    @yfb
    public final Map<String, Object> getAll() {
        Map<String, ?> all = this.f104503a.getAll();
        md8.checkNotNullExpressionValue(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = this.f104504b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(wt9.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = v82.toSet((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final boolean getBoolean(@yfb String str, boolean z) {
        md8.checkNotNullParameter(str, "key");
        return this.f104503a.getBoolean(checkKey(str), z);
    }

    public final float getFloat(@yfb String str, float f) {
        md8.checkNotNullParameter(str, "key");
        return this.f104503a.getFloat(checkKey(str), f);
    }

    public final int getInt(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "key");
        return this.f104503a.getInt(checkKey(str), i);
    }

    public final long getLong(@yfb String str, long j) {
        md8.checkNotNullParameter(str, "key");
        return this.f104503a.getLong(checkKey(str), j);
    }

    @gib
    public final String getString(@yfb String str, @gib String str2) {
        md8.checkNotNullParameter(str, "key");
        return this.f104503a.getString(checkKey(str), str2);
    }

    @gib
    public final Set<String> getStringSet(@yfb String str, @gib Set<String> set) {
        md8.checkNotNullParameter(str, "key");
        Set<String> stringSet = this.f104503a.getStringSet(checkKey(str), set);
        if (stringSet != null) {
            return v82.toMutableSet(stringSet);
        }
        return null;
    }
}
