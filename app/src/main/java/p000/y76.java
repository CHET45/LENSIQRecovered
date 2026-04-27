package p000;

import org.videolan.libvlc.MediaPlayer;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,328:1\n268#1,3:330\n268#1,3:333\n257#1:336\n259#1:338\n268#1,3:339\n257#1:342\n259#1:344\n268#1,3:345\n257#1:348\n259#1:350\n268#1,3:351\n105#2:329\n105#2:337\n105#2:343\n105#2:349\n105#2:354\n105#2:355\n105#2:358\n37#3,2:356\n37#3,2:359\n*S KotlinDebug\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n71#1:330,3\n99#1:333,3\n115#1:336\n115#1:338\n134#1:339,3\n152#1:342\n152#1:344\n173#1:345,3\n193#1:348\n193#1:350\n216#1:351,3\n28#1:329\n115#1:337\n152#1:343\n193#1:349\n233#1:354\n257#1:355\n284#1:358\n283#1:356,2\n302#1:359,2\n*E\n"})
public final /* synthetic */ class y76 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: y76$a */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n258#2,2:109\n*E\n"})
    public static final class C15514a<R> implements y56<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56[] f100572a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ oz6 f100573b;

        /* JADX INFO: renamed from: y76$a$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", m4010f = "Zip.kt", m4011i = {}, m4012l = {259, 258}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        @dwf({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,258:1\n116#2,5:259\n*E\n"})
        public static final class a extends ugg implements kz6<t66<? super R>, Object[], zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f100574a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f100575b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f100576c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ oz6 f100577d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zy2 zy2Var, oz6 oz6Var) {
                super(3, zy2Var);
                this.f100577d = oz6Var;
            }

            @Override // p000.kz6
            public final Object invoke(t66<? super R> t66Var, Object[] objArr, zy2<? super bth> zy2Var) {
                a aVar = new a(zy2Var, this.f100577d);
                aVar.f100575b = t66Var;
                aVar.f100576c = objArr;
                return aVar.invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                t66 t66Var;
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f100574a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    t66Var = (t66) this.f100575b;
                    Object[] objArr = (Object[]) this.f100576c;
                    oz6 oz6Var = this.f100577d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f100575b = t66Var;
                    this.f100574a = 1;
                    o28.mark(6);
                    obj = oz6Var.invoke(obj2, obj3, obj4, this);
                    o28.mark(7);
                    if (obj == coroutine_suspended) {
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
                    t66Var = (t66) this.f100575b;
                    y7e.throwOnFailure(obj);
                }
                this.f100575b = null;
                this.f100574a = 2;
                if (t66Var.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return bth.f14751a;
            }
        }

        public C15514a(y56[] y56VarArr, oz6 oz6Var) {
            this.f100572a = y56VarArr;
            this.f100573b = oz6Var;
        }

        @Override // p000.y56
        public Object collect(t66 t66Var, zy2 zy2Var) {
            Object objCombineInternal = eb2.combineInternal(t66Var, this.f100572a, y76.nullArrayFactory$FlowKt__ZipKt(), new a(null, this.f100573b), zy2Var);
            return objCombineInternal == pd8.getCOROUTINE_SUSPENDED() ? objCombineInternal : bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: y76$b */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n258#2,2:109\n*E\n"})
    public static final class C15515b<R> implements y56<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56[] f100578a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ rz6 f100579b;

        /* JADX INFO: renamed from: y76$b$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", m4010f = "Zip.kt", m4011i = {}, m4012l = {259, 258}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        @dwf({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,258:1\n153#2,6:259\n*E\n"})
        public static final class a extends ugg implements kz6<t66<? super R>, Object[], zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f100580a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f100581b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f100582c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ rz6 f100583d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zy2 zy2Var, rz6 rz6Var) {
                super(3, zy2Var);
                this.f100583d = rz6Var;
            }

            @Override // p000.kz6
            public final Object invoke(t66<? super R> t66Var, Object[] objArr, zy2<? super bth> zy2Var) {
                a aVar = new a(zy2Var, this.f100583d);
                aVar.f100581b = t66Var;
                aVar.f100582c = objArr;
                return aVar.invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                t66 t66Var;
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f100580a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    t66Var = (t66) this.f100581b;
                    Object[] objArr = (Object[]) this.f100582c;
                    rz6 rz6Var = this.f100583d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f100581b = t66Var;
                    this.f100580a = 1;
                    o28.mark(6);
                    obj = rz6Var.invoke(obj2, obj3, obj4, obj5, this);
                    o28.mark(7);
                    if (obj == coroutine_suspended) {
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
                    t66Var = (t66) this.f100581b;
                    y7e.throwOnFailure(obj);
                }
                this.f100581b = null;
                this.f100580a = 2;
                if (t66Var.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return bth.f14751a;
            }
        }

        public C15515b(y56[] y56VarArr, rz6 rz6Var) {
            this.f100578a = y56VarArr;
            this.f100579b = rz6Var;
        }

        @Override // p000.y56
        public Object collect(t66 t66Var, zy2 zy2Var) {
            Object objCombineInternal = eb2.combineInternal(t66Var, this.f100578a, y76.nullArrayFactory$FlowKt__ZipKt(), new a(null, this.f100579b), zy2Var);
            return objCombineInternal == pd8.getCOROUTINE_SUSPENDED() ? objCombineInternal : bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: y76$c */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n258#2,2:109\n*E\n"})
    public static final class C15516c<R> implements y56<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56[] f100584a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ uz6 f100585b;

        /* JADX INFO: renamed from: y76$c$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", m4010f = "Zip.kt", m4011i = {}, m4012l = {259, 258}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        @dwf({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,258:1\n194#2,7:259\n*E\n"})
        public static final class a extends ugg implements kz6<t66<? super R>, Object[], zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f100586a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f100587b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f100588c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ uz6 f100589d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zy2 zy2Var, uz6 uz6Var) {
                super(3, zy2Var);
                this.f100589d = uz6Var;
            }

            @Override // p000.kz6
            public final Object invoke(t66<? super R> t66Var, Object[] objArr, zy2<? super bth> zy2Var) {
                a aVar = new a(zy2Var, this.f100589d);
                aVar.f100587b = t66Var;
                aVar.f100588c = objArr;
                return aVar.invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                t66 t66Var;
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f100586a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    t66Var = (t66) this.f100587b;
                    Object[] objArr = (Object[]) this.f100588c;
                    uz6 uz6Var = this.f100589d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.f100587b = t66Var;
                    this.f100586a = 1;
                    o28.mark(6);
                    obj = uz6Var.invoke(obj2, obj3, obj4, obj5, obj6, this);
                    o28.mark(7);
                    if (obj == coroutine_suspended) {
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
                    t66Var = (t66) this.f100587b;
                    y7e.throwOnFailure(obj);
                }
                this.f100587b = null;
                this.f100586a = 2;
                if (t66Var.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return bth.f14751a;
            }
        }

        public C15516c(y56[] y56VarArr, uz6 uz6Var) {
            this.f100584a = y56VarArr;
            this.f100585b = uz6Var;
        }

        @Override // p000.y56
        public Object collect(t66 t66Var, zy2 zy2Var) {
            Object objCombineInternal = eb2.combineInternal(t66Var, this.f100584a, y76.nullArrayFactory$FlowKt__ZipKt(), new a(null, this.f100585b), zy2Var);
            return objCombineInternal == pd8.getCOROUTINE_SUSPENDED() ? objCombineInternal : bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: y76$d */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n29#2,2:109\n*E\n"})
    public static final class C15517d<R> implements y56<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f100590a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ y56 f100591b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ kz6 f100592c;

        public C15517d(y56 y56Var, y56 y56Var2, kz6 kz6Var) {
            this.f100590a = y56Var;
            this.f100591b = y56Var2;
            this.f100592c = kz6Var;
        }

        @Override // p000.y56
        public Object collect(t66<? super R> t66Var, zy2<? super bth> zy2Var) {
            Object objCombineInternal = eb2.combineInternal(t66Var, new y56[]{this.f100590a, this.f100591b}, y76.nullArrayFactory$FlowKt__ZipKt(), new C15520g(this.f100592c, null), zy2Var);
            return objCombineInternal == pd8.getCOROUTINE_SUSPENDED() ? objCombineInternal : bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: y76$e */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n234#2,2:109\n*E\n"})
    public static final class C15518e<R> implements y56<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56[] f100593a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6 f100594b;

        /* JADX INFO: renamed from: y76$e$a */
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f100595a;

            /* JADX INFO: renamed from: b */
            public int f100596b;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f100595a = obj;
                this.f100596b |= Integer.MIN_VALUE;
                return C15518e.this.collect(null, this);
            }
        }

        public C15518e(y56[] y56VarArr, gz6 gz6Var) {
            this.f100593a = y56VarArr;
            this.f100594b = gz6Var;
        }

        @Override // p000.y56
        public Object collect(t66<? super R> t66Var, zy2<? super bth> zy2Var) {
            y56[] y56VarArr = this.f100593a;
            md8.needClassReification();
            C15521h c15521h = new C15521h(this.f100593a);
            md8.needClassReification();
            Object objCombineInternal = eb2.combineInternal(t66Var, y56VarArr, c15521h, new C15522i(this.f100594b, null), zy2Var);
            return objCombineInternal == pd8.getCOROUTINE_SUSPENDED() ? objCombineInternal : bth.f14751a;
        }

        public Object collect$$forInline(t66 t66Var, zy2 zy2Var) {
            o28.mark(4);
            new a(zy2Var);
            o28.mark(5);
            y56[] y56VarArr = this.f100593a;
            md8.needClassReification();
            C15521h c15521h = new C15521h(this.f100593a);
            md8.needClassReification();
            C15522i c15522i = new C15522i(this.f100594b, null);
            o28.mark(0);
            eb2.combineInternal(t66Var, y56VarArr, c15521h, c15522i, zy2Var);
            o28.mark(1);
            return bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: y76$f */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n285#2,5:109\n*E\n"})
    public static final class C15519f<R> implements y56<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56[] f100598a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6 f100599b;

        /* JADX INFO: renamed from: y76$f$a */
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f100600a;

            /* JADX INFO: renamed from: b */
            public int f100601b;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f100600a = obj;
                this.f100601b |= Integer.MIN_VALUE;
                return C15519f.this.collect(null, this);
            }
        }

        public C15519f(y56[] y56VarArr, gz6 gz6Var) {
            this.f100598a = y56VarArr;
            this.f100599b = gz6Var;
        }

        @Override // p000.y56
        public Object collect(t66<? super R> t66Var, zy2<? super bth> zy2Var) {
            y56[] y56VarArr = this.f100598a;
            md8.needClassReification();
            C15523j c15523j = new C15523j(this.f100598a);
            md8.needClassReification();
            Object objCombineInternal = eb2.combineInternal(t66Var, y56VarArr, c15523j, new C15524k(this.f100599b, null), zy2Var);
            return objCombineInternal == pd8.getCOROUTINE_SUSPENDED() ? objCombineInternal : bth.f14751a;
        }

        public Object collect$$forInline(t66 t66Var, zy2 zy2Var) {
            o28.mark(4);
            new a(zy2Var);
            o28.mark(5);
            y56[] y56VarArr = this.f100598a;
            md8.needClassReification();
            C15523j c15523j = new C15523j(this.f100598a);
            md8.needClassReification();
            C15524k c15524k = new C15524k(this.f100599b, null);
            o28.mark(0);
            eb2.combineInternal(t66Var, y56VarArr, c15523j, c15524k, zy2Var);
            o28.mark(1);
            return bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: y76$g */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", m4010f = "Zip.kt", m4011i = {}, m4012l = {29, 29}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C15520g<R> extends ugg implements kz6<t66<? super R>, Object[], zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f100603a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f100604b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f100605c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ kz6<T1, T2, zy2<? super R>, Object> f100606d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15520g(kz6<? super T1, ? super T2, ? super zy2<? super R>, ? extends Object> kz6Var, zy2<? super C15520g> zy2Var) {
            super(3, zy2Var);
            this.f100606d = kz6Var;
        }

        @Override // p000.kz6
        public final Object invoke(t66<? super R> t66Var, Object[] objArr, zy2<? super bth> zy2Var) {
            C15520g c15520g = new C15520g(this.f100606d, zy2Var);
            c15520g.f100604b = t66Var;
            c15520g.f100605c = objArr;
            return c15520g.invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to y76$g<R> for r6v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p000.tq0
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r6.f100603a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p000.y7e.throwOnFailure(r7)
                goto L4c
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f100604b
                t66 r1 = (p000.t66) r1
                p000.y7e.throwOnFailure(r7)
                goto L40
            L22:
                p000.y7e.throwOnFailure(r7)
                java.lang.Object r7 = r6.f100604b
                r1 = r7
                t66 r1 = (p000.t66) r1
                java.lang.Object r7 = r6.f100605c
                java.lang.Object[] r7 = (java.lang.Object[]) r7
                kz6<T1, T2, zy2<? super R>, java.lang.Object> r4 = r6.f100606d
                r5 = 0
                r5 = r7[r5]
                r7 = r7[r3]
                r6.f100604b = r1
                r6.f100603a = r3
                java.lang.Object r7 = r4.invoke(r5, r7, r6)
                if (r7 != r0) goto L40
                return r0
            L40:
                r3 = 0
                r6.f100604b = r3
                r6.f100603a = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L4c
                return r0
            L4c:
                bth r7 = p000.bth.f14751a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.y76.C15520g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: y76$h */
    public static final class C15521h<T> implements ny6<T[]> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56<T>[] f100607a;

        /* JADX WARN: Multi-variable type inference failed */
        public C15521h(y56<? extends T>[] y56VarArr) {
            this.f100607a = y56VarArr;
        }

        @Override // p000.ny6
        public final T[] invoke() {
            int length = this.f100607a.length;
            md8.reifiedOperationMarker(0, "T?");
            return (T[]) new Object[length];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: y76$i */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2", m4010f = "Zip.kt", m4011i = {}, m4012l = {234, 234}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C15522i<R, T> extends ugg implements kz6<t66<? super R>, T[], zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f100608a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f100609b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f100610c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6<T[], zy2<? super R>, Object> f100611d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15522i(gz6<? super T[], ? super zy2<? super R>, ? extends Object> gz6Var, zy2<? super C15522i> zy2Var) {
            super(3, zy2Var);
            this.f100611d = gz6Var;
        }

        @Override // p000.kz6
        public final Object invoke(t66<? super R> t66Var, T[] tArr, zy2<? super bth> zy2Var) {
            md8.needClassReification();
            C15522i c15522i = new C15522i(this.f100611d, zy2Var);
            c15522i.f100609b = t66Var;
            c15522i.f100610c = tArr;
            return c15522i.invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            t66 t66Var;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f100608a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                t66 t66Var2 = (t66) this.f100609b;
                Object[] objArr = (Object[]) this.f100610c;
                gz6<T[], zy2<? super R>, Object> gz6Var = this.f100611d;
                this.f100609b = t66Var2;
                this.f100608a = 1;
                obj = gz6Var.invoke(objArr, this);
                t66Var = t66Var2;
                if (obj == coroutine_suspended) {
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
                t66 t66Var3 = (t66) this.f100609b;
                y7e.throwOnFailure(obj);
                t66Var = t66Var3;
            }
            this.f100609b = null;
            this.f100608a = 2;
            if (t66Var.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return bth.f14751a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invokeSuspend$$forInline(Object obj) {
            t66 t66Var = (t66) this.f100609b;
            Object objInvoke = this.f100611d.invoke((Object[]) this.f100610c, this);
            o28.mark(0);
            t66Var.emit(objInvoke, this);
            o28.mark(1);
            return bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: y76$j */
    public static final class C15523j<T> implements ny6<T[]> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56<T>[] f100612a;

        public C15523j(y56<T>[] y56VarArr) {
            this.f100612a = y56VarArr;
        }

        @Override // p000.ny6
        public final T[] invoke() {
            int length = this.f100612a.length;
            md8.reifiedOperationMarker(0, "T?");
            return (T[]) new Object[length];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: y76$k */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", m4010f = "Zip.kt", m4011i = {}, m4012l = {288, 288}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C15524k<R, T> extends ugg implements kz6<t66<? super R>, T[], zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f100613a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f100614b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f100615c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6<T[], zy2<? super R>, Object> f100616d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15524k(gz6<? super T[], ? super zy2<? super R>, ? extends Object> gz6Var, zy2<? super C15524k> zy2Var) {
            super(3, zy2Var);
            this.f100616d = gz6Var;
        }

        @Override // p000.kz6
        public final Object invoke(t66<? super R> t66Var, T[] tArr, zy2<? super bth> zy2Var) {
            md8.needClassReification();
            C15524k c15524k = new C15524k(this.f100616d, zy2Var);
            c15524k.f100614b = t66Var;
            c15524k.f100615c = tArr;
            return c15524k.invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            t66 t66Var;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f100613a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                t66 t66Var2 = (t66) this.f100614b;
                Object[] objArr = (Object[]) this.f100615c;
                gz6<T[], zy2<? super R>, Object> gz6Var = this.f100616d;
                this.f100614b = t66Var2;
                this.f100613a = 1;
                obj = gz6Var.invoke(objArr, this);
                t66Var = t66Var2;
                if (obj == coroutine_suspended) {
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
                t66 t66Var3 = (t66) this.f100614b;
                y7e.throwOnFailure(obj);
                t66Var = t66Var3;
            }
            this.f100614b = null;
            this.f100613a = 2;
            if (t66Var.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return bth.f14751a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invokeSuspend$$forInline(Object obj) {
            t66 t66Var = (t66) this.f100614b;
            Object objInvoke = this.f100616d.invoke((Object[]) this.f100615c, this);
            o28.mark(0);
            t66Var.emit(objInvoke, this);
            o28.mark(1);
            return bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: y76$l */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1", m4010f = "Zip.kt", m4011i = {}, m4012l = {MediaPlayer.Event.SeekableChanged}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C15525l<R> extends ugg implements gz6<t66<? super R>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f100617a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f100618b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y56[] f100619c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ oz6 f100620d;

        /* JADX INFO: renamed from: y76$l$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1", m4010f = "Zip.kt", m4011i = {}, m4012l = {270}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        @dwf({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,269:1\n72#2,5:270\n*E\n"})
        public static final class a extends ugg implements kz6<t66<? super R>, Object[], zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f100621a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f100622b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f100623c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ oz6 f100624d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zy2 zy2Var, oz6 oz6Var) {
                super(3, zy2Var);
                this.f100624d = oz6Var;
            }

            @Override // p000.kz6
            public final Object invoke(t66<? super R> t66Var, Object[] objArr, zy2<? super bth> zy2Var) {
                a aVar = new a(zy2Var, this.f100624d);
                aVar.f100622b = t66Var;
                aVar.f100623c = objArr;
                return aVar.invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f100621a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    t66 t66Var = (t66) this.f100622b;
                    Object[] objArr = (Object[]) this.f100623c;
                    oz6 oz6Var = this.f100624d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.f100621a = 1;
                    o28.mark(6);
                    Object objInvoke = oz6Var.invoke(t66Var, obj2, obj3, this);
                    o28.mark(7);
                    if (objInvoke == coroutine_suspended) {
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
        public C15525l(y56[] y56VarArr, zy2 zy2Var, oz6 oz6Var) {
            super(2, zy2Var);
            this.f100619c = y56VarArr;
            this.f100620d = oz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C15525l c15525l = new C15525l(this.f100619c, zy2Var, this.f100620d);
            c15525l.f100618b = obj;
            return c15525l;
        }

        @Override // p000.gz6
        public final Object invoke(t66<? super R> t66Var, zy2<? super bth> zy2Var) {
            return ((C15525l) create(t66Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f100617a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                t66 t66Var = (t66) this.f100618b;
                y56[] y56VarArr = this.f100619c;
                ny6 ny6VarNullArrayFactory$FlowKt__ZipKt = y76.nullArrayFactory$FlowKt__ZipKt();
                a aVar = new a(null, this.f100620d);
                this.f100617a = 1;
                if (eb2.combineInternal(t66Var, y56VarArr, ny6VarNullArrayFactory$FlowKt__ZipKt, aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: y76$m */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", m4010f = "Zip.kt", m4011i = {}, m4012l = {MediaPlayer.Event.SeekableChanged}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C15526m<R> extends ugg implements gz6<t66<? super R>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f100625a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f100626b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y56[] f100627c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ oz6 f100628d;

        /* JADX INFO: renamed from: y76$m$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", m4010f = "Zip.kt", m4011i = {}, m4012l = {270}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        @dwf({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,269:1\n100#2,5:270\n*E\n"})
        public static final class a extends ugg implements kz6<t66<? super R>, Object[], zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f100629a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f100630b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f100631c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ oz6 f100632d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zy2 zy2Var, oz6 oz6Var) {
                super(3, zy2Var);
                this.f100632d = oz6Var;
            }

            @Override // p000.kz6
            public final Object invoke(t66<? super R> t66Var, Object[] objArr, zy2<? super bth> zy2Var) {
                a aVar = new a(zy2Var, this.f100632d);
                aVar.f100630b = t66Var;
                aVar.f100631c = objArr;
                return aVar.invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f100629a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    t66 t66Var = (t66) this.f100630b;
                    Object[] objArr = (Object[]) this.f100631c;
                    oz6 oz6Var = this.f100632d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.f100629a = 1;
                    o28.mark(6);
                    Object objInvoke = oz6Var.invoke(t66Var, obj2, obj3, this);
                    o28.mark(7);
                    if (objInvoke == coroutine_suspended) {
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
        public C15526m(y56[] y56VarArr, zy2 zy2Var, oz6 oz6Var) {
            super(2, zy2Var);
            this.f100627c = y56VarArr;
            this.f100628d = oz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C15526m c15526m = new C15526m(this.f100627c, zy2Var, this.f100628d);
            c15526m.f100626b = obj;
            return c15526m;
        }

        @Override // p000.gz6
        public final Object invoke(t66<? super R> t66Var, zy2<? super bth> zy2Var) {
            return ((C15526m) create(t66Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f100625a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                t66 t66Var = (t66) this.f100626b;
                y56[] y56VarArr = this.f100627c;
                ny6 ny6VarNullArrayFactory$FlowKt__ZipKt = y76.nullArrayFactory$FlowKt__ZipKt();
                a aVar = new a(null, this.f100628d);
                this.f100625a = 1;
                if (eb2.combineInternal(t66Var, y56VarArr, ny6VarNullArrayFactory$FlowKt__ZipKt, aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: y76$n */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3", m4010f = "Zip.kt", m4011i = {}, m4012l = {MediaPlayer.Event.SeekableChanged}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C15527n<R> extends ugg implements gz6<t66<? super R>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f100633a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f100634b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y56[] f100635c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ rz6 f100636d;

        /* JADX INFO: renamed from: y76$n$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1", m4010f = "Zip.kt", m4011i = {}, m4012l = {270}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        @dwf({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,269:1\n135#2,6:270\n*E\n"})
        public static final class a extends ugg implements kz6<t66<? super R>, Object[], zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f100637a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f100638b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f100639c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ rz6 f100640d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zy2 zy2Var, rz6 rz6Var) {
                super(3, zy2Var);
                this.f100640d = rz6Var;
            }

            @Override // p000.kz6
            public final Object invoke(t66<? super R> t66Var, Object[] objArr, zy2<? super bth> zy2Var) {
                a aVar = new a(zy2Var, this.f100640d);
                aVar.f100638b = t66Var;
                aVar.f100639c = objArr;
                return aVar.invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f100637a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    t66 t66Var = (t66) this.f100638b;
                    Object[] objArr = (Object[]) this.f100639c;
                    rz6 rz6Var = this.f100640d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f100637a = 1;
                    o28.mark(6);
                    Object objInvoke = rz6Var.invoke(t66Var, obj2, obj3, obj4, this);
                    o28.mark(7);
                    if (objInvoke == coroutine_suspended) {
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
        public C15527n(y56[] y56VarArr, zy2 zy2Var, rz6 rz6Var) {
            super(2, zy2Var);
            this.f100635c = y56VarArr;
            this.f100636d = rz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C15527n c15527n = new C15527n(this.f100635c, zy2Var, this.f100636d);
            c15527n.f100634b = obj;
            return c15527n;
        }

        @Override // p000.gz6
        public final Object invoke(t66<? super R> t66Var, zy2<? super bth> zy2Var) {
            return ((C15527n) create(t66Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f100633a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                t66 t66Var = (t66) this.f100634b;
                y56[] y56VarArr = this.f100635c;
                ny6 ny6VarNullArrayFactory$FlowKt__ZipKt = y76.nullArrayFactory$FlowKt__ZipKt();
                a aVar = new a(null, this.f100636d);
                this.f100633a = 1;
                if (eb2.combineInternal(t66Var, y56VarArr, ny6VarNullArrayFactory$FlowKt__ZipKt, aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: y76$o */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4", m4010f = "Zip.kt", m4011i = {}, m4012l = {MediaPlayer.Event.SeekableChanged}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C15528o<R> extends ugg implements gz6<t66<? super R>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f100641a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f100642b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y56[] f100643c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ uz6 f100644d;

        /* JADX INFO: renamed from: y76$o$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1", m4010f = "Zip.kt", m4011i = {}, m4012l = {270}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        @dwf({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,269:1\n174#2,7:270\n*E\n"})
        public static final class a extends ugg implements kz6<t66<? super R>, Object[], zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f100645a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f100646b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f100647c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ uz6 f100648d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zy2 zy2Var, uz6 uz6Var) {
                super(3, zy2Var);
                this.f100648d = uz6Var;
            }

            @Override // p000.kz6
            public final Object invoke(t66<? super R> t66Var, Object[] objArr, zy2<? super bth> zy2Var) {
                a aVar = new a(zy2Var, this.f100648d);
                aVar.f100646b = t66Var;
                aVar.f100647c = objArr;
                return aVar.invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f100645a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    t66 t66Var = (t66) this.f100646b;
                    Object[] objArr = (Object[]) this.f100647c;
                    uz6 uz6Var = this.f100648d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f100645a = 1;
                    o28.mark(6);
                    Object objInvoke = uz6Var.invoke(t66Var, obj2, obj3, obj4, obj5, this);
                    o28.mark(7);
                    if (objInvoke == coroutine_suspended) {
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
        public C15528o(y56[] y56VarArr, zy2 zy2Var, uz6 uz6Var) {
            super(2, zy2Var);
            this.f100643c = y56VarArr;
            this.f100644d = uz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C15528o c15528o = new C15528o(this.f100643c, zy2Var, this.f100644d);
            c15528o.f100642b = obj;
            return c15528o;
        }

        @Override // p000.gz6
        public final Object invoke(t66<? super R> t66Var, zy2<? super bth> zy2Var) {
            return ((C15528o) create(t66Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f100641a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                t66 t66Var = (t66) this.f100642b;
                y56[] y56VarArr = this.f100643c;
                ny6 ny6VarNullArrayFactory$FlowKt__ZipKt = y76.nullArrayFactory$FlowKt__ZipKt();
                a aVar = new a(null, this.f100644d);
                this.f100641a = 1;
                if (eb2.combineInternal(t66Var, y56VarArr, ny6VarNullArrayFactory$FlowKt__ZipKt, aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: y76$p */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5", m4010f = "Zip.kt", m4011i = {}, m4012l = {MediaPlayer.Event.SeekableChanged}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C15529p<R> extends ugg implements gz6<t66<? super R>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f100649a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f100650b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y56[] f100651c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ xz6 f100652d;

        /* JADX INFO: renamed from: y76$p$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1", m4010f = "Zip.kt", m4011i = {}, m4012l = {270}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        @dwf({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,269:1\n217#2,8:270\n*E\n"})
        public static final class a extends ugg implements kz6<t66<? super R>, Object[], zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f100653a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f100654b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f100655c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ xz6 f100656d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zy2 zy2Var, xz6 xz6Var) {
                super(3, zy2Var);
                this.f100656d = xz6Var;
            }

            @Override // p000.kz6
            public final Object invoke(t66<? super R> t66Var, Object[] objArr, zy2<? super bth> zy2Var) {
                a aVar = new a(zy2Var, this.f100656d);
                aVar.f100654b = t66Var;
                aVar.f100655c = objArr;
                return aVar.invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f100653a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    t66 t66Var = (t66) this.f100654b;
                    Object[] objArr = (Object[]) this.f100655c;
                    xz6 xz6Var = this.f100656d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.f100653a = 1;
                    o28.mark(6);
                    Object objInvoke = xz6Var.invoke(t66Var, obj2, obj3, obj4, obj5, obj6, this);
                    o28.mark(7);
                    if (objInvoke == coroutine_suspended) {
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
        public C15529p(y56[] y56VarArr, zy2 zy2Var, xz6 xz6Var) {
            super(2, zy2Var);
            this.f100651c = y56VarArr;
            this.f100652d = xz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C15529p c15529p = new C15529p(this.f100651c, zy2Var, this.f100652d);
            c15529p.f100650b = obj;
            return c15529p;
        }

        @Override // p000.gz6
        public final Object invoke(t66<? super R> t66Var, zy2<? super bth> zy2Var) {
            return ((C15529p) create(t66Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f100649a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                t66 t66Var = (t66) this.f100650b;
                y56[] y56VarArr = this.f100651c;
                ny6 ny6VarNullArrayFactory$FlowKt__ZipKt = y76.nullArrayFactory$FlowKt__ZipKt();
                a aVar = new a(null, this.f100652d);
                this.f100649a = 1;
                if (eb2.combineInternal(t66Var, y56VarArr, ny6VarNullArrayFactory$FlowKt__ZipKt, aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: y76$q */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", m4010f = "Zip.kt", m4011i = {}, m4012l = {247}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C15530q<R> extends ugg implements gz6<t66<? super R>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f100657a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f100658b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y56<T>[] f100659c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ kz6<t66<? super R>, T[], zy2<? super bth>, Object> f100660d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: y76$q$a */
        public static final class a<T> implements ny6<T[]> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ y56<T>[] f100661a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(y56<? extends T>[] y56VarArr) {
                this.f100661a = y56VarArr;
            }

            @Override // p000.ny6
            public final T[] invoke() {
                int length = this.f100661a.length;
                md8.reifiedOperationMarker(0, "T?");
                return (T[]) new Object[length];
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: y76$q$b */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", m4010f = "Zip.kt", m4011i = {}, m4012l = {247}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b<T> extends ugg implements kz6<t66<? super R>, T[], zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f100662a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f100663b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f100664c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ kz6<t66<? super R>, T[], zy2<? super bth>, Object> f100665d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(kz6<? super t66<? super R>, ? super T[], ? super zy2<? super bth>, ? extends Object> kz6Var, zy2<? super b> zy2Var) {
                super(3, zy2Var);
                this.f100665d = kz6Var;
            }

            @Override // p000.kz6
            public final Object invoke(t66<? super R> t66Var, T[] tArr, zy2<? super bth> zy2Var) {
                md8.needClassReification();
                b bVar = new b(this.f100665d, zy2Var);
                bVar.f100663b = t66Var;
                bVar.f100664c = tArr;
                return bVar.invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f100662a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    t66<? super R> t66Var = (t66) this.f100663b;
                    Object[] objArr = (Object[]) this.f100664c;
                    kz6<t66<? super R>, T[], zy2<? super bth>, Object> kz6Var = this.f100665d;
                    this.f100663b = null;
                    this.f100662a = 1;
                    if (kz6Var.invoke(t66Var, objArr, this) == coroutine_suspended) {
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

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final Object invokeSuspend$$forInline(Object obj) {
                this.f100665d.invoke((t66) this.f100663b, (Object[]) this.f100664c, this);
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15530q(y56<? extends T>[] y56VarArr, kz6<? super t66<? super R>, ? super T[], ? super zy2<? super bth>, ? extends Object> kz6Var, zy2<? super C15530q> zy2Var) {
            super(2, zy2Var);
            this.f100659c = y56VarArr;
            this.f100660d = kz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C15530q c15530q = new C15530q(this.f100659c, this.f100660d, zy2Var);
            c15530q.f100658b = obj;
            return c15530q;
        }

        @Override // p000.gz6
        public final Object invoke(t66<? super R> t66Var, zy2<? super bth> zy2Var) {
            return ((C15530q) create(t66Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f100657a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                t66 t66Var = (t66) this.f100658b;
                y56<T>[] y56VarArr = this.f100659c;
                md8.needClassReification();
                a aVar = new a(this.f100659c);
                md8.needClassReification();
                b bVar = new b(this.f100660d, null);
                this.f100657a = 1;
                if (eb2.combineInternal(t66Var, y56VarArr, aVar, bVar, this) == coroutine_suspended) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            t66 t66Var = (t66) this.f100658b;
            y56<T>[] y56VarArr = this.f100659c;
            md8.needClassReification();
            a aVar = new a(this.f100659c);
            md8.needClassReification();
            b bVar = new b(this.f100660d, null);
            o28.mark(0);
            eb2.combineInternal(t66Var, y56VarArr, aVar, bVar, this);
            o28.mark(1);
            return bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: y76$r */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", m4010f = "Zip.kt", m4011i = {}, m4012l = {304}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C15531r<R> extends ugg implements gz6<t66<? super R>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f100666a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f100667b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y56<T>[] f100668c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ kz6<t66<? super R>, T[], zy2<? super bth>, Object> f100669d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: y76$r$a */
        public static final class a<T> implements ny6<T[]> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ y56<T>[] f100670a;

            public a(y56<T>[] y56VarArr) {
                this.f100670a = y56VarArr;
            }

            @Override // p000.ny6
            public final T[] invoke() {
                int length = this.f100670a.length;
                md8.reifiedOperationMarker(0, "T?");
                return (T[]) new Object[length];
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: y76$r$b */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", m4010f = "Zip.kt", m4011i = {}, m4012l = {304}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b<T> extends ugg implements kz6<t66<? super R>, T[], zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f100671a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f100672b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f100673c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ kz6<t66<? super R>, T[], zy2<? super bth>, Object> f100674d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(kz6<? super t66<? super R>, ? super T[], ? super zy2<? super bth>, ? extends Object> kz6Var, zy2<? super b> zy2Var) {
                super(3, zy2Var);
                this.f100674d = kz6Var;
            }

            @Override // p000.kz6
            public final Object invoke(t66<? super R> t66Var, T[] tArr, zy2<? super bth> zy2Var) {
                md8.needClassReification();
                b bVar = new b(this.f100674d, zy2Var);
                bVar.f100672b = t66Var;
                bVar.f100673c = tArr;
                return bVar.invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f100671a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    t66<? super R> t66Var = (t66) this.f100672b;
                    Object[] objArr = (Object[]) this.f100673c;
                    kz6<t66<? super R>, T[], zy2<? super bth>, Object> kz6Var = this.f100674d;
                    this.f100672b = null;
                    this.f100671a = 1;
                    if (kz6Var.invoke(t66Var, objArr, this) == coroutine_suspended) {
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

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final Object invokeSuspend$$forInline(Object obj) {
                this.f100674d.invoke((t66) this.f100672b, (Object[]) this.f100673c, this);
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15531r(y56<T>[] y56VarArr, kz6<? super t66<? super R>, ? super T[], ? super zy2<? super bth>, ? extends Object> kz6Var, zy2<? super C15531r> zy2Var) {
            super(2, zy2Var);
            this.f100668c = y56VarArr;
            this.f100669d = kz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C15531r c15531r = new C15531r(this.f100668c, this.f100669d, zy2Var);
            c15531r.f100667b = obj;
            return c15531r;
        }

        @Override // p000.gz6
        public final Object invoke(t66<? super R> t66Var, zy2<? super bth> zy2Var) {
            return ((C15531r) create(t66Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f100666a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                t66 t66Var = (t66) this.f100667b;
                y56<T>[] y56VarArr = this.f100668c;
                md8.needClassReification();
                a aVar = new a(this.f100668c);
                md8.needClassReification();
                b bVar = new b(this.f100669d, null);
                this.f100666a = 1;
                if (eb2.combineInternal(t66Var, y56VarArr, aVar, bVar, this) == coroutine_suspended) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            t66 t66Var = (t66) this.f100667b;
            y56<T>[] y56VarArr = this.f100668c;
            md8.needClassReification();
            a aVar = new a(this.f100668c);
            md8.needClassReification();
            b bVar = new b(this.f100669d, null);
            o28.mark(0);
            eb2.combineInternal(t66Var, y56VarArr, aVar, bVar, this);
            o28.mark(1);
            return bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: y76$s */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", m4010f = "Zip.kt", m4011i = {}, m4012l = {MediaPlayer.Event.SeekableChanged}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C15532s<R> extends ugg implements gz6<t66<? super R>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f100675a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f100676b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y56<T>[] f100677c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ kz6<t66<? super R>, T[], zy2<? super bth>, Object> f100678d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: y76$s$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", m4010f = "Zip.kt", m4011i = {}, m4012l = {MediaPlayer.Event.SeekableChanged}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a<T> extends ugg implements kz6<t66<? super R>, T[], zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f100679a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f100680b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f100681c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ kz6<t66<? super R>, T[], zy2<? super bth>, Object> f100682d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(kz6<? super t66<? super R>, ? super T[], ? super zy2<? super bth>, ? extends Object> kz6Var, zy2<? super a> zy2Var) {
                super(3, zy2Var);
                this.f100682d = kz6Var;
            }

            @Override // p000.kz6
            public final Object invoke(t66<? super R> t66Var, T[] tArr, zy2<? super bth> zy2Var) {
                md8.needClassReification();
                a aVar = new a(this.f100682d, zy2Var);
                aVar.f100680b = t66Var;
                aVar.f100681c = tArr;
                return aVar.invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f100679a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    t66<? super R> t66Var = (t66) this.f100680b;
                    Object[] objArr = (Object[]) this.f100681c;
                    kz6<t66<? super R>, T[], zy2<? super bth>, Object> kz6Var = this.f100682d;
                    this.f100680b = null;
                    this.f100679a = 1;
                    if (kz6Var.invoke(t66Var, objArr, this) == coroutine_suspended) {
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

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final Object invokeSuspend$$forInline(Object obj) {
                this.f100682d.invoke((t66) this.f100680b, (Object[]) this.f100681c, this);
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15532s(y56<? extends T>[] y56VarArr, kz6<? super t66<? super R>, ? super T[], ? super zy2<? super bth>, ? extends Object> kz6Var, zy2<? super C15532s> zy2Var) {
            super(2, zy2Var);
            this.f100677c = y56VarArr;
            this.f100678d = kz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C15532s c15532s = new C15532s(this.f100677c, this.f100678d, zy2Var);
            c15532s.f100676b = obj;
            return c15532s;
        }

        @Override // p000.gz6
        public final Object invoke(t66<? super R> t66Var, zy2<? super bth> zy2Var) {
            return ((C15532s) create(t66Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f100675a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                t66 t66Var = (t66) this.f100676b;
                y56<T>[] y56VarArr = this.f100677c;
                ny6 ny6VarNullArrayFactory$FlowKt__ZipKt = y76.nullArrayFactory$FlowKt__ZipKt();
                md8.needClassReification();
                a aVar = new a(this.f100678d, null);
                this.f100675a = 1;
                if (eb2.combineInternal(t66Var, y56VarArr, ny6VarNullArrayFactory$FlowKt__ZipKt, aVar, this) == coroutine_suspended) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            t66 t66Var = (t66) this.f100676b;
            y56<T>[] y56VarArr = this.f100677c;
            ny6 ny6VarNullArrayFactory$FlowKt__ZipKt = y76.nullArrayFactory$FlowKt__ZipKt();
            md8.needClassReification();
            a aVar = new a(this.f100678d, null);
            o28.mark(0);
            eb2.combineInternal(t66Var, y56VarArr, ny6VarNullArrayFactory$FlowKt__ZipKt, aVar, this);
            o28.mark(1);
            return bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: y76$t */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n258#2,2:109\n*E\n"})
    public static final class C15533t<R> implements y56<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56[] f100683a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6 f100684b;

        /* JADX INFO: renamed from: y76$t$a */
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f100685a;

            /* JADX INFO: renamed from: b */
            public int f100686b;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f100685a = obj;
                this.f100686b |= Integer.MIN_VALUE;
                return C15533t.this.collect(null, this);
            }
        }

        public C15533t(y56[] y56VarArr, gz6 gz6Var) {
            this.f100683a = y56VarArr;
            this.f100684b = gz6Var;
        }

        @Override // p000.y56
        public Object collect(t66<? super R> t66Var, zy2<? super bth> zy2Var) {
            y56[] y56VarArr = this.f100683a;
            ny6 ny6VarNullArrayFactory$FlowKt__ZipKt = y76.nullArrayFactory$FlowKt__ZipKt();
            md8.needClassReification();
            Object objCombineInternal = eb2.combineInternal(t66Var, y56VarArr, ny6VarNullArrayFactory$FlowKt__ZipKt, new C15534u(this.f100684b, null), zy2Var);
            return objCombineInternal == pd8.getCOROUTINE_SUSPENDED() ? objCombineInternal : bth.f14751a;
        }

        public Object collect$$forInline(t66 t66Var, zy2 zy2Var) {
            o28.mark(4);
            new a(zy2Var);
            o28.mark(5);
            y56[] y56VarArr = this.f100683a;
            ny6 ny6VarNullArrayFactory$FlowKt__ZipKt = y76.nullArrayFactory$FlowKt__ZipKt();
            md8.needClassReification();
            C15534u c15534u = new C15534u(this.f100684b, null);
            o28.mark(0);
            eb2.combineInternal(t66Var, y56VarArr, ny6VarNullArrayFactory$FlowKt__ZipKt, c15534u, zy2Var);
            o28.mark(1);
            return bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: y76$u */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1", m4010f = "Zip.kt", m4011i = {}, m4012l = {258, 258}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C15534u<R, T> extends ugg implements kz6<t66<? super R>, T[], zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f100688a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f100689b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f100690c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6<T[], zy2<? super R>, Object> f100691d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15534u(gz6<? super T[], ? super zy2<? super R>, ? extends Object> gz6Var, zy2<? super C15534u> zy2Var) {
            super(3, zy2Var);
            this.f100691d = gz6Var;
        }

        @Override // p000.kz6
        public final Object invoke(t66<? super R> t66Var, T[] tArr, zy2<? super bth> zy2Var) {
            md8.needClassReification();
            C15534u c15534u = new C15534u(this.f100691d, zy2Var);
            c15534u.f100689b = t66Var;
            c15534u.f100690c = tArr;
            return c15534u.invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            t66 t66Var;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f100688a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                t66 t66Var2 = (t66) this.f100689b;
                Object[] objArr = (Object[]) this.f100690c;
                gz6<T[], zy2<? super R>, Object> gz6Var = this.f100691d;
                this.f100689b = t66Var2;
                this.f100688a = 1;
                obj = gz6Var.invoke(objArr, this);
                t66Var = t66Var2;
                if (obj == coroutine_suspended) {
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
                t66 t66Var3 = (t66) this.f100689b;
                y7e.throwOnFailure(obj);
                t66Var = t66Var3;
            }
            this.f100689b = null;
            this.f100688a = 2;
            if (t66Var.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return bth.f14751a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invokeSuspend$$forInline(Object obj) {
            t66 t66Var = (t66) this.f100689b;
            Object objInvoke = this.f100691d.invoke((Object[]) this.f100690c, this);
            o28.mark(0);
            t66Var.emit(objInvoke, this);
            o28.mark(1);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: y76$v */
    public static final class C15535v implements ny6 {

        /* JADX INFO: renamed from: a */
        public static final C15535v f100692a = new C15535v();

        @Override // p000.ny6
        public final Void invoke() {
            return null;
        }
    }

    @yfb
    public static final <T1, T2, R> y56<R> combine(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb kz6<? super T1, ? super T2, ? super zy2<? super R>, ? extends Object> kz6Var) {
        return c76.flowCombine(y56Var, y56Var2, kz6Var);
    }

    @yfb
    public static final <T1, T2, R> y56<R> combineTransform(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb @cg1 oz6<? super t66<? super R>, ? super T1, ? super T2, ? super zy2<? super bth>, ? extends Object> oz6Var) {
        return c76.flow(new C15526m(new y56[]{y56Var, y56Var2}, null, oz6Var));
    }

    private static final /* synthetic */ <T, R> y56<R> combineTransformUnsafe$FlowKt__ZipKt(y56<? extends T>[] y56VarArr, @cg1 kz6<? super t66<? super R>, ? super T[], ? super zy2<? super bth>, ? extends Object> kz6Var) {
        md8.needClassReification();
        return c76.flow(new C15532s(y56VarArr, kz6Var, null));
    }

    private static final /* synthetic */ <T, R> y56<R> combineUnsafe$FlowKt__ZipKt(y56<? extends T>[] y56VarArr, gz6<? super T[], ? super zy2<? super R>, ? extends Object> gz6Var) {
        md8.needClassReification();
        return new C15533t(y56VarArr, gz6Var);
    }

    @yfb
    @xn8(name = "flowCombine")
    public static final <T1, T2, R> y56<R> flowCombine(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb kz6<? super T1, ? super T2, ? super zy2<? super R>, ? extends Object> kz6Var) {
        return new C15517d(y56Var, y56Var2, kz6Var);
    }

    @yfb
    @xn8(name = "flowCombineTransform")
    public static final <T1, T2, R> y56<R> flowCombineTransform(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb @cg1 oz6<? super t66<? super R>, ? super T1, ? super T2, ? super zy2<? super bth>, ? extends Object> oz6Var) {
        return c76.flow(new C15525l(new y56[]{y56Var, y56Var2}, null, oz6Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> ny6<T[]> nullArrayFactory$FlowKt__ZipKt() {
        return C15535v.f100692a;
    }

    @yfb
    public static final <T1, T2, R> y56<R> zip(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb kz6<? super T1, ? super T2, ? super zy2<? super R>, ? extends Object> kz6Var) {
        return eb2.zipImpl(y56Var, y56Var2, kz6Var);
    }

    @yfb
    public static final <T1, T2, T3, R> y56<R> combine(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb y56<? extends T3> y56Var3, @yfb @cg1 oz6<? super T1, ? super T2, ? super T3, ? super zy2<? super R>, ? extends Object> oz6Var) {
        return new C15514a(new y56[]{y56Var, y56Var2, y56Var3}, oz6Var);
    }

    @yfb
    public static final <T1, T2, T3, R> y56<R> combineTransform(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb y56<? extends T3> y56Var3, @yfb @cg1 rz6<? super t66<? super R>, ? super T1, ? super T2, ? super T3, ? super zy2<? super bth>, ? extends Object> rz6Var) {
        return c76.flow(new C15527n(new y56[]{y56Var, y56Var2, y56Var3}, null, rz6Var));
    }

    @yfb
    public static final <T1, T2, T3, T4, R> y56<R> combine(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb y56<? extends T3> y56Var3, @yfb y56<? extends T4> y56Var4, @yfb rz6<? super T1, ? super T2, ? super T3, ? super T4, ? super zy2<? super R>, ? extends Object> rz6Var) {
        return new C15515b(new y56[]{y56Var, y56Var2, y56Var3, y56Var4}, rz6Var);
    }

    @yfb
    public static final <T1, T2, T3, T4, R> y56<R> combineTransform(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb y56<? extends T3> y56Var3, @yfb y56<? extends T4> y56Var4, @yfb @cg1 uz6<? super t66<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super zy2<? super bth>, ? extends Object> uz6Var) {
        return c76.flow(new C15528o(new y56[]{y56Var, y56Var2, y56Var3, y56Var4}, null, uz6Var));
    }

    @yfb
    public static final <T1, T2, T3, T4, T5, R> y56<R> combine(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb y56<? extends T3> y56Var3, @yfb y56<? extends T4> y56Var4, @yfb y56<? extends T5> y56Var5, @yfb uz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super zy2<? super R>, ? extends Object> uz6Var) {
        return new C15516c(new y56[]{y56Var, y56Var2, y56Var3, y56Var4, y56Var5}, uz6Var);
    }

    @yfb
    public static final <T1, T2, T3, T4, T5, R> y56<R> combineTransform(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb y56<? extends T3> y56Var3, @yfb y56<? extends T4> y56Var4, @yfb y56<? extends T5> y56Var5, @yfb @cg1 xz6<? super t66<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super zy2<? super bth>, ? extends Object> xz6Var) {
        return c76.flow(new C15529p(new y56[]{y56Var, y56Var2, y56Var3, y56Var4, y56Var5}, null, xz6Var));
    }

    public static final /* synthetic */ <T, R> y56<R> combine(Iterable<? extends y56<? extends T>> iterable, gz6<? super T[], ? super zy2<? super R>, ? extends Object> gz6Var) {
        y56[] y56VarArr = (y56[]) v82.toList(iterable).toArray(new y56[0]);
        md8.needClassReification();
        return new C15519f(y56VarArr, gz6Var);
    }

    public static final /* synthetic */ <T, R> y56<R> combineTransform(y56<? extends T>[] y56VarArr, @cg1 kz6<? super t66<? super R>, ? super T[], ? super zy2<? super bth>, ? extends Object> kz6Var) {
        md8.needClassReification();
        return c76.flow(new C15530q(y56VarArr, kz6Var, null));
    }

    public static final /* synthetic */ <T, R> y56<R> combineTransform(Iterable<? extends y56<? extends T>> iterable, @cg1 kz6<? super t66<? super R>, ? super T[], ? super zy2<? super bth>, ? extends Object> kz6Var) {
        y56[] y56VarArr = (y56[]) v82.toList(iterable).toArray(new y56[0]);
        md8.needClassReification();
        return c76.flow(new C15531r(y56VarArr, kz6Var, null));
    }

    public static final /* synthetic */ <T, R> y56<R> combine(y56<? extends T>[] y56VarArr, gz6<? super T[], ? super zy2<? super R>, ? extends Object> gz6Var) {
        md8.needClassReification();
        return new C15518e(y56VarArr, gz6Var);
    }
}
