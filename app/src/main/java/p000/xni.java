package p000;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
public final class xni {

    /* JADX INFO: renamed from: b */
    @Deprecated
    public static final int f98736b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f98737c = 1;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public static final int f98738d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f98739e = 2;

    /* JADX INFO: renamed from: a */
    public final C15222e f98740a;

    /* JADX INFO: renamed from: xni$a */
    @c5e(20)
    public static class C15218a extends C15222e {

        /* JADX INFO: renamed from: a */
        @efb
        public final Window f98741a;

        /* JADX INFO: renamed from: b */
        @efb
        public final uuf f98742b;

        public C15218a(@efb Window window, @efb uuf uufVar) {
            this.f98741a = window;
            this.f98742b = uufVar;
        }

        private void hideForType(int i) {
            if (i == 1) {
                m25343f(4);
            } else if (i == 2) {
                m25343f(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.f98742b.hide();
            }
        }

        private void showForType(int i) {
            if (i == 1) {
                m25345h(4);
                m25346i(1024);
            } else if (i == 2) {
                m25345h(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.f98742b.show();
            }
        }

        @Override // p000.xni.C15222e
        /* JADX INFO: renamed from: a */
        public void mo25338a(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, lmi lmiVar) {
        }

        @Override // p000.xni.C15222e
        public void addOnControllableInsetsChangedListener(InterfaceC15223f interfaceC15223f) {
        }

        @Override // p000.xni.C15222e
        /* JADX INFO: renamed from: b */
        public int mo25339b() {
            return 0;
        }

        @Override // p000.xni.C15222e
        /* JADX INFO: renamed from: c */
        public void mo25340c(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    hideForType(i2);
                }
            }
        }

        @Override // p000.xni.C15222e
        /* JADX INFO: renamed from: d */
        public void mo25341d(int i) {
            if (i == 0) {
                m25345h(6144);
                return;
            }
            if (i == 1) {
                m25345h(4096);
                m25343f(2048);
            } else {
                if (i != 2) {
                    return;
                }
                m25345h(2048);
                m25343f(4096);
            }
        }

