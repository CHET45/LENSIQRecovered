package p000;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextFieldKeyEventHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 4 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n237#1,10:284\n247#1,5:435\n318#2,2:266\n323#2:283\n314#2,6:391\n323#2:412\n314#2,6:413\n323#2:434\n261#3,15:268\n261#3,15:397\n261#3,15:419\n115#4,8:294\n123#4,8:303\n115#4,16:311\n115#4,16:327\n115#4,16:343\n115#4,16:359\n115#4,16:375\n1#5:302\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler\n*L\n112#1:284,10\n112#1:435,5\n93#1:266,2\n93#1:283\n177#1:391,6\n177#1:412\n188#1:413,6\n188#1:434\n93#1:268,15\n177#1:397,15\n188#1:419,15\n134#1:294,8\n134#1:303,8\n144#1:311,16\n152#1:327,16\n158#1:343,16\n164#1:359,16\n170#1:375,16\n*E\n"})
@e0g(parameters = 0)
public abstract class yrg {

    /* JADX INFO: renamed from: d */
    public static final int f102797d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final ksg f102798a = new ksg();

    /* JADX INFO: renamed from: b */
    @yfb
    public final rj3 f102799b = new rj3();

    /* JADX INFO: renamed from: c */
    @yfb
    public final zq8 f102800c = br8.getPlatformDefaultKeyMapping();

    /* JADX INFO: renamed from: yrg$a */
    public /* synthetic */ class C15786a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f102801a;

