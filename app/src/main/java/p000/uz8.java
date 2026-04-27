package p000;

/* JADX INFO: loaded from: classes.dex */
public final class uz8 {

    /* JADX INFO: renamed from: uz8$a */
    public static final class C13802a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vz8 f89549a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f89550b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f89551c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13802a(vz8 vz8Var, int i, Object obj) {
            super(2);
            this.f89549a = vz8Var;
            this.f89550b = i;
            this.f89551c = obj;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        @hk2
        public final void invoke(@gib zl2 zl2Var, int i) {
            if ((i & 3) == 2 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(980966366, i, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:134)");
            }
            this.f89549a.Item(this.f89550b, this.f89551c, zl2Var, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: uz8$b */
    public static final class C13803b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vz8 f89552a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f89553b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f89554c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Object f89555d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f89556e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13803b(vz8 vz8Var, Object obj, int i, Object obj2, int i2) {
            super(2);
            this.f89552a = vz8Var;
            this.f89553b = obj;
            this.f89554c = i;
            this.f89555d = obj2;
            this.f89556e = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            uz8.m32672SkippableItemJVlU9Rs(this.f89552a, this.f89553b, this.f89554c, this.f89555d, zl2Var, tsd.updateChangedFlags(this.f89556e | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @hk2
    /* JADX INFO: renamed from: SkippableItem-JVlU9Rs, reason: not valid java name */
    public static final void m32672SkippableItemJVlU9Rs(vz8 vz8Var, Object obj, int i, Object obj2, zl2 zl2Var, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(1439843069);
        if ((i2 & 6) == 0) {
            i3 = (zl2VarStartRestartGroup.changed(vz8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= zl2VarStartRestartGroup.changed(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= zl2VarStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & kw1.f55470l) == 0) {
            i3 |= zl2VarStartRestartGroup.changed(obj2) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(1439843069, i3, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:132)");
            }
            ((ple) obj).SaveableStateProvider(obj2, mk2.rememberComposableLambda(980966366, true, new C13802a(vz8Var, i, obj2), zl2VarStartRestartGroup, 54), zl2VarStartRestartGroup, 48);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C13803b(vz8Var, obj, i, obj2, i2));
        }
    }
}
