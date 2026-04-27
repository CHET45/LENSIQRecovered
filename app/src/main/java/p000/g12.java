package p000;

import com.blankj.utilcode.util.C2473f;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.dy7;
import p000.g12;
import p000.kx7;

/* JADX INFO: loaded from: classes5.dex */
@px4
public final class g12 {

    /* JADX INFO: renamed from: b */
    public static final Logger f38198b = Logger.getLogger(g12.class.getName());

    /* JADX INFO: renamed from: c */
    public static final azf f38199c = azf.m2776on(C2473f.f17566z).omitEmptyStrings();

    /* JADX INFO: renamed from: d */
    public static final String f38200d = ".class";

    /* JADX INFO: renamed from: a */
    public final dy7<C6080c> f38201a;

    /* JADX INFO: renamed from: g12$a */
    public static final class C6078a extends C6080c {

        /* JADX INFO: renamed from: d */
        public final String f38202d;

        public C6078a(File file, String resourceName, ClassLoader loader) {
            super(file, resourceName, loader);
            this.f38202d = g12.m11296b(resourceName);
        }

        public String getName() {
            return this.f38202d;
        }

        public String getPackageName() {
            return wvd.getPackageName(this.f38202d);
        }

        public String getSimpleName() {
            int iLastIndexOf = this.f38202d.lastIndexOf(36);
            if (iLastIndexOf != -1) {
                return yv1.inRange('0', '9').trimLeadingFrom(this.f38202d.substring(iLastIndexOf + 1));
            }
            String packageName = getPackageName();
            return packageName.isEmpty() ? this.f38202d : this.f38202d.substring(packageName.length() + 1);
        }

        public boolean isTopLevel() {
            return this.f38202d.indexOf(36) == -1;
        }

        public Class<?> load() {
            try {
                return this.f38207c.loadClass(this.f38202d);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // p000.g12.C6080c
        public String toString() {
            return this.f38202d;
        }
    }

    /* JADX INFO: renamed from: g12$b */
    public static final class C6079b {

        /* JADX INFO: renamed from: a */
        public final File f38203a;

        /* JADX INFO: renamed from: b */
        public final ClassLoader f38204b;

        public C6079b(File home, ClassLoader classloader) {
            this.f38203a = (File) v7d.checkNotNull(home);
            this.f38204b = (ClassLoader) v7d.checkNotNull(classloader);
        }

        private void scan(File file, Set<File> scannedUris, dy7.C5007a<C6080c> builder) throws IOException {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        scanDirectory(file, builder);
                    } else {
                        scanJar(file, scannedUris, builder);
                    }
                }
            } catch (SecurityException e) {
                g12.f38198b.warning("Cannot access " + file + ": " + e);
            }
        }

        private void scanDirectory(File directory, dy7.C5007a<C6080c> builder) throws IOException {
            HashSet hashSet = new HashSet();
            hashSet.add(directory.getCanonicalFile());
            scanDirectory(directory, "", hashSet, builder);
        }

