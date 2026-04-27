package p000;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.uuf;

/* JADX INFO: loaded from: classes3.dex */
public final class uuf {

    /* JADX INFO: renamed from: a */
    public final C13722c f89176a;

    /* JADX INFO: renamed from: uuf$a */
    @c5e(20)
    public static class C13720a extends C13722c {

        /* JADX INFO: renamed from: a */
        @hib
        public final View f89177a;

        public C13720a(@hib View view) {
            this.f89177a = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$show$0(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // p000.uuf.C13722c
        /* JADX INFO: renamed from: a */
        public void mo23584a() {
            View view = this.f89177a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f89177a.getWindowToken(), 0);
            }
        }

        @Override // p000.uuf.C13722c
        /* JADX INFO: renamed from: b */
        public void mo23585b() {
            final View viewFindViewById = this.f89177a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f89177a.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: tuf
                @Override // java.lang.Runnable
                public final void run() {
                    uuf.C13720a.lambda$show$0(viewFindViewById);
                }
            });
        }
    }

    /* JADX INFO: renamed from: uuf$c */
    public static class C13722c {
        /* JADX INFO: renamed from: a */
        public void mo23584a() {
        }

        /* JADX INFO: renamed from: b */
        public void mo23585b() {
        }
    }

    public uuf(@efb View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f89176a = new C13721b(view);
        } else {
            this.f89176a = new C13720a(view);
        }
    }

    public void hide() {
        this.f89176a.mo23584a();
    }

    public void show() {
        this.f89176a.mo23585b();
    }

    /* JADX INFO: renamed from: uuf$b */
    @c5e(30)
    public static class C13721b extends C13720a {

        /* JADX INFO: renamed from: b */
        @hib
        public View f89178b;

        /* JADX INFO: renamed from: c */
        @hib
        public WindowInsetsController f89179c;

        public C13721b(@efb View view) {
            super(view);
            this.f89178b = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$hide$0(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i) {
            atomicBoolean.set((i & 8) != 0);
        }

        @Override // p000.uuf.C13720a, p000.uuf.C13722c
        /* JADX INFO: renamed from: a */
        public void mo23584a() {
            View view;
            WindowInsetsController windowInsetsController = this.f89179c;
            if (windowInsetsController == null) {
                View view2 = this.f89178b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.mo23584a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: avf
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    uuf.C13721b.lambda$hide$0(atomicBoolean, windowInsetsController2, i);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f89178b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f89178b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // p000.uuf.C13720a, p000.uuf.C13722c
        /* JADX INFO: renamed from: b */
        public void mo23585b() {
            View view = this.f89178b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f89179c;
            if (windowInsetsController == null) {
                View view2 = this.f89178b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.mo23585b();
        }

        public C13721b(@hib WindowInsetsController windowInsetsController) {
            super(null);
            this.f89179c = windowInsetsController;
        }
    }

    @c5e(30)
    @Deprecated
    public uuf(@efb WindowInsetsController windowInsetsController) {
        this.f89176a = new C13721b(windowInsetsController);
    }
}
