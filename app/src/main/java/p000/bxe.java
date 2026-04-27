package p000;

import android.view.KeyEvent;
import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import org.opencv.videoio.Videoio;
import p000.ay2;
import p000.zl2;

/* JADX INFO: loaded from: classes.dex */
public final class bxe {

    /* JADX INFO: renamed from: bxe$a */
    @dwf({"SMAP\nSelectionManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.android.kt\nandroidx/compose/foundation/text/selection/SelectionManager_androidKt$contextMenuBuilder$1\n+ 2 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n*L\n1#1,89:1\n99#2,5:90\n99#2,5:95\n*S KotlinDebug\n*F\n+ 1 SelectionManager.android.kt\nandroidx/compose/foundation/text/selection/SelectionManager_androidKt$contextMenuBuilder$1\n*L\n77#1:90,5\n82#1:95,5\n*E\n"})
    public static final class C2097a extends tt8 implements qy6<vx2, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xx2 f15172a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zwe f15173b;

        /* JADX INFO: renamed from: bxe$a$a */
        @dwf({"SMAP\nContextMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt$TextItem$2\n+ 2 SelectionManager.android.kt\nandroidx/compose/foundation/text/selection/SelectionManager_androidKt$contextMenuBuilder$1\n*L\n1#1,104:1\n81#2:105\n*E\n"})
        public static final class a extends tt8 implements ny6<bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ xx2 f15174a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zwe f15175b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(xx2 xx2Var, zwe zweVar) {
                super(0);
                this.f15174a = xx2Var;
                this.f15175b = zweVar;
            }

