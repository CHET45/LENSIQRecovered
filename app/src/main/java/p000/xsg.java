package p000;

import p000.wsg;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,694:1\n1223#2,6:695\n175#3,8:701\n175#3,8:709\n175#3,8:717\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldStateKt\n*L\n621#1:695,6\n643#1:701,8\n667#1:709,8\n689#1:717,8\n*E\n"})
public final class xsg {

    /* JADX INFO: renamed from: xsg$a */
    public static final class C15269a extends tt8 implements ny6<wsg> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f99146a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f99147b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15269a(String str, long j) {
            super(0);
            this.f99146a = str;
            this.f99147b = j;
        }

        @Override // p000.ny6
        @yfb
        public final wsg invoke() {
            return new wsg(this.f99146a, this.f99147b, (jt3) null);
        }
    }

    @yfb
    public static final wsg TextFieldState(@yfb zsg zsgVar) {
        return new wsg(zsgVar.getText(), zsgVar.m33527getSelectiond9O1mEE(), (jt3) null);
    }

    public static final void clearText(@yfb wsg wsgVar) {
        hrg hrgVarStartEdit = wsgVar.startEdit();
        try {
            irg.delete(hrgVarStartEdit, 0, hrgVarStartEdit.getLength());
            irg.placeCursorAtEnd(hrgVarStartEdit);
            wsgVar.commitEdit(hrgVarStartEdit);
        } finally {
            wsgVar.finishEditing();
        }
    }

    @yfb
    @hk2
    /* JADX INFO: renamed from: rememberTextFieldState-Le-punE, reason: not valid java name */
    public static final wsg m33269rememberTextFieldStateLepunE(@gib String str, long j, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            j = kvg.TextRange(str.length());
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1125389485, i, -1, "androidx.compose.foundation.text.input.rememberTextFieldState (TextFieldState.kt:620)");
        }
        Object[] objArr = new Object[0];
        wsg.C14791b c14791b = wsg.C14791b.f95454a;
        boolean z = ((((i & 14) ^ 6) > 4 && zl2Var.changed(str)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && zl2Var.changed(j)) || (i & 48) == 32);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new C15269a(str, j);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        wsg wsgVar = (wsg) gyd.rememberSaveable(objArr, (dme) c14791b, (String) null, (ny6) objRememberedValue, zl2Var, 48, 4);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return wsgVar;
    }

    public static final void setTextAndPlaceCursorAtEnd(@yfb wsg wsgVar, @yfb String str) {
        hrg hrgVarStartEdit = wsgVar.startEdit();
        try {
            hrgVarStartEdit.replace(0, hrgVarStartEdit.getLength(), str);
            irg.placeCursorAtEnd(hrgVarStartEdit);
            wsgVar.commitEdit(hrgVarStartEdit);
        } finally {
            wsgVar.finishEditing();
        }
    }

    public static final void setTextAndSelectAll(@yfb wsg wsgVar, @yfb String str) {
        hrg hrgVarStartEdit = wsgVar.startEdit();
        try {
            hrgVarStartEdit.replace(0, hrgVarStartEdit.getLength(), str);
            irg.selectAll(hrgVarStartEdit);
            wsgVar.commitEdit(hrgVarStartEdit);
        } finally {
            wsgVar.finishEditing();
        }
    }
}
