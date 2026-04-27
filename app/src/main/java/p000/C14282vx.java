package p000;

import androidx.compose.animation.AbstractC0574g;
import androidx.compose.animation.AbstractC0575h;
import androidx.compose.animation.C0573f;
import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.C0755h;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import androidx.mediarouter.media.C1340j;
import androidx.profileinstaller.C1360d;
import com.watchfun.voicenotes.manager.voicenotes.RecordingService;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import p000.xl2;

/* JADX INFO: renamed from: vx */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,885:1\n1223#2,6:886\n1223#2,6:894\n1223#2,6:903\n1223#2,6:909\n1223#2,6:915\n1223#2,6:921\n1223#2,6:958\n1811#3,2:892\n1813#3,3:900\n78#4,6:927\n85#4,4:942\n89#4,2:952\n93#4:957\n368#5,9:933\n377#5,3:954\n4032#6,6:946\n81#7:964\n81#7:965\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n*L\n698#1:886,6\n742#1:894,6\n753#1:903,6\n769#1:909,6\n776#1:915,6\n795#1:921,6\n869#1:958,6\n742#1:892,2\n742#1:900,3\n770#1:927,6\n770#1:942,4\n770#1:952,2\n770#1:957\n770#1:933,9\n770#1:954,3\n770#1:946,6\n746#1:964\n748#1:965\n*E\n"})
public final class C14282vx {

    /* JADX INFO: renamed from: vx$a */
    public static final class a extends tt8 implements kz6<InterfaceC0761n, rba, ku2, vba> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ r3c f92427a;

        /* JADX INFO: renamed from: vx$a$a, reason: collision with other inner class name */
        public static final class C16548a extends tt8 implements qy6<AbstractC0767t.a, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AbstractC0767t f92428a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16548a(AbstractC0767t abstractC0767t) {
                super(1);
                this.f92428a = abstractC0767t;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
                invoke2(aVar);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb AbstractC0767t.a aVar) {
                AbstractC0767t.a.place$default(aVar, this.f92428a, 0, 0, 0.0f, 4, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r3c r3cVar) {
            super(3);
            this.f92427a = r3cVar;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ vba invoke(InterfaceC0761n interfaceC0761n, rba rbaVar, ku2 ku2Var) {
            return m32817invoke3p2s80s(interfaceC0761n, rbaVar, ku2Var.m30769unboximpl());
        }

        @yfb
        /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
        public final vba m32817invoke3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
            AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(j);
            r3c r3cVar = this.f92427a;
            if (interfaceC0761n.isLookingAhead()) {
                r3cVar.m32076invokeozmzZPI(s78.IntSize(abstractC0767tMo27949measureBRTryo0.getWidth(), abstractC0767tMo27949measureBRTryo0.getHeight()));
            }
            return InterfaceC0761n.layout$default(interfaceC0761n, abstractC0767tMo27949measureBRTryo0.getWidth(), abstractC0767tMo27949measureBRTryo0.getHeight(), null, new C16548a(abstractC0767tMo27949measureBRTryo0), 4, null);
        }
    }

