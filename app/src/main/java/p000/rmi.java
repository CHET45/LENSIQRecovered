package p000;

import android.view.WindowInsetsAnimationController;

/* JADX INFO: loaded from: classes3.dex */
public final class rmi {

    /* JADX INFO: renamed from: a */
    public final C12161b f78743a;

    /* JADX INFO: renamed from: rmi$a */
    @c5e(30)
    public static class C12160a extends C12161b {

        /* JADX INFO: renamed from: a */
        public final WindowInsetsAnimationController f78744a;

        public C12160a(@efb WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f78744a = windowInsetsAnimationController;
        }

        @Override // p000.rmi.C12161b
        /* JADX INFO: renamed from: a */
        public void mo21430a(boolean z) {
            this.f78744a.finish(z);
        }

        @Override // p000.rmi.C12161b
        /* JADX INFO: renamed from: b */
        public boolean mo21431b() {
            return this.f78744a.isCancelled();
        }

        @Override // p000.rmi.C12161b
        /* JADX INFO: renamed from: c */
        public boolean mo21432c() {
            return this.f78744a.isFinished();
        }

        @Override // p000.rmi.C12161b
        public float getCurrentAlpha() {
            return this.f78744a.getCurrentAlpha();
        }

        @Override // p000.rmi.C12161b
        public float getCurrentFraction() {
            return this.f78744a.getCurrentFraction();
        }

        @Override // p000.rmi.C12161b
        @efb
        public r48 getCurrentInsets() {
            return r48.toCompatInsets(this.f78744a.getCurrentInsets());
        }

        @Override // p000.rmi.C12161b
        @efb
        public r48 getHiddenStateInsets() {
            return r48.toCompatInsets(this.f78744a.getHiddenStateInsets());
        }

        @Override // p000.rmi.C12161b
        @efb
        public r48 getShownStateInsets() {
            return r48.toCompatInsets(this.f78744a.getShownStateInsets());
        }

        @Override // p000.rmi.C12161b
        @igg({"WrongConstant"})
        public int getTypes() {
            return this.f78744a.getTypes();
        }

        @Override // p000.rmi.C12161b
        public void setInsetsAndAlpha(@hib r48 r48Var, float f, float f2) {
            this.f78744a.setInsetsAndAlpha(r48Var == null ? null : r48Var.toPlatformInsets(), f, f2);
        }
    }

    /* JADX INFO: renamed from: rmi$b */
    public static class C12161b {
        /* JADX INFO: renamed from: a */
        public void mo21430a(boolean z) {
        }

        /* JADX INFO: renamed from: b */
        public boolean mo21431b() {
            return true;
        }

        /* JADX INFO: renamed from: c */
        public boolean mo21432c() {
            return false;
        }

        public float getCurrentAlpha() {
            return 0.0f;
        }

        @y46(from = 0.0d, m25645to = 1.0d)
        public float getCurrentFraction() {
            return 0.0f;
        }

        @efb
        public r48 getCurrentInsets() {
            return r48.f77013e;
        }

        @efb
        public r48 getHiddenStateInsets() {
            return r48.f77013e;
        }

        @efb
        public r48 getShownStateInsets() {
            return r48.f77013e;
        }

        public int getTypes() {
            return 0;
        }

        public void setInsetsAndAlpha(@hib r48 r48Var, @y46(from = 0.0d, m25645to = 1.0d) float f, @y46(from = 0.0d, m25645to = 1.0d) float f2) {
        }
    }

    @c5e(30)
    public rmi(@efb WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f78743a = new C12160a(windowInsetsAnimationController);
    }

    public void finish(boolean z) {
        this.f78743a.mo21430a(z);
    }

    public float getCurrentAlpha() {
        return this.f78743a.getCurrentAlpha();
    }

    @y46(from = 0.0d, m25645to = 1.0d)
    public float getCurrentFraction() {
        return this.f78743a.getCurrentFraction();
    }

    @efb
    public r48 getCurrentInsets() {
        return this.f78743a.getCurrentInsets();
    }

    @efb
    public r48 getHiddenStateInsets() {
        return this.f78743a.getHiddenStateInsets();
    }

    @efb
    public r48 getShownStateInsets() {
        return this.f78743a.getShownStateInsets();
    }

    public int getTypes() {
        return this.f78743a.getTypes();
    }

    public boolean isCancelled() {
        return this.f78743a.mo21431b();
    }

    public boolean isFinished() {
        return this.f78743a.mo21432c();
    }

    public boolean isReady() {
        return (isFinished() || isCancelled()) ? false : true;
    }

    public void setInsetsAndAlpha(@hib r48 r48Var, @y46(from = 0.0d, m25645to = 1.0d) float f, @y46(from = 0.0d, m25645to = 1.0d) float f2) {
        this.f78743a.setInsetsAndAlpha(r48Var, f, f2);
    }
}
