package p000;

import android.view.KeyEvent;
import androidx.compose.foundation.C0589d;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.rad;
import p000.x1d;
import p000.xl7;

/* JADX INFO: renamed from: l0 */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,1301:1\n1#2:1302\n1855#3,2:1303\n175#4:1305\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n*L\n1003#1:1303,2\n1031#1:1305\n*E\n"})
@e0g(parameters = 0)
public abstract class AbstractC8563l0 extends d44 implements p2d, xq8, nm6, rxe, shh {

    /* JADX INFO: renamed from: p2 */
    @yfb
    public static final a f55740p2 = new a(null);

    /* JADX INFO: renamed from: q2 */
    public static final int f55741q2 = 8;

    /* JADX INFO: renamed from: M1 */
    @gib
    public l5b f55742M1;

    /* JADX INFO: renamed from: V1 */
    @gib
    public y08 f55743V1;

    /* JADX INFO: renamed from: Z1 */
    @gib
    public String f55744Z1;

    /* JADX INFO: renamed from: a2 */
    @gib
    public jae f55745a2;

    /* JADX INFO: renamed from: b2 */
    public boolean f55746b2;

    /* JADX INFO: renamed from: c2 */
    @yfb
    public ny6<bth> f55747c2;

    /* JADX INFO: renamed from: d2 */
    public final boolean f55748d2;

    /* JADX INFO: renamed from: e2 */
    @yfb
    public final rn6 f55749e2;

    /* JADX INFO: renamed from: f2 */
    @yfb
    public final tn6 f55750f2;

    /* JADX INFO: renamed from: g2 */
    @gib
    public wgg f55751g2;

    /* JADX INFO: renamed from: h2 */
    @gib
    public v34 f55752h2;

    /* JADX INFO: renamed from: i2 */
    @gib
    public rad.C11972b f55753i2;

    /* JADX INFO: renamed from: j2 */
    @gib
    public xl7.C15183a f55754j2;

    /* JADX INFO: renamed from: k2 */
    @yfb
    public final Map<cq8, rad.C11972b> f55755k2;

    /* JADX INFO: renamed from: l2 */
    public long f55756l2;

    /* JADX INFO: renamed from: m2 */
    @gib
    public l5b f55757m2;

    /* JADX INFO: renamed from: n2 */
    public boolean f55758n2;

    /* JADX INFO: renamed from: o2 */
    @yfb
    public final Object f55759o2;

