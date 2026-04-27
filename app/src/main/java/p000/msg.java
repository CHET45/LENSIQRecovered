package p000;

import androidx.compose.foundation.gestures.C0608g;
import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.mediarouter.media.C1333c;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,371:1\n135#2:372\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n61#1:372\n*E\n"})
public final class msg {

    /* JADX INFO: renamed from: msg$a */
    public /* synthetic */ class C9502a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f61962a;

        static {
            int[] iArr = new int[t7c.values().length];
            try {
                iArr[t7c.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t7c.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f61962a = iArr;
        }
    }

    /* JADX INFO: renamed from: msg$b */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n1#1,178:1\n62#2,5:179\n*E\n"})
    public static final class C9503b extends tt8 implements qy6<f58, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ nsg f61963a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ l5b f61964b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f61965c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9503b(nsg nsgVar, l5b l5bVar, boolean z) {
            super(1);
            this.f61963a = nsgVar;
            this.f61964b = l5bVar;
            this.f61965c = z;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("textFieldScrollable");
            f58Var.getProperties().set("scrollerPosition", this.f61963a);
            f58Var.getProperties().set("interactionSource", this.f61964b);
            f58Var.getProperties().set(C1333c.f10210i, Boolean.valueOf(this.f61965c));
        }
    }

    /* JADX INFO: renamed from: msg$c */
    @dwf({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,371:1\n77#2:372\n1223#3,6:373\n1223#3,6:379\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n*L\n69#1:372\n71#1:373,6\n84#1:379,6\n*E\n"})
    public static final class C9504c extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ nsg f61966a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f61967b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ l5b f61968c;

        /* JADX INFO: renamed from: msg$c$a */
        public static final class a extends tt8 implements qy6<Float, Float> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ nsg f61969a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(nsg nsgVar) {
                super(1);
                this.f61969a = nsgVar;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ Float invoke(Float f) {
                return invoke(f.floatValue());
            }

            @yfb
            public final Float invoke(float f) {
                float offset = this.f61969a.getOffset() + f;
                if (offset > this.f61969a.getMaximum()) {
                    f = this.f61969a.getMaximum() - this.f61969a.getOffset();
                } else if (offset < 0.0f) {
                    f = -this.f61969a.getOffset();
                }
                nsg nsgVar = this.f61969a;
                nsgVar.setOffset(nsgVar.getOffset() + f);
                return Float.valueOf(f);
            }
        }

        /* JADX INFO: renamed from: msg$c$b */
        @dwf({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,371:1\n81#2:372\n81#2:373\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1\n*L\n86#1:372\n89#1:373\n*E\n"})
        public static final class b implements ase {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ase f61970a;

            /* JADX INFO: renamed from: b */
            @yfb
            public final i2g f61971b;

            /* JADX INFO: renamed from: c */
            @yfb
            public final i2g f61972c;

            /* JADX INFO: renamed from: msg$c$b$a */
            public static final class a extends tt8 implements ny6<Boolean> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ nsg f61973a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(nsg nsgVar) {
                    super(0);
                    this.f61973a = nsgVar;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.ny6
                @yfb
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f61973a.getOffset() > 0.0f);
                }
            }

            /* JADX INFO: renamed from: msg$c$b$b, reason: collision with other inner class name */
            public static final class C16488b extends tt8 implements ny6<Boolean> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ nsg f61974a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16488b(nsg nsgVar) {
                    super(0);
                    this.f61974a = nsgVar;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.ny6
                @yfb
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f61974a.getOffset() < this.f61974a.getMaximum());
                }
            }

            public b(ase aseVar, nsg nsgVar) {
                this.f61970a = aseVar;
                this.f61971b = stf.derivedStateOf(new C16488b(nsgVar));
                this.f61972c = stf.derivedStateOf(new a(nsgVar));
            }

            @Override // p000.ase
            public float dispatchRawDelta(float f) {
                return this.f61970a.dispatchRawDelta(f);
            }

            @Override // p000.ase
            public boolean getCanScrollBackward() {
                return ((Boolean) this.f61972c.getValue()).booleanValue();
            }

            @Override // p000.ase
            public boolean getCanScrollForward() {
                return ((Boolean) this.f61971b.getValue()).booleanValue();
            }

            @Override // p000.ase
            public boolean getLastScrolledBackward() {
                return this.f61970a.getLastScrolledBackward();
            }

            @Override // p000.ase
            public boolean getLastScrolledForward() {
                return this.f61970a.getLastScrolledForward();
            }

            @Override // p000.ase
            public boolean isScrollInProgress() {
                return this.f61970a.isScrollInProgress();
            }

            @Override // p000.ase
            @gib
            public Object scroll(@yfb j7b j7bVar, @yfb gz6<? super vre, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var) {
                return this.f61970a.scroll(j7bVar, gz6Var, zy2Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9504c(nsg nsgVar, boolean z, l5b l5bVar) {
            super(3);
            this.f61966a = nsgVar;
            this.f61967b = z;
            this.f61968c = l5bVar;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(805428266);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(805428266, i, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:68)");
            }
            boolean z = this.f61966a.getOrientation() == t7c.Vertical || !(zl2Var.consume(sn2.getLocalLayoutDirection()) == ov8.Rtl);
            boolean zChanged = zl2Var.changed(this.f61966a);
            nsg nsgVar = this.f61966a;
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new a(nsgVar);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            ase aseVarRememberScrollableState = bse.rememberScrollableState((qy6) objRememberedValue, zl2Var, 0);
            boolean zChanged2 = zl2Var.changed(aseVarRememberScrollableState) | zl2Var.changed(this.f61966a);
            nsg nsgVar2 = this.f61966a;
            Object objRememberedValue2 = zl2Var.rememberedValue();
            if (zChanged2 || objRememberedValue2 == zl2.f105372a.getEmpty()) {
                objRememberedValue2 = new b(aseVarRememberScrollableState, nsgVar2);
                zl2Var.updateRememberedValue(objRememberedValue2);
            }
            InterfaceC0701e interfaceC0701eScrollable$default = C0608g.scrollable$default(InterfaceC0701e.f5158d1, (b) objRememberedValue2, this.f61966a.getOrientation(), this.f61967b && this.f61966a.getMaximum() != 0.0f, z, null, this.f61968c, 16, null);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return interfaceC0701eScrollable$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rud getCursorRectInScroller(c64 c64Var, int i, ieh iehVar, hug hugVar, boolean z, int i2) {
        rud zero;
        if (hugVar == null || (zero = hugVar.getCursorRect(iehVar.getOffsetMapping().originalToTransformed(i))) == null) {
            zero = rud.f79687e.getZero();
        }
        rud rudVar = zero;
        int iMo27167roundToPx0680j_4 = c64Var.mo27167roundToPx0680j_4(nrg.getDefaultCursorThickness());
        return rud.copy$default(rudVar, z ? (i2 - rudVar.getLeft()) - iMo27167roundToPx0680j_4 : rudVar.getLeft(), 0.0f, z ? i2 - rudVar.getLeft() : rudVar.getLeft() + iMo27167roundToPx0680j_4, 0.0f, 10, null);
    }

    @yfb
    public static final InterfaceC0701e textFieldScroll(@yfb InterfaceC0701e interfaceC0701e, @yfb nsg nsgVar, @yfb zsg zsgVar, @yfb kdi kdiVar, @yfb ny6<iug> ny6Var) {
        InterfaceC0701e j5iVar;
        t7c orientation = nsgVar.getOrientation();
        int iM31213getOffsetToFollow5zctL8 = nsgVar.m31213getOffsetToFollow5zctL8(zsgVar.m33527getSelectiond9O1mEE());
        nsgVar.m31215setPreviousSelection5zctL8(zsgVar.m33527getSelectiond9O1mEE());
        ieh iehVarFilterWithValidation = y1i.filterWithValidation(kdiVar, zsgVar.getAnnotatedString());
        int i = C9502a.f61962a[orientation.ordinal()];
        if (i == 1) {
            j5iVar = new j5i(nsgVar, iM31213getOffsetToFollow5zctL8, iehVarFilterWithValidation, ny6Var);
        } else {
            if (i != 2) {
                throw new ceb();
            }
            j5iVar = new ol7(nsgVar, iM31213getOffsetToFollow5zctL8, iehVarFilterWithValidation, ny6Var);
        }
        return v42.clipToBounds(interfaceC0701e).then(j5iVar);
    }

    @yfb
    public static final InterfaceC0701e textFieldScrollable(@yfb InterfaceC0701e interfaceC0701e, @yfb nsg nsgVar, @gib l5b l5bVar, boolean z) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C9503b(nsgVar, l5bVar, z) : c58.getNoInspectorInfo(), new C9504c(nsgVar, z, l5bVar));
    }

    public static /* synthetic */ InterfaceC0701e textFieldScrollable$default(InterfaceC0701e interfaceC0701e, nsg nsgVar, l5b l5bVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            l5bVar = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return textFieldScrollable(interfaceC0701e, nsgVar, l5bVar, z);
    }
}