        static {
            int[] iArr = new int[hq8.values().length];
            try {
                iArr[hq8.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hq8.PASTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hq8.CUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[hq8.LEFT_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[hq8.RIGHT_CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[hq8.LEFT_WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[hq8.RIGHT_WORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[hq8.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[hq8.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[hq8.UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[hq8.DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[hq8.PAGE_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[hq8.PAGE_DOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[hq8.LINE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[hq8.LINE_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[hq8.LINE_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[hq8.LINE_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[hq8.HOME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[hq8.END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[hq8.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[hq8.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[hq8.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[hq8.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[hq8.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[hq8.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[hq8.NEW_LINE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[hq8.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[hq8.SELECT_ALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[hq8.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[hq8.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[hq8.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[hq8.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[hq8.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[hq8.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[hq8.SELECT_LINE_START.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[hq8.SELECT_LINE_END.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[hq8.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[hq8.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[hq8.SELECT_UP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[hq8.SELECT_DOWN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[hq8.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[hq8.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[hq8.SELECT_HOME.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[hq8.SELECT_END.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[hq8.DESELECT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[hq8.UNDO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[hq8.REDO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[hq8.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            f102801a = iArr;
        }
    }

    /* JADX INFO: renamed from: yrg$b */
    public static final class C15787b extends tt8 implements qy6<isg, bth> {

        /* JADX INFO: renamed from: a */
        public static final C15787b f102802a = new C15787b();

        public C15787b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(isg isgVar) {
            invoke2(isgVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb isg isgVar) {
            isgVar.moveCursorLeft();
        }
    }

    /* JADX INFO: renamed from: yrg$c */
    public static final class C15788c extends tt8 implements qy6<isg, bth> {

        /* JADX INFO: renamed from: a */
        public static final C15788c f102803a = new C15788c();

        public C15788c() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(isg isgVar) {
            invoke2(isgVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb isg isgVar) {
            isgVar.moveCursorRight();
        }
    }

    private final float getVisibleTextLayoutHeight(lug lugVar) {
        mv8 textLayoutNodeCoordinates = lugVar.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            rud rudVarLocalBoundingBoxOf$default = null;
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                mv8 decoratorNodeCoordinates = lugVar.getDecoratorNodeCoordinates();
                if (decoratorNodeCoordinates != null) {
                    if (!decoratorNodeCoordinates.isAttached()) {
                        decoratorNodeCoordinates = null;
                    }
                    if (decoratorNodeCoordinates != null) {
                        rudVarLocalBoundingBoxOf$default = mv8.localBoundingBoxOf$default(decoratorNodeCoordinates, textLayoutNodeCoordinates, false, 2, null);
                    }
                }
                if (rudVarLocalBoundingBoxOf$default != null) {
                    return wpf.m33066getHeightimpl(rudVarLocalBoundingBoxOf$default.m32206getSizeNHjbRc());
                }
            }
        }
        return Float.NaN;
    }

    private final void preparedSelectionContext(jeh jehVar, lug lugVar, boolean z, qy6<? super isg, bth> qy6Var) {
        isg isgVar = new isg(jehVar, lugVar.getLayoutResult(), z, getVisibleTextLayoutHeight(lugVar), this.f102798a);
        qy6Var.invoke(isgVar);
        if (jvg.m30586equalsimpl0(isgVar.m30391getSelectiond9O1mEE(), isgVar.getInitialValue().m30568getSelectiond9O1mEE())) {
            return;
        }
        jehVar.m30519selectCharsIn5zctL8(isgVar.m30391getSelectiond9O1mEE());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: onKeyEvent-6ptp14s */
    public boolean mo30410onKeyEvent6ptp14s(@yfb KeyEvent keyEvent, @yfb jeh jehVar, @yfb lug lugVar, @yfb rsg rsgVar, boolean z, boolean z2, @yfb ny6<bth> ny6Var) {
        jvg jvgVarM30581boximpl;
        Integer numM32154consumeZmokQxo;
        boolean z3 = false;
        if (!nq8.m31182equalsimpl0(oq8.m31587getTypeZmokQxo(keyEvent), nq8.f65270b.m31186getKeyDownCS__XNY())) {
            return false;
        }
        if (csg.m28542isTypedEventZmokQxo(keyEvent) && (numM32154consumeZmokQxo = this.f102799b.m32154consumeZmokQxo(keyEvent)) != null) {
            String string = v7g.appendCodePointX(new StringBuilder(2), numM32154consumeZmokQxo.intValue()).toString();
            if (!z) {
                return false;
            }
            boolean z4 = !zrg.m33514isFromSoftKeyboardZmokQxo(keyEvent);
            wsg wsgVar = jehVar.f50410a;
            g48 g48Var = jehVar.f50411b;
            urg urgVar = urg.MergeIfPossible;
            wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
            qw4 mainBuffer$foundation_release = wsgVar.getMainBuffer$foundation_release();
            mainBuffer$foundation_release.commitComposition();
            nw4.commitText(mainBuffer$foundation_release, string, 1);
            wsgVar.commitEditAsUser(g48Var, z4, urgVar);
            this.f102798a.resetCachedX();
            return true;
        }
        hq8 hq8VarMo27875mapZmokQxo = this.f102800c.mo27875mapZmokQxo(keyEvent);
        if (hq8VarMo27875mapZmokQxo != null && (!hq8VarMo27875mapZmokQxo.getEditsText() || z)) {
            isg isgVar = new isg(jehVar, lugVar.getLayoutResult(), zrg.m33514isFromSoftKeyboardZmokQxo(keyEvent), getVisibleTextLayoutHeight(lugVar), this.f102798a);
            switch (C15786a.f102801a[hq8VarMo27875mapZmokQxo.ordinal()]) {
                case 1:
                    rsgVar.copy(false);
                    z3 = true;
                    break;
                case 2:
                    rsgVar.paste();
                    z3 = true;
                    break;
                case 3:
                    rsgVar.cut();
                    z3 = true;
                    break;
                case 4:
                    isgVar.collapseLeftOr(C15787b.f102802a);
                    z3 = true;
                    break;
                case 5:
                    isgVar.collapseRightOr(C15788c.f102803a);
                    z3 = true;
                    break;
                case 6:
                    isgVar.moveCursorLeftByWord();
                    z3 = true;
                    break;
                case 7:
                    isgVar.moveCursorRightByWord();
                    z3 = true;
                    break;
                case 8:
                    isgVar.moveCursorPrevByParagraph();
                    z3 = true;
                    break;
                case 9:
                    isgVar.moveCursorNextByParagraph();
                    z3 = true;
                    break;
                case 10:
                    isgVar.moveCursorUpByLine();
                    z3 = true;
                    break;
                case 11:
                    isgVar.moveCursorDownByLine();
                    z3 = true;
                    break;
                case 12:
                    isgVar.moveCursorUpByPage();
                    z3 = true;
                    break;
                case 13:
                    isgVar.moveCursorDownByPage();
                    z3 = true;
                    break;
                case 14:
                    isgVar.moveCursorToLineStart();
                    z3 = true;
                    break;
                case 15:
                    isgVar.moveCursorToLineEnd();
                    z3 = true;
                    break;
                case 16:
                    isgVar.moveCursorToLineLeftSide();
                    z3 = true;
                    break;
                case 17:
                    isgVar.moveCursorToLineRightSide();
                    z3 = true;
                    break;
                case 18:
                    isgVar.moveCursorToHome();
                    z3 = true;
                    break;
                case 19:
                    isgVar.moveCursorToEnd();
                    z3 = true;
                    break;
                case 20:
                    if (jvg.m30587getCollapsedimpl(isgVar.m30391getSelectiond9O1mEE())) {
                        Integer numValueOf = Integer.valueOf(isgVar.getPrecedingCharacterIndex());
                        if (numValueOf.intValue() == -1) {
                            numValueOf = null;
                        }
                        jvgVarM30581boximpl = numValueOf != null ? jvg.m30581boximpl(kvg.TextRange(numValueOf.intValue(), jvg.m30588getEndimpl(isgVar.m30391getSelectiond9O1mEE()))) : null;
                        if (jvgVarM30581boximpl != null) {
                            jeh.m30512replaceTextM8tDOmk$default(isgVar.f48148a, "", jvgVarM30581boximpl.m30597unboximpl(), null, !isgVar.f48150c, 4, null);
                        }
                    } else {
                        jeh.m30512replaceTextM8tDOmk$default(isgVar.f48148a, "", isgVar.m30391getSelectiond9O1mEE(), null, !isgVar.f48150c, 4, null);
                    }
                    z3 = true;
                    break;
                case 21:
                    if (jvg.m30587getCollapsedimpl(isgVar.m30391getSelectiond9O1mEE())) {
                        Integer numValueOf2 = Integer.valueOf(isgVar.getNextCharacterIndex());
                        if (numValueOf2.intValue() == -1) {
                            numValueOf2 = null;
                        }
                        jvgVarM30581boximpl = numValueOf2 != null ? jvg.m30581boximpl(kvg.TextRange(jvg.m30593getStartimpl(isgVar.m30391getSelectiond9O1mEE()), numValueOf2.intValue())) : null;
                        if (jvgVarM30581boximpl != null) {
                            jeh.m30512replaceTextM8tDOmk$default(isgVar.f48148a, "", jvgVarM30581boximpl.m30597unboximpl(), null, !isgVar.f48150c, 4, null);
                        }
                    } else {
                        jeh.m30512replaceTextM8tDOmk$default(isgVar.f48148a, "", isgVar.m30391getSelectiond9O1mEE(), null, !isgVar.f48150c, 4, null);
                    }
                    z3 = true;
                    break;
                case 22:
                    if (jvg.m30587getCollapsedimpl(isgVar.m30391getSelectiond9O1mEE())) {
                        jeh.m30512replaceTextM8tDOmk$default(isgVar.f48148a, "", kvg.TextRange(isgVar.getPreviousWordOffset(), jvg.m30588getEndimpl(isgVar.m30391getSelectiond9O1mEE())), null, !isgVar.f48150c, 4, null);
                    } else {
                        jeh.m30512replaceTextM8tDOmk$default(isgVar.f48148a, "", isgVar.m30391getSelectiond9O1mEE(), null, !isgVar.f48150c, 4, null);
                    }
                    z3 = true;
                    break;
                case 23:
                    if (jvg.m30587getCollapsedimpl(isgVar.m30391getSelectiond9O1mEE())) {
                        jeh.m30512replaceTextM8tDOmk$default(isgVar.f48148a, "", kvg.TextRange(jvg.m30593getStartimpl(isgVar.m30391getSelectiond9O1mEE()), isgVar.getNextWordOffset()), null, !isgVar.f48150c, 4, null);
                    } else {
                        jeh.m30512replaceTextM8tDOmk$default(isgVar.f48148a, "", isgVar.m30391getSelectiond9O1mEE(), null, !isgVar.f48150c, 4, null);
                    }
                    z3 = true;
                    break;
                case 24:
                    if (jvg.m30587getCollapsedimpl(isgVar.m30391getSelectiond9O1mEE())) {
                        jeh.m30512replaceTextM8tDOmk$default(isgVar.f48148a, "", kvg.TextRange(isgVar.getLineStartByOffset(), jvg.m30588getEndimpl(isgVar.m30391getSelectiond9O1mEE())), null, !isgVar.f48150c, 4, null);
                    } else {
                        jeh.m30512replaceTextM8tDOmk$default(isgVar.f48148a, "", isgVar.m30391getSelectiond9O1mEE(), null, !isgVar.f48150c, 4, null);
                    }
                    z3 = true;
                    break;
                case 25:
                    if (jvg.m30587getCollapsedimpl(isgVar.m30391getSelectiond9O1mEE())) {
                        jeh.m30512replaceTextM8tDOmk$default(isgVar.f48148a, "", kvg.TextRange(jvg.m30593getStartimpl(isgVar.m30391getSelectiond9O1mEE()), isgVar.getLineEndByOffset()), null, !isgVar.f48150c, 4, null);
                    } else {
                        jeh.m30512replaceTextM8tDOmk$default(isgVar.f48148a, "", isgVar.m30391getSelectiond9O1mEE(), null, !isgVar.f48150c, 4, null);
                    }
                    z3 = true;
                    break;
                case 26:
                    if (z2) {
                        ny6Var.invoke();
                    } else {
                        wsg wsgVar2 = jehVar.f50410a;
                        g48 g48Var2 = jehVar.f50411b;
                        urg urgVar2 = urg.MergeIfPossible;
                        wsgVar2.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
                        qw4 mainBuffer$foundation_release2 = wsgVar2.getMainBuffer$foundation_release();
                        mainBuffer$foundation_release2.commitComposition();
                        nw4.commitText(mainBuffer$foundation_release2, "\n", 1);
                        wsgVar2.commitEditAsUser(g48Var2, true, urgVar2);
                    }
                    z3 = true;
                    break;
                case 27:
                    if (!z2) {
                        wsg wsgVar3 = jehVar.f50410a;
                        g48 g48Var3 = jehVar.f50411b;
                        urg urgVar3 = urg.MergeIfPossible;
                        wsgVar3.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
                        qw4 mainBuffer$foundation_release3 = wsgVar3.getMainBuffer$foundation_release();
                        mainBuffer$foundation_release3.commitComposition();
                        nw4.commitText(mainBuffer$foundation_release3, "\t", 1);
                        wsgVar3.commitEditAsUser(g48Var3, true, urgVar3);
                        z3 = true;
                    }
                    break;
                case 28:
                    isgVar.selectAll();
                    z3 = true;
                    break;
                case 29:
                    isgVar.moveCursorLeft().selectMovement();
                    z3 = true;
                    break;
                case 30:
                    isgVar.moveCursorRight().selectMovement();
                    z3 = true;
                    break;
                case 31:
                    isgVar.moveCursorLeftByWord().selectMovement();
                    z3 = true;
                    break;
                case 32:
                    isgVar.moveCursorRightByWord().selectMovement();
                    z3 = true;
                    break;
                case 33:
                    isgVar.moveCursorPrevByParagraph().selectMovement();
                    z3 = true;
                    break;
                case 34:
                    isgVar.moveCursorNextByParagraph().selectMovement();
                    z3 = true;
                    break;
                case 35:
                    isgVar.moveCursorToLineStart().selectMovement();
                    z3 = true;
                    break;
                case 36:
                    isgVar.moveCursorToLineEnd().selectMovement();
                    z3 = true;
                    break;
                case 37:
                    isgVar.moveCursorToLineLeftSide().selectMovement();
                    z3 = true;
                    break;
                case 38:
                    isgVar.moveCursorToLineRightSide().selectMovement();
                    z3 = true;
                    break;
                case 39:
                    isgVar.moveCursorUpByLine().selectMovement();
                    z3 = true;
                    break;
                case 40:
                    isgVar.moveCursorDownByLine().selectMovement();
                    z3 = true;
                    break;
                case 41:
                    isgVar.moveCursorUpByPage().selectMovement();
                    z3 = true;
                    break;
                case 42:
                    isgVar.moveCursorDownByPage().selectMovement();
                    z3 = true;
                    break;
                case 43:
                    isgVar.moveCursorToHome().selectMovement();
                    z3 = true;
                    break;
                case 44:
                    isgVar.moveCursorToEnd().selectMovement();
                    z3 = true;
                    break;
                case 45:
                    isgVar.deselect();
                    z3 = true;
                    break;
                case 46:
                    jehVar.undo();
                    z3 = true;
                    break;
                case 47:
                    jehVar.redo();
                    z3 = true;
                    break;
                case 48:
                    mq8.showCharacterPalette();
                    z3 = true;
                    break;
                default:
                    z3 = true;
                    break;
            }
            if (!jvg.m30586equalsimpl0(isgVar.m30391getSelectiond9O1mEE(), isgVar.getInitialValue().m30568getSelectiond9O1mEE())) {
                jehVar.m30519selectCharsIn5zctL8(isgVar.m30391getSelectiond9O1mEE());
            }
        }
        return z3;
    }

    /* JADX INFO: renamed from: onPreKeyEvent-MyFupTE */
    public boolean mo30411onPreKeyEventMyFupTE(@yfb KeyEvent keyEvent, @yfb jeh jehVar, @yfb rsg rsgVar, @yfb um6 um6Var, @yfb suf sufVar) {
        if (jvg.m30587getCollapsedimpl(jehVar.getVisualText().m30568getSelectiond9O1mEE()) || !mq8.m31038cancelsTextSelectionZmokQxo(keyEvent)) {
            return false;
        }
        rsgVar.deselect();
        return true;
    }
}
