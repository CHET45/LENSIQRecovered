package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p000.d9d;

/* JADX INFO: loaded from: classes3.dex */
@xn8(name = "SharedPreferencesMigrationKt")
public final class x9f {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final Set<String> f97312a = new LinkedHashSet();

    /* JADX INFO: renamed from: x9f$a */
    @ck3(m4009c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", m4010f = "SharedPreferencesMigration.android.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nSharedPreferencesMigration.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/preferences/SharedPreferencesMigrationKt$getMigrationFunction$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,157:1\n1549#2:158\n1620#2,3:159\n515#3:162\n500#3,6:163\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/preferences/SharedPreferencesMigrationKt$getMigrationFunction$1\n*L\n108#1:158\n108#1:159,3\n111#1:162\n111#1:163,6\n*E\n"})
    public static final class C15009a extends ugg implements kz6<z9f, d9d, zy2<? super d9d>, Object> {

        /* JADX INFO: renamed from: a */
        public int f97313a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f97314b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f97315c;

        public C15009a(zy2<? super C15009a> zy2Var) {
            super(3, zy2Var);
        }

        @Override // p000.kz6
        @gib
        public final Object invoke(@yfb z9f z9fVar, @yfb d9d d9dVar, @gib zy2<? super d9d> zy2Var) {
            C15009a c15009a = new C15009a(zy2Var);
            c15009a.f97314b = z9fVar;
            c15009a.f97315c = d9dVar;
            return c15009a.invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f97313a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            z9f z9fVar = (z9f) this.f97314b;
            d9d d9dVar = (d9d) this.f97315c;
            Set<d9d.C4675a<?>> setKeySet = d9dVar.asMap().keySet();
            ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((d9d.C4675a) it.next()).getName());
            }
            Map<String, Object> all = z9fVar.getAll();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : all.entrySet()) {
                if (!arrayList.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            i6b mutablePreferences = d9dVar.toMutablePreferences();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    mutablePreferences.set(i9d.booleanKey(str), value);
                } else if (value instanceof Float) {
                    mutablePreferences.set(i9d.floatKey(str), value);
                } else if (value instanceof Integer) {
                    mutablePreferences.set(i9d.intKey(str), value);
                } else if (value instanceof Long) {
                    mutablePreferences.set(i9d.longKey(str), value);
                } else if (value instanceof String) {
                    mutablePreferences.set(i9d.stringKey(str), value);
                } else if (value instanceof Set) {
                    d9d.C4675a<Set<String>> c4675aStringSetKey = i9d.stringSetKey(str);
                    md8.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    mutablePreferences.set(c4675aStringSetKey, (Set) value);
                }
            }
            return mutablePreferences.toPreferences();
        }
    }

    /* JADX INFO: renamed from: x9f$b */
    @ck3(m4009c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", m4010f = "SharedPreferencesMigration.android.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nSharedPreferencesMigration.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/preferences/SharedPreferencesMigrationKt$getShouldRunMigration$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n1549#2:158\n1620#2,3:159\n1747#2,3:162\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/preferences/SharedPreferencesMigrationKt$getShouldRunMigration$1\n*L\n147#1:158\n147#1:159,3\n152#1:162,3\n*E\n"})
    public static final class C15010b extends ugg implements gz6<d9d, zy2<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a */
        public int f97316a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f97317b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Set<String> f97318c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15010b(Set<String> set, zy2<? super C15010b> zy2Var) {
            super(2, zy2Var);
            this.f97318c = set;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C15010b c15010b = new C15010b(this.f97318c, zy2Var);
            c15010b.f97317b = obj;
            return c15010b;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb d9d d9dVar, @gib zy2<? super Boolean> zy2Var) {
            return ((C15010b) create(d9dVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f97316a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            Set<d9d.C4675a<?>> setKeySet = ((d9d) this.f97317b).asMap().keySet();
            ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((d9d.C4675a) it.next()).getName());
            }
            boolean z = true;
            if (this.f97318c != x9f.getMIGRATE_ALL_KEYS()) {
                Set<String> set = this.f97318c;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z = false;
                } else {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains((String) it2.next())) {
                            break;
                        }
                    }
                    z = false;
                }
            }
            return wc1.boxBoolean(z);
        }
    }

    @yfb
    @yn8
    public static final w9f<d9d> SharedPreferencesMigration(@yfb ny6<? extends SharedPreferences> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "produceSharedPreferences");
        return SharedPreferencesMigration$default(ny6Var, null, 2, null);
    }

    public static /* synthetic */ w9f SharedPreferencesMigration$default(ny6 ny6Var, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = f97312a;
        }
        return SharedPreferencesMigration((ny6<? extends SharedPreferences>) ny6Var, (Set<String>) set);
    }

    @yfb
    public static final Set<String> getMIGRATE_ALL_KEYS() {
        return f97312a;
    }

    private static final kz6<z9f, d9d, zy2<? super d9d>, Object> getMigrationFunction() {
        return new C15009a(null);
    }

    private static final gz6<d9d, zy2<? super Boolean>, Object> getShouldRunMigration(Set<String> set) {
        return new C15010b(set, null);
    }

    @yfb
    @yn8
    public static final w9f<d9d> SharedPreferencesMigration(@yfb Context context, @yfb String str) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(str, "sharedPreferencesName");
        return SharedPreferencesMigration$default(context, str, null, 4, null);
    }

    @yfb
    @yn8
    public static final w9f<d9d> SharedPreferencesMigration(@yfb ny6<? extends SharedPreferences> ny6Var, @yfb Set<String> set) {
        md8.checkNotNullParameter(ny6Var, "produceSharedPreferences");
        md8.checkNotNullParameter(set, "keysToMigrate");
        if (set == f97312a) {
            return new w9f<>(ny6Var, (Set) null, getShouldRunMigration(set), getMigrationFunction(), 2, (jt3) null);
        }
        return new w9f<>(ny6Var, set, getShouldRunMigration(set), getMigrationFunction());
    }

    public static /* synthetic */ w9f SharedPreferencesMigration$default(Context context, String str, Set set, int i, Object obj) {
        if ((i & 4) != 0) {
            set = f97312a;
        }
        return SharedPreferencesMigration(context, str, set);
    }

    @yfb
    @yn8
    public static final w9f<d9d> SharedPreferencesMigration(@yfb Context context, @yfb String str, @yfb Set<String> set) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(str, "sharedPreferencesName");
        md8.checkNotNullParameter(set, "keysToMigrate");
        if (set == f97312a) {
            return new w9f<>(context, str, null, getShouldRunMigration(set), getMigrationFunction(), 4, null);
        }
        return new w9f<>(context, str, set, getShouldRunMigration(set), getMigrationFunction());
    }
}
