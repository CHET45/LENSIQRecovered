package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: renamed from: to */
/* JADX INFO: loaded from: classes.dex */
@c5e(26)
@ug5
@dwf({"SMAP\nAndroidAutofill.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,143:1\n26#2:144\n26#2:145\n26#2:146\n26#2:147\n*S KotlinDebug\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill\n*L\n56#1:144\n57#1:145\n58#1:146\n59#1:147\n*E\n"})
@e0g(parameters = 0)
public final class C13118to implements fm0 {

    /* JADX INFO: renamed from: d */
    public static final int f85423d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final View f85424a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final mm0 f85425b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final AutofillManager f85426c;

    public C13118to(@yfb View view, @yfb mm0 mm0Var) {
        this.f85424a = view;
        this.f85425b = mm0Var;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f85426c = autofillManager;
        view.setImportantForAutofill(1);
    }

    @Override // p000.fm0
    public void cancelAutofillForNode(@yfb lm0 lm0Var) {
        this.f85426c.notifyViewExited(this.f85424a, lm0Var.getId());
    }

    @yfb
    public final AutofillManager getAutofillManager() {
        return this.f85426c;
    }

    @yfb
    public final mm0 getAutofillTree() {
        return this.f85425b;
    }

    @yfb
    public final View getView() {
        return this.f85424a;
    }

    @Override // p000.fm0
    public void requestAutofillForNode(@yfb lm0 lm0Var) {
        rud boundingBox = lm0Var.getBoundingBox();
        if (boundingBox == null) {
            throw new IllegalStateException("requestAutofill called before onChildPositioned()");
        }
        this.f85426c.notifyViewEntered(this.f85424a, lm0Var.getId(), new Rect(Math.round(boundingBox.getLeft()), Math.round(boundingBox.getTop()), Math.round(boundingBox.getRight()), Math.round(boundingBox.getBottom())));
    }
}
