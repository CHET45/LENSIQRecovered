package p000;

import java.util.List;
import p000.fwg;
import p000.hrg;
import p000.ssf;

/* JADX INFO: loaded from: classes.dex */
@f0g
@dwf({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,694:1\n1208#2:695\n1187#2,2:696\n81#3:698\n107#3,2:699\n81#3:701\n107#3,2:702\n602#4,8:704\n602#4,8:712\n1#5:720\n460#6,11:721\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n572#1:695\n572#1:696,2\n97#1:698\n97#1:699,2\n112#1:701\n112#1:702,2\n184#1:704,8\n203#1:712,8\n432#1:721,11\n*E\n"})
public final class wsg {

    /* JADX INFO: renamed from: g */
    public static final int f95447g = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final fwg f95448a;

    /* JADX INFO: renamed from: b */
    @yfb
    public qw4 f95449b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final z6b f95450c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final z6b f95451d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final lsh f95452e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final f7b<InterfaceC14790a> f95453f;

    /* JADX INFO: renamed from: wsg$a */
    public interface InterfaceC14790a {
        void onChange(@yfb jrg jrgVar, @yfb jrg jrgVar2, boolean z);
    }

    /* JADX INFO: renamed from: wsg$b */
    @e0g(parameters = 1)
    public static final class C14791b implements dme<wsg, Object> {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C14791b f95454a = new C14791b();

        /* JADX INFO: renamed from: b */
        public static final int f95455b = 0;

        private C14791b() {
        }

        @Override // p000.dme
        @gib
        public wsg restore(@yfb Object obj) {
            md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object obj3 = list.get(1);
            Object obj4 = list.get(2);
            Object obj5 = list.get(3);
            md8.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            md8.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            md8.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
            long jTextRange = kvg.TextRange(iIntValue, ((Integer) obj4).intValue());
            fwg.C6010a.a aVar = fwg.C6010a.a.f37897a;
            md8.checkNotNull(obj5);
            fwg fwgVarRestore = aVar.restore(obj5);
            md8.checkNotNull(fwgVarRestore);
            return new wsg(str, jTextRange, fwgVarRestore, (jt3) null);
        }

        @Override // p000.dme
        @gib
        public Object save(@yfb fme fmeVar, @yfb wsg wsgVar) {
            return l82.listOf(wsgVar.getText().toString(), Integer.valueOf(jvg.m30593getStartimpl(wsgVar.m33112getSelectiond9O1mEE())), Integer.valueOf(jvg.m30588getEndimpl(wsgVar.m33112getSelectiond9O1mEE())), fwg.C6010a.a.f37897a.save(fmeVar, wsgVar.getTextUndoManager$foundation_release()));
        }
    }

    /* JADX INFO: renamed from: wsg$c */
    public /* synthetic */ class C14792c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f95456a;

        static {
            int[] iArr = new int[urg.values().length];
            try {
                iArr[urg.ClearHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[urg.MergeIfPossible.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[urg.NeverMerge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f95456a = iArr;
        }
    }

    public /* synthetic */ wsg(String str, long j, jt3 jt3Var) {
        this(str, j);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m24809a(wsg wsgVar, g48 g48Var, boolean z, urg urgVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            urgVar = urg.MergeIfPossible;
        }
        wsgVar.commitEditAsUser(g48Var, z, urgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void commitEditAsUser(g48 g48Var, boolean z, urg urgVar) {
        hrg hrgVar;
        jrg value$foundation_release = getValue$foundation_release();
        if (this.f95449b.getChangeTracker().getChangeCount() == 0 && jvg.m30586equalsimpl0(value$foundation_release.m30568getSelectiond9O1mEE(), this.f95449b.m32033getSelectiond9O1mEE())) {
            if (md8.areEqual(value$foundation_release.m30567getCompositionMzsxiRA(), this.f95449b.m32032getCompositionMzsxiRA()) && md8.areEqual(value$foundation_release.getHighlight(), this.f95449b.getHighlight())) {
                return;
            }
            updateValueAndNotifyListeners(getValue$foundation_release(), new jrg(this.f95449b.toString(), this.f95449b.m32033getSelectiond9O1mEE(), this.f95449b.m32032getCompositionMzsxiRA(), this.f95449b.getHighlight(), null), z);
            return;
        }
        jrg jrgVar = new jrg(this.f95449b.toString(), this.f95449b.m32033getSelectiond9O1mEE(), this.f95449b.m32032getCompositionMzsxiRA(), this.f95449b.getHighlight(), null);
        if (g48Var == null) {
            updateValueAndNotifyListeners(value$foundation_release, jrgVar, z);
            recordEditForUndo(value$foundation_release, jrgVar, this.f95449b.getChangeTracker(), urgVar);
            return;
        }
        hrg hrgVar2 = new hrg(jrgVar, this.f95449b.getChangeTracker(), value$foundation_release, null, 8, null);
        g48Var.transformInput(hrgVar2);
        boolean zContentEquals = h9g.contentEquals(hrgVar2.asCharSequence(), jrgVar);
        boolean z2 = !zContentEquals;
        boolean zM30586equalsimpl0 = jvg.m30586equalsimpl0(hrgVar2.m30104getSelectiond9O1mEE(), jrgVar.m30568getSelectiond9O1mEE());
        boolean z3 = !zM30586equalsimpl0;
        if (zContentEquals && zM30586equalsimpl0) {
            hrgVar = hrgVar2;
            updateValueAndNotifyListeners(value$foundation_release, hrg.m30102toTextFieldCharSequenceudt6zUU$foundation_release$default(hrgVar2, 0L, jrgVar.m30567getCompositionMzsxiRA(), 1, null), z);
        } else {
            hrgVar = hrgVar2;
            m33113syncMainBufferToTemporaryBufferTS3Rm5k$foundation_release(hrgVar, null, z2, z3);
        }
        recordEditForUndo(value$foundation_release, getValue$foundation_release(), hrgVar.getChanges(), urgVar);
    }

    public static /* synthetic */ void editAsUser$foundation_release$default(wsg wsgVar, g48 g48Var, boolean z, urg urgVar, qy6 qy6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            urgVar = urg.MergeIfPossible;
        }
        wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        qy6Var.invoke(wsgVar.getMainBuffer$foundation_release());
        wsgVar.commitEditAsUser(g48Var, z, urgVar);
    }

    @fdi
    public static /* synthetic */ void getMainBuffer$foundation_release$annotations() {
    }

    @ah5
    public static /* synthetic */ void getUndoState$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isEditing() {
        return ((Boolean) this.f95450c.getValue()).booleanValue();
    }

    private final void recordEditForUndo(jrg jrgVar, jrg jrgVar2, hrg.InterfaceC6984a interfaceC6984a, urg urgVar) {
        int i = C14792c.f95456a[urgVar.ordinal()];
        if (i == 1) {
            this.f95448a.clearHistory();
        } else if (i == 2) {
            gwg.recordChanges(this.f95448a, jrgVar, jrgVar2, interfaceC6984a, true);
        } else {
            if (i != 3) {
                return;
            }
            gwg.recordChanges(this.f95448a, jrgVar, jrgVar2, interfaceC6984a, false);
        }
    }

    private final void setEditing(boolean z) {
        this.f95450c.setValue(Boolean.valueOf(z));
    }

    private final void setValue(jrg jrgVar) {
        this.f95451d.setValue(jrgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateValueAndNotifyListeners(jrg jrgVar, jrg jrgVar2, boolean z) {
        setValue(jrgVar2);
        finishEditing();
        f7b<InterfaceC14790a> f7bVar = this.f95453f;
        int size = f7bVar.getSize();
        if (size > 0) {
            InterfaceC14790a[] content = f7bVar.getContent();
            int i = 0;
            do {
                content[i].onChange(jrgVar, jrgVar2, z);
                i++;
            } while (i < size);
        }
    }

    public final void addNotifyImeListener$foundation_release(@yfb InterfaceC14790a interfaceC14790a) {
        this.f95453f.add(interfaceC14790a);
    }

    @yjd
    public final void commitEdit(@yfb hrg hrgVar) {
        boolean z = hrgVar.getChanges().getChangeCount() > 0;
        boolean zM30586equalsimpl0 = true ^ jvg.m30586equalsimpl0(hrgVar.m30104getSelectiond9O1mEE(), this.f95449b.m32033getSelectiond9O1mEE());
        if (z) {
            this.f95448a.clearHistory();
        }
        m33113syncMainBufferToTemporaryBufferTS3Rm5k$foundation_release(hrgVar, null, z, zM30586equalsimpl0);
    }

    public final void edit(@yfb qy6<? super hrg, bth> qy6Var) {
        hrg hrgVarStartEdit = startEdit();
        try {
            qy6Var.invoke(hrgVarStartEdit);
            commitEdit(hrgVarStartEdit);
        } finally {
            o28.finallyStart(1);
            finishEditing();
            o28.finallyEnd(1);
        }
    }

    public final void editAsUser$foundation_release(@gib g48 g48Var, boolean z, @yfb urg urgVar, @yfb qy6<? super qw4, bth> qy6Var) {
        getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        qy6Var.invoke(getMainBuffer$foundation_release());
        commitEditAsUser(g48Var, z, urgVar);
    }

    public final void editWithNoSideEffects$foundation_release(@yfb qy6<? super qw4, bth> qy6Var) {
        getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        qy6Var.invoke(getMainBuffer$foundation_release());
        updateValueAndNotifyListeners(getValue$foundation_release(), new jrg(getMainBuffer$foundation_release().toString(), getMainBuffer$foundation_release().m32033getSelectiond9O1mEE(), getMainBuffer$foundation_release().m32032getCompositionMzsxiRA(), null, 8, null), true);
    }

    @yjd
    public final void finishEditing() {
        setEditing(false);
    }

    @gib
    /* JADX INFO: renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final jvg m33111getCompositionMzsxiRA() {
        return getValue$foundation_release().m30567getCompositionMzsxiRA();
    }

    @yfb
    public final qw4 getMainBuffer$foundation_release() {
        return this.f95449b;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m33112getSelectiond9O1mEE() {
        return getValue$foundation_release().m30568getSelectiond9O1mEE();
    }

    @yfb
    public final CharSequence getText() {
        return getValue$foundation_release().getText();
    }

    @yfb
    public final fwg getTextUndoManager$foundation_release() {
        return this.f95448a;
    }

    @ah5
    @yfb
    public final lsh getUndoState() {
        return this.f95452e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public final jrg getValue$foundation_release() {
        return (jrg) this.f95451d.getValue();
    }

    public final void removeNotifyImeListener$foundation_release(@yfb InterfaceC14790a interfaceC14790a) {
        this.f95453f.remove(interfaceC14790a);
    }

    public final void setMainBuffer$foundation_release(@yfb qw4 qw4Var) {
        this.f95449b = qw4Var;
    }

    @yfb
    @yjd
    public final hrg startEdit() {
        ssf.C12771a c12771a = ssf.f82790e;
        ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
        qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (isEditing()) {
                throw new IllegalStateException("TextFieldState does not support concurrent or nested editing.");
            }
            setEditing(true);
            return new hrg(getValue$foundation_release(), null, null, null, 14, null);
        } finally {
            c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
        }
    }

    @fdi
    /* JADX INFO: renamed from: syncMainBufferToTemporaryBuffer-TS3Rm5k$foundation_release, reason: not valid java name */
    public final void m33113syncMainBufferToTemporaryBufferTS3Rm5k$foundation_release(@yfb hrg hrgVar, @gib jvg jvgVar, boolean z, boolean z2) {
        String string = this.f95449b.toString();
        jrg jrgVar = new jrg(string, this.f95449b.m32033getSelectiond9O1mEE(), this.f95449b.m32032getCompositionMzsxiRA(), null, 8, null);
        boolean zAreEqual = md8.areEqual(jvgVar, this.f95449b.m32032getCompositionMzsxiRA());
        if (z) {
            this.f95449b = new qw4(hrgVar.toString(), hrgVar.m30104getSelectiond9O1mEE(), (jt3) null);
        } else if (z2) {
            this.f95449b.setSelection(jvg.m30593getStartimpl(hrgVar.m30104getSelectiond9O1mEE()), jvg.m30588getEndimpl(hrgVar.m30104getSelectiond9O1mEE()));
        }
        if (jvgVar == null || jvg.m30587getCollapsedimpl(jvgVar.m30597unboximpl())) {
            this.f95449b.commitComposition();
        } else {
            this.f95449b.setComposition(jvg.m30591getMinimpl(jvgVar.m30597unboximpl()), jvg.m30590getMaximpl(jvgVar.m30597unboximpl()));
        }
        if (z || (!z2 && !zAreEqual)) {
            this.f95449b.commitComposition();
        }
        if (z) {
            string = hrgVar.toString();
        }
        updateValueAndNotifyListeners(jrgVar, new jrg(string, this.f95449b.m32033getSelectiond9O1mEE(), this.f95449b.m32032getCompositionMzsxiRA(), null, 8, null), true);
    }

    @yfb
    public String toString() {
        ssf.C12771a c12771a = ssf.f82790e;
        ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
        qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            return "TextFieldState(selection=" + ((Object) jvg.m30596toStringimpl(m33112getSelectiond9O1mEE())) + ", text=\"" + ((Object) getText()) + "\")";
        } finally {
            c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
        }
    }

    public /* synthetic */ wsg(String str, long j, fwg fwgVar, jt3 jt3Var) {
        this(str, j, fwgVar);
    }

    private wsg(String str, long j, fwg fwgVar) {
        this.f95448a = fwgVar;
        this.f95449b = new qw4(str, kvg.m30778coerceIn8ffj60Q(j, 0, str.length()), (jt3) null);
        this.f95450c = xtf.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f95451d = xtf.mutableStateOf$default(new jrg(str, j, null, null, 12, null), null, 2, null);
        this.f95452e = new lsh(this);
        this.f95453f = new f7b<>(new InterfaceC14790a[16], 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ wsg(String str, long j, int i, jt3 jt3Var) {
        str = (i & 1) != 0 ? "" : str;
        this(str, (i & 2) != 0 ? kvg.TextRange(str.length()) : j, (jt3) null);
    }

    private wsg(String str, long j) {
        this(str, j, new fwg(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), (jt3) null);
    }
}
