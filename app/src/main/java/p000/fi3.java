package p000;

import androidx.core.app.NotificationCompat;
import androidx.mediarouter.media.C1337g;
import com.haibin.calendarview.BuildConfig;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.opencv.videoio.Videoio;
import org.videolan.libvlc.MediaPlayer;
import p000.csa;
import p000.jvd;
import p000.uwh;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n120#2,10:539\n120#2,10:549\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl\n*L\n130#1:539,10\n148#1:549,10\n*E\n"})
public final class fi3<T> implements ai3<T> {

    /* JADX INFO: renamed from: m */
    @yfb
    public static final C5813a f36622m = new C5813a(null);

    /* JADX INFO: renamed from: n */
    @yfb
    public static final String f36623n = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542";

    /* JADX INFO: renamed from: a */
    @yfb
    public final f5g<T> f36624a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final e23<T> f36625b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final x13 f36626c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final y56<T> f36627d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final y7b f36628e;

    /* JADX INFO: renamed from: f */
    public int f36629f;

    /* JADX INFO: renamed from: g */
    @gib
    public jj8 f36630g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final gi3<T> f36631h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final fi3<T>.C5814b f36632i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final fx8<g5g<T>> f36633j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final fx8 f36634k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final qcf<csa.C4487b<T>> f36635l;

    /* JADX INFO: renamed from: fi3$a */
    public static final class C5813a {
        public /* synthetic */ C5813a(jt3 jt3Var) {
            this();
        }

        private C5813a() {
        }
    }

    /* JADX INFO: renamed from: fi3$b */
    public final class C5814b extends cde {

        /* JADX INFO: renamed from: c */
        @gib
        public List<? extends gz6<? super w18<T>, ? super zy2<? super bth>, ? extends Object>> f36636c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ fi3<T> f36637d;

        /* JADX INFO: renamed from: fi3$b$a */
        @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$InitDataStore", m4010f = "DataStoreImpl.kt", m4011i = {0, 1}, m4012l = {Videoio.CAP_PROP_XI_BINNING_PATTERN, 434}, m4013m = "doRun", m4014n = {"this", "this"}, m4015s = {"L$0", "L$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public Object f36638a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f36639b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ fi3<T>.C5814b f36640c;

            /* JADX INFO: renamed from: d */
            public int f36641d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(fi3<T>.C5814b c5814b, zy2<? super a> zy2Var) {
                super(zy2Var);
                this.f36640c = c5814b;
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                this.f36639b = obj;
                this.f36641d |= Integer.MIN_VALUE;
                return this.f36640c.mo3903a(this);
            }
        }

