package p000;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;

/* JADX INFO: renamed from: hq */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,609:1\n1#2:610\n*E\n"})
@e0g(parameters = 0)
public final class C6971hq implements a52 {

    /* JADX INFO: renamed from: b */
    public static final int f44518b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final ClipboardManager f44519a;

    public C6971hq(@yfb ClipboardManager clipboardManager) {
        this.f44519a = clipboardManager;
    }

    @Override // p000.a52
    @gib
    public u42 getClip() {
        ClipData primaryClip = this.f44519a.getPrimaryClip();
        if (primaryClip != null) {
            return new u42(primaryClip);
        }
        return null;
    }

    @Override // p000.a52
    @yfb
    public ClipboardManager getNativeClipboard() {
        return this.f44519a;
    }

    @Override // p000.a52
    @gib
    public C9041lz getText() {
        ClipData primaryClip = this.f44519a.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        return C7562iq.convertToAnnotatedString(itemAt != null ? itemAt.getText() : null);
    }

    @Override // p000.a52
    public boolean hasText() {
        ClipDescription primaryClipDescription = this.f44519a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    @Override // p000.a52
    public void setClip(@gib u42 u42Var) {
        if (u42Var != null) {
            this.f44519a.setPrimaryClip(u42Var.getClipData());
        } else if (Build.VERSION.SDK_INT >= 28) {
            q00.clearPrimaryClip(this.f44519a);
        } else {
            this.f44519a.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }

    @Override // p000.a52
    public void setText(@yfb C9041lz c9041lz) {
        this.f44519a.setPrimaryClip(ClipData.newPlainText(C7562iq.f47874a, C7562iq.convertToCharSequence(c9041lz)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6971hq(@yfb Context context) {
        Object systemService = context.getSystemService("clipboard");
        md8.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this((ClipboardManager) systemService);
    }
}
