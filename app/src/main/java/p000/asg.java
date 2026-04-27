package p000;

import android.view.KeyEvent;
import java.util.Collection;
import java.util.List;
import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class asg {

    /* JADX INFO: renamed from: m */
    public static final int f11783m = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final z39 f11784a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final osg f11785b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final zsg f11786c;

    /* JADX INFO: renamed from: d */
    public final boolean f11787d;

    /* JADX INFO: renamed from: e */
    public final boolean f11788e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final ivg f11789f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final nzb f11790g;

    /* JADX INFO: renamed from: h */
    @gib
    public final ish f11791h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final rj3 f11792i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final zq8 f11793j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final qy6<zsg, bth> f11794k;

    /* JADX INFO: renamed from: l */
    public final int f11795l;

    /* JADX INFO: renamed from: asg$a */
    public static final class C1595a extends tt8 implements qy6<zsg, bth> {

        /* JADX INFO: renamed from: a */
        public static final C1595a f11796a = new C1595a();

        public C1595a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(zsg zsgVar) {
            invoke2(zsgVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb zsg zsgVar) {
        }
    }

    /* JADX INFO: renamed from: asg$b */
    @dwf({"SMAP\nTextFieldKeyInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInput$process$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n1#2:264\n*E\n"})
    public static final class C1596b extends tt8 implements qy6<jsg, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ hq8 f11797a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ asg f11798b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jvd.C8114a f11799c;

        /* JADX INFO: renamed from: asg$b$a */
        public static final class a extends tt8 implements qy6<jsg, bth> {

            /* JADX INFO: renamed from: a */
            public static final a f11800a = new a();

            public a() {
                super(1);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(jsg jsgVar) {
                invoke2(jsgVar);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb jsg jsgVar) {
                jsgVar.moveCursorLeft();
            }
        }

        /* JADX INFO: renamed from: asg$b$b */
        public static final class b extends tt8 implements qy6<jsg, bth> {

            /* JADX INFO: renamed from: a */
            public static final b f11801a = new b();

            public b() {
                super(1);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(jsg jsgVar) {
                invoke2(jsgVar);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb jsg jsgVar) {
                jsgVar.moveCursorRight();
            }
        }

        /* JADX INFO: renamed from: asg$b$c */
        public static final class c extends tt8 implements qy6<jsg, lw4> {

            /* JADX INFO: renamed from: a */
            public static final c f11802a = new c();

            public c() {
                super(1);
            }

            @Override // p000.qy6
            @gib
            public final lw4 invoke(@yfb jsg jsgVar) {
                return new f54(jvg.m30588getEndimpl(jsgVar.m30891getSelectiond9O1mEE()) - jsgVar.getPrecedingCharacterIndex(), 0);
            }
        }

        /* JADX INFO: renamed from: asg$b$d */
        public static final class d extends tt8 implements qy6<jsg, lw4> {

            /* JADX INFO: renamed from: a */
            public static final d f11803a = new d();

            public d() {
                super(1);
            }

            @Override // p000.qy6
            @gib
            public final lw4 invoke(@yfb jsg jsgVar) {
                int nextCharacterIndex = jsgVar.getNextCharacterIndex();
                if (nextCharacterIndex != -1) {
                    return new f54(0, nextCharacterIndex - jvg.m30588getEndimpl(jsgVar.m30891getSelectiond9O1mEE()));
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: asg$b$e */
        public static final class e extends tt8 implements qy6<jsg, lw4> {

            /* JADX INFO: renamed from: a */
            public static final e f11804a = new e();

            public e() {
                super(1);
            }

            @Override // p000.qy6
            @gib
            public final lw4 invoke(@yfb jsg jsgVar) {
                Integer previousWordOffset = jsgVar.getPreviousWordOffset();
                if (previousWordOffset == null) {
                    return null;
                }
                return new f54(jvg.m30588getEndimpl(jsgVar.m30891getSelectiond9O1mEE()) - previousWordOffset.intValue(), 0);
            }
        }

        /* JADX INFO: renamed from: asg$b$f */
        public static final class f extends tt8 implements qy6<jsg, lw4> {

            /* JADX INFO: renamed from: a */
            public static final f f11805a = new f();

            public f() {
                super(1);
            }

            @Override // p000.qy6
            @gib
            public final lw4 invoke(@yfb jsg jsgVar) {
                Integer nextWordOffset = jsgVar.getNextWordOffset();
                if (nextWordOffset != null) {
                    return new f54(0, nextWordOffset.intValue() - jvg.m30588getEndimpl(jsgVar.m30891getSelectiond9O1mEE()));
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: asg$b$g */
        public static final class g extends tt8 implements qy6<jsg, lw4> {

            /* JADX INFO: renamed from: a */
            public static final g f11806a = new g();

            public g() {
                super(1);
            }

            @Override // p000.qy6
            @gib
            public final lw4 invoke(@yfb jsg jsgVar) {
                Integer lineStartByOffset = jsgVar.getLineStartByOffset();
                if (lineStartByOffset == null) {
                    return null;
                }
                return new f54(jvg.m30588getEndimpl(jsgVar.m30891getSelectiond9O1mEE()) - lineStartByOffset.intValue(), 0);
            }
        }

        /* JADX INFO: renamed from: asg$b$h */
        public static final class h extends tt8 implements qy6<jsg, lw4> {

            /* JADX INFO: renamed from: a */
            public static final h f11807a = new h();

            public h() {
                super(1);
            }

            @Override // p000.qy6
            @gib
            public final lw4 invoke(@yfb jsg jsgVar) {
                Integer lineEndByOffset = jsgVar.getLineEndByOffset();
                if (lineEndByOffset != null) {
                    return new f54(0, lineEndByOffset.intValue() - jvg.m30588getEndimpl(jsgVar.m30891getSelectiond9O1mEE()));
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: asg$b$i */
        public /* synthetic */ class i {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f11808a;

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
                f11808a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1596b(hq8 hq8Var, asg asgVar, jvd.C8114a c8114a) {
            super(1);
            this.f11797a = hq8Var;
            this.f11798b = asgVar;
            this.f11799c = c8114a;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(jsg jsgVar) {
            invoke2(jsgVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb jsg jsgVar) {
            zsg zsgVarUndo;
            zsg zsgVarRedo;
            switch (i.f11808a[this.f11797a.ordinal()]) {
                case 1:
                    this.f11798b.getSelectionManager().copy$foundation_release(false);
                    break;
                case 2:
                    this.f11798b.getSelectionManager().paste$foundation_release();
                    break;
                case 3:
                    this.f11798b.getSelectionManager().cut$foundation_release();
                    break;
                case 4:
                    jsgVar.collapseLeftOr(a.f11800a);
                    break;
                case 5:
                    jsgVar.collapseRightOr(b.f11801a);
                    break;
                case 6:
                    jsgVar.moveCursorLeftByWord();
                    break;
                case 7:
                    jsgVar.moveCursorRightByWord();
                    break;
                case 8:
                    jsgVar.moveCursorPrevByParagraph();
                    break;
                case 9:
                    jsgVar.moveCursorNextByParagraph();
                    break;
                case 10:
                    jsgVar.moveCursorUpByLine();
                    break;
                case 11:
                    jsgVar.moveCursorDownByLine();
                    break;
                case 12:
                    jsgVar.moveCursorUpByPage();
                    break;
                case 13:
                    jsgVar.moveCursorDownByPage();
                    break;
                case 14:
                    jsgVar.moveCursorToLineStart();
                    break;
                case 15:
                    jsgVar.moveCursorToLineEnd();
                    break;
                case 16:
                    jsgVar.moveCursorToLineLeftSide();
                    break;
                case 17:
                    jsgVar.moveCursorToLineRightSide();
                    break;
                case 18:
                    jsgVar.moveCursorToHome();
                    break;
                case 19:
                    jsgVar.moveCursorToEnd();
                    break;
                case 20:
                    List<lw4> listDeleteIfSelectedOr = jsgVar.deleteIfSelectedOr(c.f11802a);
                    if (listDeleteIfSelectedOr != null) {
                        this.f11798b.apply(listDeleteIfSelectedOr);
                    }
                    break;
                case 21:
                    List<lw4> listDeleteIfSelectedOr2 = jsgVar.deleteIfSelectedOr(d.f11803a);
                    if (listDeleteIfSelectedOr2 != null) {
                        this.f11798b.apply(listDeleteIfSelectedOr2);
                    }
                    break;
                case 22:
                    List<lw4> listDeleteIfSelectedOr3 = jsgVar.deleteIfSelectedOr(e.f11804a);
                    if (listDeleteIfSelectedOr3 != null) {
                        this.f11798b.apply(listDeleteIfSelectedOr3);
                    }
                    break;
                case 23:
                    List<lw4> listDeleteIfSelectedOr4 = jsgVar.deleteIfSelectedOr(f.f11805a);
                    if (listDeleteIfSelectedOr4 != null) {
                        this.f11798b.apply(listDeleteIfSelectedOr4);
                    }
                    break;
                case 24:
                    List<lw4> listDeleteIfSelectedOr5 = jsgVar.deleteIfSelectedOr(g.f11806a);
                    if (listDeleteIfSelectedOr5 != null) {
                        this.f11798b.apply(listDeleteIfSelectedOr5);
                    }
                    break;
                case 25:
                    List<lw4> listDeleteIfSelectedOr6 = jsgVar.deleteIfSelectedOr(h.f11807a);
                    if (listDeleteIfSelectedOr6 != null) {
                        this.f11798b.apply(listDeleteIfSelectedOr6);
                    }
                    break;
                case 26:
                    if (!this.f11798b.getSingleLine()) {
                        this.f11798b.apply(new ac2("\n", 1));
                    } else {
                        this.f11798b.getState().getOnImeActionPerformed().invoke(mw7.m31065boximpl(this.f11798b.f11795l));
                    }
                    break;
                case 27:
                    if (!this.f11798b.getSingleLine()) {
                        this.f11798b.apply(new ac2("\t", 1));
                    } else {
                        this.f11799c.f52103a = false;
                    }
                    break;
                case 28:
                    jsgVar.selectAll();
                    break;
                case 29:
                    jsgVar.moveCursorLeft().selectMovement();
                    break;
                case 30:
                    jsgVar.moveCursorRight().selectMovement();
                    break;
                case 31:
                    jsgVar.moveCursorLeftByWord().selectMovement();
                    break;
                case 32:
                    jsgVar.moveCursorRightByWord().selectMovement();
                    break;
                case 33:
                    jsgVar.moveCursorPrevByParagraph().selectMovement();
                    break;
                case 34:
                    jsgVar.moveCursorNextByParagraph().selectMovement();
                    break;
                case 35:
                    jsgVar.moveCursorToLineStart().selectMovement();
                    break;
                case 36:
                    jsgVar.moveCursorToLineEnd().selectMovement();
                    break;
                case 37:
                    jsgVar.moveCursorToLineLeftSide().selectMovement();
                    break;
                case 38:
                    jsgVar.moveCursorToLineRightSide().selectMovement();
                    break;
                case 39:
                    jsgVar.moveCursorUpByLine().selectMovement();
                    break;
                case 40:
                    jsgVar.moveCursorDownByLine().selectMovement();
                    break;
                case 41:
                    jsgVar.moveCursorUpByPage().selectMovement();
                    break;
                case 42:
                    jsgVar.moveCursorDownByPage().selectMovement();
                    break;
                case 43:
                    jsgVar.moveCursorToHome().selectMovement();
                    break;
                case 44:
                    jsgVar.moveCursorToEnd().selectMovement();
                    break;
                case 45:
                    jsgVar.deselect();
                    break;
                case 46:
                    ish undoManager = this.f11798b.getUndoManager();
                    if (undoManager != null) {
                        undoManager.makeSnapshot(jsgVar.getValue());
                    }
                    ish undoManager2 = this.f11798b.getUndoManager();
                    if (undoManager2 != null && (zsgVarUndo = undoManager2.undo()) != null) {
                        this.f11798b.f11794k.invoke(zsgVarUndo);
                        break;
                    }
                    break;
                case 47:
                    ish undoManager3 = this.f11798b.getUndoManager();
                    if (undoManager3 != null && (zsgVarRedo = undoManager3.redo()) != null) {
                        this.f11798b.f11794k.invoke(zsgVarRedo);
                        break;
                    }
                    break;
                case 48:
                    mq8.showCharacterPalette();
                    break;
            }
        }
    }

    public /* synthetic */ asg(z39 z39Var, osg osgVar, zsg zsgVar, boolean z, boolean z2, ivg ivgVar, nzb nzbVar, ish ishVar, rj3 rj3Var, zq8 zq8Var, qy6 qy6Var, int i, jt3 jt3Var) {
        this(z39Var, osgVar, zsgVar, z, z2, ivgVar, nzbVar, ishVar, rj3Var, zq8Var, qy6Var, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(List<? extends lw4> list) {
        ow4 processor = this.f11784a.getProcessor();
        List<? extends lw4> mutableList = v82.toMutableList((Collection) list);
        mutableList.add(0, new ew5());
        this.f11794k.invoke(processor.apply(mutableList));
    }

    private final void commandExecutionContext(qy6<? super jsg, bth> qy6Var) {
        jsg jsgVar = new jsg(this.f11786c, this.f11790g, this.f11784a.getLayoutResult(), this.f11789f);
        qy6Var.invoke(jsgVar);
        if (jvg.m30586equalsimpl0(jsgVar.m30891getSelectiond9O1mEE(), this.f11786c.m33527getSelectiond9O1mEE()) && md8.areEqual(jsgVar.getAnnotatedString(), this.f11786c.getAnnotatedString())) {
            return;
        }
        this.f11794k.invoke(jsgVar.getValue());
    }

    /* JADX INFO: renamed from: typedCommand-ZmokQxo, reason: not valid java name */
    private final ac2 m27879typedCommandZmokQxo(KeyEvent keyEvent) {
        Integer numM32154consumeZmokQxo;
        if (csg.m28542isTypedEventZmokQxo(keyEvent) && (numM32154consumeZmokQxo = this.f11792i.m32154consumeZmokQxo(keyEvent)) != null) {
            return new ac2(v7g.appendCodePointX(new StringBuilder(), numM32154consumeZmokQxo.intValue()).toString(), 1);
        }
        return null;
    }

    public final boolean getEditable() {
        return this.f11787d;
    }

    @yfb
    public final nzb getOffsetMapping() {
        return this.f11790g;
    }

    @yfb
    public final ivg getPreparedSelectionState() {
        return this.f11789f;
    }

    @yfb
    public final osg getSelectionManager() {
        return this.f11785b;
    }

    public final boolean getSingleLine() {
        return this.f11788e;
    }

    @yfb
    public final z39 getState() {
        return this.f11784a;
    }

    @gib
    public final ish getUndoManager() {
        return this.f11791h;
    }

    @yfb
    public final zsg getValue() {
        return this.f11786c;
    }

    /* JADX INFO: renamed from: process-ZmokQxo, reason: not valid java name */
    public final boolean m27880processZmokQxo(@yfb KeyEvent keyEvent) {
        hq8 hq8VarMo27875mapZmokQxo;
        ac2 ac2VarM27879typedCommandZmokQxo = m27879typedCommandZmokQxo(keyEvent);
        if (ac2VarM27879typedCommandZmokQxo != null) {
            if (!this.f11787d) {
                return false;
            }
            apply(ac2VarM27879typedCommandZmokQxo);
            this.f11789f.resetCachedX();
            return true;
        }
        if (!nq8.m31182equalsimpl0(oq8.m31587getTypeZmokQxo(keyEvent), nq8.f65270b.m31186getKeyDownCS__XNY()) || (hq8VarMo27875mapZmokQxo = this.f11793j.mo27875mapZmokQxo(keyEvent)) == null || (hq8VarMo27875mapZmokQxo.getEditsText() && !this.f11787d)) {
            return false;
        }
        jvd.C8114a c8114a = new jvd.C8114a();
        c8114a.f52103a = true;
        commandExecutionContext(new C1596b(hq8VarMo27875mapZmokQxo, this, c8114a));
        ish ishVar = this.f11791h;
        if (ishVar != null) {
            ishVar.forceNextSnapshot();
        }
        return c8114a.f52103a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private asg(z39 z39Var, osg osgVar, zsg zsgVar, boolean z, boolean z2, ivg ivgVar, nzb nzbVar, ish ishVar, rj3 rj3Var, zq8 zq8Var, qy6<? super zsg, bth> qy6Var, int i) {
        this.f11784a = z39Var;
        this.f11785b = osgVar;
        this.f11786c = zsgVar;
        this.f11787d = z;
        this.f11788e = z2;
        this.f11789f = ivgVar;
        this.f11790g = nzbVar;
        this.f11791h = ishVar;
        this.f11792i = rj3Var;
        this.f11793j = zq8Var;
        this.f11794k = qy6Var;
        this.f11795l = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(lw4 lw4Var) {
        apply(k82.listOf(lw4Var));
    }

    public /* synthetic */ asg(z39 z39Var, osg osgVar, zsg zsgVar, boolean z, boolean z2, ivg ivgVar, nzb nzbVar, ish ishVar, rj3 rj3Var, zq8 zq8Var, qy6 qy6Var, int i, int i2, jt3 jt3Var) {
        this(z39Var, osgVar, (i2 & 4) != 0 ? new zsg((String) null, 0L, (jvg) null, 7, (jt3) null) : zsgVar, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2, ivgVar, (i2 & 64) != 0 ? nzb.f66113a.getIdentity() : nzbVar, (i2 & 128) != 0 ? null : ishVar, rj3Var, (i2 & 512) != 0 ? br8.getPlatformDefaultKeyMapping() : zq8Var, (i2 & 1024) != 0 ? C1595a.f11796a : qy6Var, i, null);
    }
}
