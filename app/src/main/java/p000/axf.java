package p000;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSpannableStringBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,163:1\n74#1,4:164\n74#1,4:168\n74#1,4:172\n74#1,4:176\n74#1,4:180\n74#1,4:184\n74#1,4:188\n74#1,4:192\n74#1,4:196\n*S KotlinDebug\n*F\n+ 1 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n87#1:164,4\n96#1:168,4\n105#1:172,4\n115#1:176,4\n125#1:180,4\n134#1:184,4\n144#1:188,4\n153#1:192,4\n162#1:196,4\n*E\n"})
public final class axf {
    @yfb
    public static final SpannableStringBuilder backgroundColor(@yfb SpannableStringBuilder spannableStringBuilder, @g92 int i, @yfb qy6<? super SpannableStringBuilder, bth> qy6Var) {
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i);
        int length = spannableStringBuilder.length();
        qy6Var.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @yfb
    public static final SpannableStringBuilder bold(@yfb SpannableStringBuilder spannableStringBuilder, @yfb qy6<? super SpannableStringBuilder, bth> qy6Var) {
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        qy6Var.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @yfb
    public static final SpannedString buildSpannedString(@yfb qy6<? super SpannableStringBuilder, bth> qy6Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        qy6Var.invoke(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    @yfb
    public static final SpannableStringBuilder color(@yfb SpannableStringBuilder spannableStringBuilder, @g92 int i, @yfb qy6<? super SpannableStringBuilder, bth> qy6Var) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int length = spannableStringBuilder.length();
        qy6Var.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @yfb
    public static final SpannableStringBuilder inSpans(@yfb SpannableStringBuilder spannableStringBuilder, @yfb Object[] objArr, @yfb qy6<? super SpannableStringBuilder, bth> qy6Var) {
        int length = spannableStringBuilder.length();
        qy6Var.invoke(spannableStringBuilder);
        for (Object obj : objArr) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    @yfb
    public static final SpannableStringBuilder italic(@yfb SpannableStringBuilder spannableStringBuilder, @yfb qy6<? super SpannableStringBuilder, bth> qy6Var) {
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        qy6Var.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @yfb
    public static final SpannableStringBuilder scale(@yfb SpannableStringBuilder spannableStringBuilder, float f, @yfb qy6<? super SpannableStringBuilder, bth> qy6Var) {
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f);
        int length = spannableStringBuilder.length();
        qy6Var.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @yfb
    public static final SpannableStringBuilder strikeThrough(@yfb SpannableStringBuilder spannableStringBuilder, @yfb qy6<? super SpannableStringBuilder, bth> qy6Var) {
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        qy6Var.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @yfb
    public static final SpannableStringBuilder subscript(@yfb SpannableStringBuilder spannableStringBuilder, @yfb qy6<? super SpannableStringBuilder, bth> qy6Var) {
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        qy6Var.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @yfb
    public static final SpannableStringBuilder superscript(@yfb SpannableStringBuilder spannableStringBuilder, @yfb qy6<? super SpannableStringBuilder, bth> qy6Var) {
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        qy6Var.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @yfb
    public static final SpannableStringBuilder underline(@yfb SpannableStringBuilder spannableStringBuilder, @yfb qy6<? super SpannableStringBuilder, bth> qy6Var) {
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        qy6Var.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @yfb
    public static final SpannableStringBuilder inSpans(@yfb SpannableStringBuilder spannableStringBuilder, @yfb Object obj, @yfb qy6<? super SpannableStringBuilder, bth> qy6Var) {
        int length = spannableStringBuilder.length();
        qy6Var.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
