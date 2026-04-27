package p000;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.Html;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import okio.Utf8;
import org.xml.sax.XMLReader;
import p000.C9041lz;
import p000.b79;
import p000.do6;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nHtml.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Html.android.kt\nandroidx/compose/ui/text/Html_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,292:1\n1#2:293\n13579#3,2:294\n*S KotlinDebug\n*F\n+ 1 Html.android.kt\nandroidx/compose/ui/text/Html_androidKt\n*L\n89#1:294,2\n*E\n"})
public final class sm7 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C12657a f82231a = new C12657a();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f82232b = "ContentHandlerReplacementTag";

    /* JADX INFO: renamed from: c */
    @yfb
    public static final String f82233c = "annotation";

    /* JADX INFO: renamed from: sm7$a */
    public static final class C12657a implements Html.TagHandler {
        @Override // android.text.Html.TagHandler
        public void handleTag(boolean z, @gib String str, @gib Editable editable, @gib XMLReader xMLReader) {
            if (xMLReader == null || editable == null || !z || !md8.areEqual(str, sm7.f82232b)) {
                return;
            }
            xMLReader.setContentHandler(new C10721oz(xMLReader.getContentHandler(), editable));
        }
    }

    /* JADX INFO: renamed from: sm7$b */
    public /* synthetic */ class C12658b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f82234a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f82234a = iArr;
        }
    }

    private static final void addSpan(C9041lz.a aVar, Object obj, int i, int i2, rug rugVar, e79 e79Var) {
        String url;
        if (obj instanceof AbsoluteSizeSpan) {
            return;
        }
        if (obj instanceof AlignmentSpan) {
            aVar.addStyle(toParagraphStyle((AlignmentSpan) obj), i, i2);
            return;
        }
        if (obj instanceof C11765qz) {
            C11765qz c11765qz = (C11765qz) obj;
            aVar.addStringAnnotation(c11765qz.getKey(), c11765qz.getValue(), i, i2);
            return;
        }
        if (obj instanceof BackgroundColorSpan) {
            aVar.addStyle(new swf(0L, 0L, (jp6) null, (fp6) null, (gp6) null, (do6) null, (String) null, 0L, (gv0) null, (ftg) null, (ye9) null, j92.Color(((BackgroundColorSpan) obj).getBackgroundColor()), (qqg) null, (e8f) null, (qxc) null, (rp4) null, 63487, (jt3) null), i, i2);
            return;
        }
        if (obj instanceof ForegroundColorSpan) {
            aVar.addStyle(new swf(j92.Color(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (jp6) null, (fp6) null, (gp6) null, (do6) null, (String) null, 0L, (gv0) null, (ftg) null, (ye9) null, 0L, (qqg) null, (e8f) null, (qxc) null, (rp4) null, 65534, (jt3) null), i, i2);
            return;
        }
        if (obj instanceof RelativeSizeSpan) {
            aVar.addStyle(new swf(0L, kwg.getEm(((RelativeSizeSpan) obj).getSizeChange()), (jp6) null, (fp6) null, (gp6) null, (do6) null, (String) null, 0L, (gv0) null, (ftg) null, (ye9) null, 0L, (qqg) null, (e8f) null, (qxc) null, (rp4) null, Utf8.REPLACEMENT_CODE_POINT, (jt3) null), i, i2);
            return;
        }
        if (obj instanceof StrikethroughSpan) {
            aVar.addStyle(new swf(0L, 0L, (jp6) null, (fp6) null, (gp6) null, (do6) null, (String) null, 0L, (gv0) null, (ftg) null, (ye9) null, 0L, qqg.f75141b.getLineThrough(), (e8f) null, (qxc) null, (rp4) null, 61439, (jt3) null), i, i2);
            return;
        }
        if (obj instanceof StyleSpan) {
            swf spanStyle = toSpanStyle((StyleSpan) obj);
            if (spanStyle != null) {
                aVar.addStyle(spanStyle, i, i2);
                return;
            }
            return;
        }
        if (obj instanceof SubscriptSpan) {
            aVar.addStyle(new swf(0L, 0L, (jp6) null, (fp6) null, (gp6) null, (do6) null, (String) null, 0L, gv0.m29859boximpl(gv0.f41237b.m29870getSubscripty9eOQZs()), (ftg) null, (ye9) null, 0L, (qqg) null, (e8f) null, (qxc) null, (rp4) null, wmf.f94775f, (jt3) null), i, i2);
            return;
        }
        if (obj instanceof SuperscriptSpan) {
            aVar.addStyle(new swf(0L, 0L, (jp6) null, (fp6) null, (gp6) null, (do6) null, (String) null, 0L, gv0.m29859boximpl(gv0.f41237b.m29871getSuperscripty9eOQZs()), (ftg) null, (ye9) null, 0L, (qqg) null, (e8f) null, (qxc) null, (rp4) null, wmf.f94775f, (jt3) null), i, i2);
            return;
        }
        if (obj instanceof TypefaceSpan) {
            aVar.addStyle(toSpanStyle((TypefaceSpan) obj), i, i2);
            return;
        }
        if (obj instanceof UnderlineSpan) {
            aVar.addStyle(new swf(0L, 0L, (jp6) null, (fp6) null, (gp6) null, (do6) null, (String) null, 0L, (gv0) null, (ftg) null, (ye9) null, 0L, qqg.f75141b.getUnderline(), (e8f) null, (qxc) null, (rp4) null, 61439, (jt3) null), i, i2);
        } else {
            if (!(obj instanceof URLSpan) || (url = ((URLSpan) obj).getURL()) == null) {
                return;
            }
            aVar.addLink(new b79.C1771b(url, rugVar, e79Var), i, i2);
        }
    }

    private static final void addSpans(C9041lz.a aVar, Spanned spanned, rug rugVar, e79 e79Var) {
        for (Object obj : spanned.getSpans(0, aVar.getLength(), Object.class)) {
            long jTextRange = kvg.TextRange(spanned.getSpanStart(obj), spanned.getSpanEnd(obj));
            addSpan(aVar, obj, jvg.m30593getStartimpl(jTextRange), jvg.m30588getEndimpl(jTextRange), rugVar, e79Var);
        }
    }

    @yfb
    public static final C9041lz fromHtml(@yfb C9041lz.b bVar, @yfb String str, @gib rug rugVar, @gib e79 e79Var) {
        return toAnnotatedString(em7.fromHtml("<ContentHandlerReplacementTag />" + str, 63, null, f82231a), rugVar, e79Var);
    }

    public static /* synthetic */ C9041lz fromHtml$default(C9041lz.b bVar, String str, rug rugVar, e79 e79Var, int i, Object obj) {
        if ((i & 2) != 0) {
            rugVar = null;
        }
        if ((i & 4) != 0) {
            e79Var = null;
        }
        return fromHtml(bVar, str, rugVar, e79Var);
    }

    private static final do6 optionalFontFamilyFromName(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typeface = Typeface.DEFAULT;
        if (md8.areEqual(typefaceCreate, typeface) || md8.areEqual(typefaceCreate, Typeface.create(typeface, 0))) {
            typefaceCreate = null;
        }
        if (typefaceCreate != null) {
            return C15309xv.FontFamily(typefaceCreate);
        }
        return null;
    }

    @yfb
    @fdi
    public static final C9041lz toAnnotatedString(@yfb Spanned spanned, @gib rug rugVar, @gib e79 e79Var) {
        C9041lz.a aVarAppend = new C9041lz.a(spanned.length()).append((CharSequence) spanned);
        addSpans(aVarAppend, spanned, rugVar, e79Var);
        return aVarAppend.toAnnotatedString();
    }

    public static /* synthetic */ C9041lz toAnnotatedString$default(Spanned spanned, rug rugVar, e79 e79Var, int i, Object obj) {
        if ((i & 1) != 0) {
            rugVar = null;
        }
        if ((i & 2) != 0) {
            e79Var = null;
        }
        return toAnnotatedString(spanned, rugVar, e79Var);
    }

    private static final kdc toParagraphStyle(AlignmentSpan alignmentSpan) {
        Layout.Alignment alignment = alignmentSpan.getAlignment();
        int i = alignment == null ? -1 : C12658b.f82234a[alignment.ordinal()];
        return new kdc(i != 1 ? i != 2 ? i != 3 ? bqg.f14513b.m28047getUnspecifiede0LSkKk() : bqg.f14513b.m28042getEnde0LSkKk() : bqg.f14513b.m28041getCentere0LSkKk() : bqg.f14513b.m28046getStarte0LSkKk(), 0, 0L, (ntg) null, (mxc) null, (h69) null, 0, 0, (xug) null, 510, (jt3) null);
    }

    private static final swf toSpanStyle(StyleSpan styleSpan) {
        int style = styleSpan.getStyle();
        if (style == 1) {
            return new swf(0L, 0L, jp6.f51403b.getBold(), (fp6) null, (gp6) null, (do6) null, (String) null, 0L, (gv0) null, (ftg) null, (ye9) null, 0L, (qqg) null, (e8f) null, (qxc) null, (rp4) null, 65531, (jt3) null);
        }
        if (style == 2) {
            return new swf(0L, 0L, (jp6) null, fp6.m29572boximpl(fp6.f37355b.m29581getItalic_LCdwA()), (gp6) null, (do6) null, (String) null, 0L, (gv0) null, (ftg) null, (ye9) null, 0L, (qqg) null, (e8f) null, (qxc) null, (rp4) null, 65527, (jt3) null);
        }
        if (style != 3) {
            return null;
        }
        return new swf(0L, 0L, jp6.f51403b.getBold(), fp6.m29572boximpl(fp6.f37355b.m29581getItalic_LCdwA()), (gp6) null, (do6) null, (String) null, 0L, (gv0) null, (ftg) null, (ye9) null, 0L, (qqg) null, (e8f) null, (qxc) null, (rp4) null, 65523, (jt3) null);
    }

    private static final swf toSpanStyle(TypefaceSpan typefaceSpan) {
        do6 serif;
        String family = typefaceSpan.getFamily();
        do6.C4890a c4890a = do6.f30259b;
        if (md8.areEqual(family, c4890a.getCursive().getName())) {
            serif = c4890a.getCursive();
        } else if (md8.areEqual(family, c4890a.getMonospace().getName())) {
            serif = c4890a.getMonospace();
        } else if (md8.areEqual(family, c4890a.getSansSerif().getName())) {
            serif = c4890a.getSansSerif();
        } else {
            serif = md8.areEqual(family, c4890a.getSerif().getName()) ? c4890a.getSerif() : optionalFontFamilyFromName(typefaceSpan.getFamily());
        }
        return new swf(0L, 0L, (jp6) null, (fp6) null, (gp6) null, serif, (String) null, 0L, (gv0) null, (ftg) null, (ye9) null, 0L, (qqg) null, (e8f) null, (qxc) null, (rp4) null, 65503, (jt3) null);
    }
}
