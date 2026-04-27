package p000;

import android.os.CancellationSignal;
import java.util.concurrent.CancellationException;
import p000.jj8;

/* JADX INFO: loaded from: classes.dex */
public final class wl2 {

    /* JADX INFO: renamed from: a */
    public static final boolean f94586a = false;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f94587b = "ScrollCapture";

    /* JADX INFO: renamed from: wl2$a */
    public static final class C14666a extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CancellationSignal f94588a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14666a(CancellationSignal cancellationSignal) {
            super(1);
            this.f94588a = cancellationSignal;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Throwable th) {
            if (th != null) {
                this.f94588a.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jj8 launchWithCancellationSignal(x13 x13Var, CancellationSignal cancellationSignal, gz6<? super x13, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        final jj8 jj8VarLaunch$default = fg1.launch$default(x13Var, null, null, gz6Var, 3, null);
        jj8VarLaunch$default.invokeOnCompletion(new C14666a(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: vl2
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                jj8.C7916a.cancel$default(jj8VarLaunch$default, (CancellationException) null, 1, (Object) null);
            }
        });
        return jj8VarLaunch$default;
    }
}
