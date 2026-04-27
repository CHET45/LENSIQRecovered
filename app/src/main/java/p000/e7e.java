package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public final class e7e {

    /* JADX INFO: renamed from: e7e$a */
    public class C5159a implements k69<List<String>> {

        /* JADX INFO: renamed from: a */
        public final List<String> f32049a = eb9.newArrayList();

        @Override // p000.k69
        public boolean processLine(String line) {
            this.f32049a.add(line);
            return true;
        }

        @Override // p000.k69
        public List<String> getResult() {
            return this.f32049a;
        }
    }

    /* JADX INFO: renamed from: e7e$b */
    public static final class C5160b extends rj1 {

        /* JADX INFO: renamed from: a */
        public final URL f32050a;

        public /* synthetic */ C5160b(URL url, C5159a c5159a) {
            this(url);
        }

        @Override // p000.rj1
        public InputStream openStream() throws IOException {
            return this.f32050a.openStream();
        }

        public String toString() {
            return "Resources.asByteSource(" + this.f32050a + c0b.f15434d;
        }

        private C5160b(URL url) {
            this.f32050a = (URL) v7d.checkNotNull(url);
        }
    }

    private e7e() {
    }

    public static rj1 asByteSource(URL url) {
        return new C5160b(url, null);
    }

    public static hw1 asCharSource(URL url, Charset charset) {
        return asByteSource(url).asCharSource(charset);
    }

    public static void copy(URL from, OutputStream to) throws IOException {
        asByteSource(from).copyTo(to);
    }

    @op1
    public static URL getResource(String resourceName) {
        URL resource = ((ClassLoader) yya.firstNonNull(Thread.currentThread().getContextClassLoader(), e7e.class.getClassLoader())).getResource(resourceName);
        v7d.checkArgument(resource != null, "resource %s not found.", resourceName);
        return resource;
    }

    @jgc
    @op1
    public static <T> T readLines(URL url, Charset charset, k69<T> k69Var) throws IOException {
        return (T) asCharSource(url, charset).readLines(k69Var);
    }

    public static byte[] toByteArray(URL url) throws IOException {
        return asByteSource(url).read();
    }

    public static String toString(URL url, Charset charset) throws IOException {
        return asCharSource(url, charset).read();
    }

    public static List<String> readLines(URL url, Charset charset) throws IOException {
        return (List) readLines(url, charset, new C5159a());
    }

    @op1
    public static URL getResource(Class<?> contextClass, String resourceName) {
        URL resource = contextClass.getResource(resourceName);
        v7d.checkArgument(resource != null, "resource %s relative to %s not found.", resourceName, contextClass.getName());
        return resource;
    }
}
