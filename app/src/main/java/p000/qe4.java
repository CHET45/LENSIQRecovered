package p000;

import java.io.File;
import p000.le4;

/* JADX INFO: loaded from: classes3.dex */
public class qe4 implements le4.InterfaceC8783a {

    /* JADX INFO: renamed from: c */
    public final long f74198c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC11454c f74199d;

    /* JADX INFO: renamed from: qe4$a */
    public class C11452a implements InterfaceC11454c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f74200a;

        public C11452a(String str) {
            this.f74200a = str;
        }

        @Override // p000.qe4.InterfaceC11454c
        public File getCacheDirectory() {
            return new File(this.f74200a);
        }
    }

    /* JADX INFO: renamed from: qe4$b */
    public class C11453b implements InterfaceC11454c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f74201a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f74202b;

        public C11453b(String str, String str2) {
            this.f74201a = str;
            this.f74202b = str2;
        }

        @Override // p000.qe4.InterfaceC11454c
        public File getCacheDirectory() {
            return new File(this.f74201a, this.f74202b);
        }
    }

    /* JADX INFO: renamed from: qe4$c */
    public interface InterfaceC11454c {
        File getCacheDirectory();
    }

    public qe4(String str, long j) {
        this(new C11452a(str), j);
    }

    @Override // p000.le4.InterfaceC8783a
    public le4 build() {
        File cacheDirectory = this.f74199d.getCacheDirectory();
        if (cacheDirectory == null) {
            return null;
        }
        if (cacheDirectory.isDirectory() || cacheDirectory.mkdirs()) {
            return re4.create(cacheDirectory, this.f74198c);
        }
        return null;
    }

    public qe4(String str, String str2, long j) {
        this(new C11453b(str, str2), j);
    }

    public qe4(InterfaceC11454c interfaceC11454c, long j) {
        this.f74198c = j;
        this.f74199d = interfaceC11454c;
    }
}
