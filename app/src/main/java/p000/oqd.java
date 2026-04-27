package p000;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p000.nqd;

/* JADX INFO: loaded from: classes4.dex */
public class oqd {

    /* JADX INFO: renamed from: g */
    public static final String f68307g = "lib";

    /* JADX INFO: renamed from: a */
    public final Set<String> f68308a;

    /* JADX INFO: renamed from: b */
    public final nqd.InterfaceC10004b f68309b;

    /* JADX INFO: renamed from: c */
    public final nqd.InterfaceC10003a f68310c;

    /* JADX INFO: renamed from: d */
    public boolean f68311d;

    /* JADX INFO: renamed from: e */
    public boolean f68312e;

    /* JADX INFO: renamed from: f */
    public nqd.InterfaceC10006d f68313f;

    /* JADX INFO: renamed from: oqd$a */
    public class RunnableC10502a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f68314a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f68315b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f68316c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ nqd.InterfaceC10005c f68317d;

        public RunnableC10502a(final Context val$context, final String val$library, final String val$version, final nqd.InterfaceC10005c val$listener) {
            this.f68314a = val$context;
            this.f68315b = val$library;
            this.f68316c = val$version;
            this.f68317d = val$listener;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                oqd.this.loadLibraryInternal(this.f68314a, this.f68315b, this.f68316c);
                this.f68317d.success();
            } catch (fwa e) {
                this.f68317d.failure(e);
            } catch (UnsatisfiedLinkError e2) {
                this.f68317d.failure(e2);
            }
        }
    }

    /* JADX INFO: renamed from: oqd$b */
    public class C10503b implements FilenameFilter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f68319a;

        public C10503b(final String val$mappedLibraryName) {
            this.f68319a = val$mappedLibraryName;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File dir, String filename) {
            return filename.startsWith(this.f68319a);
        }
    }

    public oqd() {
        this(new qjg(), new q10());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadLibraryInternal(final Context context, final String library, final String version) throws Throwable {
        if (this.f68308a.contains(library) && !this.f68311d) {
            log("%s already loaded previously!", library);
            return;
        }
        try {
            this.f68309b.loadLibrary(library);
            this.f68308a.add(library);
            log("%s (%s) was loaded normally!", library, version);
        } catch (UnsatisfiedLinkError e) {
            log("Loading the library normally failed: %s", Log.getStackTraceString(e));
            log("%s (%s) was not loaded normally, re-linking...", library, version);
            File fileM18814d = m18814d(context, library, version);
            if (!fileM18814d.exists() || this.f68311d) {
                if (this.f68311d) {
                    log("Forcing a re-link of %s (%s)...", library, version);
                }
                m18812b(context, library, version);
                this.f68310c.installLibrary(context, this.f68309b.supportedAbis(), this.f68309b.mapLibraryName(library), fileM18814d, this);
            }
            try {
                if (this.f68312e) {
                    jy4 jy4Var = null;
                    try {
                        jy4 jy4Var2 = new jy4(fileM18814d);
                        try {
                            List<String> neededDependencies = jy4Var2.parseNeededDependencies();
                            jy4Var2.close();
                            Iterator<String> it = neededDependencies.iterator();
                            while (it.hasNext()) {
                                loadLibrary(context, this.f68309b.unmapLibraryName(it.next()));
                            }
                        } catch (Throwable th) {
                            th = th;
                            jy4Var = jy4Var2;
                            if (jy4Var != null) {
                                jy4Var.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (IOException unused) {
            }
            this.f68309b.loadPath(fileM18814d.getAbsolutePath());
            this.f68308a.add(library);
            log("%s (%s) was re-linked!", library, version);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m18812b(final Context context, final String library, final String currentVersion) {
        File fileM18813c = m18813c(context);
        File fileM18814d = m18814d(context, library, currentVersion);
        File[] fileArrListFiles = fileM18813c.listFiles(new C10503b(this.f68309b.mapLibraryName(library)));
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.f68311d || !file.getAbsolutePath().equals(fileM18814d.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public File m18813c(final Context context) {
        return context.getDir(f68307g, 0);
    }

    /* JADX INFO: renamed from: d */
    public File m18814d(final Context context, final String library, final String version) {
        String strMapLibraryName = this.f68309b.mapLibraryName(library);
        if (mwg.isEmpty(version)) {
            return new File(m18813c(context), strMapLibraryName);
        }
        return new File(m18813c(context), strMapLibraryName + "." + version);
    }

    public oqd force() {
        this.f68311d = true;
        return this;
    }

    public void loadLibrary(final Context context, final String library) {
        loadLibrary(context, library, null, null);
    }

    public oqd log(final nqd.InterfaceC10006d logger) {
        this.f68313f = logger;
        return this;
    }

    public oqd recursively() {
        this.f68312e = true;
        return this;
    }

    public oqd(final nqd.InterfaceC10004b libraryLoader, final nqd.InterfaceC10003a libraryInstaller) {
        this.f68308a = new HashSet();
        if (libraryLoader == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (libraryInstaller == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.f68309b = libraryLoader;
        this.f68310c = libraryInstaller;
    }

    public void loadLibrary(final Context context, final String library, final String version) {
        loadLibrary(context, library, version, null);
    }

    public void log(final String format, final Object... args) {
        log(String.format(Locale.US, format, args));
    }

    public void loadLibrary(final Context context, final String library, final nqd.InterfaceC10005c listener) {
        loadLibrary(context, library, null, listener);
    }

    public void log(final String message) {
        nqd.InterfaceC10006d interfaceC10006d = this.f68313f;
        if (interfaceC10006d != null) {
            interfaceC10006d.log(message);
        }
    }

    public void loadLibrary(final Context context, final String library, final String version, final nqd.InterfaceC10005c listener) {
        if (context != null) {
            if (!mwg.isEmpty(library)) {
                log("Beginning load of %s...", library);
                if (listener == null) {
                    loadLibraryInternal(context, library, version);
                    return;
                } else {
                    new Thread(new RunnableC10502a(context, library, version, listener)).start();
                    return;
                }
            }
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        throw new IllegalArgumentException("Given context is null");
    }
}
