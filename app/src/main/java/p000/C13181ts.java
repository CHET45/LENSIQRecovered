package p000;

import android.content.Context;
import android.graphics.Typeface;
import p000.f7e;
import p000.v7e;

/* JADX INFO: renamed from: ts */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader_androidKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,86:1\n314#2,11:87\n*S KotlinDebug\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader_androidKt\n*L\n72#1:87,11\n*E\n"})
public final class C13181ts {

    /* JADX INFO: renamed from: ts$a */
    public static final class a extends f7e.AbstractC5672f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dq1<Typeface> f85696a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ i6e f85697b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(dq1<? super Typeface> dq1Var, i6e i6eVar) {
            this.f85696a = dq1Var;
            this.f85697b = i6eVar;
        }

        @Override // p000.f7e.AbstractC5672f
        /* JADX INFO: renamed from: onFontRetrievalFailed */
        public void lambda$callbackFailAsync$1(int i) {
            this.f85696a.cancel(new IllegalStateException("Unable to load font " + this.f85697b + " (reason=" + i + ')'));
        }

        @Override // p000.f7e.AbstractC5672f
        /* JADX INFO: renamed from: onFontRetrieved */
        public void lambda$callbackSuccessAsync$0(@yfb Typeface typeface) {
            dq1<Typeface> dq1Var = this.f85696a;
            v7e.C13927a c13927a = v7e.f90266b;
            dq1Var.resumeWith(v7e.m32723constructorimpl(typeface));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface load(i6e i6eVar, Context context) {
        Typeface font = f7e.getFont(context, i6eVar.getResId());
        md8.checkNotNull(font);
        return font;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadAsync(i6e i6eVar, Context context, zy2<? super Typeface> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        f7e.getFont(context, i6eVar.getResId(), new a(fq1Var, i6eVar), null);
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }
}