        private void scanJar(File file, Set<File> scannedUris, dy7.C5007a<C6080c> builder) throws IOException {
            try {
                JarFile jarFile = new JarFile(file);
                try {
                    quh<File> it = g12.m11299e(file, jarFile.getManifest()).iterator();
                    while (it.hasNext()) {
                        File next = it.next();
                        if (scannedUris.add(next.getCanonicalFile())) {
                            scan(next, scannedUris, builder);
                        }
                    }
                    scanJarFile(jarFile, builder);
                    try {
                        jarFile.close();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    try {
                        jarFile.close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            } catch (IOException unused3) {
            }
        }

        private void scanJarFile(JarFile file, dy7.C5007a<C6080c> builder) {
            Enumeration<JarEntry> enumerationEntries = file.entries();
            while (enumerationEntries.hasMoreElements()) {
                JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                if (!jarEntryNextElement.isDirectory() && !jarEntryNextElement.getName().equals("META-INF/MANIFEST.MF")) {
                    builder.add(C6080c.m11303b(new File(file.getName()), jarEntryNextElement.getName(), this.f38204b));
                }
            }
        }

        public boolean equals(@wx1 Object obj) {
            if (!(obj instanceof C6079b)) {
                return false;
            }
            C6079b c6079b = (C6079b) obj;
            return this.f38203a.equals(c6079b.f38203a) && this.f38204b.equals(c6079b.f38204b);
        }

        public final File file() {
            return this.f38203a;
        }

        public int hashCode() {
            return this.f38203a.hashCode();
        }

        public dy7<C6080c> scanResources() throws IOException {
            return scanResources(new HashSet());
        }

        public String toString() {
            return this.f38203a.toString();
        }

        public dy7<C6080c> scanResources(Set<File> scannedFiles) throws IOException {
            dy7.C5007a<C6080c> c5007aBuilder = dy7.builder();
            scannedFiles.add(this.f38203a);
            scan(this.f38203a, scannedFiles, c5007aBuilder);
            return c5007aBuilder.build();
        }

        private void scanDirectory(File directory, String packagePrefix, Set<File> currentPath, dy7.C5007a<C6080c> builder) throws IOException {
            File[] fileArrListFiles = directory.listFiles();
            if (fileArrListFiles == null) {
                g12.f38198b.warning("Cannot read directory " + directory);
                return;
            }
            for (File file : fileArrListFiles) {
                String name = file.getName();
                if (file.isDirectory()) {
                    File canonicalFile = file.getCanonicalFile();
                    if (currentPath.add(canonicalFile)) {
                        scanDirectory(canonicalFile, packagePrefix + name + pj4.f71071b, currentPath, builder);
                        currentPath.remove(canonicalFile);
                    }
                } else {
                    String str = packagePrefix + name;
                    if (!str.equals("META-INF/MANIFEST.MF")) {
                        builder.add(C6080c.m11303b(file, str, this.f38204b));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g12$c */
    public static class C6080c {

        /* JADX INFO: renamed from: a */
        public final File f38205a;

        /* JADX INFO: renamed from: b */
        public final String f38206b;

        /* JADX INFO: renamed from: c */
        public final ClassLoader f38207c;

        public C6080c(File file, String resourceName, ClassLoader loader) {
            this.f38205a = (File) v7d.checkNotNull(file);
            this.f38206b = (String) v7d.checkNotNull(resourceName);
            this.f38207c = (ClassLoader) v7d.checkNotNull(loader);
        }

        /* JADX INFO: renamed from: b */
        public static C6080c m11303b(File file, String resourceName, ClassLoader loader) {
            return resourceName.endsWith(g12.f38200d) ? new C6078a(file, resourceName, loader) : new C6080c(file, resourceName, loader);
        }

        /* JADX INFO: renamed from: a */
        public final File m11304a() {
            return this.f38205a;
        }

        public final rj1 asByteSource() {
            return e7e.asByteSource(url());
        }

        public final hw1 asCharSource(Charset charset) {
            return e7e.asCharSource(url(), charset);
        }

        public boolean equals(@wx1 Object obj) {
            if (!(obj instanceof C6080c)) {
                return false;
            }
            C6080c c6080c = (C6080c) obj;
            return this.f38206b.equals(c6080c.f38206b) && this.f38207c == c6080c.f38207c;
        }

        public final String getResourceName() {
            return this.f38206b;
        }

        public int hashCode() {
            return this.f38206b.hashCode();
        }

        public String toString() {
            return this.f38206b;
        }

        public final URL url() {
            URL resource = this.f38207c.getResource(this.f38206b);
            if (resource != null) {
                return resource;
            }
            throw new NoSuchElementException(this.f38206b);
        }
    }

    private g12(dy7<C6080c> resources) {
        this.f38201a = resources;
    }

    @gdi
    /* JADX INFO: renamed from: b */
    public static String m11296b(String filename) {
        return filename.substring(0, filename.length() - 6).replace('/', a18.f100c);
    }

    @gdi
    /* JADX INFO: renamed from: c */
    public static ox7<File, ClassLoader> m11297c(ClassLoader classloader) {
        LinkedHashMap linkedHashMapNewLinkedHashMap = tt9.newLinkedHashMap();
        ClassLoader parent = classloader.getParent();
        if (parent != null) {
            linkedHashMapNewLinkedHashMap.putAll(m11297c(parent));
        }
        quh<URL> it = getClassLoaderUrls(classloader).iterator();
        while (it.hasNext()) {
            URL next = it.next();
            if (next.getProtocol().equals("file")) {
                File fileM11302h = m11302h(next);
                if (!linkedHashMapNewLinkedHashMap.containsKey(fileM11302h)) {
                    linkedHashMapNewLinkedHashMap.put(fileM11302h, classloader);
                }
            }
        }
        return ox7.copyOf((Map) linkedHashMapNewLinkedHashMap);
    }

    @gdi
    /* JADX INFO: renamed from: d */
    public static URL m11298d(File jarFile, String path) throws MalformedURLException {
        return new URL(jarFile.toURI().toURL(), path);
    }

    @gdi
    /* JADX INFO: renamed from: e */
    public static dy7<File> m11299e(File jarFile, @wx1 Manifest manifest) {
        if (manifest == null) {
            return dy7.m9575of();
        }
        dy7.C5007a c5007aBuilder = dy7.builder();
        String value = manifest.getMainAttributes().getValue(Attributes.Name.CLASS_PATH.toString());
        if (value != null) {
            for (String str : f38199c.split(value)) {
                try {
                    URL urlM11298d = m11298d(jarFile, str);
                    if (urlM11298d.getProtocol().equals("file")) {
                        c5007aBuilder.add(m11302h(urlM11298d));
                    }
                } catch (MalformedURLException unused) {
                    f38198b.warning("Invalid Class-Path entry: " + str);
                }
            }
        }
        return c5007aBuilder.build();
    }

    /* JADX INFO: renamed from: f */
    public static dy7<C6079b> m11300f(ClassLoader classloader) {
        dy7.C5007a c5007aBuilder = dy7.builder();
        quh<Map.Entry<File, ClassLoader>> it = m11297c(classloader).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<File, ClassLoader> next = it.next();
            c5007aBuilder.add(new C6079b(next.getKey(), next.getValue()));
        }
        return c5007aBuilder.build();
    }

    public static g12 from(ClassLoader classloader) throws IOException {
        dy7<C6079b> dy7VarM11300f = m11300f(classloader);
        HashSet hashSet = new HashSet();
        quh<C6079b> it = dy7VarM11300f.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().file());
        }
        dy7.C5007a c5007aBuilder = dy7.builder();
        quh<C6079b> it2 = dy7VarM11300f.iterator();
        while (it2.hasNext()) {
            c5007aBuilder.addAll((Iterable) it2.next().scanResources(hashSet));
        }
        return new g12(c5007aBuilder.build());
    }

    @gdi
    /* JADX INFO: renamed from: g */
    public static kx7<URL> m11301g() {
        kx7.C8541a c8541aBuilder = kx7.builder();
        for (String str : azf.m2776on(h1g.PATH_SEPARATOR.value()).split(h1g.JAVA_CLASS_PATH.value())) {
            try {
                try {
                    c8541aBuilder.add(new File(str).toURI().toURL());
                } catch (SecurityException unused) {
                    c8541aBuilder.add(new URL("file", (String) null, new File(str).getAbsolutePath()));
                }
            } catch (MalformedURLException e) {
                f38198b.log(Level.WARNING, "malformed classpath entry: " + str, (Throwable) e);
            }
        }
        return c8541aBuilder.build();
    }

    private static kx7<URL> getClassLoaderUrls(ClassLoader classloader) {
        return classloader instanceof URLClassLoader ? kx7.copyOf(((URLClassLoader) classloader).getURLs()) : classloader.equals(ClassLoader.getSystemClassLoader()) ? m11301g() : kx7.m15110of();
    }

    @gdi
    /* JADX INFO: renamed from: h */
    public static File m11302h(URL url) {
        v7d.checkArgument(url.getProtocol().equals("file"));
        try {
            return new File(url.toURI());
        } catch (URISyntaxException unused) {
            return new File(url.getPath());
        }
    }

    public dy7<C6078a> getAllClasses() {
        return em6.from(this.f38201a).filter(C6078a.class).toSet();
    }

    public dy7<C6080c> getResources() {
        return this.f38201a;
    }

    public dy7<C6078a> getTopLevelClasses() {
        return em6.from(this.f38201a).filter(C6078a.class).filter(new l8d() { // from class: f12
            @Override // p000.l8d
            public final boolean apply(Object obj) {
                return ((g12.C6078a) obj).isTopLevel();
            }
        }).toSet();
    }

    public dy7<C6078a> getTopLevelClassesRecursive(String packageName) {
        v7d.checkNotNull(packageName);
        String str = packageName + a18.f100c;
        dy7.C5007a c5007aBuilder = dy7.builder();
        quh<C6078a> it = getTopLevelClasses().iterator();
        while (it.hasNext()) {
            C6078a next = it.next();
            if (next.getName().startsWith(str)) {
                c5007aBuilder.add(next);
            }
        }
        return c5007aBuilder.build();
    }

    public dy7<C6078a> getTopLevelClasses(String packageName) {
        v7d.checkNotNull(packageName);
        dy7.C5007a c5007aBuilder = dy7.builder();
        quh<C6078a> it = getTopLevelClasses().iterator();
        while (it.hasNext()) {
            C6078a next = it.next();
            if (next.getPackageName().equals(packageName)) {
                c5007aBuilder.add(next);
            }
        }
        return c5007aBuilder.build();
    }
}
