package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vg3<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C14045a f91032a = new C14045a(null);

    /* JADX INFO: renamed from: vg3$a */
    @dwf({"SMAP\nDataMigrationInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataMigrationInitializer.kt\nandroidx/datastore/core/DataMigrationInitializer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1855#2,2:73\n1#3:75\n*S KotlinDebug\n*F\n+ 1 DataMigrationInitializer.kt\nandroidx/datastore/core/DataMigrationInitializer$Companion\n*L\n55#1:73,2\n*E\n"})
    public static final class C14045a {

        /* JADX INFO: renamed from: vg3$a$a */
        @ck3(m4009c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", m4010f = "DataMigrationInitializer.kt", m4011i = {}, m4012l = {33}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<w18<T>, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f91033a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f91034b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ List<ug3<T>> f91035c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(List<? extends ug3<T>> list, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f91035c = list;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f91035c, zy2Var);
                aVar.f91034b = obj;
                return aVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb w18<T> w18Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(w18Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f91033a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    w18 w18Var = (w18) this.f91034b;
                    C14045a c14045a = vg3.f91032a;
                    List<ug3<T>> list = this.f91035c;
                    this.f91033a = 1;
                    if (c14045a.runMigrations(list, w18Var, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: vg3$a$b */
        @ck3(m4009c = "androidx.datastore.core.DataMigrationInitializer$Companion", m4010f = "DataMigrationInitializer.kt", m4011i = {0, 1}, m4012l = {42, 57}, m4013m = "runMigrations", m4014n = {"cleanUps", "cleanUpFailure"}, m4015s = {"L$0", "L$0"})
        public static final class b<T> extends cz2 {

            /* JADX INFO: renamed from: a */
            public Object f91036a;

            /* JADX INFO: renamed from: b */
            public Object f91037b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f91038c;

            /* JADX INFO: renamed from: e */
            public int f91040e;

            public b(zy2<? super b> zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                this.f91038c = obj;
                this.f91040e |= Integer.MIN_VALUE;
                return C14045a.this.runMigrations(null, null, this);
            }
        }

        /* JADX INFO: renamed from: vg3$a$c */
        @ck3(m4009c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", m4010f = "DataMigrationInitializer.kt", m4011i = {0, 0}, m4012l = {44, 46}, m4013m = "invokeSuspend", m4014n = {"migration", "data"}, m4015s = {"L$2", "L$3"})
        @dwf({"SMAP\nDataMigrationInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataMigrationInitializer.kt\nandroidx/datastore/core/DataMigrationInitializer$Companion$runMigrations$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n1789#2,3:73\n*S KotlinDebug\n*F\n+ 1 DataMigrationInitializer.kt\nandroidx/datastore/core/DataMigrationInitializer$Companion$runMigrations$2\n*L\n43#1:73,3\n*E\n"})
        public static final class c extends ugg implements gz6<T, zy2<? super T>, Object> {

            /* JADX INFO: renamed from: a */
            public Object f91041a;

            /* JADX INFO: renamed from: b */
            public Object f91042b;

            /* JADX INFO: renamed from: c */
            public Object f91043c;

            /* JADX INFO: renamed from: d */
            public int f91044d;

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f91045e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ List<ug3<T>> f91046f;

            /* JADX INFO: renamed from: m */
            public final /* synthetic */ List<qy6<zy2<? super bth>, Object>> f91047m;

            /* JADX INFO: renamed from: vg3$a$c$a */
            @ck3(m4009c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", m4010f = "DataMigrationInitializer.kt", m4011i = {}, m4012l = {45}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class a extends ugg implements qy6<zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f91048a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ug3<T> f91049b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(ug3<T> ug3Var, zy2<? super a> zy2Var) {
                    super(1, zy2Var);
                    this.f91049b = ug3Var;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@yfb zy2<?> zy2Var) {
                    return new a(this.f91049b, zy2Var);
                }

                @Override // p000.qy6
                @gib
                public final Object invoke(@gib zy2<? super bth> zy2Var) {
                    return ((a) create(zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f91048a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        ug3<T> ug3Var = this.f91049b;
                        this.f91048a = 1;
                        if (ug3Var.cleanUp(this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(List<? extends ug3<T>> list, List<qy6<zy2<? super bth>, Object>> list2, zy2<? super c> zy2Var) {
                super(2, zy2Var);
                this.f91046f = list;
                this.f91047m = list2;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                c cVar = new c(this.f91046f, this.f91047m, zy2Var);
                cVar.f91045e = obj;
                return cVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(T t, @gib zy2<? super T> zy2Var) {
                return ((c) create(t, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x008e A[RETURN] */
            @Override // p000.tq0
            @p000.gib
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r1 = r9.f91044d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r9.f91041a
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.f91045e
                    java.util.List r4 = (java.util.List) r4
                    p000.y7e.throwOnFailure(r10)
                    goto L46
                L1a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L22:
                    java.lang.Object r1 = r9.f91043c
                    java.lang.Object r4 = r9.f91042b
                    ug3 r4 = (p000.ug3) r4
                    java.lang.Object r5 = r9.f91041a
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.f91045e
                    java.util.List r6 = (java.util.List) r6
                    p000.y7e.throwOnFailure(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L68
                L37:
                    p000.y7e.throwOnFailure(r10)
                    java.lang.Object r10 = r9.f91045e
                    java.util.List<ug3<T>> r1 = r9.f91046f
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.List<qy6<zy2<? super bth>, java.lang.Object>> r4 = r9.f91047m
                    java.util.Iterator r1 = r1.iterator()
                L46:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8e
                    java.lang.Object r5 = r1.next()
                    ug3 r5 = (p000.ug3) r5
                    r9.f91045e = r4
                    r9.f91041a = r1
                    r9.f91042b = r5
                    r9.f91043c = r10
                    r9.f91044d = r3
                    java.lang.Object r6 = r5.shouldMigrate(r10, r9)
                    if (r6 != r0) goto L63
                    return r0
                L63:
                    r8 = r1
                    r1 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                L68:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L8c
                    vg3$a$c$a r10 = new vg3$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.f91045e = r4
                    r9.f91041a = r5
                    r9.f91042b = r7
                    r9.f91043c = r7
                    r9.f91044d = r2
                    java.lang.Object r10 = r6.migrate(r1, r9)
                    if (r10 != r0) goto L8a
                    return r0
                L8a:
                    r1 = r5
                    goto L46
                L8c:
                    r10 = r1
                    goto L8a
                L8e:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.vg3.C14045a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ C14045a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:25:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008b -> B:25:0x006b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final <T> java.lang.Object runMigrations(java.util.List<? extends p000.ug3<T>> r7, p000.w18<T> r8, p000.zy2<? super p000.bth> r9) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r9 instanceof p000.vg3.C14045a.b
                if (r0 == 0) goto L13
                r0 = r9
                vg3$a$b r0 = (p000.vg3.C14045a.b) r0
                int r1 = r0.f91040e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f91040e = r1
                goto L18
            L13:
                vg3$a$b r0 = new vg3$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f91038c
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f91040e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f91037b
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f91036a
                jvd$h r8 = (p000.jvd.C8121h) r8
                p000.y7e.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L34
                goto L6b
            L34:
                r9 = move-exception
                goto L84
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f91036a
                java.util.List r7 = (java.util.List) r7
                p000.y7e.throwOnFailure(r9)
                goto L60
            L46:
                p000.y7e.throwOnFailure(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                vg3$a$c r2 = new vg3$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f91036a = r9
                r0.f91040e = r4
                java.lang.Object r7 = r8.updateData(r2, r0)
                if (r7 != r1) goto L5f
                return r1
            L5f:
                r7 = r9
            L60:
                jvd$h r8 = new jvd$h
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L6b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L94
                java.lang.Object r9 = r7.next()
                qy6 r9 = (p000.qy6) r9
                r0.f91036a = r8     // Catch: java.lang.Throwable -> L34
                r0.f91037b = r7     // Catch: java.lang.Throwable -> L34
                r0.f91040e = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L6b
                return r1
            L84:
                T r2 = r8.f52110a
                if (r2 != 0) goto L8b
                r8.f52110a = r9
                goto L6b
            L8b:
                p000.md8.checkNotNull(r2)
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                p000.a85.addSuppressed(r2, r9)
                goto L6b
            L94:
                T r7 = r8.f52110a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9d
                bth r7 = p000.bth.f14751a
                return r7
            L9d:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.vg3.C14045a.runMigrations(java.util.List, w18, zy2):java.lang.Object");
        }

        @yfb
        public final <T> gz6<w18<T>, zy2<? super bth>, Object> getInitializer(@yfb List<? extends ug3<T>> list) {
            md8.checkNotNullParameter(list, "migrations");
            return new a(list, null);
        }

        private C14045a() {
        }
    }
}
