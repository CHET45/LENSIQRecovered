package p000;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.List;
import java.util.Map;
import p000.d9d;

/* JADX INFO: loaded from: classes5.dex */
public final class ti8 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ hp8<Object>[] f84966f = {vvd.property2(new qgd(ti8.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a */
    @yfb
    public final Context f84967a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f84968b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final ThreadLocal<Boolean> f84969c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final yqd f84970d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final ai3<d9d> f84971e;

    /* JADX INFO: renamed from: ti8$a */
    @ck3(m4009c = "com.google.firebase.datastorage.JavaDataStorage$contains$1", m4010f = "JavaDataStorage.kt", m4011i = {}, m4012l = {124}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13060a extends ugg implements gz6<x13, zy2<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a */
        public int f84972a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ d9d.C4675a<T> f84974c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13060a(d9d.C4675a<T> c4675a, zy2<? super C13060a> zy2Var) {
            super(2, zy2Var);
            this.f84974c = c4675a;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return ti8.this.new C13060a(this.f84974c, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super Boolean> zy2Var) {
            return ((C13060a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f84972a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                y56 data = ti8.this.f84971e.getData();
                this.f84972a = 1;
                obj = c76.firstOrNull(data, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            d9d d9dVar = (d9d) obj;
            return wc1.boxBoolean(d9dVar != null ? d9dVar.contains(this.f84974c) : false);
        }
    }

    /* JADX INFO: renamed from: ti8$b */
    @ck3(m4009c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", m4010f = "JavaDataStorage.kt", m4011i = {}, m4012l = {220}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13061b extends ugg implements gz6<x13, zy2<? super d9d>, Object> {

        /* JADX INFO: renamed from: a */
        public int f84975a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<i6b, bth> f84977c;

        /* JADX INFO: renamed from: ti8$b$a */
        @ck3(m4009c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", m4010f = "JavaDataStorage.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<i6b, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f84978a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f84979b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ qy6<i6b, bth> f84980c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(qy6<? super i6b, bth> qy6Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f84980c = qy6Var;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                a aVar = new a(this.f84980c, zy2Var);
                aVar.f84979b = obj;
                return aVar;
            }

            @Override // p000.gz6
            public final Object invoke(i6b i6bVar, zy2<? super bth> zy2Var) {
                return ((a) create(i6bVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f84978a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                this.f84980c.invoke((i6b) this.f84979b);
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13061b(qy6<? super i6b, bth> qy6Var, zy2<? super C13061b> zy2Var) {
            super(2, zy2Var);
            this.f84977c = qy6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return ti8.this.new C13061b(this.f84977c, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super d9d> zy2Var) {
            return ((C13061b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f84975a;
            try {
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    if (md8.areEqual(ti8.this.f84969c.get(), wc1.boxBoolean(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    ti8.this.f84969c.set(wc1.boxBoolean(true));
                    ai3 ai3Var = ti8.this.f84971e;
                    a aVar = new a(this.f84977c, null);
                    this.f84975a = 1;
                    obj = j9d.edit(ai3Var, aVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                return (d9d) obj;
            } finally {
                ti8.this.f84969c.set(wc1.boxBoolean(false));
            }
        }
    }

    /* JADX INFO: renamed from: ti8$c */
    @ck3(m4009c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", m4010f = "JavaDataStorage.kt", m4011i = {}, m4012l = {dk4.f29869f}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13062c extends ugg implements gz6<x13, zy2<? super Map<d9d.C4675a<?>, ? extends Object>>, Object> {

        /* JADX INFO: renamed from: a */
        public int f84981a;

        public C13062c(zy2<? super C13062c> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return ti8.this.new C13062c(zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super Map<d9d.C4675a<?>, ? extends Object>> zy2Var) {
            return ((C13062c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Map<d9d.C4675a<?>, Object> mapAsMap;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f84981a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                y56 data = ti8.this.f84971e.getData();
                this.f84981a = 1;
                obj = c76.firstOrNull(data, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            d9d d9dVar = (d9d) obj;
            return (d9dVar == null || (mapAsMap = d9dVar.asMap()) == null) ? xt9.emptyMap() : mapAsMap;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: ti8$d */
    @ck3(m4009c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", m4010f = "JavaDataStorage.kt", m4011i = {}, m4012l = {104}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13063d<T> extends ugg implements gz6<x13, zy2<? super T>, Object> {

        /* JADX INFO: renamed from: a */
        public int f84983a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ d9d.C4675a<T> f84985c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ T f84986d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13063d(d9d.C4675a<T> c4675a, T t, zy2<? super C13063d> zy2Var) {
            super(2, zy2Var);
            this.f84985c = c4675a;
            this.f84986d = t;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return ti8.this.new C13063d(this.f84985c, this.f84986d, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super T> zy2Var) {
            return ((C13063d) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f84983a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                y56<T> data = ti8.this.f84971e.getData();
                this.f84983a = 1;
                obj = c76.firstOrNull(data, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            d9d d9dVar = (d9d) obj;
            return (d9dVar == null || (obj2 = d9dVar.get(this.f84985c)) == null) ? this.f84986d : obj2;
        }
    }

    /* JADX INFO: renamed from: ti8$e */
    @ck3(m4009c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", m4010f = "JavaDataStorage.kt", m4011i = {}, m4012l = {145}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13064e extends ugg implements gz6<x13, zy2<? super d9d>, Object> {

        /* JADX INFO: renamed from: a */
        public int f84987a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ d9d.C4675a<T> f84989c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ T f84990d;

        /* JADX INFO: renamed from: ti8$e$a */
        @ck3(m4009c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", m4010f = "JavaDataStorage.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<i6b, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f84991a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f84992b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ d9d.C4675a<T> f84993c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ T f84994d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d9d.C4675a<T> c4675a, T t, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f84993c = c4675a;
                this.f84994d = t;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                a aVar = new a(this.f84993c, this.f84994d, zy2Var);
                aVar.f84992b = obj;
                return aVar;
            }

            @Override // p000.gz6
            public final Object invoke(i6b i6bVar, zy2<? super bth> zy2Var) {
                return ((a) create(i6bVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f84991a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                ((i6b) this.f84992b).set(this.f84993c, this.f84994d);
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13064e(d9d.C4675a<T> c4675a, T t, zy2<? super C13064e> zy2Var) {
            super(2, zy2Var);
            this.f84989c = c4675a;
            this.f84990d = t;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return ti8.this.new C13064e(this.f84989c, this.f84990d, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super d9d> zy2Var) {
            return ((C13064e) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f84987a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                ai3 ai3Var = ti8.this.f84971e;
                a aVar = new a(this.f84989c, this.f84990d, null);
                this.f84987a = 1;
                obj = j9d.edit(ai3Var, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public ti8(@yfb Context context, @yfb String str) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(str, "name");
        this.f84967a = context;
        this.f84968b = str;
        this.f84969c = new ThreadLocal<>();
        this.f84970d = y8d.preferencesDataStore$default(str, new h2e(new qy6() { // from class: ri8
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return ti8.dataStore_delegate$lambda$0(this.f78387a, (d23) obj);
            }
        }), new qy6() { // from class: si8
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return ti8.dataStore_delegate$lambda$1(this.f81926a, (Context) obj);
            }
        }, null, 8, null);
        this.f84971e = getDataStore(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d9d dataStore_delegate$lambda$0(ti8 ti8Var, d23 d23Var) {
        md8.checkNotNullParameter(d23Var, "ex");
        Log.w(vvd.getOrCreateKotlinClass(ti8.class).getSimpleName(), "CorruptionException in " + ti8Var.f84968b + " DataStore running in process " + Process.myPid(), d23Var);
        return f9d.createEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List dataStore_delegate$lambda$1(ti8 ti8Var, Context context) {
        md8.checkNotNullParameter(context, "it");
        return k82.listOf(x9f.SharedPreferencesMigration$default(context, ti8Var.f84968b, null, 4, null));
    }

    private final ai3<d9d> getDataStore(Context context) {
        return (ai3) this.f84970d.getValue(context, f84966f[0]);
    }

    public final <T> boolean contains(@yfb d9d.C4675a<T> c4675a) {
        md8.checkNotNullParameter(c4675a, "key");
        return ((Boolean) eg1.runBlocking$default(null, new C13060a(c4675a, null), 1, null)).booleanValue();
    }

    @yfb
    public final d9d editSync(@yfb qy6<? super i6b, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "transform");
        return (d9d) eg1.runBlocking$default(null, new C13061b(qy6Var, null), 1, null);
    }

    @yfb
    public final Map<d9d.C4675a<?>, Object> getAllSync() {
        return (Map) eg1.runBlocking$default(null, new C13062c(null), 1, null);
    }

    @yfb
    public final Context getContext() {
        return this.f84967a;
    }

    @yfb
    public final String getName() {
        return this.f84968b;
    }

    public final <T> T getSync(@yfb d9d.C4675a<T> c4675a, T t) {
        md8.checkNotNullParameter(c4675a, "key");
        return (T) eg1.runBlocking$default(null, new C13063d(c4675a, t, null), 1, null);
    }

    @yfb
    public final <T> d9d putSync(@yfb d9d.C4675a<T> c4675a, T t) {
        md8.checkNotNullParameter(c4675a, "key");
        return (d9d) eg1.runBlocking$default(null, new C13064e(c4675a, t, null), 1, null);
    }
}