    /* JADX INFO: renamed from: vx$b */
    public static final class b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ kz6<InterfaceC14819wx, zl2, Integer, bth> f92429C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ int f92430F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ int f92431H;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yeh<T> f92432a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<T, Boolean> f92433b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0701e f92434c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC0574g f92435d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AbstractC0575h f92436e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ gz6<d35, d35, Boolean> f92437f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ r3c f92438m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(yeh<T> yehVar, qy6<? super T, Boolean> qy6Var, InterfaceC0701e interfaceC0701e, AbstractC0574g abstractC0574g, AbstractC0575h abstractC0575h, gz6<? super d35, ? super d35, Boolean> gz6Var, r3c r3cVar, kz6<? super InterfaceC14819wx, ? super zl2, ? super Integer, bth> kz6Var, int i, int i2) {
            super(2);
            this.f92432a = yehVar;
            this.f92433b = qy6Var;
            this.f92434c = interfaceC0701e;
            this.f92435d = abstractC0574g;
            this.f92436e = abstractC0575h;
            this.f92437f = gz6Var;
            this.f92438m = r3cVar;
            this.f92429C = kz6Var;
            this.f92430F = i;
            this.f92431H = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C14282vx.AnimatedEnterExitImpl(this.f92432a, this.f92433b, this.f92434c, this.f92435d, this.f92436e, this.f92437f, this.f92438m, this.f92429C, zl2Var, tsd.updateChangedFlags(this.f92430F | 1), this.f92431H);
        }
    }

    /* JADX INFO: renamed from: vx$c */
    @ck3(m4009c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", m4010f = "AnimatedVisibility.kt", m4011i = {}, m4012l = {756}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class c extends ugg implements gz6<sdd<Boolean>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f92439a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f92440b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ yeh<d35> f92441c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ i2g<gz6<d35, d35, Boolean>> f92442d;

        /* JADX INFO: renamed from: vx$c$a */
        public static final class a extends tt8 implements ny6<Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ yeh<d35> f92443a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(yeh<d35> yehVar) {
                super(0);
                this.f92443a = yehVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Boolean invoke() {
                return Boolean.valueOf(C14282vx.getExitFinished(this.f92443a));
            }
        }

        /* JADX INFO: renamed from: vx$c$b */
        public static final class b<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ sdd<Boolean> f92444a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ yeh<d35> f92445b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ i2g<gz6<d35, d35, Boolean>> f92446c;

            /* JADX WARN: Multi-variable type inference failed */
            public b(sdd<Boolean> sddVar, yeh<d35> yehVar, i2g<? extends gz6<? super d35, ? super d35, Boolean>> i2gVar) {
                this.f92444a = sddVar;
                this.f92445b = yehVar;
                this.f92446c = i2gVar;
            }

            @Override // p000.t66
            public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
                return emit(((Boolean) obj).booleanValue(), (zy2<? super bth>) zy2Var);
            }

            @gib
            public final Object emit(boolean z, @yfb zy2<? super bth> zy2Var) {
                this.f92444a.setValue(wc1.boxBoolean(z ? ((Boolean) C14282vx.AnimatedEnterExitImpl$lambda$2(this.f92446c).invoke(this.f92445b.getCurrentState(), this.f92445b.getTargetState())).booleanValue() : false));
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(yeh<d35> yehVar, i2g<? extends gz6<? super d35, ? super d35, Boolean>> i2gVar, zy2<? super c> zy2Var) {
            super(2, zy2Var);
            this.f92441c = yehVar;
            this.f92442d = i2gVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            c cVar = new c(this.f92441c, this.f92442d, zy2Var);
            cVar.f92440b = obj;
            return cVar;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb sdd<Boolean> sddVar, @gib zy2<? super bth> zy2Var) {
            return ((c) create(sddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f92439a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                sdd sddVar = (sdd) this.f92440b;
                y56 y56VarSnapshotFlow = stf.snapshotFlow(new a(this.f92441c));
                b bVar = new b(sddVar, this.f92441c, this.f92442d);
                this.f92439a = 1;
                if (y56VarSnapshotFlow.collect(bVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: vx$d */
    public static final class d extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ int f92447C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ int f92448F;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gce f92449a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b7b<Boolean> f92450b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0701e f92451c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC0574g f92452d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AbstractC0575h f92453e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f92454f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ kz6<InterfaceC14819wx, zl2, Integer, bth> f92455m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(gce gceVar, b7b<Boolean> b7bVar, InterfaceC0701e interfaceC0701e, AbstractC0574g abstractC0574g, AbstractC0575h abstractC0575h, String str, kz6<? super InterfaceC14819wx, ? super zl2, ? super Integer, bth> kz6Var, int i, int i2) {
            super(2);
            this.f92449a = gceVar;
            this.f92450b = b7bVar;
            this.f92451c = interfaceC0701e;
            this.f92452d = abstractC0574g;
            this.f92453e = abstractC0575h;
            this.f92454f = str;
            this.f92455m = kz6Var;
            this.f92447C = i;
            this.f92448F = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C14282vx.AnimatedVisibility(this.f92449a, this.f92450b, this.f92451c, this.f92452d, this.f92453e, this.f92454f, this.f92455m, zl2Var, tsd.updateChangedFlags(this.f92447C | 1), this.f92448F);
        }
    }

    /* JADX INFO: renamed from: vx$e */
    public static final class e extends tt8 implements qy6<Boolean, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final e f92456a = new e();

        public e() {
            super(1);
        }

        @yfb
        public final Boolean invoke(boolean z) {
            return Boolean.valueOf(z);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return invoke(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: vx$f */
    public static final class f extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ int f92457C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ int f92458F;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bb2 f92459a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b7b<Boolean> f92460b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0701e f92461c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC0574g f92462d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AbstractC0575h f92463e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f92464f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ kz6<InterfaceC14819wx, zl2, Integer, bth> f92465m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(bb2 bb2Var, b7b<Boolean> b7bVar, InterfaceC0701e interfaceC0701e, AbstractC0574g abstractC0574g, AbstractC0575h abstractC0575h, String str, kz6<? super InterfaceC14819wx, ? super zl2, ? super Integer, bth> kz6Var, int i, int i2) {
            super(2);
            this.f92459a = bb2Var;
            this.f92460b = b7bVar;
            this.f92461c = interfaceC0701e;
            this.f92462d = abstractC0574g;
            this.f92463e = abstractC0575h;
            this.f92464f = str;
            this.f92465m = kz6Var;
            this.f92457C = i;
            this.f92458F = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C14282vx.AnimatedVisibility(this.f92459a, this.f92460b, this.f92461c, this.f92462d, this.f92463e, this.f92464f, this.f92465m, zl2Var, tsd.updateChangedFlags(this.f92457C | 1), this.f92458F);
        }
    }

    /* JADX INFO: renamed from: vx$g */
    public static final class g extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ int f92466C;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yeh<T> f92467a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<T, Boolean> f92468b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0701e f92469c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC0574g f92470d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AbstractC0575h f92471e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ kz6<InterfaceC14819wx, zl2, Integer, bth> f92472f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f92473m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(yeh<T> yehVar, qy6<? super T, Boolean> qy6Var, InterfaceC0701e interfaceC0701e, AbstractC0574g abstractC0574g, AbstractC0575h abstractC0575h, kz6<? super InterfaceC14819wx, ? super zl2, ? super Integer, bth> kz6Var, int i, int i2) {
            super(2);
            this.f92467a = yehVar;
            this.f92468b = qy6Var;
            this.f92469c = interfaceC0701e;
            this.f92470d = abstractC0574g;
            this.f92471e = abstractC0575h;
            this.f92472f = kz6Var;
            this.f92473m = i;
            this.f92466C = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C14282vx.AnimatedVisibility(this.f92467a, this.f92468b, this.f92469c, this.f92470d, this.f92471e, this.f92472f, zl2Var, tsd.updateChangedFlags(this.f92473m | 1), this.f92466C);
        }
    }

    /* JADX INFO: renamed from: vx$h */
    public static final class h extends tt8 implements qy6<Boolean, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final h f92474a = new h();

        public h() {
            super(1);
        }

        @yfb
        public final Boolean invoke(boolean z) {
            return Boolean.valueOf(z);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return invoke(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: vx$i */
    public static final class i extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ int f92475C;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f92476a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f92477b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC0574g f92478c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC0575h f92479d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f92480e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ kz6<InterfaceC14819wx, zl2, Integer, bth> f92481f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f92482m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(boolean z, InterfaceC0701e interfaceC0701e, AbstractC0574g abstractC0574g, AbstractC0575h abstractC0575h, String str, kz6<? super InterfaceC14819wx, ? super zl2, ? super Integer, bth> kz6Var, int i, int i2) {
            super(2);
            this.f92476a = z;
            this.f92477b = interfaceC0701e;
            this.f92478c = abstractC0574g;
            this.f92479d = abstractC0575h;
            this.f92480e = str;
            this.f92481f = kz6Var;
            this.f92482m = i;
            this.f92475C = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C14282vx.AnimatedVisibility(this.f92476a, this.f92477b, this.f92478c, this.f92479d, this.f92480e, this.f92481f, zl2Var, tsd.updateChangedFlags(this.f92482m | 1), this.f92475C);
        }
    }

    /* JADX INFO: renamed from: vx$j */
    public static final class j extends tt8 implements qy6<Boolean, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final j f92483a = new j();

        public j() {
            super(1);
        }

        @yfb
        public final Boolean invoke(boolean z) {
            return Boolean.valueOf(z);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return invoke(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: vx$k */
    public static final class k extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ int f92484C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ int f92485F;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gce f92486a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f92487b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0701e f92488c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC0574g f92489d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AbstractC0575h f92490e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f92491f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ kz6<InterfaceC14819wx, zl2, Integer, bth> f92492m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(gce gceVar, boolean z, InterfaceC0701e interfaceC0701e, AbstractC0574g abstractC0574g, AbstractC0575h abstractC0575h, String str, kz6<? super InterfaceC14819wx, ? super zl2, ? super Integer, bth> kz6Var, int i, int i2) {
            super(2);
            this.f92486a = gceVar;
            this.f92487b = z;
            this.f92488c = interfaceC0701e;
            this.f92489d = abstractC0574g;
            this.f92490e = abstractC0575h;
            this.f92491f = str;
            this.f92492m = kz6Var;
            this.f92484C = i;
            this.f92485F = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C14282vx.AnimatedVisibility(this.f92486a, this.f92487b, this.f92488c, this.f92489d, this.f92490e, this.f92491f, this.f92492m, zl2Var, tsd.updateChangedFlags(this.f92484C | 1), this.f92485F);
        }
    }

    /* JADX INFO: renamed from: vx$l */
    public static final class l extends tt8 implements qy6<Boolean, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final l f92493a = new l();

        public l() {
            super(1);
        }

        @yfb
        public final Boolean invoke(boolean z) {
            return Boolean.valueOf(z);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return invoke(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: vx$m */
    public static final class m extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ int f92494C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ int f92495F;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bb2 f92496a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f92497b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0701e f92498c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC0574g f92499d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AbstractC0575h f92500e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f92501f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ kz6<InterfaceC14819wx, zl2, Integer, bth> f92502m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(bb2 bb2Var, boolean z, InterfaceC0701e interfaceC0701e, AbstractC0574g abstractC0574g, AbstractC0575h abstractC0575h, String str, kz6<? super InterfaceC14819wx, ? super zl2, ? super Integer, bth> kz6Var, int i, int i2) {
            super(2);
            this.f92496a = bb2Var;
            this.f92497b = z;
            this.f92498c = interfaceC0701e;
            this.f92499d = abstractC0574g;
            this.f92500e = abstractC0575h;
            this.f92501f = str;
            this.f92502m = kz6Var;
            this.f92494C = i;
            this.f92495F = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C14282vx.AnimatedVisibility(this.f92496a, this.f92497b, this.f92498c, this.f92499d, this.f92500e, this.f92501f, this.f92502m, zl2Var, tsd.updateChangedFlags(this.f92494C | 1), this.f92495F);
        }
    }

    /* JADX INFO: renamed from: vx$n */
    public static final class n extends tt8 implements qy6<Boolean, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final n f92503a = new n();

        public n() {
            super(1);
        }

        @yfb
        public final Boolean invoke(boolean z) {
            return Boolean.valueOf(z);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return invoke(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: vx$o */
    public static final class o extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ int f92504C;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b7b<Boolean> f92505a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f92506b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC0574g f92507c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC0575h f92508d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f92509e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ kz6<InterfaceC14819wx, zl2, Integer, bth> f92510f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f92511m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(b7b<Boolean> b7bVar, InterfaceC0701e interfaceC0701e, AbstractC0574g abstractC0574g, AbstractC0575h abstractC0575h, String str, kz6<? super InterfaceC14819wx, ? super zl2, ? super Integer, bth> kz6Var, int i, int i2) {
            super(2);
            this.f92505a = b7bVar;
            this.f92506b = interfaceC0701e;
            this.f92507c = abstractC0574g;
            this.f92508d = abstractC0575h;
            this.f92509e = str;
            this.f92510f = kz6Var;
            this.f92511m = i;
            this.f92504C = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C14282vx.AnimatedVisibility(this.f92505a, this.f92506b, this.f92507c, this.f92508d, this.f92509e, this.f92510f, zl2Var, tsd.updateChangedFlags(this.f92511m | 1), this.f92504C);
        }
    }

    /* JADX INFO: renamed from: vx$p */
    public static final class p extends tt8 implements qy6<Boolean, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final p f92512a = new p();

        public p() {
            super(1);
        }

        @yfb
        public final Boolean invoke(boolean z) {
            return Boolean.valueOf(z);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return invoke(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: vx$q */
    @dwf({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,885:1\n56#2:886\n59#2:887\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1\n*L\n701#1:886\n700#1:887\n*E\n"})
    public static final class q extends tt8 implements kz6<InterfaceC0761n, rba, ku2, vba> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<T, Boolean> f92513a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ yeh<T> f92514b;

        /* JADX INFO: renamed from: vx$q$a */
        public static final class a extends tt8 implements qy6<AbstractC0767t.a, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AbstractC0767t f92515a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC0767t abstractC0767t) {
                super(1);
                this.f92515a = abstractC0767t;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
                invoke2(aVar);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb AbstractC0767t.a aVar) {
                AbstractC0767t.a.place$default(aVar, this.f92515a, 0, 0, 0.0f, 4, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(qy6<? super T, Boolean> qy6Var, yeh<T> yehVar) {
            super(3);
            this.f92513a = qy6Var;
            this.f92514b = yehVar;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ vba invoke(InterfaceC0761n interfaceC0761n, rba rbaVar, ku2 ku2Var) {
            return m32818invoke3p2s80s(interfaceC0761n, rbaVar, ku2Var.m30769unboximpl());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @yfb
        /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
        public final vba m32818invoke3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
            AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(j);
            long jIntSize = (!interfaceC0761n.isLookingAhead() || this.f92513a.invoke((T) this.f92514b.getTargetState()).booleanValue()) ? s78.IntSize(abstractC0767tMo27949measureBRTryo0.getWidth(), abstractC0767tMo27949measureBRTryo0.getHeight()) : r78.f77324b.m32092getZeroYbymL2g();
            return InterfaceC0761n.layout$default(interfaceC0761n, r78.m32087getWidthimpl(jIntSize), r78.m32086getHeightimpl(jIntSize), null, new a(abstractC0767tMo27949measureBRTryo0), 4, null);
        }
    }

    /* JADX INFO: renamed from: vx$r */
    public static final class r extends tt8 implements gz6<d35, d35, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final r f92516a = new r();

        public r() {
            super(2);
        }

        @Override // p000.gz6
        @yfb
        public final Boolean invoke(@yfb d35 d35Var, @yfb d35 d35Var2) {
            return Boolean.valueOf(d35Var == d35Var2 && d35Var2 == d35.PostExit);
        }
    }

    /* JADX INFO: renamed from: vx$s */
    public static final class s extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yeh<T> f92517a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<T, Boolean> f92518b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0701e f92519c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC0574g f92520d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AbstractC0575h f92521e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ kz6<InterfaceC14819wx, zl2, Integer, bth> f92522f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f92523m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(yeh<T> yehVar, qy6<? super T, Boolean> qy6Var, InterfaceC0701e interfaceC0701e, AbstractC0574g abstractC0574g, AbstractC0575h abstractC0575h, kz6<? super InterfaceC14819wx, ? super zl2, ? super Integer, bth> kz6Var, int i) {
            super(2);
            this.f92517a = yehVar;
            this.f92518b = qy6Var;
            this.f92519c = interfaceC0701e;
            this.f92520d = abstractC0574g;
            this.f92521e = abstractC0575h;
            this.f92522f = kz6Var;
            this.f92523m = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            C14282vx.AnimatedVisibilityImpl(this.f92517a, this.f92518b, this.f92519c, this.f92520d, this.f92521e, this.f92522f, zl2Var, tsd.updateChangedFlags(this.f92523m | 1));
        }
    }

    @hk2
    @ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final <T> void AnimatedEnterExitImpl(@yfb yeh<T> yehVar, @yfb qy6<? super T, Boolean> qy6Var, @yfb InterfaceC0701e interfaceC0701e, @yfb AbstractC0574g abstractC0574g, @yfb AbstractC0575h abstractC0575h, @yfb gz6<? super d35, ? super d35, Boolean> gz6Var, @gib r3c r3cVar, @yfb kz6<? super InterfaceC14819wx, ? super zl2, ? super Integer, bth> kz6Var, @gib zl2 zl2Var, int i2, int i3) {
        int i4;
        int i5;
        r3c r3cVar2;
        int i6;
        r3c r3cVar3;
        zl2 zl2Var2;
        InterfaceC0701e interfaceC0701eLayout;
        r3c r3cVar4;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-891967166);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (zl2VarStartRestartGroup.changed(yehVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= zl2VarStartRestartGroup.changedInstance(qy6Var) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= zl2VarStartRestartGroup.changed(interfaceC0701e) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= kw1.f55470l;
        } else if ((i2 & kw1.f55470l) == 0) {
            i4 |= zl2VarStartRestartGroup.changed(abstractC0574g) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= CpioConstants.C_ISBLK;
        } else if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i4 |= zl2VarStartRestartGroup.changed(abstractC0575h) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= C1360d.c.f10660k;
        } else if ((i2 & C1360d.c.f10660k) == 0) {
            i4 |= zl2VarStartRestartGroup.changedInstance(gz6Var) ? 131072 : 65536;
        }
        int i7 = i3 & 64;
        int i8 = 1572864;
        if (i7 != 0) {
            i4 |= i8;
        } else if ((i2 & 1572864) == 0) {
            i8 = (i2 & 2097152) == 0 ? zl2VarStartRestartGroup.changed(r3cVar) : zl2VarStartRestartGroup.changedInstance(r3cVar) ? 1048576 : 524288;
            i4 |= i8;
        }
        if ((i3 & 128) != 0) {
            i4 |= RecordingService.f26452f;
        } else if ((i2 & RecordingService.f26452f) == 0) {
            i4 |= zl2VarStartRestartGroup.changedInstance(kz6Var) ? 8388608 : 4194304;
        }
        int i9 = i4;
        if ((4793491 & i9) == 4793490 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
            r3cVar4 = r3cVar;
            zl2Var2 = zl2VarStartRestartGroup;
        } else {
            r3c r3cVar5 = i7 != 0 ? null : r3cVar;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-891967166, i9, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:737)");
            }
            if (qy6Var.invoke(yehVar.getTargetState()).booleanValue() || qy6Var.invoke(yehVar.getCurrentState()).booleanValue() || yehVar.isSeeking() || yehVar.getHasInitialValueAnimations()) {
                zl2VarStartRestartGroup.startReplaceGroup(1787977937);
                int i10 = i9 & 14;
                int i11 = i10 | 48;
                int i12 = i11 & 14;
                boolean z = true;
                boolean z2 = ((i12 ^ 6) > 4 && zl2VarStartRestartGroup.changed(yehVar)) || (i11 & 6) == 4;
                Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == zl2.f105372a.getEmpty()) {
                    objRememberedValue = yehVar.getCurrentState();
                    zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                if (yehVar.isSeeking()) {
                    objRememberedValue = yehVar.getCurrentState();
                }
                zl2VarStartRestartGroup.startReplaceGroup(-466616829);
                if (gm2.isTraceInProgress()) {
                    i5 = i10;
                    r3cVar2 = r3cVar5;
                    gm2.traceEventStart(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)");
                } else {
                    i5 = i10;
                    r3cVar2 = r3cVar5;
                }
                int i13 = i9 & 126;
                d35 d35VarTargetEnterExit = targetEnterExit(yehVar, qy6Var, objRememberedValue, zl2VarStartRestartGroup, i13);
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventEnd();
                }
                zl2VarStartRestartGroup.endReplaceGroup();
                T targetState = yehVar.getTargetState();
                zl2VarStartRestartGroup.startReplaceGroup(-466616829);
                if (gm2.isTraceInProgress()) {
                    i6 = i9;
                    gm2.traceEventStart(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)");
                } else {
                    i6 = i9;
                }
                d35 d35VarTargetEnterExit2 = targetEnterExit(yehVar, qy6Var, targetState, zl2VarStartRestartGroup, i13);
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventEnd();
                }
                zl2VarStartRestartGroup.endReplaceGroup();
                int i14 = i12 | kw1.f55470l;
                int i15 = i5;
                r3c r3cVar6 = r3cVar2;
                int i16 = i6;
                yeh yehVarCreateChildTransitionInternal = ffh.createChildTransitionInternal(yehVar, d35VarTargetEnterExit, d35VarTargetEnterExit2, "EnterExitTransition", zl2VarStartRestartGroup, i14);
                i2g i2gVarRememberUpdatedState = stf.rememberUpdatedState(gz6Var, zl2VarStartRestartGroup, (i16 >> 15) & 14);
                Boolean boolInvoke = gz6Var.invoke(yehVarCreateChildTransitionInternal.getCurrentState(), yehVarCreateChildTransitionInternal.getTargetState());
                boolean zChanged = zl2VarStartRestartGroup.changed(yehVarCreateChildTransitionInternal) | zl2VarStartRestartGroup.changed(i2gVarRememberUpdatedState);
                Object objRememberedValue2 = zl2VarStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == zl2.f105372a.getEmpty()) {
                    objRememberedValue2 = new c(yehVarCreateChildTransitionInternal, i2gVarRememberUpdatedState, null);
                    zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                i2g i2gVarProduceState = stf.produceState(boolInvoke, (gz6) objRememberedValue2, zl2VarStartRestartGroup, 0);
                if (getExitFinished(yehVarCreateChildTransitionInternal) && AnimatedEnterExitImpl$lambda$4(i2gVarProduceState)) {
                    zl2VarStartRestartGroup.startReplaceGroup(1790256282);
                    zl2VarStartRestartGroup.endReplaceGroup();
                    r3cVar3 = r3cVar6;
                    zl2Var2 = zl2VarStartRestartGroup;
                } else {
                    zl2VarStartRestartGroup.startReplaceGroup(1788869559);
                    boolean z3 = i15 == 4;
                    Object objRememberedValue3 = zl2VarStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue3 == zl2.f105372a.getEmpty()) {
                        objRememberedValue3 = new C15339xx(yehVarCreateChildTransitionInternal);
                        zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    C15339xx c15339xx = (C15339xx) objRememberedValue3;
                    int i17 = i16 >> 6;
                    int i18 = (i17 & 112) | CpioConstants.C_ISBLK | (i17 & C1340j.f10444b);
                    r3cVar3 = r3cVar6;
                    zl2Var2 = zl2VarStartRestartGroup;
                    InterfaceC0701e interfaceC0701eCreateModifier = C0573f.createModifier(yehVarCreateChildTransitionInternal, abstractC0574g, abstractC0575h, null, "Built-in", zl2Var2, i18, 4);
                    if (r3cVar3 != null) {
                        zl2Var2.startReplaceGroup(1789227361);
                        InterfaceC0701e.a aVar = InterfaceC0701e.f5158d1;
                        if ((i16 & 3670016) != 1048576 && ((i16 & 2097152) == 0 || !zl2Var2.changedInstance(r3cVar3))) {
                            z = false;
                        }
                        Object objRememberedValue4 = zl2Var2.rememberedValue();
                        if (z || objRememberedValue4 == zl2.f105372a.getEmpty()) {
                            objRememberedValue4 = new a(r3cVar3);
                            zl2Var2.updateRememberedValue(objRememberedValue4);
                        }
                        interfaceC0701eLayout = C0755h.layout(aVar, (kz6) objRememberedValue4);
                        zl2Var2.endReplaceGroup();
                    } else {
                        zl2Var2.startReplaceGroup(1581766416);
                        zl2Var2.endReplaceGroup();
                        interfaceC0701eLayout = InterfaceC0701e.f5158d1;
                    }
                    InterfaceC0701e interfaceC0701eThen = interfaceC0701e.then(interfaceC0701eCreateModifier.then(interfaceC0701eLayout));
                    Object objRememberedValue5 = zl2Var2.rememberedValue();
                    if (objRememberedValue5 == zl2.f105372a.getEmpty()) {
                        objRememberedValue5 = new C12819sx(c15339xx);
                        zl2Var2.updateRememberedValue(objRememberedValue5);
                    }
                    C12819sx c12819sx = (C12819sx) objRememberedValue5;
                    int currentCompositeKeyHash = dl2.getCurrentCompositeKeyHash(zl2Var2, 0);
                    qn2 currentCompositionLocalMap = zl2Var2.getCurrentCompositionLocalMap();
                    InterfaceC0701e interfaceC0701eMaterializeModifier = C0696c.materializeModifier(zl2Var2, interfaceC0701eThen);
                    xl2.C15179a c15179a = xl2.f98343p;
                    ny6<xl2> constructor = c15179a.getConstructor();
                    if (zl2Var2.getApplier() == null) {
                        dl2.invalidApplier();
                    }
                    zl2Var2.startReusableNode();
                    if (zl2Var2.getInserting()) {
                        zl2Var2.createNode(constructor);
                    } else {
                        zl2Var2.useNode();
                    }
                    zl2 zl2VarM32449constructorimpl = twh.m32449constructorimpl(zl2Var2);
                    twh.m32456setimpl(zl2VarM32449constructorimpl, c12819sx, c15179a.getSetMeasurePolicy());
                    twh.m32456setimpl(zl2VarM32449constructorimpl, currentCompositionLocalMap, c15179a.getSetResolvedCompositionLocals());
                    gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
                    if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    twh.m32456setimpl(zl2VarM32449constructorimpl, interfaceC0701eMaterializeModifier, c15179a.getSetModifier());
                    kz6Var.invoke(c15339xx, zl2Var2, Integer.valueOf((i16 >> 18) & 112));
                    zl2Var2.endNode();
                    zl2Var2.endReplaceGroup();
                }
                zl2Var2.endReplaceGroup();
            } else {
                zl2VarStartRestartGroup.startReplaceGroup(1790262234);
                zl2VarStartRestartGroup.endReplaceGroup();
                r3cVar3 = r3cVar5;
                zl2Var2 = zl2VarStartRestartGroup;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            r3cVar4 = r3cVar3;
        }
        are areVarEndRestartGroup = zl2Var2.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new b(yehVar, qy6Var, interfaceC0701e, abstractC0574g, abstractC0575h, gz6Var, r3cVar4, kz6Var, i2, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gz6<d35, d35, Boolean> AnimatedEnterExitImpl$lambda$2(i2g<? extends gz6<? super d35, ? super d35, Boolean>> i2gVar) {
        return (gz6) i2gVar.getValue();
    }

    private static final boolean AnimatedEnterExitImpl$lambda$4(i2g<Boolean> i2gVar) {
        return i2gVar.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @p000.hk2
    @p000.ik2(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(boolean r22, @p000.gib androidx.compose.p002ui.InterfaceC0701e r23, @p000.gib androidx.compose.animation.AbstractC0574g r24, @p000.gib androidx.compose.animation.AbstractC0575h r25, @p000.gib java.lang.String r26, @p000.yfb p000.kz6<? super p000.InterfaceC14819wx, ? super p000.zl2, ? super java.lang.Integer, p000.bth> r27, @p000.gib p000.zl2 r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C14282vx.AnimatedVisibility(boolean, androidx.compose.ui.e, androidx.compose.animation.g, androidx.compose.animation.h, java.lang.String, kz6, zl2, int, int):void");
    }

    @hk2
    @ik2(scheme = "[0[0]]")
    public static final <T> void AnimatedVisibilityImpl(@yfb yeh<T> yehVar, @yfb qy6<? super T, Boolean> qy6Var, @yfb InterfaceC0701e interfaceC0701e, @yfb AbstractC0574g abstractC0574g, @yfb AbstractC0575h abstractC0575h, @yfb kz6<? super InterfaceC14819wx, ? super zl2, ? super Integer, bth> kz6Var, @gib zl2 zl2Var, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(429978603);
        if ((i2 & 6) == 0) {
            i3 = (zl2VarStartRestartGroup.changed(yehVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= zl2VarStartRestartGroup.changedInstance(qy6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= zl2VarStartRestartGroup.changed(interfaceC0701e) ? 256 : 128;
        }
        if ((i2 & kw1.f55470l) == 0) {
            i3 |= zl2VarStartRestartGroup.changed(abstractC0574g) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i3 |= zl2VarStartRestartGroup.changed(abstractC0575h) ? 16384 : 8192;
        }
        if ((i2 & C1360d.c.f10660k) == 0) {
            i3 |= zl2VarStartRestartGroup.changedInstance(kz6Var) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(429978603, i3, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:693)");
            }
            int i4 = i3 & 112;
            int i5 = i3 & 14;
            boolean z = (i4 == 32) | (i5 == 4);
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new q(qy6Var, yehVar);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AnimatedEnterExitImpl(yehVar, qy6Var, C0755h.layout(interfaceC0701e, (kz6) objRememberedValue), abstractC0574g, abstractC0575h, r.f92516a, null, kz6Var, zl2VarStartRestartGroup, i4 | 196608 | i5 | (i3 & 7168) | (57344 & i3) | ((i3 << 6) & 29360128), 64);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new s(yehVar, qy6Var, interfaceC0701e, abstractC0574g, abstractC0575h, kz6Var, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getExitFinished(yeh<d35> yehVar) {
        d35 currentState = yehVar.getCurrentState();
        d35 d35Var = d35.PostExit;
        return currentState == d35Var && yehVar.getTargetState() == d35Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @hk2
    private static final <T> d35 targetEnterExit(yeh<T> yehVar, qy6<? super T, Boolean> qy6Var, T t, zl2 zl2Var, int i2) {
        d35 d35Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(361571134, i2, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:855)");
        }
        zl2Var.startMovableGroup(-902048200, yehVar);
        if (yehVar.isSeeking()) {
            zl2Var.startReplaceGroup(2101296683);
            zl2Var.endReplaceGroup();
            d35Var = qy6Var.invoke(t).booleanValue() ? d35.Visible : qy6Var.invoke(yehVar.getCurrentState()).booleanValue() ? d35.PostExit : d35.PreEnter;
        } else {
            zl2Var.startReplaceGroup(2101530516);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = xtf.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            z6b z6bVar = (z6b) objRememberedValue;
            if (qy6Var.invoke(yehVar.getCurrentState()).booleanValue()) {
                z6bVar.setValue(Boolean.TRUE);
            }
            d35Var = qy6Var.invoke(t).booleanValue() ? d35.Visible : ((Boolean) z6bVar.getValue()).booleanValue() ? d35.PostExit : d35.PreEnter;
            zl2Var.endReplaceGroup();
        }
        zl2Var.endMovableGroup();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return d35Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @p000.hk2
    @p000.ik2(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(@p000.yfb p000.gce r22, boolean r23, @p000.gib androidx.compose.p002ui.InterfaceC0701e r24, @p000.gib androidx.compose.animation.AbstractC0574g r25, @p000.gib androidx.compose.animation.AbstractC0575h r26, @p000.gib java.lang.String r27, @p000.yfb p000.kz6<? super p000.InterfaceC14819wx, ? super p000.zl2, ? super java.lang.Integer, p000.bth> r28, @p000.gib p000.zl2 r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C14282vx.AnimatedVisibility(gce, boolean, androidx.compose.ui.e, androidx.compose.animation.g, androidx.compose.animation.h, java.lang.String, kz6, zl2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @p000.hk2
    @p000.ik2(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(@p000.yfb p000.bb2 r22, boolean r23, @p000.gib androidx.compose.p002ui.InterfaceC0701e r24, @p000.gib androidx.compose.animation.AbstractC0574g r25, @p000.gib androidx.compose.animation.AbstractC0575h r26, @p000.gib java.lang.String r27, @p000.yfb p000.kz6<? super p000.InterfaceC14819wx, ? super p000.zl2, ? super java.lang.Integer, p000.bth> r28, @p000.gib p000.zl2 r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C14282vx.AnimatedVisibility(bb2, boolean, androidx.compose.ui.e, androidx.compose.animation.g, androidx.compose.animation.h, java.lang.String, kz6, zl2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0161  */
    @p000.hk2
    @p000.ik2(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(@p000.yfb p000.b7b<java.lang.Boolean> r22, @p000.gib androidx.compose.p002ui.InterfaceC0701e r23, @p000.gib androidx.compose.animation.AbstractC0574g r24, @p000.gib androidx.compose.animation.AbstractC0575h r25, @p000.gib java.lang.String r26, @p000.yfb p000.kz6<? super p000.InterfaceC14819wx, ? super p000.zl2, ? super java.lang.Integer, p000.bth> r27, @p000.gib p000.zl2 r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C14282vx.AnimatedVisibility(b7b, androidx.compose.ui.e, androidx.compose.animation.g, androidx.compose.animation.h, java.lang.String, kz6, zl2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0163  */
    @p000.hk2
    @p000.ik2(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(@p000.yfb p000.gce r22, @p000.yfb p000.b7b<java.lang.Boolean> r23, @p000.gib androidx.compose.p002ui.InterfaceC0701e r24, @p000.gib androidx.compose.animation.AbstractC0574g r25, @p000.gib androidx.compose.animation.AbstractC0575h r26, @p000.gib java.lang.String r27, @p000.yfb p000.kz6<? super p000.InterfaceC14819wx, ? super p000.zl2, ? super java.lang.Integer, p000.bth> r28, @p000.gib p000.zl2 r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C14282vx.AnimatedVisibility(gce, b7b, androidx.compose.ui.e, androidx.compose.animation.g, androidx.compose.animation.h, java.lang.String, kz6, zl2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0163  */
    @p000.hk2
    @p000.ik2(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(@p000.yfb p000.bb2 r22, @p000.yfb p000.b7b<java.lang.Boolean> r23, @p000.gib androidx.compose.p002ui.InterfaceC0701e r24, @p000.gib androidx.compose.animation.AbstractC0574g r25, @p000.gib androidx.compose.animation.AbstractC0575h r26, @p000.gib java.lang.String r27, @p000.yfb p000.kz6<? super p000.InterfaceC14819wx, ? super p000.zl2, ? super java.lang.Integer, p000.bth> r28, @p000.gib p000.zl2 r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C14282vx.AnimatedVisibility(bb2, b7b, androidx.compose.ui.e, androidx.compose.animation.g, androidx.compose.animation.h, java.lang.String, kz6, zl2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @p000.hk2
    @p000.ik2(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void AnimatedVisibility(@p000.yfb p000.yeh<T> r23, @p000.yfb p000.qy6<? super T, java.lang.Boolean> r24, @p000.gib androidx.compose.p002ui.InterfaceC0701e r25, @p000.gib androidx.compose.animation.AbstractC0574g r26, @p000.gib androidx.compose.animation.AbstractC0575h r27, @p000.yfb p000.kz6<? super p000.InterfaceC14819wx, ? super p000.zl2, ? super java.lang.Integer, p000.bth> r28, @p000.gib p000.zl2 r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C14282vx.AnimatedVisibility(yeh, qy6, androidx.compose.ui.e, androidx.compose.animation.g, androidx.compose.animation.h, kz6, zl2, int, int):void");
    }
}