            @Override // p000.ny6
            public /* bridge */ /* synthetic */ bth invoke() {
                invoke2();
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f15175b.copy$foundation_release();
                yx2.close(this.f15174a);
            }
        }

        /* JADX INFO: renamed from: bxe$a$b */
        @dwf({"SMAP\nContextMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt$TextItem$2\n+ 2 SelectionManager.android.kt\nandroidx/compose/foundation/text/selection/SelectionManager_androidKt$contextMenuBuilder$1\n*L\n1#1,104:1\n86#2:105\n*E\n"})
        public static final class b extends tt8 implements ny6<bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ xx2 f15176a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zwe f15177b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(xx2 xx2Var, zwe zweVar) {
                super(0);
                this.f15176a = xx2Var;
                this.f15177b = zweVar;
            }

            @Override // p000.ny6
            public /* bridge */ /* synthetic */ bth invoke() {
                invoke2();
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f15177b.selectAll$foundation_release();
                yx2.close(this.f15176a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2097a(xx2 xx2Var, zwe zweVar) {
            super(1);
            this.f15172a = xx2Var;
            this.f15173b = zweVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(vx2 vx2Var) {
            invoke2(vx2Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb vx2 vx2Var) {
            xx2 xx2Var = this.f15172a;
            vx2.item$default(vx2Var, new ay2.C1659g(pqg.Copy), null, this.f15173b.isNonEmptySelection$foundation_release(), null, new a(xx2Var, this.f15173b), 10, null);
            bth bthVar = bth.f14751a;
            xx2 xx2Var2 = this.f15172a;
            vx2.item$default(vx2Var, new ay2.C1659g(pqg.SelectAll), null, !this.f15173b.isEntireContainerSelected$foundation_release(), null, new b(xx2Var2, this.f15173b), 10, null);
            l82.listOf((Object[]) new bth[]{bthVar, bthVar});
        }
    }

    /* JADX INFO: renamed from: bxe$b */
    @dwf({"SMAP\nSelectionManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.android.kt\nandroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,89:1\n77#2:90\n1223#3,6:91\n1223#3,6:97\n1223#3,6:103\n81#4:109\n107#4,2:110\n*S KotlinDebug\n*F\n+ 1 SelectionManager.android.kt\nandroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1\n*L\n50#1:90\n51#1:91,6\n53#1:97,6\n56#1:103,6\n51#1:109\n51#1:110,2\n*E\n"})
    public static final class C2098b extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zwe f15178a;

        /* JADX INFO: renamed from: bxe$b$a */
        public static final class a extends tt8 implements ny6<izb> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ zwe f15179a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ z6b<r78> f15180b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zwe zweVar, z6b<r78> z6bVar) {
                super(0);
                this.f15179a = zweVar;
                this.f15180b = z6bVar;
            }

            @Override // p000.ny6
            public /* bridge */ /* synthetic */ izb invoke() {
                return izb.m30418boximpl(m28177invokeF1C5BW0());
            }

            /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
            public final long m28177invokeF1C5BW0() {
                return axe.m27905calculateSelectionMagnifierCenterAndroidO0kMr_c(this.f15179a, C2098b.invoke$lambda$1(this.f15180b));
            }
        }

        /* JADX INFO: renamed from: bxe$b$b */
        public static final class b extends tt8 implements qy6<ny6<? extends izb>, InterfaceC0701e> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ c64 f15181a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ z6b<r78> f15182b;

            /* JADX INFO: renamed from: bxe$b$b$a */
            public static final class a extends tt8 implements qy6<c64, izb> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ny6<izb> f15183a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(ny6<izb> ny6Var) {
                    super(1);
                    this.f15183a = ny6Var;
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ izb invoke(c64 c64Var) {
                    return izb.m30418boximpl(m28178invoketuRUvjQ(c64Var));
                }

                /* JADX INFO: renamed from: invoke-tuRUvjQ, reason: not valid java name */
                public final long m28178invoketuRUvjQ(@yfb c64 c64Var) {
                    return this.f15183a.invoke().m30439unboximpl();
                }
            }

            /* JADX INFO: renamed from: bxe$b$b$b, reason: collision with other inner class name */
            public static final class C16414b extends tt8 implements qy6<pn4, bth> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ c64 f15184a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ z6b<r78> f15185b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16414b(c64 c64Var, z6b<r78> z6bVar) {
                    super(1);
                    this.f15184a = c64Var;
                    this.f15185b = z6bVar;
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ bth invoke(pn4 pn4Var) {
                    m28179invokeEaSLcWc(pn4Var.m31823unboximpl());
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke-EaSLcWc, reason: not valid java name */
                public final void m28179invokeEaSLcWc(long j) {
                    z6b<r78> z6bVar = this.f15185b;
                    c64 c64Var = this.f15184a;
                    C2098b.invoke$lambda$2(z6bVar, s78.IntSize(c64Var.mo27167roundToPx0680j_4(pn4.m31815getWidthD9Ej5fM(j)), c64Var.mo27167roundToPx0680j_4(pn4.m31813getHeightD9Ej5fM(j))));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c64 c64Var, z6b<r78> z6bVar) {
                super(1);
                this.f15181a = c64Var;
                this.f15182b = z6bVar;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ InterfaceC0701e invoke(ny6<? extends izb> ny6Var) {
                return invoke2((ny6<izb>) ny6Var);
            }

            @yfb
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final InterfaceC0701e invoke2(@yfb ny6<izb> ny6Var) {
                return vq9.m32794magnifierjPUL71Q$default(InterfaceC0701e.f5158d1, new a(ny6Var), null, new C16414b(this.f15181a, this.f15182b), 0.0f, true, 0L, 0.0f, 0.0f, false, jxc.f52195a.getForCurrentPlatform(), Videoio.CAP_PROP_XI_CC_MATRIX_23, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2098b(zwe zweVar) {
            super(3);
            this.f15178a = zweVar;
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
            zl2Var.startReplaceGroup(-1914520728);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1914520728, i, -1, "androidx.compose.foundation.text.selection.selectionMagnifier.<anonymous> (SelectionManager.android.kt:49)");
            }
            c64 c64Var = (c64) zl2Var.consume(sn2.getLocalDensity());
            Object objRememberedValue = zl2Var.rememberedValue();
            zl2.C16170a c16170a = zl2.f105372a;
            if (objRememberedValue == c16170a.getEmpty()) {
                objRememberedValue = xtf.mutableStateOf$default(r78.m32079boximpl(r78.f77324b.m32092getZeroYbymL2g()), null, 2, null);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            z6b z6bVar = (z6b) objRememberedValue;
            boolean zChangedInstance = zl2Var.changedInstance(this.f15178a);
            zwe zweVar = this.f15178a;
            Object objRememberedValue2 = zl2Var.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == c16170a.getEmpty()) {
                objRememberedValue2 = new a(zweVar, z6bVar);
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
    public static final qy6<vx2, bth> contextMenuBuilder(@yfb zwe zweVar, @yfb xx2 xx2Var) {
        return new C2097a(xx2Var, zweVar);
    }

    /* JADX INFO: renamed from: isCopyKeyEvent-ZmokQxo, reason: not valid java name */
    public static final boolean m28176isCopyKeyEventZmokQxo(@yfb KeyEvent keyEvent) {
        return br8.getPlatformDefaultKeyMapping().mo27875mapZmokQxo(keyEvent) == hq8.COPY;
    }

    @yfb
    public static final InterfaceC0701e selectionMagnifier(@yfb InterfaceC0701e interfaceC0701e, @yfb zwe zweVar) {
        return !vq9.isPlatformMagnifierSupported$default(0, 1, null) ? interfaceC0701e : C0696c.composed$default(interfaceC0701e, null, new C2098b(zweVar), 1, null);
    }
}
