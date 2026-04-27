package p000;

import java.util.ArrayList;
import java.util.List;
import p000.jvd;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n17#1:174\n19#1:178\n17#1:179\n19#1:183\n46#2:168\n51#2:170\n46#2:171\n51#2:173\n46#2:175\n51#2:177\n46#2:180\n51#2:182\n46#2:184\n51#2:186\n46#2:187\n51#2:189\n46#2:190\n51#2:192\n46#2:194\n51#2:196\n105#3:169\n105#3:172\n105#3:176\n105#3:181\n105#3:185\n105#3:188\n105#3:191\n105#3:193\n105#3:195\n105#3:197\n105#3:198\n105#3:200\n1#4:199\n*S KotlinDebug\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n32#1:174\n32#1:178\n37#1:179\n37#1:183\n17#1:168\n17#1:170\n24#1:171\n24#1:173\n32#1:175\n32#1:177\n37#1:180\n37#1:182\n42#1:184\n42#1:186\n49#1:187\n49#1:189\n56#1:190\n56#1:192\n74#1:194\n74#1:196\n17#1:169\n24#1:172\n32#1:176\n37#1:181\n42#1:185\n49#1:188\n56#1:191\n64#1:193\n74#1:195\n101#1:197\n121#1:198\n152#1:200\n*E\n"})
public final /* synthetic */ class x76 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: x76$a */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n153#2,12:109\n165#2:122\n1#3:121\n*E\n"})
    public static final class C14948a<T> implements y56<List<? extends T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f96943a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f96944b;

        /* JADX INFO: renamed from: x76$a$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1", m4010f = "Transform.kt", m4011i = {0, 0}, m4012l = {110, 120}, m4013m = "collect", m4014n = {"$this$chunked_u24lambda_u2413", "result"}, m4015s = {"L$0", "L$1"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f96945a;

            /* JADX INFO: renamed from: b */
            public int f96946b;

            /* JADX INFO: renamed from: d */
            public Object f96948d;

            /* JADX INFO: renamed from: e */
            public Object f96949e;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f96945a = obj;
                this.f96946b |= Integer.MIN_VALUE;
                return C14948a.this.collect(null, this);
            }
        }

        public C14948a(y56 y56Var, int i) {
            this.f96943a = y56Var;
            this.f96944b = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.y56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(p000.t66<? super java.util.List<? extends T>> r8, p000.zy2<? super p000.bth> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof p000.x76.C14948a.a
                if (r0 == 0) goto L13
                r0 = r9
                x76$a$a r0 = (p000.x76.C14948a.a) r0
                int r1 = r0.f96946b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f96946b = r1
                goto L18
            L13:
                x76$a$a r0 = new x76$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f96945a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f96946b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                p000.y7e.throwOnFailure(r9)
                goto L74
            L2c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L34:
                java.lang.Object r8 = r0.f96949e
                jvd$h r8 = (p000.jvd.C8121h) r8
                java.lang.Object r2 = r0.f96948d
                t66 r2 = (p000.t66) r2
                p000.y7e.throwOnFailure(r9)
                goto L60
            L40:
                p000.y7e.throwOnFailure(r9)
                jvd$h r9 = new jvd$h
                r9.<init>()
                y56 r2 = r7.f96943a
                x76$b r5 = new x76$b
                int r6 = r7.f96944b
                r5.<init>(r9, r6, r8)
                r0.f96948d = r8
                r0.f96949e = r9
                r0.f96946b = r4
                java.lang.Object r2 = r2.collect(r5, r0)
                if (r2 != r1) goto L5e
                return r1
            L5e:
                r2 = r8
                r8 = r9
            L60:
                T r8 = r8.f52110a
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                if (r8 == 0) goto L74
                r9 = 0
                r0.f96948d = r9
                r0.f96949e = r9
                r0.f96946b = r3
                java.lang.Object r8 = r2.emit(r8, r0)
                if (r8 != r1) goto L74
                return r1
            L74:
                bth r8 = p000.bth.f14751a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.x76.C14948a.collect(t66, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: x76$b */
    @dwf({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt$chunked$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n"})
    public static final class C14949b<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h<ArrayList<T>> f96950a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f96951b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ t66<List<? extends T>> f96952c;

        /* JADX INFO: renamed from: x76$b$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1", m4010f = "Transform.kt", m4011i = {0}, m4012l = {159}, m4013m = "emit", m4014n = {"this"}, m4015s = {"L$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public Object f96953a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f96954b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C14949b<T> f96955c;

            /* JADX INFO: renamed from: d */
            public int f96956d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C14949b<? super T> c14949b, zy2<? super a> zy2Var) {
                super(zy2Var);
                this.f96955c = c14949b;
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f96954b = obj;
                this.f96956d |= Integer.MIN_VALUE;
                return this.f96955c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C14949b(jvd.C8121h<ArrayList<T>> c8121h, int i, t66<? super List<? extends T>> t66Var) {
            this.f96950a = c8121h;
            this.f96951b = i;
            this.f96952c = t66Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r5v2, types: [t66, t66<java.util.List<? extends T>>] */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.ArrayList] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p000.t66
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r5, p000.zy2<? super p000.bth> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof p000.x76.C14949b.a
                if (r0 == 0) goto L13
                r0 = r6
                x76$b$a r0 = (p000.x76.C14949b.a) r0
                int r1 = r0.f96956d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f96956d = r1
                goto L18
            L13:
                x76$b$a r0 = new x76$b$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f96954b
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f96956d
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f96953a
                x76$b r5 = (p000.x76.C14949b) r5
                p000.y7e.throwOnFailure(r6)
                goto L64
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                p000.y7e.throwOnFailure(r6)
                jvd$h<java.util.ArrayList<T>> r6 = r4.f96950a
                T r6 = r6.f52110a
                java.util.ArrayList r6 = (java.util.ArrayList) r6
                if (r6 != 0) goto L4b
                java.util.ArrayList r6 = new java.util.ArrayList
                int r2 = r4.f96951b
                r6.<init>(r2)
                jvd$h<java.util.ArrayList<T>> r2 = r4.f96950a
                r2.f52110a = r6
            L4b:
                r6.add(r5)
                int r5 = r6.size()
                int r2 = r4.f96951b
                if (r5 != r2) goto L69
                t66<java.util.List<? extends T>> r5 = r4.f96952c
                r0.f96953a = r4
                r0.f96956d = r3
                java.lang.Object r5 = r5.emit(r6, r0)
                if (r5 != r1) goto L63
                return r1
            L63:
                r5 = r4
            L64:
                jvd$h<java.util.ArrayList<T>> r5 = r5.f96950a
                r6 = 0
                r5.f52110a = r6
            L69:
                bth r5 = p000.bth.f14751a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.x76.C14949b.emit(java.lang.Object, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: x76$c */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class C14950c<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f96957a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6 f96958b;

        /* JADX INFO: renamed from: x76$c$a */
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f96959a;

            /* JADX INFO: renamed from: b */
            public int f96960b;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f96959a = obj;
                this.f96960b |= Integer.MIN_VALUE;
                return C14950c.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: x76$c$b */
        @dwf({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n18#2,2:50\n*E\n"})
        public static final class b<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ t66 f96962a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ gz6 f96963b;

            /* JADX INFO: renamed from: x76$c$b$a */
            @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", m4010f = "Transform.kt", m4011i = {0, 0}, m4012l = {50, 50}, m4013m = "emit", m4014n = {"value", "$this$filter_u24lambda_u240"}, m4015s = {"L$0", "L$1"})
            public static final class a extends cz2 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f96964a;

                /* JADX INFO: renamed from: b */
                public int f96965b;

                /* JADX INFO: renamed from: d */
                public Object f96967d;

                /* JADX INFO: renamed from: e */
                public Object f96968e;

                public a(zy2 zy2Var) {
                    super(zy2Var);
                }

                @Override // p000.tq0
                public final Object invokeSuspend(Object obj) {
                    this.f96964a = obj;
                    this.f96965b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(t66 t66Var, gz6 gz6Var) {
                this.f96962a = t66Var;
                this.f96963b = gz6Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p000.t66
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r7, p000.zy2<? super p000.bth> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof p000.x76.C14950c.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    x76$c$b$a r0 = (p000.x76.C14950c.b.a) r0
                    int r1 = r0.f96965b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f96965b = r1
                    goto L18
                L13:
                    x76$c$b$a r0 = new x76$c$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f96964a
                    java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f96965b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    p000.y7e.throwOnFailure(r8)
                    goto L6c
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f96968e
                    t66 r7 = (p000.t66) r7
                    java.lang.Object r2 = r0.f96967d
                    p000.y7e.throwOnFailure(r8)
                    goto L56
                L3e:
                    p000.y7e.throwOnFailure(r8)
                    t66 r8 = r6.f96962a
                    gz6 r2 = r6.f96963b
                    r0.f96967d = r7
                    r0.f96968e = r8
                    r0.f96965b = r4
                    java.lang.Object r2 = r2.invoke(r7, r0)
                    if (r2 != r1) goto L52
                    return r1
                L52:
                    r5 = r2
                    r2 = r7
                    r7 = r8
                    r8 = r5
                L56:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 == 0) goto L6c
                    r8 = 0
                    r0.f96967d = r8
                    r0.f96968e = r8
                    r0.f96965b = r3
                    java.lang.Object r7 = r7.emit(r2, r0)
                    if (r7 != r1) goto L6c
                    return r1
                L6c:
                    bth r7 = p000.bth.f14751a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.x76.C14950c.b.emit(java.lang.Object, zy2):java.lang.Object");
            }

            public final Object emit$$forInline(Object obj, zy2 zy2Var) {
                o28.mark(4);
                new a(zy2Var);
                o28.mark(5);
                t66 t66Var = this.f96962a;
                if (((Boolean) this.f96963b.invoke(obj, zy2Var)).booleanValue()) {
                    o28.mark(0);
                    t66Var.emit(obj, zy2Var);
                    o28.mark(1);
                }
                return bth.f14751a;
            }
        }

        public C14950c(y56 y56Var, gz6 gz6Var) {
            this.f96957a = y56Var;
            this.f96958b = gz6Var;
        }

        @Override // p000.y56
        public Object collect(t66 t66Var, zy2 zy2Var) {
            Object objCollect = this.f96957a.collect(new b(t66Var, this.f96958b), zy2Var);
            return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
        }

        public Object collect$$forInline(t66 t66Var, zy2 zy2Var) {
            o28.mark(4);
            new a(zy2Var);
            o28.mark(5);
            y56 y56Var = this.f96957a;
            b bVar = new b(t66Var, this.f96958b);
            o28.mark(0);
            y56Var.collect(bVar, zy2Var);
            o28.mark(1);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: x76$d */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class C14951d implements y56<Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f96969a;

        /* JADX INFO: renamed from: x76$d$a */
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f96970a;

            /* JADX INFO: renamed from: b */
            public int f96971b;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f96970a = obj;
                this.f96971b |= Integer.MIN_VALUE;
                return C14951d.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: x76$d$b */
        @dwf({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n18#2:50\n32#2:51\n19#2:52\n*E\n"})
        public static final class b<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ t66 f96973a;

            /* JADX INFO: renamed from: x76$d$b$a */
            @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", m4010f = "Transform.kt", m4011i = {}, m4012l = {50}, m4013m = "emit", m4014n = {}, m4015s = {})
            public static final class a extends cz2 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f96974a;

                /* JADX INFO: renamed from: b */
                public int f96975b;

                /* JADX INFO: renamed from: c */
                public Object f96976c;

                /* JADX INFO: renamed from: d */
                public Object f96977d;

                public a(zy2 zy2Var) {
                    super(zy2Var);
                }

                @Override // p000.tq0
                public final Object invokeSuspend(Object obj) {
                    this.f96974a = obj;
                    this.f96975b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(t66 t66Var) {
                this.f96973a = t66Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p000.t66
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r6, p000.zy2 r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof p000.x76.C14951d.b.a
                    if (r0 == 0) goto L13
                    r0 = r7
                    x76$d$b$a r0 = (p000.x76.C14951d.b.a) r0
                    int r1 = r0.f96975b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f96975b = r1
                    goto L18
                L13:
                    x76$d$b$a r0 = new x76$d$b$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f96974a
                    java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f96975b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p000.y7e.throwOnFailure(r7)
                    goto L47
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    p000.y7e.throwOnFailure(r7)
                    t66 r7 = r5.f96973a
                    r2 = 3
                    java.lang.String r4 = "R"
                    p000.md8.reifiedOperationMarker(r2, r4)
                    if (r6 == 0) goto L47
                    r0.f96975b = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L47
                    return r1
                L47:
                    bth r6 = p000.bth.f14751a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.x76.C14951d.b.emit(java.lang.Object, zy2):java.lang.Object");
            }

            public final Object emit$$forInline(Object obj, zy2 zy2Var) {
                o28.mark(4);
                new a(zy2Var);
                o28.mark(5);
                t66 t66Var = this.f96973a;
                md8.reifiedOperationMarker(3, "R");
                if (obj != null) {
                    o28.mark(0);
                    t66Var.emit(obj, zy2Var);
                    o28.mark(1);
                }
                return bth.f14751a;
            }
        }

        public C14951d(y56 y56Var) {
            this.f96969a = y56Var;
        }

        @Override // p000.y56
        public Object collect(t66<? super Object> t66Var, zy2 zy2Var) {
            y56 y56Var = this.f96969a;
            md8.needClassReification();
            Object objCollect = y56Var.collect(new b(t66Var), zy2Var);
            return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
        }

        public Object collect$$forInline(t66 t66Var, zy2 zy2Var) {
            o28.mark(4);
            new a(zy2Var);
            o28.mark(5);
            y56 y56Var = this.f96969a;
            md8.needClassReification();
            b bVar = new b(t66Var);
            o28.mark(0);
            y56Var.collect(bVar, zy2Var);
            o28.mark(1);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: x76$e */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class C14952e implements y56<Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f96979a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ oo8 f96980b;

        /* JADX INFO: renamed from: x76$e$a */
        @dwf({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n18#2:50\n37#2:51\n19#2:52\n*E\n"})
        public static final class a<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ t66 f96981a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ oo8 f96982b;

            /* JADX INFO: renamed from: x76$e$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2", m4010f = "Transform.kt", m4011i = {}, m4012l = {50}, m4013m = "emit", m4014n = {}, m4015s = {})
            public static final class C16554a extends cz2 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f96983a;

                /* JADX INFO: renamed from: b */
                public int f96984b;

                /* JADX INFO: renamed from: c */
                public Object f96985c;

                /* JADX INFO: renamed from: d */
                public Object f96986d;

                public C16554a(zy2 zy2Var) {
                    super(zy2Var);
                }

                @Override // p000.tq0
                public final Object invokeSuspend(Object obj) {
                    this.f96983a = obj;
                    this.f96984b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(t66 t66Var, oo8 oo8Var) {
                this.f96981a = t66Var;
                this.f96982b = oo8Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p000.t66
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, p000.zy2 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p000.x76.C14952e.a.C16554a
                    if (r0 == 0) goto L13
                    r0 = r6
                    x76$e$a$a r0 = (p000.x76.C14952e.a.C16554a) r0
                    int r1 = r0.f96984b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f96984b = r1
                    goto L18
                L13:
                    x76$e$a$a r0 = new x76$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f96983a
                    java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f96984b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p000.y7e.throwOnFailure(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p000.y7e.throwOnFailure(r6)
                    t66 r6 = r4.f96981a
                    oo8 r2 = r4.f96982b
                    boolean r2 = r2.isInstance(r5)
                    if (r2 == 0) goto L47
                    r0.f96984b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    bth r5 = p000.bth.f14751a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.x76.C14952e.a.emit(java.lang.Object, zy2):java.lang.Object");
            }
        }

        public C14952e(y56 y56Var, oo8 oo8Var) {
            this.f96979a = y56Var;
            this.f96980b = oo8Var;
        }

        @Override // p000.y56
        public Object collect(t66<? super Object> t66Var, zy2 zy2Var) {
            Object objCollect = this.f96979a.collect(new a(t66Var, this.f96980b), zy2Var);
            return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: x76$f */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class C14953f<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f96988a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6 f96989b;

        /* JADX INFO: renamed from: x76$f$a */
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f96990a;

            /* JADX INFO: renamed from: b */
            public int f96991b;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f96990a = obj;
                this.f96991b |= Integer.MIN_VALUE;
                return C14953f.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: x76$f$b */
        @dwf({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n25#2,2:50\n*E\n"})
        public static final class b<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ t66 f96993a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ gz6 f96994b;

            /* JADX INFO: renamed from: x76$f$b$a */
            @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", m4010f = "Transform.kt", m4011i = {0, 0}, m4012l = {50, 50}, m4013m = "emit", m4014n = {"value", "$this$filterNot_u24lambda_u241"}, m4015s = {"L$0", "L$1"})
            public static final class a extends cz2 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f96995a;

                /* JADX INFO: renamed from: b */
                public int f96996b;

                /* JADX INFO: renamed from: d */
                public Object f96998d;

                /* JADX INFO: renamed from: e */
                public Object f96999e;

                public a(zy2 zy2Var) {
                    super(zy2Var);
                }

                @Override // p000.tq0
                public final Object invokeSuspend(Object obj) {
                    this.f96995a = obj;
                    this.f96996b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(t66 t66Var, gz6 gz6Var) {
                this.f96993a = t66Var;
                this.f96994b = gz6Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p000.t66
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r7, p000.zy2<? super p000.bth> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof p000.x76.C14953f.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    x76$f$b$a r0 = (p000.x76.C14953f.b.a) r0
                    int r1 = r0.f96996b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f96996b = r1
                    goto L18
                L13:
                    x76$f$b$a r0 = new x76$f$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f96995a
                    java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f96996b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    p000.y7e.throwOnFailure(r8)
                    goto L6c
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f96999e
                    t66 r7 = (p000.t66) r7
                    java.lang.Object r2 = r0.f96998d
                    p000.y7e.throwOnFailure(r8)
                    goto L56
                L3e:
                    p000.y7e.throwOnFailure(r8)
                    t66 r8 = r6.f96993a
                    gz6 r2 = r6.f96994b
                    r0.f96998d = r7
                    r0.f96999e = r8
                    r0.f96996b = r4
                    java.lang.Object r2 = r2.invoke(r7, r0)
                    if (r2 != r1) goto L52
                    return r1
                L52:
                    r5 = r2
                    r2 = r7
                    r7 = r8
                    r8 = r5
                L56:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 != 0) goto L6c
                    r8 = 0
                    r0.f96998d = r8
                    r0.f96999e = r8
                    r0.f96996b = r3
                    java.lang.Object r7 = r7.emit(r2, r0)
                    if (r7 != r1) goto L6c
                    return r1
                L6c:
                    bth r7 = p000.bth.f14751a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.x76.C14953f.b.emit(java.lang.Object, zy2):java.lang.Object");
            }

            public final Object emit$$forInline(Object obj, zy2 zy2Var) {
                o28.mark(4);
                new a(zy2Var);
                o28.mark(5);
                t66 t66Var = this.f96993a;
                if (!((Boolean) this.f96994b.invoke(obj, zy2Var)).booleanValue()) {
                    o28.mark(0);
                    t66Var.emit(obj, zy2Var);
                    o28.mark(1);
                }
                return bth.f14751a;
            }
        }

        public C14953f(y56 y56Var, gz6 gz6Var) {
            this.f96988a = y56Var;
            this.f96989b = gz6Var;
        }

        @Override // p000.y56
        public Object collect(t66 t66Var, zy2 zy2Var) {
            Object objCollect = this.f96988a.collect(new b(t66Var, this.f96989b), zy2Var);
            return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
        }

        public Object collect$$forInline(t66 t66Var, zy2 zy2Var) {
            o28.mark(4);
            new a(zy2Var);
            o28.mark(5);
            y56 y56Var = this.f96988a;
            b bVar = new b(t66Var, this.f96989b);
            o28.mark(0);
            y56Var.collect(bVar, zy2Var);
            o28.mark(1);
            return bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: x76$g */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class C14954g<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f97000a;

        /* JADX INFO: renamed from: x76$g$a */
        @dwf({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n43#2,2:50\n*E\n"})
        public static final class a<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ t66 f97001a;

            /* JADX INFO: renamed from: x76$g$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", m4010f = "Transform.kt", m4011i = {}, m4012l = {50}, m4013m = "emit", m4014n = {}, m4015s = {})
            public static final class C16555a extends cz2 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f97002a;

                /* JADX INFO: renamed from: b */
                public int f97003b;

                public C16555a(zy2 zy2Var) {
                    super(zy2Var);
                }

                @Override // p000.tq0
                public final Object invokeSuspend(Object obj) {
                    this.f97002a = obj;
                    this.f97003b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(t66 t66Var) {
                this.f97001a = t66Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p000.t66
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r5, p000.zy2<? super p000.bth> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p000.x76.C14954g.a.C16555a
                    if (r0 == 0) goto L13
                    r0 = r6
                    x76$g$a$a r0 = (p000.x76.C14954g.a.C16555a) r0
                    int r1 = r0.f97003b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f97003b = r1
                    goto L18
                L13:
                    x76$g$a$a r0 = new x76$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f97002a
                    java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f97003b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p000.y7e.throwOnFailure(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p000.y7e.throwOnFailure(r6)
                    t66 r6 = r4.f97001a
                    if (r5 == 0) goto L41
                    r0.f97003b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    bth r5 = p000.bth.f14751a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.x76.C14954g.a.emit(java.lang.Object, zy2):java.lang.Object");
            }
        }

        public C14954g(y56 y56Var) {
            this.f97000a = y56Var;
        }

        @Override // p000.y56
        public Object collect(t66 t66Var, zy2 zy2Var) {
            Object objCollect = this.f97000a.collect(new a(t66Var), zy2Var);
            return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: x76$h */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class C14955h<R> implements y56<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f97005a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6 f97006b;

        /* JADX INFO: renamed from: x76$h$a */
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f97007a;

            /* JADX INFO: renamed from: b */
            public int f97008b;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f97007a = obj;
                this.f97008b |= Integer.MIN_VALUE;
                return C14955h.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: x76$h$b */
        @dwf({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n50#2:50\n*E\n"})
        public static final class b<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ t66 f97010a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ gz6 f97011b;

            /* JADX INFO: renamed from: x76$h$b$a */
            @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", m4010f = "Transform.kt", m4011i = {}, m4012l = {50, 50}, m4013m = "emit", m4014n = {}, m4015s = {})
            public static final class a extends cz2 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f97012a;

                /* JADX INFO: renamed from: b */
                public int f97013b;

                /* JADX INFO: renamed from: d */
                public Object f97015d;

                public a(zy2 zy2Var) {
                    super(zy2Var);
                }

                @Override // p000.tq0
                public final Object invokeSuspend(Object obj) {
                    this.f97012a = obj;
                    this.f97013b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(t66 t66Var, gz6 gz6Var) {
                this.f97010a = t66Var;
                this.f97011b = gz6Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p000.t66
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r7, p000.zy2<? super p000.bth> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof p000.x76.C14955h.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    x76$h$b$a r0 = (p000.x76.C14955h.b.a) r0
                    int r1 = r0.f97013b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f97013b = r1
                    goto L18
                L13:
                    x76$h$b$a r0 = new x76$h$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f97012a
                    java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f97013b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    p000.y7e.throwOnFailure(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f97015d
                    t66 r7 = (p000.t66) r7
                    p000.y7e.throwOnFailure(r8)
                    goto L51
                L3c:
                    p000.y7e.throwOnFailure(r8)
                    t66 r8 = r6.f97010a
                    gz6 r2 = r6.f97011b
                    r0.f97015d = r8
                    r0.f97013b = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.f97015d = r2
                    r0.f97013b = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    bth r7 = p000.bth.f14751a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.x76.C14955h.b.emit(java.lang.Object, zy2):java.lang.Object");
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object emit$$forInline(Object obj, zy2 zy2Var) {
                o28.mark(4);
                new a(zy2Var);
                o28.mark(5);
                t66 t66Var = this.f97010a;
                Object objInvoke = this.f97011b.invoke(obj, zy2Var);
                o28.mark(0);
                t66Var.emit(objInvoke, zy2Var);
                o28.mark(1);
                return bth.f14751a;
            }
        }

        public C14955h(y56 y56Var, gz6 gz6Var) {
            this.f97005a = y56Var;
            this.f97006b = gz6Var;
        }

        @Override // p000.y56
        public Object collect(t66 t66Var, zy2 zy2Var) {
            Object objCollect = this.f97005a.collect(new b(t66Var, this.f97006b), zy2Var);
            return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
        }

        public Object collect$$forInline(t66 t66Var, zy2 zy2Var) {
            o28.mark(4);
            new a(zy2Var);
            o28.mark(5);
            y56 y56Var = this.f97005a;
            b bVar = new b(t66Var, this.f97006b);
            o28.mark(0);
            y56Var.collect(bVar, zy2Var);
            o28.mark(1);
            return bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: x76$i */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class C14956i<R> implements y56<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f97016a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6 f97017b;

        /* JADX INFO: renamed from: x76$i$a */
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f97018a;

            /* JADX INFO: renamed from: b */
            public int f97019b;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f97018a = obj;
                this.f97019b |= Integer.MIN_VALUE;
                return C14956i.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: x76$i$b */
        @dwf({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n57#2,2:50\n*E\n"})
        public static final class b<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ t66 f97021a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ gz6 f97022b;

            /* JADX INFO: renamed from: x76$i$b$a */
            @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", m4010f = "Transform.kt", m4011i = {0}, m4012l = {50, 51}, m4013m = "emit", m4014n = {"$this$mapNotNull_u24lambda_u246"}, m4015s = {"L$0"})
            public static final class a extends cz2 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f97023a;

                /* JADX INFO: renamed from: b */
                public int f97024b;

                /* JADX INFO: renamed from: d */
                public Object f97026d;

                public a(zy2 zy2Var) {
                    super(zy2Var);
                }

                @Override // p000.tq0
                public final Object invokeSuspend(Object obj) {
                    this.f97023a = obj;
                    this.f97024b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(t66 t66Var, gz6 gz6Var) {
                this.f97021a = t66Var;
                this.f97022b = gz6Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p000.t66
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r7, p000.zy2<? super p000.bth> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof p000.x76.C14956i.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    x76$i$b$a r0 = (p000.x76.C14956i.b.a) r0
                    int r1 = r0.f97024b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f97024b = r1
                    goto L18
                L13:
                    x76$i$b$a r0 = new x76$i$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f97023a
                    java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f97024b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    p000.y7e.throwOnFailure(r8)
                    goto L60
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f97026d
                    t66 r7 = (p000.t66) r7
                    p000.y7e.throwOnFailure(r8)
                    goto L51
                L3c:
                    p000.y7e.throwOnFailure(r8)
                    t66 r8 = r6.f97021a
                    gz6 r2 = r6.f97022b
                    r0.f97026d = r8
                    r0.f97024b = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    if (r8 != 0) goto L54
                    goto L60
                L54:
                    r2 = 0
                    r0.f97026d = r2
                    r0.f97024b = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L60
                    return r1
                L60:
                    bth r7 = p000.bth.f14751a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.x76.C14956i.b.emit(java.lang.Object, zy2):java.lang.Object");
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object emit$$forInline(Object obj, zy2 zy2Var) {
                o28.mark(4);
                new a(zy2Var);
                o28.mark(5);
                t66 t66Var = this.f97021a;
                Object objInvoke = this.f97022b.invoke(obj, zy2Var);
                if (objInvoke != null) {
                    o28.mark(0);
                    t66Var.emit(objInvoke, zy2Var);
                    o28.mark(1);
                }
                return bth.f14751a;
            }
        }

        public C14956i(y56 y56Var, gz6 gz6Var) {
            this.f97016a = y56Var;
            this.f97017b = gz6Var;
        }

        @Override // p000.y56
        public Object collect(t66 t66Var, zy2 zy2Var) {
            Object objCollect = this.f97016a.collect(new b(t66Var, this.f97017b), zy2Var);
            return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
        }

        public Object collect$$forInline(t66 t66Var, zy2 zy2Var) {
            o28.mark(4);
            new a(zy2Var);
            o28.mark(5);
            y56 y56Var = this.f97016a;
            b bVar = new b(t66Var, this.f97017b);
            o28.mark(0);
            y56Var.collect(bVar, zy2Var);
            o28.mark(1);
            return bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: x76$j */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class C14957j<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f97027a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6 f97028b;

        /* JADX INFO: renamed from: x76$j$a */
        @dwf({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n75#2,2:50\n*E\n"})
        public static final class a<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ t66 f97029a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ gz6 f97030b;

            /* JADX INFO: renamed from: x76$j$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", m4010f = "Transform.kt", m4011i = {0, 0}, m4012l = {50, 51}, m4013m = "emit", m4014n = {"value", "$this$onEach_u24lambda_u248"}, m4015s = {"L$0", "L$1"})
            public static final class C16556a extends cz2 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f97031a;

                /* JADX INFO: renamed from: b */
                public int f97032b;

                /* JADX INFO: renamed from: d */
                public Object f97034d;

                /* JADX INFO: renamed from: e */
                public Object f97035e;

                public C16556a(zy2 zy2Var) {
                    super(zy2Var);
                }

                @Override // p000.tq0
                public final Object invokeSuspend(Object obj) {
                    this.f97031a = obj;
                    this.f97032b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(t66 t66Var, gz6 gz6Var) {
                this.f97029a = t66Var;
                this.f97030b = gz6Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p000.t66
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r6, p000.zy2<? super p000.bth> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof p000.x76.C14957j.a.C16556a
                    if (r0 == 0) goto L13
                    r0 = r7
                    x76$j$a$a r0 = (p000.x76.C14957j.a.C16556a) r0
                    int r1 = r0.f97032b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f97032b = r1
                    goto L18
                L13:
                    x76$j$a$a r0 = new x76$j$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f97031a
                    java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f97032b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    p000.y7e.throwOnFailure(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f97035e
                    t66 r6 = (p000.t66) r6
                    java.lang.Object r2 = r0.f97034d
                    p000.y7e.throwOnFailure(r7)
                    goto L5c
                L3e:
                    p000.y7e.throwOnFailure(r7)
                    t66 r7 = r5.f97029a
                    gz6 r2 = r5.f97030b
                    r0.f97034d = r6
                    r0.f97035e = r7
                    r0.f97032b = r4
                    r4 = 6
                    p000.o28.mark(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    p000.o28.mark(r4)
                    if (r2 != r1) goto L5a
                    return r1
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f97034d = r7
                    r0.f97035e = r7
                    r0.f97032b = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                    return r1
                L6a:
                    bth r6 = p000.bth.f14751a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.x76.C14957j.a.emit(java.lang.Object, zy2):java.lang.Object");
            }
        }

        public C14957j(y56 y56Var, gz6 gz6Var) {
            this.f97027a = y56Var;
            this.f97028b = gz6Var;
        }

        @Override // p000.y56
        public Object collect(t66 t66Var, zy2 zy2Var) {
            Object objCollect = this.f97027a.collect(new a(t66Var, this.f97028b), zy2Var);
            return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: x76$k */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,108:1\n102#2,7:109\n*E\n"})
    public static final class C14958k<R> implements y56<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f97036a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ y56 f97037b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ kz6 f97038c;

        /* JADX INFO: renamed from: x76$k$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", m4010f = "Transform.kt", m4011i = {0, 0, 0}, m4012l = {110, 111}, m4013m = "collect", m4014n = {"this", "$this$runningFold_u24lambda_u249", "accumulator"}, m4015s = {"L$0", "L$1", "L$2"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f97039a;

            /* JADX INFO: renamed from: b */
            public int f97040b;

            /* JADX INFO: renamed from: d */
            public Object f97042d;

            /* JADX INFO: renamed from: e */
            public Object f97043e;

            /* JADX INFO: renamed from: f */
            public Object f97044f;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f97039a = obj;
                this.f97040b |= Integer.MIN_VALUE;
                return C14958k.this.collect(null, this);
            }
        }

        public C14958k(Object obj, y56 y56Var, kz6 kz6Var) {
            this.f97036a = obj;
            this.f97037b = y56Var;
            this.f97038c = kz6Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // p000.y56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(p000.t66<? super R> r7, p000.zy2<? super p000.bth> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof p000.x76.C14958k.a
                if (r0 == 0) goto L13
                r0 = r8
                x76$k$a r0 = (p000.x76.C14958k.a) r0
                int r1 = r0.f97040b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f97040b = r1
                goto L18
            L13:
                x76$k$a r0 = new x76$k$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f97039a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f97040b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L44
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                p000.y7e.throwOnFailure(r8)
                goto L7b
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f97044f
                jvd$h r7 = (p000.jvd.C8121h) r7
                java.lang.Object r2 = r0.f97043e
                t66 r2 = (p000.t66) r2
                java.lang.Object r4 = r0.f97042d
                x76$k r4 = (p000.x76.C14958k) r4
                p000.y7e.throwOnFailure(r8)
                goto L62
            L44:
                p000.y7e.throwOnFailure(r8)
                jvd$h r8 = new jvd$h
                r8.<init>()
                java.lang.Object r2 = r6.f97036a
                r8.f52110a = r2
                r0.f97042d = r6
                r0.f97043e = r7
                r0.f97044f = r8
                r0.f97040b = r4
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L5f
                return r1
            L5f:
                r4 = r6
                r2 = r7
                r7 = r8
            L62:
                y56 r8 = r4.f97037b
                x76$l r5 = new x76$l
                kz6 r4 = r4.f97038c
                r5.<init>(r7, r4, r2)
                r7 = 0
                r0.f97042d = r7
                r0.f97043e = r7
                r0.f97044f = r7
                r0.f97040b = r3
                java.lang.Object r7 = r8.collect(r5, r0)
                if (r7 != r1) goto L7b
                return r1
            L7b:
                bth r7 = p000.bth.f14751a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.x76.C14958k.collect(t66, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: x76$l */
    public static final class C14959l<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h<R> f97045a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kz6<R, T, zy2<? super R>, Object> f97046b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ t66<R> f97047c;

        /* JADX INFO: renamed from: x76$l$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", m4010f = "Transform.kt", m4011i = {0}, m4012l = {105, 106}, m4013m = "emit", m4014n = {"this"}, m4015s = {"L$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public Object f97048a;

            /* JADX INFO: renamed from: b */
            public Object f97049b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f97050c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ C14959l<T> f97051d;

            /* JADX INFO: renamed from: e */
            public int f97052e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C14959l<? super T> c14959l, zy2<? super a> zy2Var) {
                super(zy2Var);
                this.f97051d = c14959l;
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f97050c = obj;
                this.f97052e |= Integer.MIN_VALUE;
                return this.f97051d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C14959l(jvd.C8121h<R> c8121h, kz6<? super R, ? super T, ? super zy2<? super R>, ? extends Object> kz6Var, t66<? super R> t66Var) {
            this.f97045a = c8121h;
            this.f97046b = kz6Var;
            this.f97047c = t66Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.t66
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r8, p000.zy2<? super p000.bth> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof p000.x76.C14959l.a
                if (r0 == 0) goto L13
                r0 = r9
                x76$l$a r0 = (p000.x76.C14959l.a) r0
                int r1 = r0.f97052e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f97052e = r1
                goto L18
            L13:
                x76$l$a r0 = new x76$l$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f97050c
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f97052e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                p000.y7e.throwOnFailure(r9)
                goto L70
            L2c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L34:
                java.lang.Object r8 = r0.f97049b
                jvd$h r8 = (p000.jvd.C8121h) r8
                java.lang.Object r2 = r0.f97048a
                x76$l r2 = (p000.x76.C14959l) r2
                p000.y7e.throwOnFailure(r9)
                goto L5a
            L40:
                p000.y7e.throwOnFailure(r9)
                jvd$h<R> r9 = r7.f97045a
                kz6<R, T, zy2<? super R>, java.lang.Object> r2 = r7.f97046b
                T r5 = r9.f52110a
                r0.f97048a = r7
                r0.f97049b = r9
                r0.f97052e = r4
                java.lang.Object r8 = r2.invoke(r5, r8, r0)
                if (r8 != r1) goto L56
                return r1
            L56:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L5a:
                r8.f52110a = r9
                t66<R> r8 = r2.f97047c
                jvd$h<R> r9 = r2.f97045a
                T r9 = r9.f52110a
                r2 = 0
                r0.f97048a = r2
                r0.f97049b = r2
                r0.f97052e = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L70
                return r1
            L70:
                bth r8 = p000.bth.f14751a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.x76.C14959l.emit(java.lang.Object, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: x76$m */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,108:1\n122#2,10:109\n*E\n"})
    public static final class C14960m<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f97053a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kz6 f97054b;

        public C14960m(y56 y56Var, kz6 kz6Var) {
            this.f97053a = y56Var;
            this.f97054b = kz6Var;
        }

        @Override // p000.y56
        public Object collect(t66<? super T> t66Var, zy2<? super bth> zy2Var) {
            jvd.C8121h c8121h = new jvd.C8121h();
            c8121h.f52110a = (T) zhb.f105096a;
            Object objCollect = this.f97053a.collect(new C14961n(c8121h, this.f97054b, t66Var), zy2Var);
            return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: x76$n */
    public static final class C14961n<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h<Object> f97055a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kz6<T, T, zy2<? super T>, Object> f97056b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ t66<T> f97057c;

        /* JADX INFO: renamed from: x76$n$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", m4010f = "Transform.kt", m4011i = {0}, m4012l = {127, 129}, m4013m = "emit", m4014n = {"this"}, m4015s = {"L$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public Object f97058a;

            /* JADX INFO: renamed from: b */
            public Object f97059b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f97060c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ C14961n<T> f97061d;

            /* JADX INFO: renamed from: e */
            public int f97062e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C14961n<? super T> c14961n, zy2<? super a> zy2Var) {
                super(zy2Var);
                this.f97061d = c14961n;
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f97060c = obj;
                this.f97062e |= Integer.MIN_VALUE;
                return this.f97061d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C14961n(jvd.C8121h<Object> c8121h, kz6<? super T, ? super T, ? super zy2<? super T>, ? extends Object> kz6Var, t66<? super T> t66Var) {
            this.f97055a = c8121h;
            this.f97056b = kz6Var;
            this.f97057c = t66Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p000.t66
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r8, p000.zy2<? super p000.bth> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof p000.x76.C14961n.a
                if (r0 == 0) goto L13
                r0 = r9
                x76$n$a r0 = (p000.x76.C14961n.a) r0
                int r1 = r0.f97062e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f97062e = r1
                goto L18
            L13:
                x76$n$a r0 = new x76$n$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f97060c
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f97062e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                p000.y7e.throwOnFailure(r9)
                goto L79
            L2c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L34:
                java.lang.Object r8 = r0.f97059b
                jvd$h r8 = (p000.jvd.C8121h) r8
                java.lang.Object r2 = r0.f97058a
                x76$n r2 = (p000.x76.C14961n) r2
                p000.y7e.throwOnFailure(r9)
                goto L60
            L40:
                p000.y7e.throwOnFailure(r9)
                jvd$h<java.lang.Object> r9 = r7.f97055a
                T r2 = r9.f52110a
                qhg r5 = p000.zhb.f105096a
                if (r2 != r5) goto L4d
                r2 = r7
                goto L63
            L4d:
                kz6<T, T, zy2<? super T>, java.lang.Object> r5 = r7.f97056b
                r0.f97058a = r7
                r0.f97059b = r9
                r0.f97062e = r4
                java.lang.Object r8 = r5.invoke(r2, r8, r0)
                if (r8 != r1) goto L5c
                return r1
            L5c:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L60:
                r6 = r9
                r9 = r8
                r8 = r6
            L63:
                r9.f52110a = r8
                t66<T> r8 = r2.f97057c
                jvd$h<java.lang.Object> r9 = r2.f97055a
                T r9 = r9.f52110a
                r2 = 0
                r0.f97058a = r2
                r0.f97059b = r2
                r0.f97062e = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L79
                return r1
            L79:
                bth r8 = p000.bth.f14751a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.x76.C14961n.emit(java.lang.Object, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: x76$o */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,108:1\n65#2,5:109\n*E\n"})
    public static final class C14962o<T> implements y56<q08<? extends T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f97063a;

        public C14962o(y56 y56Var) {
            this.f97063a = y56Var;
        }

        @Override // p000.y56
        public Object collect(t66<? super q08<? extends T>> t66Var, zy2<? super bth> zy2Var) {
            Object objCollect = this.f97063a.collect(new C14963p(t66Var, new jvd.C8119f()), zy2Var);
            return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: x76$p */
    @dwf({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt$withIndex$1$1\n+ 2 FlowExceptions.common.kt\nkotlinx/coroutines/flow/internal/FlowExceptions_commonKt\n*L\n1#1,167:1\n29#2,4:168\n*S KotlinDebug\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt$withIndex$1$1\n*L\n67#1:168,4\n*E\n"})
    public static final class C14963p<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ t66<q08<? extends T>> f97064a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jvd.C8119f f97065b;

        /* JADX INFO: renamed from: x76$p$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", m4010f = "Transform.kt", m4011i = {}, m4012l = {67}, m4013m = "emit", m4014n = {}, m4015s = {})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f97066a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C14963p<T> f97067b;

            /* JADX INFO: renamed from: c */
            public int f97068c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C14963p<? super T> c14963p, zy2<? super a> zy2Var) {
                super(zy2Var);
                this.f97067b = c14963p;
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f97066a = obj;
                this.f97068c |= Integer.MIN_VALUE;
                return this.f97067b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C14963p(t66<? super q08<? extends T>> t66Var, jvd.C8119f c8119f) {
            this.f97064a = t66Var;
            this.f97065b = c8119f;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.t66
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r8, p000.zy2<? super p000.bth> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof p000.x76.C14963p.a
                if (r0 == 0) goto L13
                r0 = r9
                x76$p$a r0 = (p000.x76.C14963p.a) r0
                int r1 = r0.f97068c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f97068c = r1
                goto L18
            L13:
                x76$p$a r0 = new x76$p$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f97066a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f97068c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                p000.y7e.throwOnFailure(r9)
                goto L4e
            L29:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L31:
                p000.y7e.throwOnFailure(r9)
                t66<q08<? extends T>> r9 = r7.f97064a
                q08 r2 = new q08
                jvd$f r4 = r7.f97065b
                int r5 = r4.f52108a
                int r6 = r5 + 1
                r4.f52108a = r6
                if (r5 < 0) goto L51
                r2.<init>(r5, r8)
                r0.f97068c = r3
                java.lang.Object r8 = r9.emit(r2, r0)
                if (r8 != r1) goto L4e
                return r1
            L4e:
                bth r8 = p000.bth.f14751a
                return r8
            L51:
                java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
                java.lang.String r9 = "Index overflow has happened"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.x76.C14963p.emit(java.lang.Object, zy2):java.lang.Object");
        }
    }

    @wg5
    @yfb
    public static final <T> y56<List<T>> chunked(@yfb y56<? extends T> y56Var, int i) {
        if (i >= 1) {
            return new C14948a(y56Var, i);
        }
        throw new IllegalArgumentException(("Expected positive chunk size, but got " + i).toString());
    }

    @yfb
    public static final <T> y56<T> filter(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super Boolean>, ? extends Object> gz6Var) {
        return new C14950c(y56Var, gz6Var);
    }

    public static final /* synthetic */ <R> y56<R> filterIsInstance(y56<?> y56Var) {
        md8.needClassReification();
        return new C14951d(y56Var);
    }

    @yfb
    public static final <T> y56<T> filterNot(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super Boolean>, ? extends Object> gz6Var) {
        return new C14953f(y56Var, gz6Var);
    }

    @yfb
    public static final <T> y56<T> filterNotNull(@yfb y56<? extends T> y56Var) {
        return new C14954g(y56Var);
    }

    @yfb
    public static final <T, R> y56<R> map(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super R>, ? extends Object> gz6Var) {
        return new C14955h(y56Var, gz6Var);
    }

    @yfb
    public static final <T, R> y56<R> mapNotNull(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super R>, ? extends Object> gz6Var) {
        return new C14956i(y56Var, gz6Var);
    }

    @yfb
    public static final <T> y56<T> onEach(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return new C14957j(y56Var, gz6Var);
    }

    @yfb
    public static final <T, R> y56<R> runningFold(@yfb y56<? extends T> y56Var, R r, @yfb @cg1 kz6<? super R, ? super T, ? super zy2<? super R>, ? extends Object> kz6Var) {
        return new C14958k(r, y56Var, kz6Var);
    }

    @yfb
    public static final <T> y56<T> runningReduce(@yfb y56<? extends T> y56Var, @yfb kz6<? super T, ? super T, ? super zy2<? super T>, ? extends Object> kz6Var) {
        return new C14960m(y56Var, kz6Var);
    }

    @yfb
    public static final <T, R> y56<R> scan(@yfb y56<? extends T> y56Var, R r, @yfb @cg1 kz6<? super R, ? super T, ? super zy2<? super R>, ? extends Object> kz6Var) {
        return c76.runningFold(y56Var, r, kz6Var);
    }

    @yfb
    public static final <T> y56<q08<T>> withIndex(@yfb y56<? extends T> y56Var) {
        return new C14962o(y56Var);
    }

    @yfb
    public static final <R> y56<R> filterIsInstance(@yfb y56<?> y56Var, @yfb oo8<R> oo8Var) {
        return new C14952e(y56Var, oo8Var);
    }
}
