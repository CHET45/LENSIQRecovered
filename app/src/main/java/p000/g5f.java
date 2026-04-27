package p000;

import java.io.File;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class g5f {

    /* JADX INFO: renamed from: a */
    public final C6138c f38826a;

    /* JADX INFO: renamed from: b */
    public final File f38827b;

    /* JADX INFO: renamed from: c */
    public final File f38828c;

    /* JADX INFO: renamed from: d */
    public final File f38829d;

    /* JADX INFO: renamed from: e */
    public final File f38830e;

    /* JADX INFO: renamed from: f */
    public final File f38831f;

    /* JADX INFO: renamed from: g */
    public final File f38832g;

    /* JADX INFO: renamed from: g5f$b */
    public static final class C6137b {

        /* JADX INFO: renamed from: a */
        public C6138c f38833a;

        /* JADX INFO: renamed from: b */
        public File f38834b;

        /* JADX INFO: renamed from: c */
        public File f38835c;

        /* JADX INFO: renamed from: d */
        public File f38836d;

        /* JADX INFO: renamed from: e */
        public File f38837e;

        /* JADX INFO: renamed from: f */
        public File f38838f;

        /* JADX INFO: renamed from: g */
        public File f38839g;

        /* JADX INFO: renamed from: h */
        public C6137b m11402h(File file) {
            this.f38837e = file;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C6137b m11403i(File file) {
            this.f38834b = file;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public g5f m11404j() {
            return new g5f(this);
        }

        /* JADX INFO: renamed from: k */
        public C6137b m11405k(File file) {
            this.f38838f = file;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C6137b m11406l(File file) {
            this.f38835c = file;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C6137b m11407m(C6138c c6138c) {
            this.f38833a = c6138c;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C6137b m11408n(File file) {
            this.f38839g = file;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C6137b m11409o(File file) {
            this.f38836d = file;
            return this;
        }
    }

    /* JADX INFO: renamed from: g5f$c */
    public static final class C6138c {

        /* JADX INFO: renamed from: a */
        @hib
        public final File f38840a;

        /* JADX INFO: renamed from: b */
        @hib
        public final z33.AbstractC15960a f38841b;

        public C6138c(@hib File file, @hib z33.AbstractC15960a abstractC15960a) {
            this.f38840a = file;
            this.f38841b = abstractC15960a;
        }

        /* JADX INFO: renamed from: a */
        public boolean m11410a() {
            File file = this.f38840a;
            return (file != null && file.exists()) || this.f38841b != null;
        }
    }

    private g5f(C6137b c6137b) {
        this.f38826a = c6137b.f38833a;
        this.f38827b = c6137b.f38834b;
        this.f38828c = c6137b.f38835c;
        this.f38829d = c6137b.f38836d;
        this.f38830e = c6137b.f38837e;
        this.f38831f = c6137b.f38838f;
        this.f38832g = c6137b.f38839g;
    }
}
