package p000;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nEditProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n33#2,6:183\n1#3:189\n*S KotlinDebug\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n*L\n115#1:183,6\n*E\n"})
@e0g(parameters = 0)
public final class ow4 {

    /* JADX INFO: renamed from: c */
    public static final int f69007c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public zsg f69008a = new zsg(C9611mz.emptyAnnotatedString(), jvg.f52112b.m30598getZerod9O1mEE(), (jvg) null, (jt3) null);

    /* JADX INFO: renamed from: b */
    @yfb
    public rw4 f69009b = new rw4(this.f69008a.getAnnotatedString(), this.f69008a.m33527getSelectiond9O1mEE(), (jt3) null);

    /* JADX INFO: renamed from: ow4$a */
    public static final class C10675a extends tt8 implements qy6<lw4, CharSequence> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ lw4 f69010a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ow4 f69011b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10675a(lw4 lw4Var, ow4 ow4Var) {
            super(1);
            this.f69010a = lw4Var;
            this.f69011b = ow4Var;
        }

        @Override // p000.qy6
        @yfb
        public final CharSequence invoke(@yfb lw4 lw4Var) {
            return (this.f69010a == lw4Var ? " > " : d99.f28832c) + this.f69011b.toStringForLog(lw4Var);
        }
    }

    private final String generateBatchErrorMessage(List<? extends lw4> list, lw4 lw4Var) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.f69009b.getLength$ui_text_release() + ", composition=" + this.f69009b.m32221getCompositionMzsxiRA$ui_text_release() + ", selection=" + ((Object) jvg.m30596toStringimpl(this.f69009b.m32222getSelectiond9O1mEE$ui_text_release())) + "):");
        md8.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        md8.checkNotNullExpressionValue(sb, "append('\\n')");
        v82.joinTo(list, sb, (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new C10675a(lw4Var, this));
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toStringForLog(lw4 lw4Var) {
        if (lw4Var instanceof ac2) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommitTextCommand(text.length=");
            ac2 ac2Var = (ac2) lw4Var;
            sb.append(ac2Var.getText().length());
            sb.append(", newCursorPosition=");
            sb.append(ac2Var.getNewCursorPosition());
            sb.append(')');
            return sb.toString();
        }
        if (lw4Var instanceof k6f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SetComposingTextCommand(text.length=");
            k6f k6fVar = (k6f) lw4Var;
            sb2.append(k6fVar.getText().length());
            sb2.append(", newCursorPosition=");
            sb2.append(k6fVar.getNewCursorPosition());
            sb2.append(')');
            return sb2.toString();
        }
        if (!(lw4Var instanceof j6f) && !(lw4Var instanceof f54) && !(lw4Var instanceof g54) && !(lw4Var instanceof s6f) && !(lw4Var instanceof ew5) && !(lw4Var instanceof bp0) && !(lw4Var instanceof j0b) && !(lw4Var instanceof x44)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unknown EditCommand: ");
            String simpleName = vvd.getOrCreateKotlinClass(lw4Var.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "{anonymous EditCommand}";
            }
            sb3.append(simpleName);
            return sb3.toString();
        }
        return lw4Var.toString();
    }

    @yfb
    public final zsg apply(@yfb List<? extends lw4> list) {
        lw4 lw4Var;
        Exception e;
        try {
            int size = list.size();
            int i = 0;
            lw4Var = null;
            while (i < size) {
                try {
                    lw4 lw4Var2 = list.get(i);
                    try {
                        lw4Var2.applyTo(this.f69009b);
                        i++;
                        lw4Var = lw4Var2;
                    } catch (Exception e2) {
                        e = e2;
                        lw4Var = lw4Var2;
                        throw new RuntimeException(generateBatchErrorMessage(list, lw4Var), e);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            C9041lz annotatedString$ui_text_release = this.f69009b.toAnnotatedString$ui_text_release();
            long jM32222getSelectiond9O1mEE$ui_text_release = this.f69009b.m32222getSelectiond9O1mEE$ui_text_release();
            jvg jvgVarM30581boximpl = jvg.m30581boximpl(jM32222getSelectiond9O1mEE$ui_text_release);
            jvgVarM30581boximpl.m30597unboximpl();
            jvg jvgVar = jvg.m30592getReversedimpl(this.f69008a.m33527getSelectiond9O1mEE()) ? null : jvgVarM30581boximpl;
            zsg zsgVar = new zsg(annotatedString$ui_text_release, jvgVar != null ? jvgVar.m30597unboximpl() : kvg.TextRange(jvg.m30590getMaximpl(jM32222getSelectiond9O1mEE$ui_text_release), jvg.m30591getMinimpl(jM32222getSelectiond9O1mEE$ui_text_release)), this.f69009b.m32221getCompositionMzsxiRA$ui_text_release(), (jt3) null);
            this.f69008a = zsgVar;
            return zsgVar;
        } catch (Exception e4) {
            lw4Var = null;
            e = e4;
        }
    }

    @yfb
    public final rw4 getMBuffer$ui_text_release() {
        return this.f69009b;
    }

    @yfb
    public final zsg getMBufferState$ui_text_release() {
        return this.f69008a;
    }

    public final void reset(@yfb zsg zsgVar, @gib ytg ytgVar) {
        boolean zAreEqual = md8.areEqual(zsgVar.m33526getCompositionMzsxiRA(), this.f69009b.m32221getCompositionMzsxiRA$ui_text_release());
        boolean z = true;
        boolean z2 = false;
        if (!md8.areEqual(this.f69008a.getAnnotatedString(), zsgVar.getAnnotatedString())) {
            this.f69009b = new rw4(zsgVar.getAnnotatedString(), zsgVar.m33527getSelectiond9O1mEE(), (jt3) null);
        } else if (jvg.m30586equalsimpl0(this.f69008a.m33527getSelectiond9O1mEE(), zsgVar.m33527getSelectiond9O1mEE())) {
            z = false;
        } else {
            this.f69009b.setSelection$ui_text_release(jvg.m30591getMinimpl(zsgVar.m33527getSelectiond9O1mEE()), jvg.m30590getMaximpl(zsgVar.m33527getSelectiond9O1mEE()));
            z2 = true;
            z = false;
        }
        if (zsgVar.m33526getCompositionMzsxiRA() == null) {
            this.f69009b.commitComposition$ui_text_release();
        } else if (!jvg.m30587getCollapsedimpl(zsgVar.m33526getCompositionMzsxiRA().m30597unboximpl())) {
            this.f69009b.setComposition$ui_text_release(jvg.m30591getMinimpl(zsgVar.m33526getCompositionMzsxiRA().m30597unboximpl()), jvg.m30590getMaximpl(zsgVar.m33526getCompositionMzsxiRA().m30597unboximpl()));
        }
        if (z || (!z2 && !zAreEqual)) {
            this.f69009b.commitComposition$ui_text_release();
            zsgVar = zsg.m33523copy3r_uNRQ$default(zsgVar, (C9041lz) null, 0L, (jvg) null, 3, (Object) null);
        }
        zsg zsgVar2 = this.f69008a;
        this.f69008a = zsgVar;
        if (ytgVar != null) {
            ytgVar.updateState(zsgVar2, zsgVar);
        }
    }

    @yfb
    public final zsg toTextFieldValue() {
        return this.f69008a;
    }
}
