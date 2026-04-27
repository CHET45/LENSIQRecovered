package p000;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.appcompat.widget.C0546a;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nSharedPreferencesMigration.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/migrations/SharedPreferencesMigration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,323:1\n1747#2,3:324\n1855#2,2:327\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/migrations/SharedPreferencesMigration\n*L\n158#1:324,3\n178#1:327,2\n*E\n"})
public final class w9f<T> implements ug3<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final gz6<T, zy2<? super Boolean>, Object> f93753a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final kz6<z9f, T, zy2<? super T>, Object> f93754b;

    /* JADX INFO: renamed from: c */
    @gib
    public final Context f93755c;

    /* JADX INFO: renamed from: d */
    @gib
    public final String f93756d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final fx8 f93757e;

    /* JADX INFO: renamed from: f */
    @gib
    public final Set<String> f93758f;

    /* JADX INFO: renamed from: w9f$a */
    @ck3(m4009c = "androidx.datastore.migrations.SharedPreferencesMigration$1", m4010f = "SharedPreferencesMigration.android.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C14518a extends ugg implements gz6<T, zy2<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a */
        public int f93759a;

        public C14518a(zy2<? super C14518a> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C14518a(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(T t, @gib zy2<? super Boolean> zy2Var) {
            return ((C14518a) create(t, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f93759a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return wc1.boxBoolean(true);
        }
    }

    /* JADX INFO: renamed from: w9f$b */
    @ck3(m4009c = "androidx.datastore.migrations.SharedPreferencesMigration$2", m4010f = "SharedPreferencesMigration.android.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C14519b extends ugg implements gz6<T, zy2<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a */
        public int f93760a;

        public C14519b(zy2<? super C14519b> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C14519b(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(T t, @gib zy2<? super Boolean> zy2Var) {
            return ((C14519b) create(t, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f93760a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return wc1.boxBoolean(true);
        }
    }

    /* JADX INFO: renamed from: w9f$c */
    @ck3(m4009c = "androidx.datastore.migrations.SharedPreferencesMigration$3", m4010f = "SharedPreferencesMigration.android.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C14520c extends ugg implements gz6<T, zy2<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a */
        public int f93761a;

        public C14520c(zy2<? super C14520c> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C14520c(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(T t, @gib zy2<? super Boolean> zy2Var) {
            return ((C14520c) create(t, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f93761a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return wc1.boxBoolean(true);
        }
    }

    /* JADX INFO: renamed from: w9f$d */
    public static final class C14521d extends tt8 implements ny6<SharedPreferences> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f93762a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f93763b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14521d(Context context, String str) {
            super(0);
            this.f93762a = context;
            this.f93763b = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f93762a.getSharedPreferences(this.f93763b, 0);
            md8.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    /* JADX INFO: renamed from: w9f$e */
    @c5e(24)
    public static final class C14522e {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C14522e f93764a = new C14522e();

        private C14522e() {
        }

        @do8
        @ih4
        public static final boolean deleteSharedPreferences(@yfb Context context, @yfb String str) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(str, "name");
            return context.deleteSharedPreferences(str);
        }
    }

    /* JADX INFO: renamed from: w9f$f */
    @ck3(m4009c = "androidx.datastore.migrations.SharedPreferencesMigration", m4010f = "SharedPreferencesMigration.android.kt", m4011i = {0}, m4012l = {151}, m4013m = "shouldMigrate", m4014n = {"this"}, m4015s = {"L$0"})
    public static final class C14523f extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f93765a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f93766b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ w9f<T> f93767c;

        /* JADX INFO: renamed from: d */
        public int f93768d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14523f(w9f<T> w9fVar, zy2<? super C14523f> zy2Var) {
            super(zy2Var);
            this.f93767c = w9fVar;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f93766b = obj;
            this.f93768d |= Integer.MIN_VALUE;
            return this.f93767c.shouldMigrate(null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public w9f(@yfb ny6<? extends SharedPreferences> ny6Var, @yfb kz6<? super z9f, ? super T, ? super zy2<? super T>, ? extends Object> kz6Var) {
        this(ny6Var, (Set) null, (gz6) null, kz6Var, 6, (jt3) null);
        md8.checkNotNullParameter(ny6Var, "produceSharedPreferences");
        md8.checkNotNullParameter(kz6Var, "migrate");
    }

    private final void deleteSharedPreferences(Context context, String str) {
        C14522e.deleteSharedPreferences(context, str);
    }

    private final SharedPreferences getSharedPrefs() {
        return (SharedPreferences) this.f93757e.getValue();
    }

    private final File getSharedPrefsBackup(File file) {
        return new File(file.getPath() + ".bak");
    }

    private final File getSharedPrefsFile(Context context, String str) {
        return new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), str + C0546a.f3363y);
    }

    @Override // p000.ug3
    @gib
    public Object cleanUp(@yfb zy2<? super bth> zy2Var) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = getSharedPrefs().edit();
        Set<String> set = this.f93758f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (getSharedPrefs().getAll().isEmpty() && (context = this.f93755c) != null && (str = this.f93756d) != null) {
            deleteSharedPreferences(context, str);
        }
        Set<String> set2 = this.f93758f;
        if (set2 != null) {
            set2.clear();
        }
        return bth.f14751a;
    }

    @Override // p000.ug3
    @gib
    public Object migrate(T t, @yfb zy2<? super T> zy2Var) {
        return this.f93754b.invoke(new z9f(getSharedPrefs(), this.f93758f), t, zy2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.ug3
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object shouldMigrate(T r5, @p000.yfb p000.zy2<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p000.w9f.C14523f
            if (r0 == 0) goto L13
            r0 = r6
            w9f$f r0 = (p000.w9f.C14523f) r0
            int r1 = r0.f93768d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f93768d = r1
            goto L18
        L13:
            w9f$f r0 = new w9f$f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f93766b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f93768d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f93765a
            w9f r5 = (p000.w9f) r5
            p000.y7e.throwOnFailure(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            p000.y7e.throwOnFailure(r6)
            gz6<T, zy2<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f93753a
            r0.f93765a = r4
            r0.f93768d = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 != 0) goto L54
            java.lang.Boolean r5 = p000.wc1.boxBoolean(r0)
            return r5
        L54:
            java.util.Set<java.lang.String> r6 = r5.f93758f
            if (r6 != 0) goto L6e
            android.content.SharedPreferences r5 = r5.getSharedPrefs()
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            p000.md8.checkNotNullExpressionValue(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L6c
            goto L98
        L6c:
            r3 = r0
            goto L98
        L6e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            android.content.SharedPreferences r5 = r5.getSharedPrefs()
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L82
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L82
            goto L6c
        L82:
            java.util.Iterator r6 = r6.iterator()
        L86:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L86
        L98:
            java.lang.Boolean r5 = p000.wc1.boxBoolean(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w9f.shouldMigrate(java.lang.Object, zy2):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public w9f(@yfb ny6<? extends SharedPreferences> ny6Var, @yfb Set<String> set, @yfb kz6<? super z9f, ? super T, ? super zy2<? super T>, ? extends Object> kz6Var) {
        this(ny6Var, set, (gz6) null, kz6Var, 4, (jt3) null);
        md8.checkNotNullParameter(ny6Var, "produceSharedPreferences");
        md8.checkNotNullParameter(set, "keysToMigrate");
        md8.checkNotNullParameter(kz6Var, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public w9f(@yfb Context context, @yfb String str, @yfb kz6<? super z9f, ? super T, ? super zy2<? super T>, ? extends Object> kz6Var) {
        this(context, str, null, null, kz6Var, 12, null);
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(str, "sharedPreferencesName");
        md8.checkNotNullParameter(kz6Var, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public w9f(@yfb Context context, @yfb String str, @yfb Set<String> set, @yfb kz6<? super z9f, ? super T, ? super zy2<? super T>, ? extends Object> kz6Var) {
        this(context, str, set, null, kz6Var, 8, null);
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(str, "sharedPreferencesName");
        md8.checkNotNullParameter(set, "keysToMigrate");
        md8.checkNotNullParameter(kz6Var, "migrate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private w9f(ny6<? extends SharedPreferences> ny6Var, Set<String> set, gz6<? super T, ? super zy2<? super Boolean>, ? extends Object> gz6Var, kz6<? super z9f, ? super T, ? super zy2<? super T>, ? extends Object> kz6Var, Context context, String str) {
        this.f93753a = gz6Var;
        this.f93754b = kz6Var;
        this.f93755c = context;
        this.f93756d = str;
        this.f93757e = hz8.lazy(ny6Var);
        this.f93758f = set == y9f.getMIGRATE_ALL_KEYS() ? null : v82.toMutableSet(set);
    }

    public /* synthetic */ w9f(ny6 ny6Var, Set set, gz6 gz6Var, kz6 kz6Var, Context context, String str, int i, jt3 jt3Var) {
        this((ny6<? extends SharedPreferences>) ny6Var, (Set<String>) set, (i & 4) != 0 ? new C14518a(null) : gz6Var, kz6Var, context, str);
    }

    public /* synthetic */ w9f(ny6 ny6Var, Set set, gz6 gz6Var, kz6 kz6Var, int i, jt3 jt3Var) {
        this((ny6<? extends SharedPreferences>) ny6Var, (Set<String>) ((i & 2) != 0 ? y9f.getMIGRATE_ALL_KEYS() : set), (i & 4) != 0 ? new C14519b(null) : gz6Var, kz6Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public w9f(@yfb ny6<? extends SharedPreferences> ny6Var, @yfb Set<String> set, @yfb gz6<? super T, ? super zy2<? super Boolean>, ? extends Object> gz6Var, @yfb kz6<? super z9f, ? super T, ? super zy2<? super T>, ? extends Object> kz6Var) {
        this(ny6Var, set, gz6Var, kz6Var, (Context) null, (String) null);
        md8.checkNotNullParameter(ny6Var, "produceSharedPreferences");
        md8.checkNotNullParameter(set, "keysToMigrate");
        md8.checkNotNullParameter(gz6Var, "shouldRunMigration");
        md8.checkNotNullParameter(kz6Var, "migrate");
    }

    public /* synthetic */ w9f(Context context, String str, Set set, gz6 gz6Var, kz6 kz6Var, int i, jt3 jt3Var) {
        this(context, str, (i & 4) != 0 ? y9f.getMIGRATE_ALL_KEYS() : set, (i & 8) != 0 ? new C14520c(null) : gz6Var, kz6Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public w9f(@yfb Context context, @yfb String str, @yfb Set<String> set, @yfb gz6<? super T, ? super zy2<? super Boolean>, ? extends Object> gz6Var, @yfb kz6<? super z9f, ? super T, ? super zy2<? super T>, ? extends Object> kz6Var) {
        this(new C14521d(context, str), set, gz6Var, kz6Var, context, str);
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(str, "sharedPreferencesName");
        md8.checkNotNullParameter(set, "keysToMigrate");
        md8.checkNotNullParameter(gz6Var, "shouldRunMigration");
        md8.checkNotNullParameter(kz6Var, "migrate");
    }
}
