package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,169:1\n85#1,5:170\n85#1,5:175\n139#1,13:191\n1#2:180\n1368#3:181\n1454#3,5:182\n1557#3:187\n1628#3,3:188\n1069#4,2:204\n*S KotlinDebug\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n*L\n62#1:170,5\n69#1:175,5\n125#1:191,13\n107#1:181\n107#1:182,5\n109#1:187\n109#1:188,3\n161#1:204,2\n*E\n"})
public final class pp5 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final pp5 f71576a = new pp5();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f71577b = "META-INF/services/";

    private pp5() {
    }

    private final er9 createInstanceOf(Class<er9> cls, String str) {
        try {
            return cls.cast(Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final <S> S getProviderInstance(String str, ClassLoader classLoader, Class<S> cls) throws ClassNotFoundException {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(null).newInstance(null));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> load(Class<S> cls, ClassLoader classLoader) {
        try {
            return loadProviders$kotlinx_coroutines_core(cls, classLoader);
        } catch (Throwable unused) {
            return v82.toList(ServiceLoader.load(cls, classLoader));
        }
    }

    private final List<String> parse(URL url) throws IllegalAccessException, IOException, InvocationTargetException {
        BufferedReader bufferedReader;
        String string = url.toString();
        if (!h9g.startsWith$default(string, ArchiveStreamFactory.JAR, false, 2, null)) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> file = f71576a.parseFile(bufferedReader);
                u52.closeFinally(bufferedReader, null);
                return file;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        String strSubstringBefore$default = m9g.substringBefore$default(m9g.substringAfter$default(string, "jar:file:", (String) null, 2, (Object) null), '!', (String) null, 2, (Object) null);
        String strSubstringAfter$default = m9g.substringAfter$default(string, "!/", (String) null, 2, (Object) null);
        JarFile jarFile = new JarFile(strSubstringBefore$default, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strSubstringAfter$default)), "UTF-8"));
            try {
                List<String> file2 = f71576a.parseFile(bufferedReader);
                u52.closeFinally(bufferedReader, null);
                jarFile.close();
                return file2;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    jarFile.close();
                    throw th3;
                } catch (Throwable th4) {
                    a85.addSuppressed(th2, th4);
                    throw th2;
                }
            }
        }
    }

    private final List<String> parseFile(BufferedReader bufferedReader) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return v82.toList(linkedHashSet);
            }
            String string = m9g.trim((CharSequence) m9g.substringBefore$default(line, "#", (String) null, 2, (Object) null)).toString();
            for (int i = 0; i < string.length(); i++) {
                char cCharAt = string.charAt(i);
                if (cCharAt != '.' && !Character.isJavaIdentifierPart(cCharAt)) {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + string).toString());
                }
            }
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }

    private final <R> R use(JarFile jarFile, qy6<? super JarFile, ? extends R> qy6Var) throws IllegalAccessException, IOException, InvocationTargetException {
        try {
            R rInvoke = qy6Var.invoke(jarFile);
            o28.finallyStart(1);
            jarFile.close();
            o28.finallyEnd(1);
            return rInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o28.finallyStart(1);
                try {
                    jarFile.close();
                    o28.finallyEnd(1);
                    throw th2;
                } catch (Throwable th3) {
                    a85.addSuppressed(th, th3);
                    throw th;
                }
            }
        }
    }

    @yfb
    public final List<er9> loadMainDispatcherFactory$kotlinx_coroutines_core() {
        er9 er9Var;
        if (!qp5.getANDROID_DETECTED()) {
            return load(er9.class, er9.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            er9 er9Var2 = null;
            try {
                er9Var = (er9) er9.class.cast(Class.forName("ds", true, er9.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            } catch (ClassNotFoundException unused) {
                er9Var = null;
            }
            if (er9Var == null) {
                return load(er9.class, er9.class.getClassLoader());
            }
            arrayList.add(er9Var);
            try {
                er9Var2 = (er9) er9.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, er9.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            } catch (ClassNotFoundException unused2) {
            }
            if (er9Var2 == null) {
                return arrayList;
            }
            arrayList.add(er9Var2);
            return arrayList;
        } catch (Throwable unused3) {
            return load(er9.class, er9.class.getClassLoader());
        }
    }

    @yfb
    public final <S> List<S> loadProviders$kotlinx_coroutines_core(@yfb Class<S> cls, @yfb ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources(f71577b + cls.getName()));
        md8.checkNotNullExpressionValue(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q82.addAll(arrayList, f71576a.parse((URL) it.next()));
        }
        Set set = v82.toSet(arrayList);
        if (set.isEmpty()) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader");
        }
        Set set2 = set;
        ArrayList arrayList2 = new ArrayList(m82.collectionSizeOrDefault(set2, 10));
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f71576a.getProviderInstance((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }
}