    /* JADX INFO: renamed from: l0$a */
    public static final class a {
        public /* synthetic */ a(jt3 jt3Var) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: l0$b */
    public static final class b extends tt8 implements ny6<Boolean> {
        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            AbstractC8563l0.this.m15182d().invoke();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: l0$c */
    @ck3(m4009c = "androidx.compose.foundation.AbstractClickableNode$emitHoverEnter$1$1", m4010f = "Clickable.kt", m4011i = {}, m4012l = {1174}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f55761a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ l5b f55762b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ xl7.C15183a f55763c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l5b l5bVar, xl7.C15183a c15183a, zy2<? super c> zy2Var) {
            super(2, zy2Var);
            this.f55762b = l5bVar;
            this.f55763c = c15183a;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new c(this.f55762b, this.f55763c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f55761a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                l5b l5bVar = this.f55762b;
                xl7.C15183a c15183a = this.f55763c;
                this.f55761a = 1;
                if (l5bVar.emit(c15183a, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: l0$d */
    @ck3(m4009c = "androidx.compose.foundation.AbstractClickableNode$emitHoverExit$1$1$1", m4010f = "Clickable.kt", m4011i = {}, m4012l = {1186}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class d extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f55764a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ l5b f55765b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ xl7.C15184b f55766c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l5b l5bVar, xl7.C15184b c15184b, zy2<? super d> zy2Var) {
            super(2, zy2Var);
            this.f55765b = l5bVar;
            this.f55766c = c15184b;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new d(this.f55765b, this.f55766c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((d) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f55764a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                l5b l5bVar = this.f55765b;
                xl7.C15184b c15184b = this.f55766c;
                this.f55764a = 1;
                if (l5bVar.emit(c15184b, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: l0$e */
    @ck3(m4009c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", m4010f = "Clickable.kt", m4011i = {0, 1, 2}, m4012l = {1139, 1141, 1148, 1149, 1158}, m4013m = "invokeSuspend", m4014n = {"delayJob", FirebaseAnalytics.C3552d.f23173H, "release"}, m4015s = {"L$0", "Z$0", "L$0"})
    public static final class e extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public boolean f55767a;

        /* JADX INFO: renamed from: b */
        public int f55768b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f55769c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ pad f55770d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ long f55771e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ l5b f55772f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ AbstractC8563l0 f55773m;

        /* JADX INFO: renamed from: l0$e$a */
        @ck3(m4009c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", m4010f = "Clickable.kt", m4011i = {1}, m4012l = {1133, 1136}, m4013m = "invokeSuspend", m4014n = {"press"}, m4015s = {"L$0"})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public Object f55774a;

            /* JADX INFO: renamed from: b */
            public int f55775b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ AbstractC8563l0 f55776c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ long f55777d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ l5b f55778e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC8563l0 abstractC8563l0, long j, l5b l5bVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f55776c = abstractC8563l0;
                this.f55777d = j;
                this.f55778e = l5bVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f55776c, this.f55777d, this.f55778e, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                rad.C11972b c11972b;
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f55775b;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    if (this.f55776c.delayPressInteraction()) {
                        long tapIndicationDelay = u22.getTapIndicationDelay();
                        this.f55775b = 1;
                        if (p34.delay(tapIndicationDelay, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c11972b = (rad.C11972b) this.f55774a;
                        y7e.throwOnFailure(obj);
                        this.f55776c.f55753i2 = c11972b;
                        return bth.f14751a;
                    }
                    y7e.throwOnFailure(obj);
                }
                rad.C11972b c11972b2 = new rad.C11972b(this.f55777d, null);
                l5b l5bVar = this.f55778e;
                this.f55774a = c11972b2;
                this.f55775b = 2;
                if (l5bVar.emit(c11972b2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c11972b = c11972b2;
                this.f55776c.f55753i2 = c11972b;
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(pad padVar, long j, l5b l5bVar, AbstractC8563l0 abstractC8563l0, zy2<? super e> zy2Var) {
            super(2, zy2Var);
            this.f55770d = padVar;
            this.f55771e = j;
            this.f55772f = l5bVar;
            this.f55773m = abstractC8563l0;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            e eVar = new e(this.f55770d, this.f55771e, this.f55772f, this.f55773m, zy2Var);
            eVar.f55769c = obj;
            return eVar;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((e) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ae A[RETURN] */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC8563l0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: l0$f */
    @ck3(m4009c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", m4010f = "Clickable.kt", m4011i = {}, m4012l = {1074}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class f extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f55779a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ rad.C11972b f55781c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(rad.C11972b c11972b, zy2<? super f> zy2Var) {
            super(2, zy2Var);
            this.f55781c = c11972b;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return AbstractC8563l0.this.new f(this.f55781c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((f) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f55779a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                l5b l5bVar = AbstractC8563l0.this.f55742M1;
                if (l5bVar != null) {
                    rad.C11972b c11972b = this.f55781c;
                    this.f55779a = 1;
                    if (l5bVar.emit(c11972b, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX INFO: renamed from: l0$g */
    @ck3(m4009c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2$1", m4010f = "Clickable.kt", m4011i = {}, m4012l = {1085}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class g extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f55782a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ rad.C11972b f55784c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(rad.C11972b c11972b, zy2<? super g> zy2Var) {
            super(2, zy2Var);
            this.f55784c = c11972b;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return AbstractC8563l0.this.new g(this.f55784c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((g) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f55782a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                l5b l5bVar = AbstractC8563l0.this.f55742M1;
                if (l5bVar != null) {
                    rad.C11973c c11973c = new rad.C11973c(this.f55784c);
                    this.f55782a = 1;
                    if (l5bVar.emit(c11973c, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX INFO: renamed from: l0$h */
    @ck3(m4009c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1", m4010f = "Clickable.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class h extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f55785a;

        public h(zy2<? super h> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return AbstractC8563l0.this.new h(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((h) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f55785a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            AbstractC8563l0.this.emitHoverEnter();
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: l0$i */
    @ck3(m4009c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$2", m4010f = "Clickable.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class i extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f55787a;

        public i(zy2<? super i> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return AbstractC8563l0.this.new i(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((i) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f55787a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            AbstractC8563l0.this.emitHoverExit();
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: l0$j */
    @ck3(m4009c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$3", m4010f = "Clickable.kt", m4011i = {}, m4012l = {1042}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class j extends ugg implements gz6<s2d, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f55789a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f55790b;

        public j(zy2<? super j> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            j jVar = AbstractC8563l0.this.new j(zy2Var);
            jVar.f55790b = obj;
            return jVar;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb s2d s2dVar, @gib zy2<? super bth> zy2Var) {
            return ((j) create(s2dVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f55789a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                s2d s2dVar = (s2d) this.f55790b;
                AbstractC8563l0 abstractC8563l0 = AbstractC8563l0.this;
                this.f55789a = 1;
                if (abstractC8563l0.clickPointerInput(s2dVar, this) == coroutine_suspended) {
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

    public /* synthetic */ AbstractC8563l0(l5b l5bVar, y08 y08Var, boolean z, String str, jae jaeVar, ny6 ny6Var, jt3 jt3Var) {
        this(l5bVar, y08Var, z, str, jaeVar, ny6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean delayPressInteraction() {
        return C0589d.hasScrollableContainer(this) || u22.isComposeRootInScrollableContainer(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitHoverEnter() {
        if (this.f55754j2 == null) {
            xl7.C15183a c15183a = new xl7.C15183a();
            l5b l5bVar = this.f55742M1;
            if (l5bVar != null) {
                fg1.launch$default(getCoroutineScope(), null, null, new c(l5bVar, c15183a, null), 3, null);
            }
            this.f55754j2 = c15183a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitHoverExit() {
        xl7.C15183a c15183a = this.f55754j2;
        if (c15183a != null) {
            xl7.C15184b c15184b = new xl7.C15184b(c15183a);
            l5b l5bVar = this.f55742M1;
            if (l5bVar != null) {
                fg1.launch$default(getCoroutineScope(), null, null, new d(l5bVar, c15184b, null), 3, null);
            }
            this.f55754j2 = null;
        }
    }

    private final void initializeIndicationAndInteractionSourceIfNeeded() {
        y08 y08Var;
        if (this.f55752h2 == null && (y08Var = this.f55743V1) != null) {
            if (this.f55742M1 == null) {
                this.f55742M1 = r98.MutableInteractionSource();
            }
            this.f55750f2.update(this.f55742M1);
            l5b l5bVar = this.f55742M1;
            md8.checkNotNull(l5bVar);
            v34 v34VarCreate = y08Var.create(l5bVar);
            m8877a(v34VarCreate);
            this.f55752h2 = v34VarCreate;
        }
    }

    private final boolean shouldLazilyCreateIndication() {
        return this.f55757m2 == null && this.f55743V1 != null;
    }

    public void applyAdditionalSemantics(@yfb eye eyeVar) {
    }

    @Override // p000.rxe
    public final void applySemantics(@yfb eye eyeVar) {
        jae jaeVar = this.f55745a2;
        if (jaeVar != null) {
            md8.checkNotNull(jaeVar);
            bye.m28185setRolekuIjeqM(eyeVar, jaeVar.m30500unboximpl());
        }
        bye.onClick(eyeVar, this.f55744Z1, new b());
        if (this.f55746b2) {
            this.f55750f2.applySemantics(eyeVar);
        } else {
            bye.disabled(eyeVar);
        }
        applyAdditionalSemantics(eyeVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m15181c() {
        l5b l5bVar = this.f55742M1;
        if (l5bVar != null) {
            rad.C11972b c11972b = this.f55753i2;
            if (c11972b != null) {
                l5bVar.tryEmit(new rad.C11971a(c11972b));
            }
            xl7.C15183a c15183a = this.f55754j2;
            if (c15183a != null) {
                l5bVar.tryEmit(new xl7.C15184b(c15183a));
            }
            Iterator<T> it = this.f55755k2.values().iterator();
            while (it.hasNext()) {
                l5bVar.tryEmit(new rad.C11971a((rad.C11972b) it.next()));
            }
        }
        this.f55753i2 = null;
        this.f55754j2 = null;
        this.f55755k2.clear();
    }

    @gib
    public abstract Object clickPointerInput(@yfb s2d s2dVar, @yfb zy2<? super bth> zy2Var);

    @yfb
    /* JADX INFO: renamed from: d */
    public final ny6<bth> m15182d() {
        return this.f55747c2;
    }

    @gib
    /* JADX INFO: renamed from: e */
    public final Object m15183e(@yfb pad padVar, long j2, @yfb zy2<? super bth> zy2Var) {
        Object objCoroutineScope;
        l5b l5bVar = this.f55742M1;
        return (l5bVar == null || (objCoroutineScope = y13.coroutineScope(new e(padVar, j2, l5bVar, this, null), zy2Var)) != pd8.getCOROUTINE_SUSPENDED()) ? bth.f14751a : objCoroutineScope;
    }

    @gib
    /* JADX INFO: renamed from: f */
    public final bth m15184f() {
        wgg wggVar = this.f55751g2;
        if (wggVar == null) {
            return null;
        }
        wggVar.resetPointerInputHandler();
        return bth.f14751a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m15185g(@p000.gib p000.l5b r3, @p000.gib p000.y08 r4, boolean r5, @p000.gib java.lang.String r6, @p000.gib p000.jae r7, @p000.yfb p000.ny6<p000.bth> r8) {
        /*
            r2 = this;
            l5b r0 = r2.f55757m2
            boolean r0 = p000.md8.areEqual(r0, r3)
            r1 = 1
            if (r0 != 0) goto L12
            r2.m15181c()
            r2.f55757m2 = r3
            r2.f55742M1 = r3
            r3 = r1
            goto L13
        L12:
            r3 = 0
        L13:
            y08 r0 = r2.f55743V1
            boolean r0 = p000.md8.areEqual(r0, r4)
            if (r0 != 0) goto L1e
            r2.f55743V1 = r4
            r3 = r1
        L1e:
            boolean r4 = r2.f55746b2
            if (r4 == r5) goto L41
            if (r5 == 0) goto L2f
            rn6 r4 = r2.f55749e2
            r2.m8877a(r4)
            tn6 r4 = r2.f55750f2
            r2.m8877a(r4)
            goto L3c
        L2f:
            rn6 r4 = r2.f55749e2
            r2.m8878b(r4)
            tn6 r4 = r2.f55750f2
            r2.m8878b(r4)
            r2.m15181c()
        L3c:
            p000.sxe.invalidateSemantics(r2)
            r2.f55746b2 = r5
        L41:
            java.lang.String r4 = r2.f55744Z1
            boolean r4 = p000.md8.areEqual(r4, r6)
            if (r4 != 0) goto L4e
            r2.f55744Z1 = r6
            p000.sxe.invalidateSemantics(r2)
        L4e:
            jae r4 = r2.f55745a2
            boolean r4 = p000.md8.areEqual(r4, r7)
            if (r4 != 0) goto L5b
            r2.f55745a2 = r7
            p000.sxe.invalidateSemantics(r2)
        L5b:
            r2.f55747c2 = r8
            boolean r4 = r2.f55758n2
            boolean r5 = r2.shouldLazilyCreateIndication()
            if (r4 == r5) goto L72
            boolean r4 = r2.shouldLazilyCreateIndication()
            r2.f55758n2 = r4
            if (r4 != 0) goto L72
            v34 r4 = r2.f55752h2
            if (r4 != 0) goto L72
            goto L73
        L72:
            r1 = r3
        L73:
            if (r1 == 0) goto L88
            v34 r3 = r2.f55752h2
            if (r3 != 0) goto L7d
            boolean r4 = r2.f55758n2
            if (r4 != 0) goto L88
        L7d:
            if (r3 == 0) goto L82
            r2.m8878b(r3)
        L82:
            r3 = 0
            r2.f55752h2 = r3
            r2.initializeIndicationAndInteractionSourceIfNeeded()
        L88:
            tn6 r3 = r2.f55750f2
            l5b r4 = r2.f55742M1
            r3.update(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC8563l0.m15185g(l5b, y08, boolean, java.lang.String, jae, ny6):void");
    }

    public final boolean getEnabled() {
        return this.f55746b2;
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public final boolean getShouldAutoInvalidate() {
        return this.f55748d2;
    }

    @Override // p000.rxe
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // p000.shh
    @yfb
    public Object getTraverseKey() {
        return this.f55759o2;
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public final void onAttach() {
        if (!this.f55758n2) {
            initializeIndicationAndInteractionSourceIfNeeded();
        }
        if (this.f55746b2) {
            m8877a(this.f55749e2);
            m8877a(this.f55750f2);
        }
    }

    @Override // p000.p2d
    public final void onCancelPointerInput() {
        xl7.C15183a c15183a;
        l5b l5bVar = this.f55742M1;
        if (l5bVar != null && (c15183a = this.f55754j2) != null) {
            l5bVar.tryEmit(new xl7.C15184b(c15183a));
        }
        this.f55754j2 = null;
        wgg wggVar = this.f55751g2;
        if (wggVar != null) {
            wggVar.onCancelPointerInput();
        }
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public final void onDetach() {
        m15181c();
        if (this.f55757m2 == null) {
            this.f55742M1 = null;
        }
        v34 v34Var = this.f55752h2;
        if (v34Var != null) {
            m8878b(v34Var);
        }
        this.f55752h2 = null;
    }

    @Override // p000.nm6
    public final void onFocusEvent(@yfb in6 in6Var) {
        if (in6Var.isFocused()) {
            initializeIndicationAndInteractionSourceIfNeeded();
        }
        if (this.f55746b2) {
            this.f55750f2.onFocusEvent(in6Var);
        }
    }

    @Override // p000.xq8
    /* JADX INFO: renamed from: onKeyEvent-ZmokQxo */
    public final boolean mo27341onKeyEventZmokQxo(@yfb KeyEvent keyEvent) {
        initializeIndicationAndInteractionSourceIfNeeded();
        if (this.f55746b2 && u22.m32527isPressZmokQxo(keyEvent)) {
            if (this.f55755k2.containsKey(cq8.m28248boximpl(oq8.m31586getKeyZmokQxo(keyEvent)))) {
                return false;
            }
            rad.C11972b c11972b = new rad.C11972b(this.f55756l2, null);
            this.f55755k2.put(cq8.m28248boximpl(oq8.m31586getKeyZmokQxo(keyEvent)), c11972b);
            if (this.f55742M1 != null) {
                fg1.launch$default(getCoroutineScope(), null, null, new f(c11972b, null), 3, null);
            }
        } else {
            if (!this.f55746b2 || !u22.m32525isClickZmokQxo(keyEvent)) {
                return false;
            }
            rad.C11972b c11972bRemove = this.f55755k2.remove(cq8.m28248boximpl(oq8.m31586getKeyZmokQxo(keyEvent)));
            if (c11972bRemove != null && this.f55742M1 != null) {
                fg1.launch$default(getCoroutineScope(), null, null, new g(c11972bRemove, null), 3, null);
            }
            this.f55747c2.invoke();
        }
        return true;
    }

    @Override // p000.p2d
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public final void mo27219onPointerEventH0pRuoY(@yfb t1d t1dVar, @yfb v1d v1dVar, long j2) {
        long jM32282getCenterozmzZPI = s78.m32282getCenterozmzZPI(j2);
        this.f55756l2 = mzb.Offset(a78.m27201getXimpl(jM32282getCenterozmzZPI), a78.m27202getYimpl(jM32282getCenterozmzZPI));
        initializeIndicationAndInteractionSourceIfNeeded();
        if (this.f55746b2 && v1dVar == v1d.Main) {
            int iM32358getType7fucELk = t1dVar.m32358getType7fucELk();
            x1d.C14873a c14873a = x1d.f96025b;
            if (x1d.m33153equalsimpl0(iM32358getType7fucELk, c14873a.m33157getEnter7fucELk())) {
                fg1.launch$default(getCoroutineScope(), null, null, new h(null), 3, null);
            } else if (x1d.m33153equalsimpl0(iM32358getType7fucELk, c14873a.m33158getExit7fucELk())) {
                fg1.launch$default(getCoroutineScope(), null, null, new i(null), 3, null);
            }
        }
        if (this.f55751g2 == null) {
            this.f55751g2 = (wgg) m8877a(vgg.SuspendingPointerInputModifierNode(new j(null)));
        }
        wgg wggVar = this.f55751g2;
        if (wggVar != null) {
            wggVar.mo27219onPointerEventH0pRuoY(t1dVar, v1dVar, j2);
        }
    }

    @Override // p000.xq8
    /* JADX INFO: renamed from: onPreKeyEvent-ZmokQxo */
    public final boolean mo27342onPreKeyEventZmokQxo(@yfb KeyEvent keyEvent) {
        return false;
    }

    private AbstractC8563l0(l5b l5bVar, y08 y08Var, boolean z, String str, jae jaeVar, ny6<bth> ny6Var) {
        this.f55742M1 = l5bVar;
        this.f55743V1 = y08Var;
        this.f55744Z1 = str;
        this.f55745a2 = jaeVar;
        this.f55746b2 = z;
        this.f55747c2 = ny6Var;
        this.f55749e2 = new rn6();
        this.f55750f2 = new tn6(this.f55742M1);
        this.f55755k2 = new LinkedHashMap();
        this.f55756l2 = izb.f49009b.m30445getZeroF1C5BW0();
        this.f55757m2 = this.f55742M1;
        this.f55758n2 = shouldLazilyCreateIndication();
        this.f55759o2 = f55740p2;
    }
}
