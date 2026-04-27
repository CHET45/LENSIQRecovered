package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import p000.w82;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nContextMenuUi.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuUi_androidKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,415:1\n85#2:416\n82#2,6:417\n88#2:451\n92#2:455\n78#3,6:423\n85#3,4:438\n89#3,2:448\n93#3:454\n78#3,6:465\n85#3,4:480\n89#3,2:490\n78#3,6:501\n85#3,4:516\n89#3,2:526\n93#3:532\n93#3:536\n368#4,9:429\n377#4:450\n378#4,2:452\n368#4,9:471\n377#4:492\n368#4,9:507\n377#4:528\n378#4,2:530\n378#4,2:534\n4032#5,6:442\n4032#5,6:484\n4032#5,6:520\n1223#6,6:456\n1223#6,6:540\n98#7,3:462\n101#7:493\n105#7:537\n71#8:494\n68#8,6:495\n74#8:529\n78#8:533\n77#9:538\n77#9:539\n*S KotlinDebug\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuUi_androidKt\n*L\n146#1:416\n146#1:417,6\n146#1:451\n146#1:455\n146#1:423,6\n146#1:438,4\n146#1:448,2\n146#1:454\n183#1:465,6\n183#1:480,4\n183#1:490,2\n205#1:501,6\n205#1:516,4\n205#1:526,2\n205#1:532\n183#1:536\n146#1:429,9\n146#1:450\n146#1:452,2\n183#1:471,9\n183#1:492\n205#1:507,9\n205#1:528\n205#1:530,2\n183#1:534,2\n146#1:442,6\n183#1:484,6\n205#1:520,6\n190#1:456,6\n357#1:540,6\n183#1:462,3\n183#1:493\n183#1:537\n205#1:494\n205#1:495,6\n205#1:529\n205#1:533\n356#1:538\n357#1:539\n*E\n"})
public final class zx2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final y4d f106268a = new y4d(true, false, false, false, 14, (jt3) null);

    /* JADX INFO: renamed from: b */
    public static final float f106269b = 0.38f;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final qx2 f106270c;

    /* JADX INFO: renamed from: zx2$a */
    public static final class C16292a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qx2 f106271a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f106272b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ kz6<bb2, zl2, Integer, bth> f106273c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f106274d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f106275e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16292a(qx2 qx2Var, InterfaceC0701e interfaceC0701e, kz6<? super bb2, ? super zl2, ? super Integer, bth> kz6Var, int i, int i2) {
            super(2);
            this.f106271a = qx2Var;
            this.f106272b = interfaceC0701e;
            this.f106273c = kz6Var;
            this.f106274d = i;
            this.f106275e = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            zx2.ContextMenuColumn(this.f106271a, this.f106272b, this.f106273c, zl2Var, tsd.updateChangedFlags(this.f106274d | 1), this.f106275e);
        }
    }

    /* JADX INFO: renamed from: zx2$b */
    public static final class C16293b extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f106276a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ny6<bth> f106277b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16293b(boolean z, ny6<bth> ny6Var) {
            super(0);
            this.f106276a = z;
            this.f106277b = ny6Var;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f106276a) {
                this.f106277b.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: zx2$c */
    public static final class C16294c extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ int f106278C;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f106279a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f106280b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qx2 f106281c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC0701e f106282d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ kz6<w82, zl2, Integer, bth> f106283e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ny6<bth> f106284f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f106285m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16294c(String str, boolean z, qx2 qx2Var, InterfaceC0701e interfaceC0701e, kz6<? super w82, ? super zl2, ? super Integer, bth> kz6Var, ny6<bth> ny6Var, int i, int i2) {
            super(2);
            this.f106279a = str;
            this.f106280b = z;
            this.f106281c = qx2Var;
            this.f106282d = interfaceC0701e;
            this.f106283e = kz6Var;
            this.f106284f = ny6Var;
            this.f106285m = i;
            this.f106278C = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            zx2.ContextMenuItem(this.f106279a, this.f106280b, this.f106281c, this.f106282d, this.f106283e, this.f106284f, zl2Var, tsd.updateChangedFlags(this.f106285m | 1), this.f106278C);
        }
    }

    /* JADX INFO: renamed from: zx2$d */
    public static final class C16295d extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x4d f106286a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ny6<bth> f106287b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0701e f106288c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<vx2, bth> f106289d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f106290e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f106291f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16295d(x4d x4dVar, ny6<bth> ny6Var, InterfaceC0701e interfaceC0701e, qy6<? super vx2, bth> qy6Var, int i, int i2) {
            super(2);
            this.f106286a = x4dVar;
            this.f106287b = ny6Var;
            this.f106288c = interfaceC0701e;
            this.f106289d = qy6Var;
            this.f106290e = i;
            this.f106291f = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            zx2.ContextMenuPopup(this.f106286a, this.f106287b, this.f106288c, this.f106289d, zl2Var, tsd.updateChangedFlags(this.f106290e | 1), this.f106291f);
        }
    }

    /* JADX INFO: renamed from: zx2$e */
    public static final class C16296e extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qx2 f106292a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f106293b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<vx2, bth> f106294c;

        /* JADX INFO: renamed from: zx2$e$a */
        @dwf({"SMAP\nContextMenuUi.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuUi_androidKt$ContextMenuPopup$2$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,415:1\n1223#2,6:416\n*S KotlinDebug\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuUi_androidKt$ContextMenuPopup$2$1\n*L\n129#1:416,6\n*E\n"})
        public static final class a extends tt8 implements kz6<bb2, zl2, Integer, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ qy6<vx2, bth> f106295a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ qx2 f106296b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(qy6<? super vx2, bth> qy6Var, qx2 qx2Var) {
                super(3);
                this.f106295a = qy6Var;
                this.f106296b = qx2Var;
            }

            @Override // p000.kz6
            public /* bridge */ /* synthetic */ bth invoke(bb2 bb2Var, zl2 zl2Var, Integer num) {
                invoke(bb2Var, zl2Var, num.intValue());
                return bth.f14751a;
            }

            @bl2(applier = "androidx.compose.ui.UiComposable")
            @hk2
            public final void invoke(@yfb bb2 bb2Var, @gib zl2 zl2Var, int i) {
                if ((i & 17) == 16 && zl2Var.getSkipping()) {
                    zl2Var.skipToGroupEnd();
                    return;
                }
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventStart(1156688164, i, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous>.<anonymous> (ContextMenuUi.android.kt:128)");
                }
                Object objRememberedValue = zl2Var.rememberedValue();
                if (objRememberedValue == zl2.f105372a.getEmpty()) {
                    objRememberedValue = new vx2();
                    zl2Var.updateRememberedValue(objRememberedValue);
                }
                vx2 vx2Var = (vx2) objRememberedValue;
                qy6<vx2, bth> qy6Var = this.f106295a;
                qx2 qx2Var = this.f106296b;
                vx2Var.clear$foundation_release();
                qy6Var.invoke(vx2Var);
                vx2Var.Content$foundation_release(qx2Var, zl2Var, 0);
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16296e(qx2 qx2Var, InterfaceC0701e interfaceC0701e, qy6<? super vx2, bth> qy6Var) {
            super(2);
            this.f106292a = qx2Var;
            this.f106293b = interfaceC0701e;
            this.f106294c = qy6Var;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        @bl2(applier = "androidx.compose.ui.UiComposable")
        @hk2
        public final void invoke(@gib zl2 zl2Var, int i) {
            if ((i & 3) == 2 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(795909757, i, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous> (ContextMenuUi.android.kt:127)");
            }
            qx2 qx2Var = this.f106292a;
            zx2.ContextMenuColumn(qx2Var, this.f106293b, mk2.rememberComposableLambda(1156688164, true, new a(this.f106294c, qx2Var), zl2Var, 54), zl2Var, 384, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: zx2$f */
    public static final class C16297f extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x4d f106297a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ny6<bth> f106298b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0701e f106299c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qx2 f106300d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ qy6<vx2, bth> f106301e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f106302f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f106303m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16297f(x4d x4dVar, ny6<bth> ny6Var, InterfaceC0701e interfaceC0701e, qx2 qx2Var, qy6<? super vx2, bth> qy6Var, int i, int i2) {
            super(2);
            this.f106297a = x4dVar;
            this.f106298b = ny6Var;
            this.f106299c = interfaceC0701e;
            this.f106300d = qx2Var;
            this.f106301e = qy6Var;
            this.f106302f = i;
            this.f106303m = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            zx2.ContextMenuPopup(this.f106297a, this.f106298b, this.f106299c, this.f106300d, this.f106301e, zl2Var, tsd.updateChangedFlags(this.f106302f | 1), this.f106303m);
        }
    }

    static {
        w82.C14471a c14471a = w82.f93556b;
        f106270c = new qx2(c14471a.m32988getWhite0d7_KjU(), c14471a.m32977getBlack0d7_KjU(), c14471a.m32977getBlack0d7_KjU(), w82.m32950copywmQWz5c$default(c14471a.m32977getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), w82.m32950copywmQWz5c$default(c14471a.m32977getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @p000.fdi
    @p000.hk2
    @p000.ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ContextMenuColumn(@p000.yfb p000.qx2 r23, @p000.gib androidx.compose.p002ui.InterfaceC0701e r24, @p000.yfb p000.kz6<? super p000.bb2, ? super p000.zl2, ? super java.lang.Integer, p000.bth> r25, @p000.gib p000.zl2 r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zx2.ContextMenuColumn(qx2, androidx.compose.ui.e, kz6, zl2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0189  */
    @p000.fdi
    @p000.igg({"ComposableLambdaParameterPosition"})
    @p000.hk2
    @p000.ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ContextMenuItem(@p000.yfb java.lang.String r30, boolean r31, @p000.yfb p000.qx2 r32, @p000.gib androidx.compose.p002ui.InterfaceC0701e r33, @p000.gib p000.kz6<? super p000.w82, ? super p000.zl2, ? super java.lang.Integer, p000.bth> r34, @p000.yfb p000.ny6<p000.bth> r35, @p000.gib p000.zl2 r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zx2.ContextMenuItem(java.lang.String, boolean, qx2, androidx.compose.ui.e, kz6, ny6, zl2, int, int):void");
    }

    @bl2(applier = "androidx.compose.ui.UiComposable")
    @hk2
    public static final void ContextMenuPopup(@yfb x4d x4dVar, @yfb ny6<bth> ny6Var, @gib InterfaceC0701e interfaceC0701e, @yfb qy6<? super vx2, bth> qy6Var, @gib zl2 zl2Var, int i, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(712057293);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (zl2VarStartRestartGroup.changed(x4dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= zl2VarStartRestartGroup.changedInstance(ny6Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= zl2VarStartRestartGroup.changed(interfaceC0701e) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= kw1.f55470l;
        } else if ((i & kw1.f55470l) == 0) {
            i3 |= zl2VarStartRestartGroup.changedInstance(qy6Var) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                interfaceC0701e = InterfaceC0701e.f5158d1;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(712057293, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:103)");
            }
            ContextMenuPopup(x4dVar, ny6Var, interfaceC0701e, computeContextMenuColors(0, 0, zl2VarStartRestartGroup, 0, 3), qy6Var, zl2VarStartRestartGroup, (i3 & 1022) | ((i3 << 3) & 57344), 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        InterfaceC0701e interfaceC0701e2 = interfaceC0701e;
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C16295d(x4dVar, ny6Var, interfaceC0701e2, qy6Var, i, i2));
        }
    }

    @yfb
    @fdi
    @hk2
    public static final qx2 computeContextMenuColors(@dbg int i, @dbg int i2, @gib zl2 zl2Var, int i3, int i4) {
        int i5 = (i4 & 1) != 0 ? R.style.Widget.PopupMenu : i;
        int i6 = (i4 & 2) != 0 ? R.style.TextAppearance.Widget.PopupMenu.Large : i2;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1689505294, i3, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:354)");
        }
        Context context = (Context) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        boolean zChanged = zl2Var.changed((Configuration) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())) | zl2Var.changed(context);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            qx2 qx2Var = f106270c;
            long jM33575resolveColorg2O1Hgs = m33575resolveColorg2O1Hgs(context, i5, R.attr.colorBackground, qx2Var.m32049getBackgroundColor0d7_KjU());
            ColorStateList colorStateListResolveColorStateList = resolveColorStateList(context, i6, R.attr.textColorPrimary);
            long jM33574enabledColor4WTKRHQ = m33574enabledColor4WTKRHQ(colorStateListResolveColorStateList, qx2Var.m32053getTextColor0d7_KjU());
            long jM33573disabledColor4WTKRHQ = m33573disabledColor4WTKRHQ(colorStateListResolveColorStateList, qx2Var.m32051getDisabledTextColor0d7_KjU());
            objRememberedValue = new qx2(jM33575resolveColorg2O1Hgs, jM33574enabledColor4WTKRHQ, jM33574enabledColor4WTKRHQ, jM33573disabledColor4WTKRHQ, jM33573disabledColor4WTKRHQ, null);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        qx2 qx2Var2 = (qx2) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return qx2Var2;
    }

    /* JADX INFO: renamed from: disabledColor-4WTKRHQ, reason: not valid java name */
    private static final long m33573disabledColor4WTKRHQ(ColorStateList colorStateList, long j) {
        int iM30490toArgb8_81llA = j92.m30490toArgb8_81llA(j);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iM30490toArgb8_81llA)) : null;
        return (numValueOf == null || numValueOf.intValue() == iM30490toArgb8_81llA) ? j : j92.Color(numValueOf.intValue());
    }

    /* JADX INFO: renamed from: enabledColor-4WTKRHQ, reason: not valid java name */
    private static final long m33574enabledColor4WTKRHQ(ColorStateList colorStateList, long j) {
        int iM30490toArgb8_81llA = j92.m30490toArgb8_81llA(j);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{16842910}, iM30490toArgb8_81llA)) : null;
        return (numValueOf == null || numValueOf.intValue() == iM30490toArgb8_81llA) ? j : j92.Color(numValueOf.intValue());
    }

    @yfb
    public static final qx2 getDefaultContextMenuColors() {
        return f106270c;
    }

    @fdi
    public static /* synthetic */ void getDefaultContextMenuColors$annotations() {
    }

    /* JADX INFO: renamed from: resolveColor-g2O1Hgs, reason: not valid java name */
    private static final long m33575resolveColorg2O1Hgs(Context context, @dbg int i, @gc0 int i2, long j) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
        int iM30490toArgb8_81llA = j92.m30490toArgb8_81llA(j);
        int color = typedArrayObtainStyledAttributes.getColor(0, iM30490toArgb8_81llA);
        typedArrayObtainStyledAttributes.recycle();
        return color == iM30490toArgb8_81llA ? j : j92.Color(color);
    }

    private static final ColorStateList resolveColorStateList(Context context, @dbg int i, @gc0 int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.fdi
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ContextMenuPopup(@p000.yfb p000.x4d r16, @p000.yfb p000.ny6<p000.bth> r17, @p000.gib androidx.compose.p002ui.InterfaceC0701e r18, @p000.yfb p000.qx2 r19, @p000.yfb p000.qy6<? super p000.vx2, p000.bth> r20, @p000.gib p000.zl2 r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zx2.ContextMenuPopup(x4d, ny6, androidx.compose.ui.e, qx2, qy6, zl2, int, int):void");
    }
}
