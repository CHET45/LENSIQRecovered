package p000;

import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import org.opencv.videoio.Videoio;
import p000.ay2;
import p000.zl2;

/* JADX INFO: loaded from: classes.dex */
public final class qsg {

    /* JADX INFO: renamed from: qsg$a */
    @dwf({"SMAP\nTextFieldSelectionManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$contextMenuBuilder$1\n+ 2 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n*L\n1#1,97:1\n99#2,5:98\n99#2,5:103\n99#2,5:108\n99#2,5:113\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$contextMenuBuilder$1\n*L\n76#1:98,5\n81#1:103,5\n86#1:108,5\n91#1:113,5\n*E\n"})
    public static final class C11670a extends tt8 implements qy6<vx2, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ osg f75536a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ xx2 f75537b;

        /* JADX INFO: renamed from: qsg$a$a */
        @dwf({"SMAP\nContextMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt$TextItem$2\n+ 2 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$contextMenuBuilder$1\n*L\n1#1,104:1\n80#2:105\n*E\n"})
        public static final class a extends tt8 implements ny6<bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ xx2 f75538a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ osg f75539b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(xx2 xx2Var, osg osgVar) {
                super(0);
                this.f75538a = xx2Var;
                this.f75539b = osgVar;
            }

            @Override // p000.ny6
            public /* bridge */ /* synthetic */ bth invoke() {
                invoke2();
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f75539b.cut$foundation_release();
                yx2.close(this.f75538a);
            }
        }

        /* JADX INFO: renamed from: qsg$a$b */
        @dwf({"SMAP\nContextMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt$TextItem$2\n+ 2 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$contextMenuBuilder$1\n*L\n1#1,104:1\n85#2:105\n*E\n"})
        public static final class b extends tt8 implements ny6<bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ xx2 f75540a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ osg f75541b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(xx2 xx2Var, osg osgVar) {
                super(0);
                this.f75540a = xx2Var;
                this.f75541b = osgVar;
            }

            @Override // p000.ny6
            public /* bridge */ /* synthetic */ bth invoke() {
                invoke2();
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f75541b.copy$foundation_release(false);
                yx2.close(this.f75540a);
            }
        }

        /* JADX INFO: renamed from: qsg$a$c */
        @dwf({"SMAP\nContextMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt$TextItem$2\n+ 2 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$contextMenuBuilder$1\n*L\n1#1,104:1\n90#2:105\n*E\n"})
        public static final class c extends tt8 implements ny6<bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ xx2 f75542a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ osg f75543b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(xx2 xx2Var, osg osgVar) {
                super(0);
                this.f75542a = xx2Var;
                this.f75543b = osgVar;
            }

            @Override // p000.ny6
            public /* bridge */ /* synthetic */ bth invoke() {
                invoke2();
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f75543b.paste$foundation_release();
                yx2.close(this.f75542a);
            }
        }

        /* JADX INFO: renamed from: qsg$a$d */
        @dwf({"SMAP\nContextMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt$TextItem$2\n+ 2 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$contextMenuBuilder$1\n*L\n1#1,104:1\n95#2:105\n*E\n"})
        public static final class d extends tt8 implements ny6<bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ xx2 f75544a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ osg f75545b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(xx2 xx2Var, osg osgVar) {
                super(0);
                this.f75544a = xx2Var;
                this.f75545b = osgVar;
            }

            @Override // p000.ny6
            public /* bridge */ /* synthetic */ bth invoke() {
                invoke2();
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f75545b.selectAll$foundation_release();
                yx2.close(this.f75544a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11670a(osg osgVar, xx2 xx2Var) {
            super(1);
            this.f75536a = osgVar;
            this.f75537b = xx2Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(vx2 vx2Var) {
            invoke2(vx2Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb vx2 vx2Var) {
            a52 clipboardManager$foundation_release;
            boolean z = this.f75536a.getVisualTransformation$foundation_release() instanceof tic;
            boolean zM30587getCollapsedimpl = jvg.m30587getCollapsedimpl(this.f75536a.getValue$foundation_release().m33527getSelectiond9O1mEE());
            xx2 xx2Var = this.f75537b;
            vx2.item$default(vx2Var, new ay2.C1659g(pqg.Cut), null, (zM30587getCollapsedimpl || !this.f75536a.getEditable() || z) ? false : true, null, new a(xx2Var, this.f75536a), 10, null);
            xx2 xx2Var2 = this.f75537b;
            vx2.item$default(vx2Var, new ay2.C1659g(pqg.Copy), null, (zM30587getCollapsedimpl || z) ? false : true, null, new b(xx2Var2, this.f75536a), 10, null);
            xx2 xx2Var3 = this.f75537b;
            vx2.item$default(vx2Var, new ay2.C1659g(pqg.Paste), null, this.f75536a.getEditable() && (clipboardManager$foundation_release = this.f75536a.getClipboardManager$foundation_release()) != null && clipboardManager$foundation_release.hasText(), null, new c(xx2Var3, this.f75536a), 10, null);
            xx2 xx2Var4 = this.f75537b;
            vx2.item$default(vx2Var, new ay2.C1659g(pqg.SelectAll), null, jvg.m30589getLengthimpl(this.f75536a.getValue$foundation_release().m33527getSelectiond9O1mEE()) != this.f75536a.getValue$foundation_release().getText().length(), null, new d(xx2Var4, this.f75536a), 10, null);
        }
    }

    /* JADX INFO: renamed from: qsg$b */
    @dwf({"SMAP\nTextFieldSelectionManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,97:1\n77#2:98\n1223#3,6:99\n1223#3,6:105\n1223#3,6:111\n81#4:117\n107#4,2:118\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n*L\n49#1:98\n50#1:99,6\n52#1:105,6\n55#1:111,6\n50#1:117\n50#1:118,2\n*E\n"})
    public static final class C11671b extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ osg f75546a;

        /* JADX INFO: renamed from: qsg$b$a */
        public static final class a extends tt8 implements ny6<izb> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ osg f75547a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ z6b<r78> f75548b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(osg osgVar, z6b<r78> z6bVar) {
                super(0);
                this.f75547a = osgVar;
                this.f75548b = z6bVar;
            }

            @Override // p000.ny6
            public /* bridge */ /* synthetic */ izb invoke() {
                return izb.m30418boximpl(m31997invokeF1C5BW0());
            }

            /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
            public final long m31997invokeF1C5BW0() {
                return psg.m31867calculateSelectionMagnifierCenterAndroidO0kMr_c(this.f75547a, C11671b.invoke$lambda$1(this.f75548b));
            }
        }

        /* JADX INFO: renamed from: qsg$b$b */
        public static final class b extends tt8 implements qy6<ny6<? extends izb>, InterfaceC0701e> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ c64 f75549a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ z6b<r78> f75550b;

            /* JADX INFO: renamed from: qsg$b$b$a */
            public static final class a extends tt8 implements qy6<c64, izb> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ny6<izb> f75551a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(ny6<izb> ny6Var) {
                    super(1);
                    this.f75551a = ny6Var;
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ izb invoke(c64 c64Var) {
                    return izb.m30418boximpl(m31998invoketuRUvjQ(c64Var));
                }

                /* JADX INFO: renamed from: invoke-tuRUvjQ, reason: not valid java name */
                public final long m31998invoketuRUvjQ(@yfb c64 c64Var) {
                    return this.f75551a.invoke().m30439unboximpl();
                }
            }

            /* JADX INFO: renamed from: qsg$b$b$b, reason: collision with other inner class name */
            public static final class C16506b extends tt8 implements qy6<pn4, bth> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ c64 f75552a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ z6b<r78> f75553b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16506b(c64 c64Var, z6b<r78> z6bVar) {
                    super(1);
                    this.f75552a = c64Var;
                    this.f75553b = z6bVar;
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ bth invoke(pn4 pn4Var) {
                    m31999invokeEaSLcWc(pn4Var.m31823unboximpl());
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke-EaSLcWc, reason: not valid java name */
                public final void m31999invokeEaSLcWc(long j) {
                    z6b<r78> z6bVar = this.f75553b;
                    c64 c64Var = this.f75552a;
                    C11671b.invoke$lambda$2(z6bVar, s78.IntSize(c64Var.mo27167roundToPx0680j_4(pn4.m31815getWidthD9Ej5fM(j)), c64Var.mo27167roundToPx0680j_4(pn4.m31813getHeightD9Ej5fM(j))));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c64 c64Var, z6b<r78> z6bVar) {
                super(1);
                this.f75549a = c64Var;
                this.f75550b = z6bVar;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ InterfaceC0701e invoke(ny6<? extends izb> ny6Var) {
                return invoke2((ny6<izb>) ny6Var);
            }

            @yfb
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final InterfaceC0701e invoke2(@yfb ny6<izb> ny6Var) {
                return vq9.m32794magnifierjPUL71Q$default(InterfaceC0701e.f5158d1, new a(ny6Var), null, new C16506b(this.f75549a, this.f75550b), 0.0f, true, 0L, 0.0f, 0.0f, false, jxc.f52195a.getForCurrentPlatform(), Videoio.CAP_PROP_XI_CC_MATRIX_23, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11671b(osg osgVar) {
            super(3);
            this.f75546a = osgVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$1(z6b<r78> z6bVar) {
            return z6bVar.getValue().m32091unboximpl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(z6b<r78> z6bVar, long j) {
            z6bVar.setValue(r78.m32079boximpl(j));
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(1980580247);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(1980580247, i, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:48)");
            }
            c64 c64Var = (c64) zl2Var.consume(sn2.getLocalDensity());
            Object objRememberedValue = zl2Var.rememberedValue();
            zl2.C16170a c16170a = zl2.f105372a;
            if (objRememberedValue == c16170a.getEmpty()) {
                objRememberedValue = xtf.mutableStateOf$default(r78.m32079boximpl(r78.f77324b.m32092getZeroYbymL2g()), null, 2, null);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            z6b z6bVar = (z6b) objRememberedValue;
            boolean zChangedInstance = zl2Var.changedInstance(this.f75546a);
            osg osgVar = this.f75546a;
            Object objRememberedValue2 = zl2Var.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == c16170a.getEmpty()) {
                objRememberedValue2 = new a(osgVar, z6bVar);
                zl2Var.updateRememberedValue(objRememberedValue2);
            }
            ny6 ny6Var = (ny6) objRememberedValue2;
            boolean zChanged = zl2Var.changed(c64Var);
            Object objRememberedValue3 = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue3 == c16170a.getEmpty()) {
                objRememberedValue3 = new b(c64Var, z6bVar);
                zl2Var.updateRememberedValue(objRememberedValue3);
            }
            InterfaceC0701e interfaceC0701eAnimatedSelectionMagnifier = ywe.animatedSelectionMagnifier(interfaceC0701e, ny6Var, (qy6) objRememberedValue3);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return interfaceC0701eAnimatedSelectionMagnifier;
        }
    }

    @yfb
    public static final qy6<vx2, bth> contextMenuBuilder(@yfb osg osgVar, @yfb xx2 xx2Var) {
        return new C11670a(osgVar, xx2Var);
    }

    public static final boolean isShiftPressed(@yfb t1d t1dVar) {
        return false;
    }

    @yfb
    public static final InterfaceC0701e textFieldMagnifier(@yfb InterfaceC0701e interfaceC0701e, @yfb osg osgVar) {
        return !vq9.isPlatformMagnifierSupported$default(0, 1, null) ? interfaceC0701e : C0696c.composed$default(interfaceC0701e, null, new C11671b(osgVar), 1, null);
    }
}
