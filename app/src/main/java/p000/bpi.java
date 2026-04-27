package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.p002ui.C0693R;
import androidx.lifecycle.AbstractC1143j;
import androidx.lifecycle.InterfaceC1154n;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.jaf;
import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nWindowRecomposer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,444:1\n36#2:445\n361#3,7:446\n42#4,7:453\n66#4,9:461\n1#5:460\n*S KotlinDebug\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n*L\n100#1:445\n101#1:446,7\n297#1:453,7\n354#1:461,9\n*E\n"})
public final class bpi {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final Map<Context, l2g<Float>> f14423a = new LinkedHashMap();

    /* JADX INFO: renamed from: bpi$a */
    public static final class ViewOnAttachStateChangeListenerC1991a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f14424a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ wsd f14425b;

        public ViewOnAttachStateChangeListenerC1991a(View view, wsd wsdVar) {
            this.f14424a = view;
            this.f14425b = wsdVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@yfb View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@yfb View view) {
            this.f14424a.removeOnAttachStateChangeListener(this);
            this.f14425b.cancel();
        }
    }

    /* JADX INFO: renamed from: bpi$b */
    public static final class C1992b implements InterfaceC1154n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x13 f14426a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dlc f14427b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ wsd f14428c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ jvd.C8121h<gza> f14429d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ View f14430e;

        /* JADX INFO: renamed from: bpi$b$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f14431a;

            static {
                int[] iArr = new int[AbstractC1143j.a.values().length];
                try {
                    iArr[AbstractC1143j.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC1143j.a.ON_START.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AbstractC1143j.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AbstractC1143j.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AbstractC1143j.a.ON_PAUSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AbstractC1143j.a.ON_RESUME.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AbstractC1143j.a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f14431a = iArr;
            }
        }

        /* JADX INFO: renamed from: bpi$b$b */
        @ck3(m4009c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", m4010f = "WindowRecomposer.android.kt", m4011i = {0}, m4012l = {396}, m4013m = "invokeSuspend", m4014n = {"durationScaleJob"}, m4015s = {"L$0"})
        public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f14432a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f14433b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ jvd.C8121h<gza> f14434c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ wsd f14435d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ g59 f14436e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ C1992b f14437f;

            /* JADX INFO: renamed from: m */
            public final /* synthetic */ View f14438m;

            /* JADX INFO: renamed from: bpi$b$b$a */
            @ck3(m4009c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", m4010f = "WindowRecomposer.android.kt", m4011i = {}, m4012l = {391}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f14439a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ l2g<Float> f14440b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ gza f14441c;

                /* JADX INFO: renamed from: bpi$b$b$a$a, reason: collision with other inner class name */
                public static final class C16413a<T> implements t66 {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ gza f14442a;

                    public C16413a(gza gzaVar) {
                        this.f14442a = gzaVar;
                    }

                    @Override // p000.t66
                    public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
                        return emit(((Number) obj).floatValue(), (zy2<? super bth>) zy2Var);
                    }

                    @gib
                    public final Object emit(float f, @yfb zy2<? super bth> zy2Var) {
                        this.f14442a.setScaleFactor(f);
                        return bth.f14751a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(l2g<Float> l2gVar, gza gzaVar, zy2<? super a> zy2Var) {
                    super(2, zy2Var);
                    this.f14440b = l2gVar;
                    this.f14441c = gzaVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new a(this.f14440b, this.f14441c, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f14439a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        l2g<Float> l2gVar = this.f14440b;
                        C16413a c16413a = new C16413a(this.f14441c);
                        this.f14439a = 1;
                        if (l2gVar.collect(c16413a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                    }
                    throw new us8();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(jvd.C8121h<gza> c8121h, wsd wsdVar, g59 g59Var, C1992b c1992b, View view, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f14434c = c8121h;
                this.f14435d = wsdVar;
                this.f14436e = g59Var;
                this.f14437f = c1992b;
                this.f14438m = view;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                b bVar = new b(this.f14434c, this.f14435d, this.f14436e, this.f14437f, this.f14438m, zy2Var);
                bVar.f14433b = obj;
                return bVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
            @Override // p000.tq0
            @p000.gib
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r12) throws java.lang.Throwable {
                /*
                    r11 = this;
                    java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r1 = r11.f14432a
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r0 = r11.f14433b
                    jj8 r0 = (p000.jj8) r0
                    p000.y7e.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L14
                    goto L6a
                L14:
                    r12 = move-exception
                    goto L81
                L17:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L1f:
                    p000.y7e.throwOnFailure(r12)
                    java.lang.Object r12 = r11.f14433b
                    r4 = r12
                    x13 r4 = (p000.x13) r4
                    jvd$h<gza> r12 = r11.f14434c     // Catch: java.lang.Throwable -> L58
                    T r12 = r12.f52110a     // Catch: java.lang.Throwable -> L58
                    gza r12 = (p000.gza) r12     // Catch: java.lang.Throwable -> L58
                    if (r12 == 0) goto L5b
                    android.view.View r1 = r11.f14438m     // Catch: java.lang.Throwable -> L58
                    android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L58
                    android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L58
                    l2g r1 = p000.bpi.access$getAnimationScaleFlowFor(r1)     // Catch: java.lang.Throwable -> L58
                    java.lang.Object r5 = r1.getValue()     // Catch: java.lang.Throwable -> L58
                    java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L58
                    float r5 = r5.floatValue()     // Catch: java.lang.Throwable -> L58
                    r12.setScaleFactor(r5)     // Catch: java.lang.Throwable -> L58
                    bpi$b$b$a r7 = new bpi$b$b$a     // Catch: java.lang.Throwable -> L58
                    r7.<init>(r1, r12, r3)     // Catch: java.lang.Throwable -> L58
                    r8 = 3
                    r9 = 0
                    r5 = 0
                    r6 = 0
                    jj8 r12 = p000.dg1.launch$default(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L58
                    goto L5c
                L58:
                    r12 = move-exception
                    r0 = r3
                    goto L81
                L5b:
                    r12 = r3
                L5c:
                    wsd r1 = r11.f14435d     // Catch: java.lang.Throwable -> L7d
                    r11.f14433b = r12     // Catch: java.lang.Throwable -> L7d
                    r11.f14432a = r2     // Catch: java.lang.Throwable -> L7d
                    java.lang.Object r1 = r1.runRecomposeAndApplyChanges(r11)     // Catch: java.lang.Throwable -> L7d
                    if (r1 != r0) goto L69
                    return r0
                L69:
                    r0 = r12
                L6a:
                    if (r0 == 0) goto L6f
                    p000.jj8.C7916a.cancel$default(r0, r3, r2, r3)
                L6f:
                    g59 r12 = r11.f14436e
                    androidx.lifecycle.j r12 = r12.getLifecycle()
                    bpi$b r0 = r11.f14437f
                    r12.removeObserver(r0)
                    bth r12 = p000.bth.f14751a
                    return r12
                L7d:
                    r0 = move-exception
                    r10 = r0
                    r0 = r12
                    r12 = r10
                L81:
                    if (r0 == 0) goto L86
                    p000.jj8.C7916a.cancel$default(r0, r3, r2, r3)
                L86:
                    g59 r0 = r11.f14436e
                    androidx.lifecycle.j r0 = r0.getLifecycle()
                    bpi$b r1 = r11.f14437f
                    r0.removeObserver(r1)
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.bpi.C1992b.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C1992b(x13 x13Var, dlc dlcVar, wsd wsdVar, jvd.C8121h<gza> c8121h, View view) {
            this.f14426a = x13Var;
            this.f14427b = dlcVar;
            this.f14428c = wsdVar;
            this.f14429d = c8121h;
            this.f14430e = view;
        }

        @Override // androidx.lifecycle.InterfaceC1154n
        public void onStateChanged(@yfb g59 g59Var, @yfb AbstractC1143j.a aVar) {
            int i = a.f14431a[aVar.ordinal()];
            if (i == 1) {
                fg1.launch$default(this.f14426a, null, b23.f12444d, new b(this.f14429d, this.f14428c, g59Var, this, this.f14430e, null), 1, null);
                return;
            }
            if (i == 2) {
                dlc dlcVar = this.f14427b;
                if (dlcVar != null) {
                    dlcVar.resume();
                }
                this.f14428c.resumeCompositionFrameClock();
                return;
            }
            if (i == 3) {
                this.f14428c.pauseCompositionFrameClock();
            } else {
                if (i != 4) {
                    return;
                }
                this.f14428c.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: bpi$c */
    @ck3(m4009c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", m4010f = "WindowRecomposer.android.kt", m4011i = {0, 1}, m4012l = {117, 123}, m4013m = "invokeSuspend", m4014n = {"$this$flow", "$this$flow"}, m4015s = {"L$0", "L$0"})
    public static final class C1993c extends ugg implements gz6<t66<? super Float>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ Context f14443C;

        /* JADX INFO: renamed from: a */
        public Object f14444a;

        /* JADX INFO: renamed from: b */
        public int f14445b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f14446c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ContentResolver f14447d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Uri f14448e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C1994d f14449f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ au1<bth> f14450m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1993c(ContentResolver contentResolver, Uri uri, C1994d c1994d, au1<bth> au1Var, Context context, zy2<? super C1993c> zy2Var) {
            super(2, zy2Var);
            this.f14447d = contentResolver;
            this.f14448e = uri;
            this.f14449f = c1994d;
            this.f14450m = au1Var;
            this.f14443C = context;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C1993c c1993c = new C1993c(this.f14447d, this.f14448e, this.f14449f, this.f14450m, this.f14443C, zy2Var);
            c1993c.f14446c = obj;
            return c1993c;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb t66<? super Float> t66Var, @gib zy2<? super bth> zy2Var) {
            return ((C1993c) create(t66Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x0048, B:22:0x0058, B:24:0x0060, B:14:0x002d, B:17:0x0042), top: B:31:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007f -> B:8:0x0019). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r8.f14445b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r8.f14444a
                mu1 r1 = (p000.mu1) r1
                java.lang.Object r4 = r8.f14446c
                t66 r4 = (p000.t66) r4
                p000.y7e.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L1b
            L19:
                r9 = r4
                goto L48
            L1b:
                r9 = move-exception
                goto L8c
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.f14444a
                mu1 r1 = (p000.mu1) r1
                java.lang.Object r4 = r8.f14446c
                t66 r4 = (p000.t66) r4
                p000.y7e.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L1b
                goto L58
            L31:
                p000.y7e.throwOnFailure(r9)
                java.lang.Object r9 = r8.f14446c
                t66 r9 = (p000.t66) r9
                android.content.ContentResolver r1 = r8.f14447d
                android.net.Uri r4 = r8.f14448e
                r5 = 0
                bpi$d r6 = r8.f14449f
                r1.registerContentObserver(r4, r5, r6)
                au1<bth> r1 = r8.f14450m     // Catch: java.lang.Throwable -> L1b
                mu1 r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
            L48:
                r8.f14446c = r9     // Catch: java.lang.Throwable -> L1b
                r8.f14444a = r1     // Catch: java.lang.Throwable -> L1b
                r8.f14445b = r3     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r4 = r1.hasNext(r8)     // Catch: java.lang.Throwable -> L1b
                if (r4 != r0) goto L55
                return r0
            L55:
                r7 = r4
                r4 = r9
                r9 = r7
            L58:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L1b
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L1b
                if (r9 == 0) goto L82
                r1.next()     // Catch: java.lang.Throwable -> L1b
                android.content.Context r9 = r8.f14443C     // Catch: java.lang.Throwable -> L1b
                android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L1b
                java.lang.String r5 = "animator_duration_scale"
                r6 = 1065353216(0x3f800000, float:1.0)
                float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: java.lang.Throwable -> L1b
                java.lang.Float r9 = p000.wc1.boxFloat(r9)     // Catch: java.lang.Throwable -> L1b
                r8.f14446c = r4     // Catch: java.lang.Throwable -> L1b
                r8.f14444a = r1     // Catch: java.lang.Throwable -> L1b
                r8.f14445b = r2     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r9 = r4.emit(r9, r8)     // Catch: java.lang.Throwable -> L1b
                if (r9 != r0) goto L19
                return r0
            L82:
                android.content.ContentResolver r9 = r8.f14447d
                bpi$d r0 = r8.f14449f
                r9.unregisterContentObserver(r0)
                bth r9 = p000.bth.f14751a
                return r9
            L8c:
                android.content.ContentResolver r0 = r8.f14447d
                bpi$d r1 = r8.f14449f
                r0.unregisterContentObserver(r1)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.bpi.C1993c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: bpi$d */
    public static final class C1994d extends ContentObserver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ au1<bth> f14451a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1994d(au1<bth> au1Var, Handler handler) {
            super(handler);
            this.f14451a = au1Var;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, @gib Uri uri) {
            this.f14451a.mo28705trySendJP2dKIU(bth.f14751a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [e13] */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, gza] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r10v3, types: [e13] */
    @ug5
    @yfb
    public static final wsd createLifecycleAwareWindowRecomposer(@yfb View view, @yfb e13 e13Var, @gib AbstractC1143j abstractC1143j) {
        dlc dlcVar;
        if (e13Var.get(dz2.f31343s) == null || e13Var.get(rya.f80099P) == null) {
            e13Var = C15816yv.f103016N.getCurrentThread().plus(e13Var);
        }
        rya ryaVar = (rya) e13Var.get(rya.f80099P);
        if (ryaVar != null) {
            dlc dlcVar2 = new dlc(ryaVar);
            dlcVar2.pause();
            dlcVar = dlcVar2;
        } else {
            dlcVar = null;
        }
        jvd.C8121h c8121h = new jvd.C8121h();
        fza fzaVar = (fza) e13Var.get(fza.f38062R);
        ?? r0 = fzaVar;
        if (fzaVar == null) {
            ?? gzaVar = new gza();
            c8121h.f52110a = gzaVar;
            r0 = gzaVar;
        }
        e13 e13VarPlus = e13Var.plus(dlcVar != null ? dlcVar : a05.f2a).plus(r0);
        wsd wsdVar = new wsd(e13VarPlus);
        wsdVar.pauseCompositionFrameClock();
        x13 x13VarCoroutineScope = y13.CoroutineScope(e13VarPlus);
        if (abstractC1143j == null) {
            g59 g59Var = zbi.get(view);
            abstractC1143j = g59Var != null ? g59Var.getLifecycle() : null;
        }
        if (abstractC1143j != null) {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1991a(view, wsdVar));
            abstractC1143j.addObserver(new C1992b(x13VarCoroutineScope, dlcVar, wsdVar, c8121h, view));
            return wsdVar;
        }
        g28.throwIllegalStateExceptionForNullCheck("ViewTreeLifecycleOwner not found from " + view);
        throw new us8();
    }

    public static /* synthetic */ wsd createLifecycleAwareWindowRecomposer$default(View view, e13 e13Var, AbstractC1143j abstractC1143j, int i, Object obj) {
        if ((i & 1) != 0) {
            e13Var = a05.f2a;
        }
        if ((i & 2) != 0) {
            abstractC1143j = null;
        }
        return createLifecycleAwareWindowRecomposer(view, e13Var, abstractC1143j);
    }

    @gib
    public static final dn2 findViewTreeCompositionContext(@yfb View view) {
        dn2 compositionContext = getCompositionContext(view);
        if (compositionContext != null) {
            return compositionContext;
        }
        for (ViewParent parent = view.getParent(); compositionContext == null && (parent instanceof View); parent = parent.getParent()) {
            compositionContext = getCompositionContext((View) parent);
        }
        return compositionContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l2g<Float> getAnimationScaleFlowFor(Context context) {
        l2g<Float> l2gVar;
        Map<Context, l2g<Float>> map = f14423a;
        synchronized (map) {
            try {
                l2g<Float> l2gVarStateIn = map.get(context);
                if (l2gVarStateIn == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    au1 au1VarChannel$default = nu1.Channel$default(-1, null, null, 6, null);
                    l2gVarStateIn = c76.stateIn(c76.flow(new C1993c(contentResolver, uriFor, new C1994d(au1VarChannel$default, de7.createAsync(Looper.getMainLooper())), au1VarChannel$default, context, null)), y13.MainScope(), jaf.C7827a.WhileSubscribed$default(jaf.f50125a, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, l2gVarStateIn);
                }
                l2gVar = l2gVarStateIn;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l2gVar;
    }

    @gib
    public static final dn2 getCompositionContext(@yfb View view) {
        Object tag = view.getTag(C0693R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof dn2) {
            return (dn2) tag;
        }
        return null;
    }

    private static final View getContentChild(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    @yfb
    public static final wsd getWindowRecomposer(@yfb View view) {
        if (!view.isAttachedToWindow()) {
            g28.throwIllegalStateException("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View contentChild = getContentChild(view);
        dn2 compositionContext = getCompositionContext(contentChild);
        if (compositionContext == null) {
            return api.f11557a.createAndInstallWindowRecomposer$ui_release(contentChild);
        }
        if (compositionContext instanceof wsd) {
            return (wsd) compositionContext;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    public static /* synthetic */ void getWindowRecomposer$annotations(View view) {
    }

    public static final void setCompositionContext(@yfb View view, @gib dn2 dn2Var) {
        view.setTag(C0693R.id.androidx_compose_ui_view_composition_context, dn2Var);
    }
}
