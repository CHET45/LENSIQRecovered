package p000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import p000.p7e;

/* JADX INFO: renamed from: e6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5134e6 extends ClickableSpan {

    /* JADX INFO: renamed from: d */
    @p7e({p7e.EnumC10826a.f69936c})
    public static final String f31879d = "ACCESSIBILITY_CLICKABLE_SPAN_ID";

    /* JADX INFO: renamed from: a */
    public final int f31880a;

    /* JADX INFO: renamed from: b */
    public final C6730h7 f31881b;

    /* JADX INFO: renamed from: c */
    public final int f31882c;

    @p7e({p7e.EnumC10826a.f69936c})
    public C5134e6(int i, @efb C6730h7 c6730h7, int i2) {
        this.f31880a = i;
        this.f31881b = c6730h7;
        this.f31882c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@efb View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(f31879d, this.f31880a);
        this.f31881b.performAction(this.f31882c, bundle);
    }
}
