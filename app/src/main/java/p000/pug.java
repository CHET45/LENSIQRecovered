package p000;

import androidx.compose.foundation.C0589d;
import androidx.compose.foundation.C0594f;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.mediarouter.media.C1340j;
import java.util.Arrays;
import java.util.List;
import p000.C9041lz;
import p000.b79;
import p000.n8c;
import p000.zl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextLinkScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLinkScope.kt\nandroidx/compose/foundation/text/TextLinkScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,284:1\n33#2,6:285\n33#2,4:295\n38#2:318\n33#2,6:320\n81#3:291\n107#3,2:292\n81#3:332\n81#3:333\n81#3:334\n77#4:294\n1#5:299\n1223#6,6:300\n1223#6,6:306\n1223#6,6:312\n1223#6,6:326\n1240#7:319\n*S KotlinDebug\n*F\n+ 1 TextLinkScope.kt\nandroidx/compose/foundation/text/TextLinkScope\n*L\n73#1:285,6\n157#1:295,4\n157#1:318\n228#1:320,6\n67#1:291\n67#1:292,2\n174#1:332\n175#1:333\n176#1:334\n154#1:294\n160#1:300,6\n170#1:306,6\n186#1:312,6\n239#1:326,6\n225#1:319\n*E\n"})
@e0g(parameters = 0)
public final class pug {

    /* JADX INFO: renamed from: e */
    public static final int f72164e = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C9041lz f72165a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final z6b f72166b = xtf.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: c */
    @yfb
    public C9041lz f72167c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final ytf<qy6<hqg, bth>> f72168d;

