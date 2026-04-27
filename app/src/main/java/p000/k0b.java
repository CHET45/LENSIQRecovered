package p000;

import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.widget.TextView;
import p000.tu9;

/* JADX INFO: loaded from: classes7.dex */
public class k0b extends AbstractC14875x2 {

    /* JADX INFO: renamed from: a */
    @hib
    public final MovementMethod f52330a;

    public k0b(@hib MovementMethod movementMethod) {
        this.f52330a = movementMethod;
    }

    @efb
    @Deprecated
    public static k0b create() {
        return create(LinkMovementMethod.getInstance());
    }

    @efb
    public static k0b link() {
        return create(LinkMovementMethod.getInstance());
    }

    @efb
    public static k0b none() {
        return new k0b(null);
    }

    @Override // p000.AbstractC14875x2, p000.tu9
    public void beforeSetText(@efb TextView textView, @efb Spanned spanned) {
        MovementMethod movementMethod = textView.getMovementMethod();
        MovementMethod movementMethod2 = this.f52330a;
        if (movementMethod != movementMethod2) {
            textView.setMovementMethod(movementMethod2);
        }
    }

    @Override // p000.AbstractC14875x2, p000.tu9
    public void configure(@efb tu9.InterfaceC13246b interfaceC13246b) {
        ((n03) interfaceC13246b.require(n03.class)).hasExplicitMovementMethod(true);
    }

    @efb
    public static k0b create(@efb MovementMethod movementMethod) {
        return new k0b(movementMethod);
    }
}
