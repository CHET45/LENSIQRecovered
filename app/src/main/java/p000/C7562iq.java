package p000;

import android.content.ClipData;
import android.content.ClipDescription;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;
import p000.C9041lz;

/* JADX INFO: renamed from: iq */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,609:1\n33#2,6:610\n*S KotlinDebug\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n*L\n168#1:610,6\n*E\n"})
public final class C7562iq {

    /* JADX INFO: renamed from: A */
    public static final int f47865A = 8;

    /* JADX INFO: renamed from: B */
    public static final int f47866B = 5;

    /* JADX INFO: renamed from: C */
    public static final int f47867C = 4;

    /* JADX INFO: renamed from: D */
    public static final int f47868D = 1;

    /* JADX INFO: renamed from: E */
    public static final int f47869E = 1;

    /* JADX INFO: renamed from: F */
    public static final int f47870F = 4;

    /* JADX INFO: renamed from: G */
    public static final int f47871G = 8;

    /* JADX INFO: renamed from: H */
    public static final int f47872H = 4;

    /* JADX INFO: renamed from: I */
    public static final int f47873I = 20;

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f47874a = "plain text";

    /* JADX INFO: renamed from: b */
    public static final byte f47875b = 0;

    /* JADX INFO: renamed from: c */
    public static final byte f47876c = 1;

    /* JADX INFO: renamed from: d */
    public static final byte f47877d = 2;

    /* JADX INFO: renamed from: e */
    public static final byte f47878e = 0;

    /* JADX INFO: renamed from: f */
    public static final byte f47879f = 1;

    /* JADX INFO: renamed from: g */
    public static final byte f47880g = 0;

    /* JADX INFO: renamed from: h */
    public static final byte f47881h = 1;

    /* JADX INFO: renamed from: i */
    public static final byte f47882i = 2;

    /* JADX INFO: renamed from: j */
    public static final byte f47883j = 3;

    /* JADX INFO: renamed from: k */
    public static final byte f47884k = 1;

    /* JADX INFO: renamed from: l */
    public static final byte f47885l = 2;

    /* JADX INFO: renamed from: m */
    public static final byte f47886m = 3;

    /* JADX INFO: renamed from: n */
    public static final byte f47887n = 4;

    /* JADX INFO: renamed from: o */
    public static final byte f47888o = 5;

    /* JADX INFO: renamed from: p */
    public static final byte f47889p = 6;

    /* JADX INFO: renamed from: q */
    public static final byte f47890q = 7;

    /* JADX INFO: renamed from: r */
    public static final byte f47891r = 8;

    /* JADX INFO: renamed from: s */
    public static final byte f47892s = 9;

    /* JADX INFO: renamed from: t */
    public static final byte f47893t = 10;

    /* JADX INFO: renamed from: u */
    public static final byte f47894u = 11;

    /* JADX INFO: renamed from: v */
    public static final byte f47895v = 12;

    /* JADX INFO: renamed from: w */
    public static final int f47896w = 1;

    /* JADX INFO: renamed from: x */
    public static final int f47897x = 4;

    /* JADX INFO: renamed from: y */
    public static final int f47898y = 4;

    /* JADX INFO: renamed from: z */
    public static final int f47899z = 8;

    @gib
    public static final C9041lz convertToAnnotatedString(@gib CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new C9041lz(charSequence.toString(), null, null, 6, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int lastIndex = e80.getLastIndex(annotationArr);
        if (lastIndex >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i];
                if (md8.areEqual(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new C9041lz.c(new dl3(annotation.getValue()).decodeSpanStyle(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return new C9041lz(charSequence.toString(), arrayList, null, 4, null);
    }

    @yfb
    public static final CharSequence convertToCharSequence(@yfb C9041lz c9041lz) {
        if (c9041lz.getSpanStyles().isEmpty()) {
            return c9041lz.getText();
        }
        SpannableString spannableString = new SpannableString(c9041lz.getText());
        e15 e15Var = new e15();
        List<C9041lz.c<swf>> spanStyles = c9041lz.getSpanStyles();
        int size = spanStyles.size();
        for (int i = 0; i < size; i++) {
            C9041lz.c<swf> cVar = spanStyles.get(i);
            swf swfVarComponent1 = cVar.component1();
            int iComponent2 = cVar.component2();
            int iComponent3 = cVar.component3();
            e15Var.reset();
            e15Var.encode(swfVarComponent1);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", e15Var.encodedString()), iComponent2, iComponent3, 33);
        }
        return spannableString;
    }

    @yfb
    public static final u42 toClipEntry(@yfb ClipData clipData) {
        return new u42(clipData);
    }

    @yfb
    public static final w42 toClipMetadata(@yfb ClipDescription clipDescription) {
        return new w42(clipDescription);
    }
}
