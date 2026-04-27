package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,174:1\n1223#2,6:175\n1223#2,6:182\n77#3:181\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n*L\n54#1:175,6\n57#1:182,6\n56#1:181\n*E\n"})
public final class g09 {

    /* JADX INFO: renamed from: g09$a */
    @dwf({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,174:1\n64#2,5:175\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1\n*L\n57#1:175,5\n*E\n"})
    public static final class C6050a extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f09 f38109a;

        /* JADX INFO: renamed from: g09$a$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1\n*L\n1#1,497:1\n57#2:498\n*E\n"})
        public static final class a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ f09 f38110a;

            public a(f09 f09Var) {
                this.f38110a = f09Var;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f38110a.onDisposed();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6050a(f09 f09Var) {
            super(1);
            this.f38109a = f09Var;
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            return new a(this.f38109a);
        }
    }

    /* JADX INFO: renamed from: g09$b */
    public static final class C6051b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f38111a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f38112b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ h09 f38113c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6<zl2, Integer, bth> f38114d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f38115e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6051b(Object obj, int i, h09 h09Var, gz6<? super zl2, ? super Integer, bth> gz6Var, int i2) {
            super(2);
            this.f38111a = obj;
            this.f38112b = i;
            this.f38113c = h09Var;
            this.f38114d = gz6Var;
            this.f38115e = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            g09.LazyLayoutPinnableItem(this.f38111a, this.f38112b, this.f38113c, this.f38114d, zl2Var, tsd.updateChangedFlags(this.f38115e | 1));
        }
    }

    @ah5
    @hk2
    public static final void LazyLayoutPinnableItem(@gib Object obj, int i, @yfb h09 h09Var, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var, @gib zl2 zl2Var, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-2079116560);
        if ((i2 & 6) == 0) {
            i3 = (zl2VarStartRestartGroup.changedInstance(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= zl2VarStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= zl2VarStartRestartGroup.changedInstance(h09Var) ? 256 : 128;
        }
        if ((i2 & kw1.f55470l) == 0) {
            i3 |= zl2VarStartRestartGroup.changedInstance(gz6Var) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-2079116560, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:52)");
            }
            boolean zChanged = zl2VarStartRestartGroup.changed(obj) | zl2VarStartRestartGroup.changed(h09Var);
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new f09(obj, h09Var);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            f09 f09Var = (f09) objRememberedValue;
            f09Var.setIndex(i);
            f09Var.setParentPinnableContainer((vvc) zl2VarStartRestartGroup.consume(wvc.getLocalPinnableContainer()));
            boolean zChanged2 = zl2VarStartRestartGroup.changed(f09Var);
            Object objRememberedValue2 = zl2VarStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == zl2.f105372a.getEmpty()) {
                objRememberedValue2 = new C6050a(f09Var);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            jx4.DisposableEffect(f09Var, (qy6<? super wf4, ? extends vf4>) objRememberedValue2, zl2VarStartRestartGroup, 0);
            pn2.CompositionLocalProvider(wvc.getLocalPinnableContainer().provides(f09Var), gz6Var, zl2VarStartRestartGroup, ((i3 >> 6) & 112) | did.f29712i);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C6051b(obj, i, h09Var, gz6Var, i2));
        }
    }
}
