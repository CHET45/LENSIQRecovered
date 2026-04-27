package p000;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.p002ui.C0693R;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import p000.smi;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class foi {

    /* JADX INFO: renamed from: A */
    public static boolean f37295A;

    /* JADX INFO: renamed from: x */
    @yfb
    public static final C5910a f37296x = new C5910a(null);

    /* JADX INFO: renamed from: y */
    public static final int f37297y = 8;

    /* JADX INFO: renamed from: z */
    @yfb
    public static final WeakHashMap<View, foi> f37298z = new WeakHashMap<>();

    /* JADX INFO: renamed from: a */
    @yfb
    public final C10671ow f37299a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final C10671ow f37300b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final C10671ow f37301c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final C10671ow f37302d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final C10671ow f37303e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final C10671ow f37304f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final C10671ow f37305g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final C10671ow f37306h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final C10671ow f37307i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final m2i f37308j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final vli f37309k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final vli f37310l;

    /* JADX INFO: renamed from: m */
    @yfb
    public final vli f37311m;

    /* JADX INFO: renamed from: n */
    @yfb
    public final m2i f37312n;

    /* JADX INFO: renamed from: o */
    @yfb
    public final m2i f37313o;

    /* JADX INFO: renamed from: p */
    @yfb
    public final m2i f37314p;

    /* JADX INFO: renamed from: q */
    @yfb
    public final m2i f37315q;

    /* JADX INFO: renamed from: r */
    @yfb
    public final m2i f37316r;

    /* JADX INFO: renamed from: s */
    @yfb
    public final m2i f37317s;

    /* JADX INFO: renamed from: t */
    @yfb
    public final m2i f37318t;

    /* JADX INFO: renamed from: u */
    public final boolean f37319u;

    /* JADX INFO: renamed from: v */
    public int f37320v;

    /* JADX INFO: renamed from: w */
    @yfb
    public final u48 f37321w;

    /* JADX INFO: renamed from: foi$a */
    @dwf({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,785:1\n77#2:786\n1223#3,6:787\n361#4,7:793\n1#5:800\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n*L\n628#1:786\n631#1:787,6\n646#1:793,7\n*E\n"})
    public static final class C5910a {

        /* JADX INFO: renamed from: foi$a$a */
        @dwf({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion$current$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,785:1\n64#2,5:786\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion$current$1$1\n*L\n633#1:786,5\n*E\n"})
        public static final class a extends tt8 implements qy6<wf4, vf4> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ foi f37322a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f37323b;

            /* JADX INFO: renamed from: foi$a$a$a, reason: collision with other inner class name */
            @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion$current$1$1\n*L\n1#1,497:1\n634#2,2:498\n*E\n"})
            public static final class C16446a implements vf4 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ foi f37324a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f37325b;

                public C16446a(foi foiVar, View view) {
                    this.f37324a = foiVar;
                    this.f37325b = view;
                }

                @Override // p000.vf4
                public void dispose() {
                    this.f37324a.decrementAccessors(this.f37325b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(foi foiVar, View view) {
                super(1);
                this.f37322a = foiVar;
                this.f37323b = view;
            }

            @Override // p000.qy6
            @yfb
            public final vf4 invoke(@yfb wf4 wf4Var) {
                this.f37322a.incrementAccessors(this.f37323b);
                return new C16446a(this.f37322a, this.f37323b);
            }
        }

        public /* synthetic */ C5910a(jt3 jt3Var) {
            this();
        }

        private final foi getOrCreateFor(View view) {
            foi foiVar;
            synchronized (foi.f37298z) {
                try {
                    WeakHashMap weakHashMap = foi.f37298z;
                    Object obj = weakHashMap.get(view);
                    Object obj2 = obj;
                    if (obj == null) {
                        foi foiVar2 = new foi(null, view, false ? 1 : 0);
                        weakHashMap.put(view, foiVar2);
                        obj2 = foiVar2;
                    }
                    foiVar = (foi) obj2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return foiVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C10671ow systemInsets(smi smiVar, int i, String str) {
            C10671ow c10671ow = new C10671ow(i, str);
            if (smiVar != null) {
                c10671ow.update$foundation_layout_release(smiVar, i);
            }
            return c10671ow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final m2i valueInsetsIgnoringVisibility(smi smiVar, int i, String str) {
            r48 insetsIgnoringVisibility;
            if (smiVar == null || (insetsIgnoringVisibility = smiVar.getInsetsIgnoringVisibility(i)) == null) {
                insetsIgnoringVisibility = r48.f77013e;
            }
            return woi.ValueInsets(insetsIgnoringVisibility, str);
        }

        @yfb
        @hk2
        public final foi current(@gib zl2 zl2Var, int i) {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1366542614, i, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
            }
            View view = (View) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalView());
            foi orCreateFor = getOrCreateFor(view);
            boolean zChangedInstance = zl2Var.changedInstance(orCreateFor) | zl2Var.changedInstance(view);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChangedInstance || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new a(orCreateFor, view);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            jx4.DisposableEffect(orCreateFor, (qy6<? super wf4, ? extends vf4>) objRememberedValue, zl2Var, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            return orCreateFor;
        }

        @dpg
        public final void setUseTestInsets(boolean z) {
            foi.f37295A = z;
        }

        private C5910a() {
        }
    }

    public /* synthetic */ foi(smi smiVar, View view, jt3 jt3Var) {
        this(smiVar, view);
    }

    public static /* synthetic */ void update$default(foi foiVar, smi smiVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        foiVar.update(smiVar, i);
    }

    public final void decrementAccessors(@yfb View view) {
        int i = this.f37320v - 1;
        this.f37320v = i;
        if (i == 0) {
            o8i.setOnApplyWindowInsetsListener(view, null);
            o8i.setWindowInsetsAnimationCallback(view, null);
            view.removeOnAttachStateChangeListener(this.f37321w);
        }
    }

    @yfb
    public final C10671ow getCaptionBar() {
        return this.f37299a;
    }

    @yfb
    public final m2i getCaptionBarIgnoringVisibility() {
        return this.f37312n;
    }

    public final boolean getConsumes() {
        return this.f37319u;
    }

    @yfb
    public final C10671ow getDisplayCutout() {
        return this.f37300b;
    }

    @yfb
    public final C10671ow getIme() {
        return this.f37301c;
    }

    @yfb
    public final m2i getImeAnimationSource() {
        return this.f37318t;
    }

    @yfb
    public final m2i getImeAnimationTarget() {
        return this.f37317s;
    }

    @yfb
    public final C10671ow getMandatorySystemGestures() {
        return this.f37302d;
    }

    @yfb
    public final C10671ow getNavigationBars() {
        return this.f37303e;
    }

    @yfb
    public final m2i getNavigationBarsIgnoringVisibility() {
        return this.f37313o;
    }

    @yfb
    public final vli getSafeContent() {
        return this.f37311m;
    }

    @yfb
    public final vli getSafeDrawing() {
        return this.f37309k;
    }

    @yfb
    public final vli getSafeGestures() {
        return this.f37310l;
    }

    @yfb
    public final C10671ow getStatusBars() {
        return this.f37304f;
    }

    @yfb
    public final m2i getStatusBarsIgnoringVisibility() {
        return this.f37314p;
    }

    @yfb
    public final C10671ow getSystemBars() {
        return this.f37305g;
    }

    @yfb
    public final m2i getSystemBarsIgnoringVisibility() {
        return this.f37315q;
    }

    @yfb
    public final C10671ow getSystemGestures() {
        return this.f37306h;
    }

    @yfb
    public final C10671ow getTappableElement() {
        return this.f37307i;
    }

    @yfb
    public final m2i getTappableElementIgnoringVisibility() {
        return this.f37316r;
    }

    @yfb
    public final m2i getWaterfall() {
        return this.f37308j;
    }

    public final void incrementAccessors(@yfb View view) {
        if (this.f37320v == 0) {
            o8i.setOnApplyWindowInsetsListener(view, this.f37321w);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.f37321w);
            o8i.setWindowInsetsAnimationCallback(view, this.f37321w);
        }
        this.f37320v++;
    }

    public final void update(@yfb smi smiVar, int i) {
        if (f37295A) {
            WindowInsets windowInsets = smiVar.toWindowInsets();
            md8.checkNotNull(windowInsets);
            smiVar = smi.toWindowInsetsCompat(windowInsets);
        }
        this.f37299a.update$foundation_layout_release(smiVar, i);
        this.f37301c.update$foundation_layout_release(smiVar, i);
        this.f37300b.update$foundation_layout_release(smiVar, i);
        this.f37303e.update$foundation_layout_release(smiVar, i);
        this.f37304f.update$foundation_layout_release(smiVar, i);
        this.f37305g.update$foundation_layout_release(smiVar, i);
        this.f37306h.update$foundation_layout_release(smiVar, i);
        this.f37307i.update$foundation_layout_release(smiVar, i);
        this.f37302d.update$foundation_layout_release(smiVar, i);
        if (i == 0) {
            this.f37312n.setValue$foundation_layout_release(woi.toInsetsValues(smiVar.getInsetsIgnoringVisibility(smi.C12678m.captionBar())));
            this.f37313o.setValue$foundation_layout_release(woi.toInsetsValues(smiVar.getInsetsIgnoringVisibility(smi.C12678m.navigationBars())));
            this.f37314p.setValue$foundation_layout_release(woi.toInsetsValues(smiVar.getInsetsIgnoringVisibility(smi.C12678m.statusBars())));
            this.f37315q.setValue$foundation_layout_release(woi.toInsetsValues(smiVar.getInsetsIgnoringVisibility(smi.C12678m.systemBars())));
            this.f37316r.setValue$foundation_layout_release(woi.toInsetsValues(smiVar.getInsetsIgnoringVisibility(smi.C12678m.tappableElement())));
            if4 displayCutout = smiVar.getDisplayCutout();
            if (displayCutout != null) {
                this.f37308j.setValue$foundation_layout_release(woi.toInsetsValues(displayCutout.getWaterfallInsets()));
            }
        }
        ssf.f82790e.sendApplyNotifications();
    }

    public final void updateImeAnimationSource(@yfb smi smiVar) {
        this.f37318t.setValue$foundation_layout_release(woi.toInsetsValues(smiVar.getInsets(smi.C12678m.ime())));
    }

    public final void updateImeAnimationTarget(@yfb smi smiVar) {
        this.f37317s.setValue$foundation_layout_release(woi.toInsetsValues(smiVar.getInsets(smi.C12678m.ime())));
    }

    private foi(smi smiVar, View view) {
        if4 displayCutout;
        r48 waterfallInsets;
        C5910a c5910a = f37296x;
        this.f37299a = c5910a.systemInsets(smiVar, smi.C12678m.captionBar(), "captionBar");
        C10671ow c10671owSystemInsets = c5910a.systemInsets(smiVar, smi.C12678m.displayCutout(), "displayCutout");
        this.f37300b = c10671owSystemInsets;
        C10671ow c10671owSystemInsets2 = c5910a.systemInsets(smiVar, smi.C12678m.ime(), "ime");
        this.f37301c = c10671owSystemInsets2;
        C10671ow c10671owSystemInsets3 = c5910a.systemInsets(smiVar, smi.C12678m.mandatorySystemGestures(), "mandatorySystemGestures");
        this.f37302d = c10671owSystemInsets3;
        this.f37303e = c5910a.systemInsets(smiVar, smi.C12678m.navigationBars(), "navigationBars");
        this.f37304f = c5910a.systemInsets(smiVar, smi.C12678m.statusBars(), "statusBars");
        C10671ow c10671owSystemInsets4 = c5910a.systemInsets(smiVar, smi.C12678m.systemBars(), "systemBars");
        this.f37305g = c10671owSystemInsets4;
        C10671ow c10671owSystemInsets5 = c5910a.systemInsets(smiVar, smi.C12678m.systemGestures(), "systemGestures");
        this.f37306h = c10671owSystemInsets5;
        C10671ow c10671owSystemInsets6 = c5910a.systemInsets(smiVar, smi.C12678m.tappableElement(), "tappableElement");
        this.f37307i = c10671owSystemInsets6;
        m2i m2iVarValueInsets = woi.ValueInsets((smiVar == null || (displayCutout = smiVar.getDisplayCutout()) == null || (waterfallInsets = displayCutout.getWaterfallInsets()) == null) ? r48.f77013e : waterfallInsets, "waterfall");
        this.f37308j = m2iVarValueInsets;
        vli vliVarUnion = goi.union(goi.union(c10671owSystemInsets4, c10671owSystemInsets2), c10671owSystemInsets);
        this.f37309k = vliVarUnion;
        vli vliVarUnion2 = goi.union(goi.union(goi.union(c10671owSystemInsets6, c10671owSystemInsets3), c10671owSystemInsets5), m2iVarValueInsets);
        this.f37310l = vliVarUnion2;
        this.f37311m = goi.union(vliVarUnion, vliVarUnion2);
        this.f37312n = c5910a.valueInsetsIgnoringVisibility(smiVar, smi.C12678m.captionBar(), "captionBarIgnoringVisibility");
        this.f37313o = c5910a.valueInsetsIgnoringVisibility(smiVar, smi.C12678m.navigationBars(), "navigationBarsIgnoringVisibility");
        this.f37314p = c5910a.valueInsetsIgnoringVisibility(smiVar, smi.C12678m.statusBars(), "statusBarsIgnoringVisibility");
        this.f37315q = c5910a.valueInsetsIgnoringVisibility(smiVar, smi.C12678m.systemBars(), "systemBarsIgnoringVisibility");
        this.f37316r = c5910a.valueInsetsIgnoringVisibility(smiVar, smi.C12678m.tappableElement(), "tappableElementIgnoringVisibility");
        this.f37317s = c5910a.valueInsetsIgnoringVisibility(smiVar, smi.C12678m.ime(), "imeAnimationTarget");
        this.f37318t = c5910a.valueInsetsIgnoringVisibility(smiVar, smi.C12678m.ime(), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(C0693R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f37319u = bool != null ? bool.booleanValue() : true;
        this.f37321w = new u48(this);
    }
}