        @Override // p000.xni.C15222e
        /* JADX INFO: renamed from: e */
        public void mo25342e(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    showForType(i2);
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m25343f(int i) {
            View decorView = this.f98741a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: g */
        public void m25344g(int i) {
            this.f98741a.addFlags(i);
        }

        /* JADX INFO: renamed from: h */
        public void m25345h(int i) {
            View decorView = this.f98741a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: i */
        public void m25346i(int i) {
            this.f98741a.clearFlags(i);
        }

        @Override // p000.xni.C15222e
        public void removeOnControllableInsetsChangedListener(@efb InterfaceC15223f interfaceC15223f) {
        }
    }

    /* JADX INFO: renamed from: xni$b */
    @c5e(23)
    public static class C15219b extends C15218a {
        public C15219b(@efb Window window, @efb uuf uufVar) {
            super(window, uufVar);
        }

        @Override // p000.xni.C15222e
        public boolean isAppearanceLightStatusBars() {
            return (this.f98741a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // p000.xni.C15222e
        public void setAppearanceLightStatusBars(boolean z) {
            if (!z) {
                m25345h(8192);
                return;
            }
            m25346i(67108864);
            m25344g(Integer.MIN_VALUE);
            m25343f(8192);
        }
    }

    /* JADX INFO: renamed from: xni$c */
    @c5e(26)
    public static class C15220c extends C15219b {
        public C15220c(@efb Window window, @efb uuf uufVar) {
            super(window, uufVar);
        }

        @Override // p000.xni.C15222e
        public boolean isAppearanceLightNavigationBars() {
            return (this.f98741a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // p000.xni.C15222e
        public void setAppearanceLightNavigationBars(boolean z) {
            if (!z) {
                m25345h(16);
                return;
            }
            m25346i(134217728);
            m25344g(Integer.MIN_VALUE);
            m25343f(16);
        }
    }

    /* JADX INFO: renamed from: xni$e */
    public static class C15222e {
        /* JADX INFO: renamed from: a */
        public void mo25338a(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, lmi lmiVar) {
        }

        public void addOnControllableInsetsChangedListener(InterfaceC15223f interfaceC15223f) {
        }

        /* JADX INFO: renamed from: b */
        public int mo25339b() {
            return 0;
        }

        /* JADX INFO: renamed from: c */
        public void mo25340c(int i) {
        }

        /* JADX INFO: renamed from: d */
        public void mo25341d(int i) {
        }

        /* JADX INFO: renamed from: e */
        public void mo25342e(int i) {
        }

        public boolean isAppearanceLightNavigationBars() {
            return false;
        }

        public boolean isAppearanceLightStatusBars() {
            return false;
        }

        public void removeOnControllableInsetsChangedListener(@efb InterfaceC15223f interfaceC15223f) {
        }

        public void setAppearanceLightNavigationBars(boolean z) {
        }

        public void setAppearanceLightStatusBars(boolean z) {
        }
    }

    /* JADX INFO: renamed from: xni$f */
    public interface InterfaceC15223f {
        void onControllableInsetsChanged(@efb xni xniVar, int i);
    }

    @c5e(30)
    @Deprecated
    private xni(@efb WindowInsetsController windowInsetsController) {
        this.f98740a = new C15221d(windowInsetsController, this, new uuf(windowInsetsController));
    }

    @c5e(30)
    @efb
    @Deprecated
    public static xni toWindowInsetsControllerCompat(@efb WindowInsetsController windowInsetsController) {
        return new xni(windowInsetsController);
    }

    public void addOnControllableInsetsChangedListener(@efb InterfaceC15223f interfaceC15223f) {
        this.f98740a.addOnControllableInsetsChangedListener(interfaceC15223f);
    }

    public void controlWindowInsetsAnimation(int i, long j, @hib Interpolator interpolator, @hib CancellationSignal cancellationSignal, @efb lmi lmiVar) {
        this.f98740a.mo25338a(i, j, interpolator, cancellationSignal, lmiVar);
    }

    @igg({"WrongConstant"})
    public int getSystemBarsBehavior() {
        return this.f98740a.mo25339b();
    }

    public void hide(int i) {
        this.f98740a.mo25340c(i);
    }

    public boolean isAppearanceLightNavigationBars() {
        return this.f98740a.isAppearanceLightNavigationBars();
    }

    public boolean isAppearanceLightStatusBars() {
        return this.f98740a.isAppearanceLightStatusBars();
    }

    public void removeOnControllableInsetsChangedListener(@efb InterfaceC15223f interfaceC15223f) {
        this.f98740a.removeOnControllableInsetsChangedListener(interfaceC15223f);
    }

    public void setAppearanceLightNavigationBars(boolean z) {
        this.f98740a.setAppearanceLightNavigationBars(z);
    }

    public void setAppearanceLightStatusBars(boolean z) {
        this.f98740a.setAppearanceLightStatusBars(z);
    }

    public void setSystemBarsBehavior(int i) {
        this.f98740a.mo25341d(i);
    }

    public void show(int i) {
        this.f98740a.mo25342e(i);
    }

    /* JADX INFO: renamed from: xni$d */
    @c5e(30)
    public static class C15221d extends C15222e {

        /* JADX INFO: renamed from: a */
        public final xni f98743a;

        /* JADX INFO: renamed from: b */
        public final WindowInsetsController f98744b;

        /* JADX INFO: renamed from: c */
        public final uuf f98745c;

        /* JADX INFO: renamed from: d */
        public final scf<InterfaceC15223f, WindowInsetsController.OnControllableInsetsChangedListener> f98746d;

        /* JADX INFO: renamed from: e */
        public Window f98747e;

        /* JADX INFO: renamed from: xni$d$a */
        public class a implements WindowInsetsAnimationControlListener {

            /* JADX INFO: renamed from: a */
            public rmi f98748a = null;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ lmi f98749b;

            public a(lmi lmiVar) {
                this.f98749b = lmiVar;
            }

            public void onCancelled(@hib WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f98749b.onCancelled(windowInsetsAnimationController == null ? null : this.f98748a);
            }

            public void onFinished(@efb WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f98749b.onFinished(this.f98748a);
            }

            public void onReady(@efb WindowInsetsAnimationController windowInsetsAnimationController, int i) {
                rmi rmiVar = new rmi(windowInsetsAnimationController);
                this.f98748a = rmiVar;
                this.f98749b.onReady(rmiVar, i);
            }
        }

        public C15221d(@efb Window window, @efb xni xniVar, @efb uuf uufVar) {
            this(window.getInsetsController(), xniVar, uufVar);
            this.f98747e = window;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$addOnControllableInsetsChangedListener$0(InterfaceC15223f interfaceC15223f, WindowInsetsController windowInsetsController, int i) {
            if (this.f98744b == windowInsetsController) {
                interfaceC15223f.onControllableInsetsChanged(this.f98743a, i);
            }
        }

        @Override // p000.xni.C15222e
        /* JADX INFO: renamed from: a */
        public void mo25338a(int i, long j, @hib Interpolator interpolator, @hib CancellationSignal cancellationSignal, @efb lmi lmiVar) {
            this.f98744b.controlWindowInsetsAnimation(i, j, interpolator, cancellationSignal, new a(lmiVar));
        }

        @Override // p000.xni.C15222e
        public void addOnControllableInsetsChangedListener(@efb final InterfaceC15223f interfaceC15223f) {
            if (this.f98746d.containsKey(interfaceC15223f)) {
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: eoi
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
                    this.f33758a.lambda$addOnControllableInsetsChangedListener$0(interfaceC15223f, windowInsetsController, i);
                }
            };
            this.f98746d.put(interfaceC15223f, onControllableInsetsChangedListener);
            this.f98744b.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        }

        @Override // p000.xni.C15222e
        @igg({"WrongConstant"})
        /* JADX INFO: renamed from: b */
        public int mo25339b() {
            return this.f98744b.getSystemBarsBehavior();
        }

        @Override // p000.xni.C15222e
        /* JADX INFO: renamed from: c */
        public void mo25340c(int i) {
            if ((i & 8) != 0) {
                this.f98745c.hide();
            }
            this.f98744b.hide(i & (-9));
        }

        @Override // p000.xni.C15222e
        /* JADX INFO: renamed from: d */
        public void mo25341d(int i) {
            this.f98744b.setSystemBarsBehavior(i);
        }

        @Override // p000.xni.C15222e
        /* JADX INFO: renamed from: e */
        public void mo25342e(int i) {
            if ((i & 8) != 0) {
                this.f98745c.show();
            }
            this.f98744b.show(i & (-9));
        }

        /* JADX INFO: renamed from: g */
        public void m25348g(int i) {
            View decorView = this.f98747e.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: h */
        public void m25349h(int i) {
            View decorView = this.f98747e.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        @Override // p000.xni.C15222e
        public boolean isAppearanceLightNavigationBars() {
            this.f98744b.setSystemBarsAppearance(0, 0);
            return (this.f98744b.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // p000.xni.C15222e
        public boolean isAppearanceLightStatusBars() {
            this.f98744b.setSystemBarsAppearance(0, 0);
            return (this.f98744b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // p000.xni.C15222e
        public void removeOnControllableInsetsChangedListener(@efb InterfaceC15223f interfaceC15223f) {
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListenerM4112a = coi.m4112a(this.f98746d.remove(interfaceC15223f));
            if (onControllableInsetsChangedListenerM4112a != null) {
                this.f98744b.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListenerM4112a);
            }
        }

        @Override // p000.xni.C15222e
        public void setAppearanceLightNavigationBars(boolean z) {
            if (z) {
                if (this.f98747e != null) {
                    m25348g(16);
                }
                this.f98744b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f98747e != null) {
                    m25349h(16);
                }
                this.f98744b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // p000.xni.C15222e
        public void setAppearanceLightStatusBars(boolean z) {
            if (z) {
                if (this.f98747e != null) {
                    m25348g(8192);
                }
                this.f98744b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f98747e != null) {
                    m25349h(8192);
                }
                this.f98744b.setSystemBarsAppearance(0, 8);
            }
        }

        public C15221d(@efb WindowInsetsController windowInsetsController, @efb xni xniVar, @efb uuf uufVar) {
            this.f98746d = new scf<>();
            this.f98744b = windowInsetsController;
            this.f98743a = xniVar;
            this.f98745c = uufVar;
        }
    }

    public xni(@efb Window window, @efb View view) {
        uuf uufVar = new uuf(view);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f98740a = new C15221d(window, this, uufVar);
        } else {
            this.f98740a = new C15220c(window, uufVar);
        }
    }
}