    /* JADX INFO: renamed from: pug$a */
    public static final class C11133a extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C9041lz.c<b79> f72170b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ wxh f72171c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11133a(C9041lz.c<b79> cVar, wxh wxhVar) {
            super(0);
            this.f72170b = cVar;
            this.f72171c = wxhVar;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            pug.this.handleLink(this.f72170b.getItem(), this.f72171c);
        }
    }

    /* JADX INFO: renamed from: pug$b */
    public static final class C11134b extends tt8 implements qy6<hqg, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C9041lz.c<b79> f72173b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ i2g<Boolean> f72174c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ i2g<Boolean> f72175d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ i2g<Boolean> f72176e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11134b(C9041lz.c<b79> cVar, i2g<Boolean> i2gVar, i2g<Boolean> i2gVar2, i2g<Boolean> i2gVar3) {
            super(1);
            this.f72173b = cVar;
            this.f72174c = i2gVar;
            this.f72175d = i2gVar2;
            this.f72176e = i2gVar3;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(hqg hqgVar) {
            invoke2(hqgVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb hqg hqgVar) {
            rug styles;
            rug styles2;
            rug styles3;
            pug pugVar = pug.this;
            rug styles4 = this.f72173b.getItem().getStyles();
            swf pressedStyle = null;
            swf swfVarMergeOrUse = pugVar.mergeOrUse(pugVar.mergeOrUse(styles4 != null ? styles4.getStyle() : null, (!pug.LinksComposables$lambda$13$lambda$10(this.f72174c) || (styles3 = this.f72173b.getItem().getStyles()) == null) ? null : styles3.getFocusedStyle()), (!pug.LinksComposables$lambda$13$lambda$9(this.f72175d) || (styles2 = this.f72173b.getItem().getStyles()) == null) ? null : styles2.getHoveredStyle());
            if (pug.LinksComposables$lambda$13$lambda$11(this.f72176e) && (styles = this.f72173b.getItem().getStyles()) != null) {
                pressedStyle = styles.getPressedStyle();
            }
            swf swfVarMergeOrUse2 = pugVar.mergeOrUse(swfVarMergeOrUse, pressedStyle);
            if (swfVarMergeOrUse2 != null) {
                C9041lz.c<b79> cVar = this.f72173b;
                hqgVar.replaceStyle(swfVarMergeOrUse2, cVar.getStart(), cVar.getEnd());
            }
        }
    }

    /* JADX INFO: renamed from: pug$c */
    public static final class C11135c extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f72178b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11135c(int i) {
            super(2);
            this.f72178b = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            pug.this.LinksComposables(zl2Var, tsd.updateChangedFlags(this.f72178b | 1));
        }
    }

    /* JADX INFO: renamed from: pug$d */
    @dwf({"SMAP\nTextLinkScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLinkScope.kt\nandroidx/compose/foundation/text/TextLinkScope$StyleAnnotation$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,284:1\n64#2,5:285\n*S KotlinDebug\n*F\n+ 1 TextLinkScope.kt\nandroidx/compose/foundation/text/TextLinkScope$StyleAnnotation$1$1\n*L\n241#1:285,5\n*E\n"})
    public static final class C11136d extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<hqg, bth> f72180b;

        /* JADX INFO: renamed from: pug$d$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 TextLinkScope.kt\nandroidx/compose/foundation/text/TextLinkScope$StyleAnnotation$1$1\n*L\n1#1,497:1\n242#2,2:498\n*E\n"})
        public static final class a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ pug f72181a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ qy6 f72182b;

            public a(pug pugVar, qy6 qy6Var) {
                this.f72181a = pugVar;
                this.f72182b = qy6Var;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f72181a.f72168d.remove(this.f72182b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11136d(qy6<? super hqg, bth> qy6Var) {
            super(1);
            this.f72180b = qy6Var;
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            pug.this.f72168d.add(this.f72180b);
            return new a(pug.this, this.f72180b);
        }
    }

    /* JADX INFO: renamed from: pug$e */
    public static final class C11137e extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object[] f72184b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<hqg, bth> f72185c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f72186d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11137e(Object[] objArr, qy6<? super hqg, bth> qy6Var, int i) {
            super(2);
            this.f72184b = objArr;
            this.f72185c = qy6Var;
            this.f72186d = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            pug pugVar = pug.this;
            Object[] objArr = this.f72184b;
            pugVar.StyleAnnotation(Arrays.copyOf(objArr, objArr.length), this.f72185c, zl2Var, tsd.updateChangedFlags(this.f72186d | 1));
        }
    }

    /* JADX INFO: renamed from: pug$f */
    public static final class C11138f implements m8f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vic f72187a;

        public C11138f(vic vicVar) {
            this.f72187a = vicVar;
        }

        @Override // p000.m8f
        @yfb
        /* JADX INFO: renamed from: createOutline-Pq9zytI */
        public n8c mo27947createOutlinePq9zytI(long j, @yfb ov8 ov8Var, @yfb c64 c64Var) {
            return new n8c.C9741a(this.f72187a);
        }
    }

    /* JADX INFO: renamed from: pug$g */
    public static final class C11139g extends tt8 implements ny6<Boolean> {
        public C11139g() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            gug layoutInput;
            C9041lz text$foundation_release = pug.this.getText$foundation_release();
            hug textLayoutResult = pug.this.getTextLayoutResult();
            return Boolean.valueOf(md8.areEqual(text$foundation_release, (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null) ? null : layoutInput.getText()));
        }
    }

    /* JADX INFO: renamed from: pug$h */
    public static final class C11140h extends tt8 implements ny6<a78> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l78 f72189a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11140h(l78 l78Var) {
            super(0);
            this.f72189a = l78Var;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ a78 invoke() {
            return a78.m27192boximpl(m31870invokenOccac());
        }

        /* JADX INFO: renamed from: invoke-nOcc-ac, reason: not valid java name */
        public final long m31870invokenOccac() {
            return this.f72189a.m30828getTopLeftnOccac();
        }
    }

    /* JADX INFO: renamed from: pug$i */
    public static final class C11141i extends tt8 implements ny6<a78> {

        /* JADX INFO: renamed from: a */
        public static final C11141i f72190a = new C11141i();

        public C11141i() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ a78 invoke() {
            return a78.m27192boximpl(m31871invokenOccac());
        }

        /* JADX INFO: renamed from: invoke-nOcc-ac, reason: not valid java name */
        public final long m31871invokenOccac() {
            return a78.f545b.m27211getZeronOccac();
        }
    }

    public pug(@yfb C9041lz c9041lz) {
        swf style;
        this.f72165a = c9041lz;
        C9041lz.a aVar = new C9041lz.a(c9041lz);
        List<C9041lz.c<b79>> linkAnnotations = c9041lz.getLinkAnnotations(0, c9041lz.length());
        int size = linkAnnotations.size();
        for (int i = 0; i < size; i++) {
            C9041lz.c<b79> cVar = linkAnnotations.get(i);
            rug styles = cVar.getItem().getStyles();
            if (styles != null && (style = styles.getStyle()) != null) {
                aVar.addStyle(style, cVar.getStart(), cVar.getEnd());
            }
        }
        this.f72167c = aVar.toAnnotatedString();
        this.f72168d = stf.mutableStateListOf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LinksComposables$lambda$13$lambda$10(i2g<Boolean> i2gVar) {
        return i2gVar.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LinksComposables$lambda$13$lambda$11(i2g<Boolean> i2gVar) {
        return i2gVar.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LinksComposables$lambda$13$lambda$9(i2g<Boolean> i2gVar) {
        return i2gVar.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @hk2
    public final void StyleAnnotation(Object[] objArr, qy6<? super hqg, bth> qy6Var, zl2 zl2Var, int i) {
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-2083052099);
        int i2 = (i & 48) == 0 ? (zl2VarStartRestartGroup.changedInstance(qy6Var) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= zl2VarStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        zl2VarStartRestartGroup.startMovableGroup(-416717687, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i2 |= zl2VarStartRestartGroup.changedInstance(obj) ? 4 : 0;
        }
        zl2VarStartRestartGroup.endMovableGroup();
        if ((i2 & 14) == 0) {
            i2 |= 2;
        }
        if ((i2 & 147) == 146 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-2083052099, i2, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:237)");
            }
            fzf fzfVar = new fzf(2);
            fzfVar.add(qy6Var);
            fzfVar.addSpread(objArr);
            Object[] array = fzfVar.toArray(new Object[fzfVar.size()]);
            boolean zChangedInstance = ((i2 & 112) == 32) | zl2VarStartRestartGroup.changedInstance(this);
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new C11136d(qy6Var);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            jx4.DisposableEffect(array, (qy6<? super wf4, ? extends vf4>) objRememberedValue, zl2VarStartRestartGroup, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C11137e(objArr, qy6Var, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLink(b79 b79Var, wxh wxhVar) {
        e79 linkInteractionListener;
        bth bthVar;
        if (!(b79Var instanceof b79.C1771b)) {
            if (!(b79Var instanceof b79.C1770a) || (linkInteractionListener = b79Var.getLinkInteractionListener()) == null) {
                return;
            }
            linkInteractionListener.onClick(b79Var);
            return;
        }
        e79 linkInteractionListener2 = b79Var.getLinkInteractionListener();
        if (linkInteractionListener2 != null) {
            linkInteractionListener2.onClick(b79Var);
            bthVar = bth.f14751a;
        } else {
            bthVar = null;
        }
        if (bthVar == null) {
            try {
                wxhVar.openUri(((b79.C1771b) b79Var).getUrl());
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final swf mergeOrUse(swf swfVar, swf swfVar2) {
        swf swfVarMerge;
        return (swfVar == null || (swfVarMerge = swfVar.merge(swfVar2)) == null) ? swfVar2 : swfVarMerge;
    }

    private final vic pathForRangeInRangeCoordinates(C9041lz.c<b79> cVar) {
        hug textLayoutResult;
        if (!getShouldMeasureLinks().invoke().booleanValue() || (textLayoutResult = getTextLayoutResult()) == null) {
            return null;
        }
        vic pathForRange = textLayoutResult.getPathForRange(cVar.getStart(), cVar.getEnd());
        rud boundingBox = textLayoutResult.getBoundingBox(cVar.getStart());
        pathForRange.mo28702translatek4lQ0M(izb.m30438unaryMinusF1C5BW0(mzb.Offset(textLayoutResult.getLineForOffset(cVar.getStart()) == textLayoutResult.getLineForOffset(cVar.getEnd()) ? Math.min(textLayoutResult.getBoundingBox(cVar.getEnd() - 1).getLeft(), boundingBox.getLeft()) : 0.0f, boundingBox.getTop())));
        return pathForRange;
    }

    private final m8f shapeForRange(C9041lz.c<b79> cVar) {
        vic vicVarPathForRangeInRangeCoordinates = pathForRangeInRangeCoordinates(cVar);
        if (vicVarPathForRangeInRangeCoordinates != null) {
            return new C11138f(vicVarPathForRangeInRangeCoordinates);
        }
        return null;
    }

    private final InterfaceC0701e textRange(InterfaceC0701e interfaceC0701e, final int i, final int i2) {
        return interfaceC0701e.then(new nvg(new ovg() { // from class: oug
            @Override // p000.ovg
            public final lvg measure(mvg mvgVar) {
                return pug.textRange$lambda$3(this.f68842a, i, i2, mvgVar);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lvg textRange$lambda$3(pug pugVar, int i, int i2, mvg mvgVar) {
        hug textLayoutResult = pugVar.getTextLayoutResult();
        if (textLayoutResult == null) {
            return mvgVar.layout(0, 0, C11141i.f72190a);
        }
        l78 l78VarRoundToIntRect = m78.roundToIntRect(textLayoutResult.getPathForRange(i, i2).getBounds());
        return mvgVar.layout(l78VarRoundToIntRect.getWidth(), l78VarRoundToIntRect.getHeight(), new C11140h(l78VarRoundToIntRect));
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    @bl2(applier = "androidx.compose.ui.UiComposable")
    @hk2
    public final void LinksComposables(@gib zl2 zl2Var, int i) {
        int i2;
        InterfaceC0701e interfaceC0701eClip;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(1154651354);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(1154651354, i2, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:152)");
            }
            wxh wxhVar = (wxh) zl2VarStartRestartGroup.consume(sn2.getLocalUriHandler());
            C9041lz c9041lz = this.f72167c;
            ?? r12 = 0;
            List<C9041lz.c<b79>> linkAnnotations = c9041lz.getLinkAnnotations(0, c9041lz.length());
            int size = linkAnnotations.size();
            int i4 = 0;
            while (i4 < size) {
                C9041lz.c<b79> cVar = linkAnnotations.get(i4);
                m8f m8fVarShapeForRange = shapeForRange(cVar);
                if (m8fVarShapeForRange == null || (interfaceC0701eClip = v42.clip(InterfaceC0701e.f5158d1, m8fVarShapeForRange)) == null) {
                    interfaceC0701eClip = InterfaceC0701e.f5158d1;
                }
                Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
                zl2.C16170a c16170a = zl2.f105372a;
                if (objRememberedValue == c16170a.getEmpty()) {
                    objRememberedValue = r98.MutableInteractionSource();
                    zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                l5b l5bVar = (l5b) objRememberedValue;
                InterfaceC0701e interfaceC0701ePointerHoverIcon$default = c2d.pointerHoverIcon$default(C0594f.hoverable$default(textRange(interfaceC0701eClip, cVar.getStart(), cVar.getEnd()), l5bVar, r12, i3, null), a2d.f185a.getHand(), r12, i3, null);
                boolean zChangedInstance = zl2VarStartRestartGroup.changedInstance(this) | zl2VarStartRestartGroup.changed(cVar) | zl2VarStartRestartGroup.changedInstance(wxhVar);
                Object objRememberedValue2 = zl2VarStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == c16170a.getEmpty()) {
                    objRememberedValue2 = new C11133a(cVar, wxhVar);
                    zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                pc1.Box(C0589d.m27302combinedClickableXVZzFYc(interfaceC0701ePointerHoverIcon$default, l5bVar, null, (252 & 4) != 0, (252 & 8) != 0 ? null : null, (252 & 16) != 0 ? null : null, (252 & 32) != 0 ? null : null, (252 & 64) != 0 ? null : null, (252 & 128) != 0 ? null : null, (ny6) objRememberedValue2), zl2VarStartRestartGroup, r12);
                i2g<Boolean> i2gVarCollectIsHoveredAsState = yl7.collectIsHoveredAsState(l5bVar, zl2VarStartRestartGroup, 6);
                i2g<Boolean> i2gVarCollectIsFocusedAsState = sm6.collectIsFocusedAsState(l5bVar, zl2VarStartRestartGroup, 6);
                i2g<Boolean> i2gVarCollectIsPressedAsState = sad.collectIsPressedAsState(l5bVar, zl2VarStartRestartGroup, 6);
                Boolean boolValueOf = Boolean.valueOf(LinksComposables$lambda$13$lambda$9(i2gVarCollectIsHoveredAsState));
                Boolean boolValueOf2 = Boolean.valueOf(LinksComposables$lambda$13$lambda$10(i2gVarCollectIsFocusedAsState));
                Boolean boolValueOf3 = Boolean.valueOf(LinksComposables$lambda$13$lambda$11(i2gVarCollectIsPressedAsState));
                rug styles = cVar.getItem().getStyles();
                swf style = styles != null ? styles.getStyle() : null;
                rug styles2 = cVar.getItem().getStyles();
                swf focusedStyle = styles2 != null ? styles2.getFocusedStyle() : null;
                rug styles3 = cVar.getItem().getStyles();
                swf hoveredStyle = styles3 != null ? styles3.getHoveredStyle() : null;
                rug styles4 = cVar.getItem().getStyles();
                Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, style, focusedStyle, hoveredStyle, styles4 != null ? styles4.getPressedStyle() : null};
                boolean zChangedInstance2 = zl2VarStartRestartGroup.changedInstance(this) | zl2VarStartRestartGroup.changed(cVar) | zl2VarStartRestartGroup.changed(i2gVarCollectIsFocusedAsState) | zl2VarStartRestartGroup.changed(i2gVarCollectIsHoveredAsState) | zl2VarStartRestartGroup.changed(i2gVarCollectIsPressedAsState);
                Object objRememberedValue3 = zl2VarStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == c16170a.getEmpty()) {
                    Object c11134b = new C11134b(cVar, i2gVarCollectIsFocusedAsState, i2gVarCollectIsHoveredAsState, i2gVarCollectIsPressedAsState);
                    zl2VarStartRestartGroup.updateRememberedValue(c11134b);
                    objRememberedValue3 = c11134b;
                }
                StyleAnnotation(objArr, (qy6) objRememberedValue3, zl2VarStartRestartGroup, (i2 << 6) & C1340j.f10444b);
                i4++;
                i3 = 2;
                r12 = 0;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C11135c(i));
        }
    }

    @yfb
    public final C9041lz applyAnnotators$foundation_release() {
        C9041lz annotatedString;
        if (this.f72168d.isEmpty()) {
            annotatedString = this.f72167c;
        } else {
            C9041lz.a aVar = new C9041lz.a(0, 1, null);
            aVar.append(this.f72165a);
            hqg hqgVar = new hqg(aVar);
            ytf<qy6<hqg, bth>> ytfVar = this.f72168d;
            int size = ytfVar.size();
            for (int i = 0; i < size; i++) {
                ytfVar.get(i).invoke(hqgVar);
            }
            annotatedString = aVar.toAnnotatedString();
        }
        this.f72167c = annotatedString;
        return annotatedString;
    }

    @yfb
    public final C9041lz getInitialText$foundation_release() {
        return this.f72165a;
    }

    @yfb
    public final ny6<Boolean> getShouldMeasureLinks() {
        return new C11139g();
    }

    @yfb
    public final C9041lz getText$foundation_release() {
        return this.f72167c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gib
    public final hug getTextLayoutResult() {
        return (hug) this.f72166b.getValue();
    }

    public final void setText$foundation_release(@yfb C9041lz c9041lz) {
        this.f72167c = c9041lz;
    }

    public final void setTextLayoutResult(@gib hug hugVar) {
        this.f72166b.setValue(hugVar);
    }
}