        /* JADX INFO: renamed from: fi3$b$b */
        @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", m4010f = "DataStoreImpl.kt", m4011i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, m4012l = {Videoio.CAP_PROP_XI_SENSOR_TAPS, 458, Videoio.CAP_PROP_XI_TS_RST_SOURCE, Videoio.CAP_PROP_XI_CHIP_TEMP}, m4013m = "invokeSuspend", m4014n = {"updateLock", "initializationComplete", "currentData", "updateLock", "initializationComplete", "currentData", "api", "initializationComplete", "currentData", "$this$withLock_u24default$iv"}, m4015s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
        @dwf({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n1855#2,2:539\n120#3,10:541\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1\n*L\n458#1:539,2\n461#1:541,10\n*E\n"})
        public static final class b extends ugg implements qy6<zy2<? super if3<T>>, Object> {

            /* JADX INFO: renamed from: C */
            public final /* synthetic */ fi3<T> f36642C;

            /* JADX INFO: renamed from: F */
            public final /* synthetic */ fi3<T>.C5814b f36643F;

            /* JADX INFO: renamed from: a */
            public Object f36644a;

            /* JADX INFO: renamed from: b */
            public Object f36645b;

            /* JADX INFO: renamed from: c */
            public Object f36646c;

            /* JADX INFO: renamed from: d */
            public Object f36647d;

            /* JADX INFO: renamed from: e */
            public Object f36648e;

            /* JADX INFO: renamed from: f */
            public int f36649f;

            /* JADX INFO: renamed from: m */
            public int f36650m;

            /* JADX INFO: renamed from: fi3$b$b$a */
            @dwf({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n120#2,10:539\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1\n*L\n441#1:539,10\n*E\n"})
            public static final class a implements w18<T> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ y7b f36651a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ jvd.C8114a f36652b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ jvd.C8121h<T> f36653c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ fi3<T> f36654d;

                /* JADX INFO: renamed from: fi3$b$b$a$a, reason: collision with other inner class name */
                @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", m4010f = "DataStoreImpl.kt", m4011i = {0, 0, 1, 2, 2}, m4012l = {Videoio.CAP_PROP_XI_TRG_DELAY, 447, Videoio.CAP_PROP_XI_WB_KG}, m4013m = "updateData", m4014n = {"transform", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "newData"}, m4015s = {"L$0", "L$1", "L$0", "L$0", "L$2"})
                public static final class C16442a extends cz2 {

                    /* JADX INFO: renamed from: C */
                    public int f36655C;

                    /* JADX INFO: renamed from: a */
                    public Object f36656a;

                    /* JADX INFO: renamed from: b */
                    public Object f36657b;

                    /* JADX INFO: renamed from: c */
                    public Object f36658c;

                    /* JADX INFO: renamed from: d */
                    public Object f36659d;

                    /* JADX INFO: renamed from: e */
                    public Object f36660e;

                    /* JADX INFO: renamed from: f */
                    public /* synthetic */ Object f36661f;

                    public C16442a(zy2<? super C16442a> zy2Var) {
                        super(zy2Var);
                    }

                    @Override // p000.tq0
                    @gib
                    public final Object invokeSuspend(@yfb Object obj) {
                        this.f36661f = obj;
                        this.f36655C |= Integer.MIN_VALUE;
                        return a.this.updateData(null, this);
                    }
                }

                public a(y7b y7bVar, jvd.C8114a c8114a, jvd.C8121h<T> c8121h, fi3<T> fi3Var) {
                    this.f36651a = y7bVar;
                    this.f36652b = c8114a;
                    this.f36653c = c8121h;
                    this.f36654d = fi3Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p000.w18
                @p000.gib
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object updateData(@p000.yfb p000.gz6<? super T, ? super p000.zy2<? super T>, ? extends java.lang.Object> r11, @p000.yfb p000.zy2<? super T> r12) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 231
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.fi3.C5814b.b.a.updateData(gz6, zy2):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(fi3<T> fi3Var, fi3<T>.C5814b c5814b, zy2<? super b> zy2Var) {
                super(1, zy2Var);
                this.f36642C = fi3Var;
                this.f36643F = c5814b;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@yfb zy2<?> zy2Var) {
                return new b(this.f36642C, this.f36643F, zy2Var);
            }

            @Override // p000.qy6
            @gib
            public final Object invoke(@gib zy2<? super if3<T>> zy2Var) {
                return ((b) create(zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00e6 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00f3  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x010d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x010e  */
            @Override // p000.tq0
            @p000.gib
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r13) throws java.lang.IllegalAccessException, p000.d23, java.lang.reflect.InvocationTargetException {
                /*
                    Method dump skipped, instruction units count: 288
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.fi3.C5814b.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C5814b(@yfb fi3 fi3Var, List<? extends gz6<? super w18<T>, ? super zy2<? super bth>, ? extends Object>> list) {
            md8.checkNotNullParameter(list, "initTasksList");
            this.f36637d = fi3Var;
            this.f36636c = v82.toList(list);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.cde
        @p000.gib
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object mo3903a(@p000.yfb p000.zy2<? super p000.bth> r7) throws java.lang.IllegalAccessException, p000.d23, java.lang.reflect.InvocationTargetException {
            /*
                r6 = this;
                boolean r0 = r7 instanceof p000.fi3.C5814b.a
                if (r0 == 0) goto L13
                r0 = r7
                fi3$b$a r0 = (p000.fi3.C5814b.a) r0
                int r1 = r0.f36641d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f36641d = r1
                goto L18
            L13:
                fi3$b$a r0 = new fi3$b$a
                r0.<init>(r6, r7)
            L18:
                java.lang.Object r7 = r0.f36639b
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f36641d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r0 = r0.f36638a
                fi3$b r0 = (p000.fi3.C5814b) r0
                p000.y7e.throwOnFailure(r7)
                goto L6b
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L38:
                java.lang.Object r0 = r0.f36638a
                fi3$b r0 = (p000.fi3.C5814b) r0
                p000.y7e.throwOnFailure(r7)
                goto L7d
            L40:
                p000.y7e.throwOnFailure(r7)
                java.util.List<? extends gz6<? super w18<T>, ? super zy2<? super bth>, ? extends java.lang.Object>> r7 = r6.f36636c
                if (r7 == 0) goto L6e
                p000.md8.checkNotNull(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L51
                goto L6e
            L51:
                fi3<T> r7 = r6.f36637d
                m98 r7 = p000.fi3.access$getCoordinator(r7)
                fi3$b$b r2 = new fi3$b$b
                fi3<T> r4 = r6.f36637d
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.f36638a = r6
                r0.f36641d = r3
                java.lang.Object r7 = r7.lock(r2, r0)
                if (r7 != r1) goto L6a
                return r1
            L6a:
                r0 = r6
            L6b:
                if3 r7 = (p000.if3) r7
                goto L7f
            L6e:
                fi3<T> r7 = r6.f36637d
                r0.f36638a = r6
                r0.f36641d = r4
                r2 = 0
                java.lang.Object r7 = p000.fi3.access$readDataOrHandleCorruption(r7, r2, r0)
                if (r7 != r1) goto L7c
                return r1
            L7c:
                r0 = r6
            L7d:
                if3 r7 = (p000.if3) r7
            L7f:
                fi3<T> r0 = r0.f36637d
                gi3 r0 = p000.fi3.access$getInMemoryCache$p(r0)
                r0.tryUpdate(r7)
                bth r7 = p000.bth.f14751a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.fi3.C5814b.mo3903a(zy2):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: fi3$c */
    public static final class C5815c extends tt8 implements ny6<m98> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fi3<T> f36663a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5815c(fi3<T> fi3Var) {
            super(0);
            this.f36663a = fi3Var;
        }

        @Override // p000.ny6
        @yfb
        public final m98 invoke() {
            return this.f36663a.getStorageConnection$datastore_core_release().getCoordinator();
        }
    }

    /* JADX INFO: renamed from: fi3$d */
    @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$data$1", m4010f = "DataStoreImpl.kt", m4011i = {0, 1, 1}, m4012l = {72, 74, 100}, m4013m = "invokeSuspend", m4014n = {"$this$flow", "$this$flow", "startState"}, m4015s = {"L$0", "L$0", "L$1"})
    @dwf({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$data$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,538:1\n53#2:539\n55#2:543\n50#3:540\n55#3:542\n107#4:541\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$data$1\n*L\n108#1:539\n108#1:543\n108#1:540\n108#1:542\n108#1:541\n*E\n"})
    public static final class C5816d extends ugg implements gz6<t66<? super T>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f36664a;

        /* JADX INFO: renamed from: b */
        public int f36665b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f36666c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ fi3<T> f36667d;

        /* JADX INFO: renamed from: fi3$d$a */
        @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$data$1$1", m4010f = "DataStoreImpl.kt", m4011i = {}, m4012l = {102}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<t66<? super g2g<T>>, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f36668a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ fi3<T> f36669b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(fi3<T> fi3Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f36669b = fi3Var;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f36669b, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb t66<? super g2g<T>> t66Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(t66Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f36668a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    fi3<T> fi3Var = this.f36669b;
                    this.f36668a = 1;
                    if (fi3Var.incrementCollector(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                return bth.f14751a;
            }
        }

        /* JADX INFO: renamed from: fi3$d$b */
        @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$data$1$2", m4010f = "DataStoreImpl.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<g2g<T>, zy2<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a */
            public int f36670a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f36671b;

            public b(zy2<? super b> zy2Var) {
                super(2, zy2Var);
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                b bVar = new b(zy2Var);
                bVar.f36671b = obj;
                return bVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb g2g<T> g2gVar, @gib zy2<? super Boolean> zy2Var) {
                return ((b) create(g2gVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f36670a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                return wc1.boxBoolean(!(((g2g) this.f36671b) instanceof qv5));
            }
        }

        /* JADX INFO: renamed from: fi3$d$c */
        @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$data$1$3", m4010f = "DataStoreImpl.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class c extends ugg implements gz6<g2g<T>, zy2<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a */
            public int f36672a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f36673b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ g2g<T> f36674c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(g2g<T> g2gVar, zy2<? super c> zy2Var) {
                super(2, zy2Var);
                this.f36674c = g2gVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                c cVar = new c(this.f36674c, zy2Var);
                cVar.f36673b = obj;
                return cVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb g2g<T> g2gVar, @gib zy2<? super Boolean> zy2Var) {
                return ((c) create(g2gVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f36672a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                g2g g2gVar = (g2g) this.f36673b;
                return wc1.boxBoolean((g2gVar instanceof if3) && g2gVar.getVersion() <= this.f36674c.getVersion());
            }
        }

        /* JADX INFO: renamed from: fi3$d$d */
        @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$data$1$5", m4010f = "DataStoreImpl.kt", m4011i = {}, m4012l = {116}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class d extends ugg implements kz6<t66<? super T>, Throwable, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f36675a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ fi3<T> f36676b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(fi3<T> fi3Var, zy2<? super d> zy2Var) {
                super(3, zy2Var);
                this.f36676b = fi3Var;
            }

            @Override // p000.kz6
            @gib
            public final Object invoke(@yfb t66<? super T> t66Var, @gib Throwable th, @gib zy2<? super bth> zy2Var) {
                return new d(this.f36676b, zy2Var).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f36675a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    fi3<T> fi3Var = this.f36676b;
                    this.f36675a = 1;
                    if (fi3Var.decrementCollector(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                return bth.f14751a;
            }
        }

        /* JADX INFO: renamed from: fi3$d$e */
        @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
        public static final class e implements y56<T> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ y56 f36677a;

            /* JADX INFO: renamed from: fi3$d$e$a */
            @dwf({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$data$1\n*L\n1#1,222:1\n54#2:223\n109#3,5:224\n*E\n"})
            public static final class a<T> implements t66 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ t66 f36678a;

                /* JADX INFO: renamed from: fi3$d$e$a$a, reason: collision with other inner class name */
                @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", m4010f = "DataStoreImpl.kt", m4011i = {}, m4012l = {223}, m4013m = "emit", m4014n = {}, m4015s = {})
                @dwf({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                public static final class C16443a extends cz2 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f36679a;

                    /* JADX INFO: renamed from: b */
                    public int f36680b;

                    /* JADX INFO: renamed from: c */
                    public Object f36681c;

                    public C16443a(zy2 zy2Var) {
                        super(zy2Var);
                    }

                    @Override // p000.tq0
                    @gib
                    public final Object invokeSuspend(@yfb Object obj) {
                        this.f36679a = obj;
                        this.f36680b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(t66 t66Var) {
                    this.f36678a = t66Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p000.t66
                @p000.gib
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, @p000.yfb p000.zy2 r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof p000.fi3.C5816d.e.a.C16443a
                        if (r0 == 0) goto L13
                        r0 = r6
                        fi3$d$e$a$a r0 = (p000.fi3.C5816d.e.a.C16443a) r0
                        int r1 = r0.f36680b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f36680b = r1
                        goto L18
                    L13:
                        fi3$d$e$a$a r0 = new fi3$d$e$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f36679a
                        java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f36680b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        p000.y7e.throwOnFailure(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        p000.y7e.throwOnFailure(r6)
                        t66 r6 = r4.f36678a
                        g2g r5 = (p000.g2g) r5
                        boolean r2 = r5 instanceof p000.sqd
                        if (r2 != 0) goto L69
                        boolean r2 = r5 instanceof p000.if3
                        if (r2 == 0) goto L52
                        if3 r5 = (p000.if3) r5
                        java.lang.Object r5 = r5.getValue()
                        r0.f36680b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        bth r5 = p000.bth.f14751a
                        return r5
                    L52:
                        boolean r6 = r5 instanceof p000.qv5
                        if (r6 == 0) goto L57
                        goto L59
                    L57:
                        boolean r3 = r5 instanceof p000.frh
                    L59:
                        if (r3 == 0) goto L63
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        r5.<init>(r6)
                        throw r5
                    L63:
                        ceb r5 = new ceb
                        r5.<init>()
                        throw r5
                    L69:
                        sqd r5 = (p000.sqd) r5
                        java.lang.Throwable r5 = r5.getReadException()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.fi3.C5816d.e.a.emit(java.lang.Object, zy2):java.lang.Object");
                }
            }

            public e(y56 y56Var) {
                this.f36677a = y56Var;
            }

            @Override // p000.y56
            @gib
            public Object collect(@yfb t66 t66Var, @yfb zy2 zy2Var) {
                Object objCollect = this.f36677a.collect(new a(t66Var), zy2Var);
                return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5816d(fi3<T> fi3Var, zy2<? super C5816d> zy2Var) {
            super(2, zy2Var);
            this.f36667d = fi3Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C5816d c5816d = new C5816d(this.f36667d, zy2Var);
            c5816d.f36666c = obj;
            return c5816d;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb t66<? super T> t66Var, @gib zy2<? super bth> zy2Var) {
            return ((C5816d) create(t66Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00bc A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, t66] */
        /* JADX WARN: Type inference failed for: r1v6, types: [t66] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 207
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.fi3.C5816d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: fi3$e */
    @ck3(m4009c = "androidx.datastore.core.DataStoreImpl", m4010f = "DataStoreImpl.kt", m4011i = {0, 0}, m4012l = {Videoio.CAP_PROP_XI_TRG_DELAY}, m4013m = "decrementCollector", m4014n = {"this", "$this$withLock_u24default$iv"}, m4015s = {"L$0", "L$1"})
    public static final class C5817e extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f36683a;

        /* JADX INFO: renamed from: b */
        public Object f36684b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f36685c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ fi3<T> f36686d;

        /* JADX INFO: renamed from: e */
        public int f36687e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5817e(fi3<T> fi3Var, zy2<? super C5817e> zy2Var) {
            super(zy2Var);
            this.f36686d = fi3Var;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f36685c = obj;
            this.f36687e |= Integer.MIN_VALUE;
            return this.f36686d.decrementCollector(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: fi3$f */
    @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", m4010f = "DataStoreImpl.kt", m4011i = {}, m4012l = {416}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5818f<R> extends ugg implements qy6<zy2<? super R>, Object> {

        /* JADX INFO: renamed from: a */
        public int f36688a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<zy2<? super R>, Object> f36689b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5818f(qy6<? super zy2<? super R>, ? extends Object> qy6Var, zy2<? super C5818f> zy2Var) {
            super(1, zy2Var);
            this.f36689b = qy6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@yfb zy2<?> zy2Var) {
            return new C5818f(this.f36689b, zy2Var);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@gib zy2<? super R> zy2Var) {
            return ((C5818f) create(zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f36688a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                qy6<zy2<? super R>, Object> qy6Var = this.f36689b;
                this.f36688a = 1;
                obj = qy6Var.invoke(this);
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

    /* JADX INFO: renamed from: fi3$g */
    @ck3(m4009c = "androidx.datastore.core.DataStoreImpl", m4010f = "DataStoreImpl.kt", m4011i = {1, 1}, m4012l = {237, 243, 246}, m4013m = "handleUpdate", m4014n = {"update", "$this$handleUpdate_u24lambda_u242"}, m4015s = {"L$0", "L$1"})
    public static final class C5819g extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f36690a;

        /* JADX INFO: renamed from: b */
        public Object f36691b;

        /* JADX INFO: renamed from: c */
        public Object f36692c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f36693d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ fi3<T> f36694e;

        /* JADX INFO: renamed from: f */
        public int f36695f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5819g(fi3<T> fi3Var, zy2<? super C5819g> zy2Var) {
            super(zy2Var);
            this.f36694e = fi3Var;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f36693d = obj;
            this.f36695f |= Integer.MIN_VALUE;
            return this.f36694e.handleUpdate(null, this);
        }
    }

    /* JADX INFO: renamed from: fi3$h */
    @ck3(m4009c = "androidx.datastore.core.DataStoreImpl", m4010f = "DataStoreImpl.kt", m4011i = {0, 0}, m4012l = {Videoio.CAP_PROP_XI_TRG_DELAY}, m4013m = "incrementCollector", m4014n = {"this", "$this$withLock_u24default$iv"}, m4015s = {"L$0", "L$1"})
    public static final class C5820h extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f36696a;

        /* JADX INFO: renamed from: b */
        public Object f36697b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f36698c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ fi3<T> f36699d;

        /* JADX INFO: renamed from: e */
        public int f36700e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5820h(fi3<T> fi3Var, zy2<? super C5820h> zy2Var) {
            super(zy2Var);
            this.f36699d = fi3Var;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f36698c = obj;
            this.f36700e |= Integer.MIN_VALUE;
            return this.f36699d.incrementCollector(this);
        }
    }

    /* JADX INFO: renamed from: fi3$i */
    @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", m4010f = "DataStoreImpl.kt", m4011i = {}, m4012l = {134, 135}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5821i extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f36701a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ fi3<T> f36702b;

        /* JADX INFO: renamed from: fi3$i$a */
        public static final class a<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ fi3<T> f36703a;

            public a(fi3<T> fi3Var) {
                this.f36703a = fi3Var;
            }

            @Override // p000.t66
            public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
                return emit((bth) obj, (zy2<? super bth>) zy2Var);
            }

            @gib
            public final Object emit(@yfb bth bthVar, @yfb zy2<? super bth> zy2Var) {
                if (this.f36703a.f36631h.getCurrentState() instanceof qv5) {
                    return bth.f14751a;
                }
                Object dataAndUpdateCache = this.f36703a.readDataAndUpdateCache(true, zy2Var);
                return dataAndUpdateCache == pd8.getCOROUTINE_SUSPENDED() ? dataAndUpdateCache : bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5821i(fi3<T> fi3Var, zy2<? super C5821i> zy2Var) {
            super(2, zy2Var);
            this.f36702b = fi3Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C5821i(this.f36702b, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C5821i) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f36701a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                C5814b c5814b = this.f36702b.f36632i;
                this.f36701a = 1;
                if (c5814b.awaitComplete(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                    return bth.f14751a;
                }
                y7e.throwOnFailure(obj);
            }
            y56 y56VarConflate = c76.conflate(this.f36702b.getCoordinator().getUpdateNotifications());
            a aVar = new a(this.f36702b);
            this.f36701a = 2;
            if (y56VarConflate.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: fi3$j */
    @ck3(m4009c = "androidx.datastore.core.DataStoreImpl", m4010f = "DataStoreImpl.kt", m4011i = {0, 1, 1}, m4012l = {C1337g.e.c.f10358n, MediaPlayer.Event.EncounteredError}, m4013m = "readAndInitOrPropagateAndThrowFailure", m4014n = {"this", "this", "preReadVersion"}, m4015s = {"L$0", "L$0", "I$0"})
    public static final class C5822j extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f36704a;

        /* JADX INFO: renamed from: b */
        public int f36705b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f36706c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ fi3<T> f36707d;

        /* JADX INFO: renamed from: e */
        public int f36708e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5822j(fi3<T> fi3Var, zy2<? super C5822j> zy2Var) {
            super(zy2Var);
            this.f36707d = fi3Var;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f36706c = obj;
            this.f36708e |= Integer.MIN_VALUE;
            return this.f36707d.readAndInitOrPropagateAndThrowFailure(this);
        }
    }

    /* JADX INFO: renamed from: fi3$k */
    @ck3(m4009c = "androidx.datastore.core.DataStoreImpl", m4010f = "DataStoreImpl.kt", m4011i = {0, 0, 0, 1, 2}, m4012l = {287, 296, 304}, m4013m = "readDataAndUpdateCache", m4014n = {"this", "currentState", "requireLock", "this", "this"}, m4015s = {"L$0", "L$1", "Z$0", "L$0", "L$0"})
    public static final class C5823k extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f36709a;

        /* JADX INFO: renamed from: b */
        public Object f36710b;

        /* JADX INFO: renamed from: c */
        public boolean f36711c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f36712d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ fi3<T> f36713e;

        /* JADX INFO: renamed from: f */
        public int f36714f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5823k(fi3<T> fi3Var, zy2<? super C5823k> zy2Var) {
            super(zy2Var);
            this.f36713e = fi3Var;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f36712d = obj;
            this.f36714f |= Integer.MIN_VALUE;
            return this.f36713e.readDataAndUpdateCache(false, this);
        }
    }

    /* JADX INFO: renamed from: fi3$l */
    @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", m4010f = "DataStoreImpl.kt", m4011i = {}, m4012l = {298, 300}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5824l extends ugg implements qy6<zy2<? super scc<? extends g2g<T>, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f36715a;

        /* JADX INFO: renamed from: b */
        public int f36716b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ fi3<T> f36717c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5824l(fi3<T> fi3Var, zy2<? super C5824l> zy2Var) {
            super(1, zy2Var);
            this.f36717c = fi3Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@yfb zy2<?> zy2Var) {
            return new C5824l(this.f36717c, zy2Var);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@gib zy2<? super scc<? extends g2g<T>, Boolean>> zy2Var) {
            return ((C5824l) create(zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Throwable th;
            g2g sqdVar;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f36716b;
            try {
            } catch (Throwable th2) {
                m98 coordinator = this.f36717c.getCoordinator();
                this.f36715a = th2;
                this.f36716b = 2;
                Object version = coordinator.getVersion(this);
                if (version == coroutine_suspended) {
                    return coroutine_suspended;
                }
                th = th2;
                obj = version;
            }
            if (i == 0) {
                y7e.throwOnFailure(obj);
                fi3<T> fi3Var = this.f36717c;
                this.f36716b = 1;
                obj = fi3Var.readDataOrHandleCorruption(true, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.f36715a;
                    y7e.throwOnFailure(obj);
                    sqdVar = new sqd(th, ((Number) obj).intValue());
                    return vkh.m24050to(sqdVar, wc1.boxBoolean(true));
                }
                y7e.throwOnFailure(obj);
            }
            sqdVar = (g2g) obj;
            return vkh.m24050to(sqdVar, wc1.boxBoolean(true));
        }
    }

    /* JADX INFO: renamed from: fi3$m */
    @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", m4010f = "DataStoreImpl.kt", m4011i = {0, 1}, m4012l = {306, 309}, m4013m = "invokeSuspend", m4014n = {"locked", "locked"}, m4015s = {"Z$0", "Z$0"})
    public static final class C5825m extends ugg implements gz6<Boolean, zy2<? super scc<? extends g2g<T>, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f36718a;

        /* JADX INFO: renamed from: b */
        public int f36719b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ boolean f36720c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ fi3<T> f36721d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f36722e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5825m(fi3<T> fi3Var, int i, zy2<? super C5825m> zy2Var) {
            super(2, zy2Var);
            this.f36721d = fi3Var;
            this.f36722e = i;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C5825m c5825m = new C5825m(this.f36721d, this.f36722e, zy2Var);
            c5825m.f36720c = ((Boolean) obj).booleanValue();
            return c5825m;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return invoke(bool.booleanValue(), (zy2) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r4v0 */
        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Throwable th;
            int iIntValue;
            ?? r0;
            ?? r02;
            g2g g2gVar;
            ?? r1;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            ?? r12 = this.f36719b;
            try {
            } catch (Throwable th2) {
                if (r12 == 0) {
                    ?? r4 = r12;
                    th = th2;
                    iIntValue = this.f36722e;
                    r0 = r4 == true ? 1 : 0;
                    sqd sqdVar = new sqd(th, iIntValue);
                    r1 = r0;
                    g2gVar = sqdVar;
                    return vkh.m24050to(g2gVar, wc1.boxBoolean(r1));
                }
                m98 coordinator = this.f36721d.getCoordinator();
                this.f36718a = th2;
                this.f36720c = r12;
                this.f36719b = 2;
                Object version = coordinator.getVersion(this);
                if (version == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r02 = r12;
                th = th2;
                obj = version;
            }
            if (r12 == 0) {
                y7e.throwOnFailure(obj);
                boolean z = this.f36720c;
                fi3<T> fi3Var = this.f36721d;
                this.f36720c = z;
                this.f36719b = 1;
                obj = fi3Var.readDataOrHandleCorruption(z, this);
                r12 = z;
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = this.f36720c;
                    th = (Throwable) this.f36718a;
                    y7e.throwOnFailure(obj);
                    r02 = z2;
                    iIntValue = ((Number) obj).intValue();
                    r0 = r02;
                    sqd sqdVar2 = new sqd(th, iIntValue);
                    r1 = r0;
                    g2gVar = sqdVar2;
                    return vkh.m24050to(g2gVar, wc1.boxBoolean(r1));
                }
                boolean z3 = this.f36720c;
                y7e.throwOnFailure(obj);
                r12 = z3;
            }
            g2gVar = (g2g) obj;
            r1 = r12;
            return vkh.m24050to(g2gVar, wc1.boxBoolean(r1));
        }

        @gib
        public final Object invoke(boolean z, @gib zy2<? super scc<? extends g2g<T>, Boolean>> zy2Var) {
            return ((C5825m) create(Boolean.valueOf(z), zy2Var)).invokeSuspend(bth.f14751a);
        }
    }

    /* JADX INFO: renamed from: fi3$n */
    @ck3(m4009c = "androidx.datastore.core.DataStoreImpl", m4010f = "DataStoreImpl.kt", m4011i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5}, m4012l = {365, 366, BuildConfig.VERSION_CODE, 369, 380, 384}, m4013m = "readDataOrHandleCorruption", m4014n = {"this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "ex", "newData", "hasWriteFileLock", "ex", "newData", "version"}, m4015s = {"L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2"})
    public static final class C5826n extends cz2 {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ fi3<T> f36723C;

        /* JADX INFO: renamed from: F */
        public int f36724F;

        /* JADX INFO: renamed from: a */
        public Object f36725a;

        /* JADX INFO: renamed from: b */
        public Object f36726b;

        /* JADX INFO: renamed from: c */
        public Object f36727c;

        /* JADX INFO: renamed from: d */
        public Object f36728d;

        /* JADX INFO: renamed from: e */
        public boolean f36729e;

        /* JADX INFO: renamed from: f */
        public int f36730f;

        /* JADX INFO: renamed from: m */
        public /* synthetic */ Object f36731m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5826n(fi3<T> fi3Var, zy2<? super C5826n> zy2Var) {
            super(zy2Var);
            this.f36723C = fi3Var;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f36731m = obj;
            this.f36724F |= Integer.MIN_VALUE;
            return this.f36723C.readDataOrHandleCorruption(false, this);
        }
    }

    /* JADX INFO: renamed from: fi3$o */
    @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", m4010f = "DataStoreImpl.kt", m4011i = {0, 1}, m4012l = {370, 371}, m4013m = "invokeSuspend", m4014n = {"locked", "data"}, m4015s = {"Z$0", "L$0"})
    public static final class C5827o extends ugg implements gz6<Boolean, zy2<? super if3<T>>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f36732a;

        /* JADX INFO: renamed from: b */
        public int f36733b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ boolean f36734c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ fi3<T> f36735d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f36736e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5827o(fi3<T> fi3Var, int i, zy2<? super C5827o> zy2Var) {
            super(2, zy2Var);
            this.f36735d = fi3Var;
            this.f36736e = i;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C5827o c5827o = new C5827o(this.f36735d, this.f36736e, zy2Var);
            c5827o.f36734c = ((Boolean) obj).booleanValue();
            return c5827o;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return invoke(bool.booleanValue(), (zy2) obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r5.f36733b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r5.f36732a
                p000.y7e.throwOnFailure(r6)
                goto L49
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                boolean r1 = r5.f36734c
                p000.y7e.throwOnFailure(r6)
                goto L34
            L22:
                p000.y7e.throwOnFailure(r6)
                boolean r1 = r5.f36734c
                fi3<T> r6 = r5.f36735d
                r5.f36734c = r1
                r5.f36733b = r3
                java.lang.Object r6 = p000.fi3.access$readDataFromFileOrDefault(r6, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                if (r1 == 0) goto L50
                fi3<T> r1 = r5.f36735d
                m98 r1 = p000.fi3.access$getCoordinator(r1)
                r5.f36732a = r6
                r5.f36733b = r2
                java.lang.Object r1 = r1.getVersion(r5)
                if (r1 != r0) goto L47
                return r0
            L47:
                r0 = r6
                r6 = r1
            L49:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                goto L55
            L50:
                int r0 = r5.f36736e
                r4 = r0
                r0 = r6
                r6 = r4
            L55:
                if3 r1 = new if3
                if (r0 == 0) goto L5e
                int r2 = r0.hashCode()
                goto L5f
            L5e:
                r2 = 0
            L5f:
                r1.<init>(r0, r2, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.fi3.C5827o.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @gib
        public final Object invoke(boolean z, @gib zy2<? super if3<T>> zy2Var) {
            return ((C5827o) create(Boolean.valueOf(z), zy2Var)).invokeSuspend(bth.f14751a);
        }
    }

    /* JADX INFO: renamed from: fi3$p */
    @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", m4010f = "DataStoreImpl.kt", m4011i = {}, m4012l = {387, 388, 390}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5828p extends ugg implements qy6<zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f36737a;

        /* JADX INFO: renamed from: b */
        public int f36738b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jvd.C8121h<T> f36739c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ fi3<T> f36740d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ jvd.C8119f f36741e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5828p(jvd.C8121h<T> c8121h, fi3<T> fi3Var, jvd.C8119f c8119f, zy2<? super C5828p> zy2Var) {
            super(1, zy2Var);
            this.f36739c = c8121h;
            this.f36740d = fi3Var;
            this.f36741e = c8119f;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@yfb zy2<?> zy2Var) {
            return new C5828p(this.f36739c, this.f36740d, this.f36741e, zy2Var);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@gib zy2<? super bth> zy2Var) {
            return ((C5828p) create(zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            jvd.C8119f c8119f;
            jvd.C8121h<T> c8121h;
            jvd.C8119f c8119f2;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f36738b;
            try {
            } catch (d23 unused) {
                jvd.C8119f c8119f3 = this.f36741e;
                fi3<T> fi3Var = this.f36740d;
                T t = this.f36739c.f52110a;
                this.f36737a = c8119f3;
                this.f36738b = 3;
                Object objWriteData$datastore_core_release = fi3Var.writeData$datastore_core_release(t, true, this);
                if (objWriteData$datastore_core_release == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c8119f = c8119f3;
                obj = (T) objWriteData$datastore_core_release;
            }
            if (i == 0) {
                y7e.throwOnFailure(obj);
                c8121h = this.f36739c;
                fi3<T> fi3Var2 = this.f36740d;
                this.f36737a = c8121h;
                this.f36738b = 1;
                obj = (T) fi3Var2.readDataFromFileOrDefault(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        c8119f2 = (jvd.C8119f) this.f36737a;
                        y7e.throwOnFailure(obj);
                        c8119f2.f52108a = ((Number) obj).intValue();
                        return bth.f14751a;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c8119f = (jvd.C8119f) this.f36737a;
                    y7e.throwOnFailure(obj);
                    c8119f.f52108a = ((Number) obj).intValue();
                    return bth.f14751a;
                }
                c8121h = (jvd.C8121h) this.f36737a;
                y7e.throwOnFailure(obj);
            }
            c8121h.f52110a = (T) obj;
            c8119f2 = this.f36741e;
            m98 coordinator = this.f36740d.getCoordinator();
            this.f36737a = c8119f2;
            this.f36738b = 2;
            obj = (T) coordinator.getVersion(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            c8119f2.f52108a = ((Number) obj).intValue();
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: fi3$q */
    @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$readState$2", m4010f = "DataStoreImpl.kt", m4011i = {}, m4012l = {bw3.f14995j, nb2.f63860h}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5829q extends ugg implements gz6<x13, zy2<? super g2g<T>>, Object> {

        /* JADX INFO: renamed from: a */
        public int f36742a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ fi3<T> f36743b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f36744c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5829q(fi3<T> fi3Var, boolean z, zy2<? super C5829q> zy2Var) {
            super(2, zy2Var);
            this.f36743b = fi3Var;
            this.f36744c = z;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C5829q(this.f36743b, this.f36744c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super g2g<T>> zy2Var) {
            return ((C5829q) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f36742a;
            try {
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    if (this.f36743b.f36631h.getCurrentState() instanceof qv5) {
                        return this.f36743b.f36631h.getCurrentState();
                    }
                    fi3<T> fi3Var = this.f36743b;
                    this.f36742a = 1;
                    if (fi3Var.readAndInitOrPropagateAndThrowFailure(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                        return (g2g) obj;
                    }
                    y7e.throwOnFailure(obj);
                }
                fi3<T> fi3Var2 = this.f36743b;
                boolean z = this.f36744c;
                this.f36742a = 2;
                obj = fi3Var2.readDataAndUpdateCache(z, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (g2g) obj;
            } catch (Throwable th) {
                return new sqd(th, -1);
            }
        }
    }

    /* JADX INFO: renamed from: fi3$r */
    public static final class C5830r extends tt8 implements ny6<g5g<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fi3<T> f36745a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5830r(fi3<T> fi3Var) {
            super(0);
            this.f36745a = fi3Var;
        }

        @Override // p000.ny6
        @yfb
        public final g5g<T> invoke() {
            return this.f36745a.f36624a.createConnection();
        }
    }

    /* JADX INFO: renamed from: fi3$s */
    @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", m4010f = "DataStoreImpl.kt", m4011i = {1, 2}, m4012l = {330, 331, 337}, m4013m = "invokeSuspend", m4014n = {"curData", "newData"}, m4015s = {"L$0", "L$0"})
    public static final class C5831s extends ugg implements qy6<zy2<? super T>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f36746a;

        /* JADX INFO: renamed from: b */
        public int f36747b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ fi3<T> f36748c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ e13 f36749d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gz6<T, zy2<? super T>, Object> f36750e;

        /* JADX INFO: renamed from: fi3$s$a */
        @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", m4010f = "DataStoreImpl.kt", m4011i = {}, m4012l = {331}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super T>, Object> {

            /* JADX INFO: renamed from: a */
            public int f36751a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ gz6<T, zy2<? super T>, Object> f36752b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ if3<T> f36753c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(gz6<? super T, ? super zy2<? super T>, ? extends Object> gz6Var, if3<T> if3Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f36752b = gz6Var;
                this.f36753c = if3Var;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f36752b, this.f36753c, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super T> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to fi3$s$a for r3v1 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // p000.tq0
            @p000.gib
            public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r1 = r3.f36751a
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p000.y7e.throwOnFailure(r4)
                    goto L2b
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    p000.y7e.throwOnFailure(r4)
                    gz6<T, zy2<? super T>, java.lang.Object> r4 = r3.f36752b
                    if3<T> r1 = r3.f36753c
                    java.lang.Object r1 = r1.getValue()
                    r3.f36751a = r2
                    java.lang.Object r4 = r4.invoke(r1, r3)
                    if (r4 != r0) goto L2b
                    return r0
                L2b:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.fi3.C5831s.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5831s(fi3<T> fi3Var, e13 e13Var, gz6<? super T, ? super zy2<? super T>, ? extends Object> gz6Var, zy2<? super C5831s> zy2Var) {
            super(1, zy2Var);
            this.f36748c = fi3Var;
            this.f36749d = e13Var;
            this.f36750e = gz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@yfb zy2<?> zy2Var) {
            return new C5831s(this.f36748c, this.f36749d, this.f36750e, zy2Var);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@gib zy2<? super T> zy2Var) {
            return ((C5831s) create(zy2Var)).invokeSuspend(bth.f14751a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type zy2 to fi3$s for r8v1 'this'  zy2
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p000.tq0
        @p000.gib
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r8.f36747b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.f36746a
                p000.y7e.throwOnFailure(r9)
                goto L6c
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f36746a
                if3 r1 = (p000.if3) r1
                p000.y7e.throwOnFailure(r9)
                goto L51
            L27:
                p000.y7e.throwOnFailure(r9)
                goto L39
            L2b:
                p000.y7e.throwOnFailure(r9)
                fi3<T> r9 = r8.f36748c
                r8.f36747b = r4
                java.lang.Object r9 = p000.fi3.access$readDataOrHandleCorruption(r9, r4, r8)
                if (r9 != r0) goto L39
                return r0
            L39:
                r1 = r9
                if3 r1 = (p000.if3) r1
                e13 r9 = r8.f36749d
                fi3$s$a r5 = new fi3$s$a
                gz6<T, zy2<? super T>, java.lang.Object> r6 = r8.f36750e
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.f36746a = r1
                r8.f36747b = r3
                java.lang.Object r9 = p000.dg1.withContext(r9, r5, r8)
                if (r9 != r0) goto L51
                return r0
            L51:
                r1.checkHashCode()
                java.lang.Object r1 = r1.getValue()
                boolean r1 = p000.md8.areEqual(r1, r9)
                if (r1 != 0) goto L6d
                fi3<T> r1 = r8.f36748c
                r8.f36746a = r9
                r8.f36747b = r2
                java.lang.Object r1 = r1.writeData$datastore_core_release(r9, r4, r8)
                if (r1 != r0) goto L6b
                return r0
            L6b:
                r0 = r9
            L6c:
                r9 = r0
            L6d:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.fi3.C5831s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: fi3$t */
    @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$updateData$2", m4010f = "DataStoreImpl.kt", m4011i = {}, m4012l = {169}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5832t extends ugg implements gz6<x13, zy2<? super T>, Object> {

        /* JADX INFO: renamed from: a */
        public int f36754a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f36755b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ fi3<T> f36756c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6<T, zy2<? super T>, Object> f36757d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5832t(fi3<T> fi3Var, gz6<? super T, ? super zy2<? super T>, ? extends Object> gz6Var, zy2<? super C5832t> zy2Var) {
            super(2, zy2Var);
            this.f36756c = fi3Var;
            this.f36757d = gz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C5832t c5832t = new C5832t(this.f36756c, this.f36757d, zy2Var);
            c5832t.f36755b = obj;
            return c5832t;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super T> zy2Var) {
            return ((C5832t) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) throws Throwable {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f36754a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                x13 x13Var = (x13) this.f36755b;
                ve2 ve2VarCompletableDeferred$default = xe2.CompletableDeferred$default(null, 1, null);
                this.f36756c.f36635l.offer(new csa.C4487b(this.f36757d, ve2VarCompletableDeferred$default, this.f36756c.f36631h.getCurrentState(), x13Var.getCoroutineContext()));
                this.f36754a = 1;
                obj = ve2VarCompletableDeferred$default.await(this);
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

    /* JADX INFO: renamed from: fi3$u */
    public static final class C5833u extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fi3<T> f36758a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5833u(fi3<T> fi3Var) {
            super(1);
            this.f36758a = fi3Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Throwable th) {
            if (th != null) {
                this.f36758a.f36631h.tryUpdate(new qv5(th));
            }
            if (this.f36758a.f36633j.isInitialized()) {
                this.f36758a.getStorageConnection$datastore_core_release().close();
            }
        }
    }

    /* JADX INFO: renamed from: fi3$v */
    public static final class C5834v extends tt8 implements gz6<csa.C4487b<T>, Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5834v f36759a = new C5834v();

        public C5834v() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(Object obj, Throwable th) {
            invoke((csa.C4487b) obj, th);
            return bth.f14751a;
        }

        public final void invoke(@yfb csa.C4487b<T> c4487b, @gib Throwable th) {
            md8.checkNotNullParameter(c4487b, NotificationCompat.CATEGORY_MESSAGE);
            ve2<T> ack = c4487b.getAck();
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            ack.completeExceptionally(th);
        }
    }

    /* JADX INFO: renamed from: fi3$w */
    @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$writeActor$3", m4010f = "DataStoreImpl.kt", m4011i = {}, m4012l = {gm2.f40180q}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5835w extends ugg implements gz6<csa.C4487b<T>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f36760a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f36761b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ fi3<T> f36762c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5835w(fi3<T> fi3Var, zy2<? super C5835w> zy2Var) {
            super(2, zy2Var);
            this.f36762c = fi3Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C5835w c5835w = new C5835w(this.f36762c, zy2Var);
            c5835w.f36761b = obj;
            return c5835w;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb csa.C4487b<T> c4487b, @gib zy2<? super bth> zy2Var) {
            return ((C5835w) create(c4487b, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f36760a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                csa.C4487b c4487b = (csa.C4487b) this.f36761b;
                fi3<T> fi3Var = this.f36762c;
                this.f36760a = 1;
                if (fi3Var.handleUpdate(c4487b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: fi3$x */
    @ck3(m4009c = "androidx.datastore.core.DataStoreImpl", m4010f = "DataStoreImpl.kt", m4011i = {0}, m4012l = {348}, m4013m = "writeData$datastore_core_release", m4014n = {"newVersion"}, m4015s = {"L$0"})
    public static final class C5836x extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f36763a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f36764b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ fi3<T> f36765c;

        /* JADX INFO: renamed from: d */
        public int f36766d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5836x(fi3<T> fi3Var, zy2<? super C5836x> zy2Var) {
            super(zy2Var);
            this.f36765c = fi3Var;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f36764b = obj;
            this.f36766d |= Integer.MIN_VALUE;
            return this.f36765c.writeData$datastore_core_release(null, false, this);
        }
    }

    /* JADX INFO: renamed from: fi3$y */
    @ck3(m4009c = "androidx.datastore.core.DataStoreImpl$writeData$2", m4010f = "DataStoreImpl.kt", m4011i = {0}, m4012l = {352, 353}, m4013m = "invokeSuspend", m4014n = {"$this$writeScope"}, m4015s = {"L$0"})
    public static final class C5837y extends ugg implements gz6<msi<T>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f36767a;

        /* JADX INFO: renamed from: b */
        public int f36768b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f36769c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ jvd.C8119f f36770d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ fi3<T> f36771e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ T f36772f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ boolean f36773m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5837y(jvd.C8119f c8119f, fi3<T> fi3Var, T t, boolean z, zy2<? super C5837y> zy2Var) {
            super(2, zy2Var);
            this.f36770d = c8119f;
            this.f36771e = fi3Var;
            this.f36772f = t;
            this.f36773m = z;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C5837y c5837y = new C5837y(this.f36770d, this.f36771e, this.f36772f, this.f36773m, zy2Var);
            c5837y.f36769c = obj;
            return c5837y;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb msi<T> msiVar, @gib zy2<? super bth> zy2Var) {
            return ((C5837y) create(msiVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r6.f36768b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p000.y7e.throwOnFailure(r7)
                goto L5d
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f36767a
                jvd$f r1 = (p000.jvd.C8119f) r1
                java.lang.Object r3 = r6.f36769c
                msi r3 = (p000.msi) r3
                p000.y7e.throwOnFailure(r7)
                goto L45
            L26:
                p000.y7e.throwOnFailure(r7)
                java.lang.Object r7 = r6.f36769c
                msi r7 = (p000.msi) r7
                jvd$f r1 = r6.f36770d
                fi3<T> r4 = r6.f36771e
                m98 r4 = p000.fi3.access$getCoordinator(r4)
                r6.f36769c = r7
                r6.f36767a = r1
                r6.f36768b = r3
                java.lang.Object r3 = r4.incrementAndGetVersion(r6)
                if (r3 != r0) goto L42
                return r0
            L42:
                r5 = r3
                r3 = r7
                r7 = r5
            L45:
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r1.f52108a = r7
                T r7 = r6.f36772f
                r1 = 0
                r6.f36769c = r1
                r6.f36767a = r1
                r6.f36768b = r2
                java.lang.Object r7 = r3.writeData(r7, r6)
                if (r7 != r0) goto L5d
                return r0
            L5d:
                boolean r7 = r6.f36773m
                if (r7 == 0) goto L7d
                fi3<T> r7 = r6.f36771e
                gi3 r7 = p000.fi3.access$getInMemoryCache$p(r7)
                if3 r0 = new if3
                T r1 = r6.f36772f
                if (r1 == 0) goto L72
                int r2 = r1.hashCode()
                goto L73
            L72:
                r2 = 0
            L73:
                jvd$f r3 = r6.f36770d
                int r3 = r3.f52108a
                r0.<init>(r1, r2, r3)
                r7.tryUpdate(r0)
            L7d:
                bth r7 = p000.bth.f14751a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.fi3.C5837y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public fi3(@yfb f5g<T> f5gVar, @yfb List<? extends gz6<? super w18<T>, ? super zy2<? super bth>, ? extends Object>> list, @yfb e23<T> e23Var, @yfb x13 x13Var) {
        md8.checkNotNullParameter(f5gVar, "storage");
        md8.checkNotNullParameter(list, "initTasksList");
        md8.checkNotNullParameter(e23Var, "corruptionHandler");
        md8.checkNotNullParameter(x13Var, "scope");
        this.f36624a = f5gVar;
        this.f36625b = e23Var;
        this.f36626c = x13Var;
        this.f36627d = c76.flow(new C5816d(this, null));
        this.f36628e = e8b.Mutex$default(false, 1, null);
        this.f36631h = new gi3<>();
        this.f36632i = new C5814b(this, list);
        this.f36633j = hz8.lazy(new C5830r(this));
        this.f36634k = hz8.lazy(new C5815c(this));
        this.f36635l = new qcf<>(x13Var, new C5833u(this), C5834v.f36759a, new C5835w(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object decrementCollector(p000.zy2<? super p000.bth> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p000.fi3.C5817e
            if (r0 == 0) goto L13
            r0 = r6
            fi3$e r0 = (p000.fi3.C5817e) r0
            int r1 = r0.f36687e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36687e = r1
            goto L18
        L13:
            fi3$e r0 = new fi3$e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f36685c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f36687e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f36684b
            y7b r1 = (p000.y7b) r1
            java.lang.Object r0 = r0.f36683a
            fi3 r0 = (p000.fi3) r0
            p000.y7e.throwOnFailure(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            p000.y7e.throwOnFailure(r6)
            y7b r6 = r5.f36628e
            r0.f36683a = r5
            r0.f36684b = r6
            r0.f36687e = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            int r6 = r0.f36629f     // Catch: java.lang.Throwable -> L5e
            int r6 = r6 + (-1)
            r0.f36629f = r6     // Catch: java.lang.Throwable -> L5e
            if (r6 != 0) goto L62
            jj8 r6 = r0.f36630g     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L60
            p000.jj8.C7916a.cancel$default(r6, r4, r3, r4)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r6 = move-exception
            goto L68
        L60:
            r0.f36630g = r4     // Catch: java.lang.Throwable -> L5e
        L62:
            bth r6 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L5e
            r1.unlock(r4)
            return r6
        L68:
            r1.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fi3.decrementCollector(zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> Object doWithWriteFileLock(boolean z, qy6<? super zy2<? super R>, ? extends Object> qy6Var, zy2<? super R> zy2Var) {
        return z ? qy6Var.invoke(zy2Var) : getCoordinator().lock(new C5818f(qy6Var, null), zy2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m98 getCoordinator() {
        return (m98) this.f36634k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [fi3] */
    /* JADX WARN: Type inference failed for: r8v0, types: [fi3, fi3<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [csa$b, csa$b<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [csa$b] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [ve2] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object handleUpdate(p000.csa.C4487b<T> r9, p000.zy2<? super p000.bth> r10) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fi3.handleUpdate(csa$b, zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object incrementCollector(p000.zy2<? super p000.bth> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof p000.fi3.C5820h
            if (r0 == 0) goto L13
            r0 = r12
            fi3$h r0 = (p000.fi3.C5820h) r0
            int r1 = r0.f36700e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36700e = r1
            goto L18
        L13:
            fi3$h r0 = new fi3$h
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f36698c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f36700e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f36697b
            y7b r1 = (p000.y7b) r1
            java.lang.Object r0 = r0.f36696a
            fi3 r0 = (p000.fi3) r0
            p000.y7e.throwOnFailure(r12)
            goto L4e
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3a:
            p000.y7e.throwOnFailure(r12)
            y7b r12 = r11.f36628e
            r0.f36696a = r11
            r0.f36697b = r12
            r0.f36700e = r3
            java.lang.Object r0 = r12.lock(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r11
            r1 = r12
        L4e:
            int r12 = r0.f36629f     // Catch: java.lang.Throwable -> L67
            int r12 = r12 + r3
            r0.f36629f = r12     // Catch: java.lang.Throwable -> L67
            if (r12 != r3) goto L69
            x13 r5 = r0.f36626c     // Catch: java.lang.Throwable -> L67
            fi3$i r8 = new fi3$i     // Catch: java.lang.Throwable -> L67
            r8.<init>(r0, r4)     // Catch: java.lang.Throwable -> L67
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            jj8 r12 = p000.dg1.launch$default(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L67
            r0.f36630g = r12     // Catch: java.lang.Throwable -> L67
            goto L69
        L67:
            r12 = move-exception
            goto L6f
        L69:
            bth r12 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L67
            r1.unlock(r4)
            return r12
        L6f:
            r1.unlock(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fi3.incrementCollector(zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readAndInitOrPropagateAndThrowFailure(p000.zy2<? super p000.bth> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p000.fi3.C5822j
            if (r0 == 0) goto L13
            r0 = r6
            fi3$j r0 = (p000.fi3.C5822j) r0
            int r1 = r0.f36708e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36708e = r1
            goto L18
        L13:
            fi3$j r0 = new fi3$j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f36706c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f36708e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r1 = r0.f36705b
            java.lang.Object r0 = r0.f36704a
            fi3 r0 = (p000.fi3) r0
            p000.y7e.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L32
            goto L6c
        L32:
            r6 = move-exception
            goto L73
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            java.lang.Object r2 = r0.f36704a
            fi3 r2 = (p000.fi3) r2
            p000.y7e.throwOnFailure(r6)
            goto L57
        L44:
            p000.y7e.throwOnFailure(r6)
            m98 r6 = r5.getCoordinator()
            r0.f36704a = r5
            r0.f36708e = r4
            java.lang.Object r6 = r6.getVersion(r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            r2 = r5
        L57:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            fi3<T>$b r4 = r2.f36632i     // Catch: java.lang.Throwable -> L6f
            r0.f36704a = r2     // Catch: java.lang.Throwable -> L6f
            r0.f36705b = r6     // Catch: java.lang.Throwable -> L6f
            r0.f36708e = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r4.runIfNeeded(r0)     // Catch: java.lang.Throwable -> L6f
            if (r6 != r1) goto L6c
            return r1
        L6c:
            bth r6 = p000.bth.f14751a
            return r6
        L6f:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L73:
            gi3<T> r0 = r0.f36631h
            sqd r2 = new sqd
            r2.<init>(r6, r1)
            r0.tryUpdate(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fi3.readAndInitOrPropagateAndThrowFailure(zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readDataAndUpdateCache(boolean r10, p000.zy2<? super p000.g2g<T>> r11) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fi3.readDataAndUpdateCache(boolean, zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readDataFromFileOrDefault(zy2<? super T> zy2Var) {
        return h5g.readData(getStorageConnection$datastore_core_release(), zy2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [fi3, fi3<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14, types: [fi3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r6v10, types: [fi3] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [fi3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [fi3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [fi3] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readDataOrHandleCorruption(boolean r11, p000.zy2<? super p000.if3<T>> r12) throws java.lang.IllegalAccessException, p000.d23, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fi3.readDataOrHandleCorruption(boolean, zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readState(boolean z, zy2<? super g2g<T>> zy2Var) {
        return dg1.withContext(this.f36626c.getCoroutineContext(), new C5829q(this, z, null), zy2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object transformAndWrite(gz6<? super T, ? super zy2<? super T>, ? extends Object> gz6Var, e13 e13Var, zy2<? super T> zy2Var) {
        return getCoordinator().lock(new C5831s(this, e13Var, gz6Var, null), zy2Var);
    }

    @Override // p000.ai3
    @yfb
    public y56<T> getData() {
        return this.f36627d;
    }

    @yfb
    public final g5g<T> getStorageConnection$datastore_core_release() {
        return this.f36633j.getValue();
    }

    @Override // p000.ai3
    @gib
    public Object updateData(@yfb gz6<? super T, ? super zy2<? super T>, ? extends Object> gz6Var, @yfb zy2<? super T> zy2Var) {
        uwh uwhVar = (uwh) zy2Var.getContext().get(uwh.C13751a.a.f89300a);
        if (uwhVar != null) {
            uwhVar.checkNotUpdating(this);
        }
        return dg1.withContext(new uwh(uwhVar, this), new C5832t(this, gz6Var, null), zy2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object writeData$datastore_core_release(T r12, boolean r13, @p000.yfb p000.zy2<? super java.lang.Integer> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p000.fi3.C5836x
            if (r0 == 0) goto L13
            r0 = r14
            fi3$x r0 = (p000.fi3.C5836x) r0
            int r1 = r0.f36766d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36766d = r1
            goto L18
        L13:
            fi3$x r0 = new fi3$x
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f36764b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f36766d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r12 = r0.f36763a
            jvd$f r12 = (p000.jvd.C8119f) r12
            p000.y7e.throwOnFailure(r14)
            goto L58
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            p000.y7e.throwOnFailure(r14)
            jvd$f r14 = new jvd$f
            r14.<init>()
            g5g r2 = r11.getStorageConnection$datastore_core_release()
            fi3$y r10 = new fi3$y
            r9 = 0
            r4 = r10
            r5 = r14
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f36763a = r14
            r0.f36766d = r3
            java.lang.Object r12 = r2.writeScope(r10, r0)
            if (r12 != r1) goto L57
            return r1
        L57:
            r12 = r14
        L58:
            int r12 = r12.f52108a
            java.lang.Integer r12 = p000.wc1.boxInt(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fi3.writeData$datastore_core_release(java.lang.Object, boolean, zy2):java.lang.Object");
    }

    public /* synthetic */ fi3(f5g f5gVar, List list, e23 e23Var, x13 x13Var, int i, jt3 jt3Var) {
        this(f5gVar, (i & 2) != 0 ? l82.emptyList() : list, (i & 4) != 0 ? new rdb() : e23Var, (i & 8) != 0 ? y13.CoroutineScope(C7876je.ioDispatcher().plus(kfg.SupervisorJob$default((jj8) null, 1, (Object) null))) : x13Var);
    }
}
