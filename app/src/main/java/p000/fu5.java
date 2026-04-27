package p000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public final class fu5 {

    /* JADX INFO: renamed from: a */
    public static final bfg<File> f37766a = new C5984b();

    /* JADX INFO: renamed from: fu5$a */
    public class C5983a implements k69<List<String>> {

        /* JADX INFO: renamed from: a */
        public final List<String> f37767a = eb9.newArrayList();

        @Override // p000.k69
        public boolean processLine(String line) {
            this.f37767a.add(line);
            return true;
        }

        @Override // p000.k69
        public List<String> getResult() {
            return this.f37767a;
        }
    }

    /* JADX INFO: renamed from: fu5$b */
    public class C5984b implements bfg<File> {
        @Override // p000.bfg, p000.j97
        public Iterable<File> successors(File file) {
            File[] fileArrListFiles;
            return (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) ? kx7.m15110of() : Collections.unmodifiableList(Arrays.asList(fileArrListFiles));
        }
    }

    /* JADX INFO: renamed from: fu5$c */
    public static final class C5985c extends qj1 {

        /* JADX INFO: renamed from: a */
        public final File f37768a;

        /* JADX INFO: renamed from: b */
        public final dy7<du5> f37769b;

        public /* synthetic */ C5985c(File file, du5[] du5VarArr, C5983a c5983a) {
            this(file, du5VarArr);
        }

        public String toString() {
            return "Files.asByteSink(" + this.f37768a + ", " + this.f37769b + c0b.f15434d;
        }

        private C5985c(File file, du5... modes) {
            this.f37768a = (File) v7d.checkNotNull(file);
            this.f37769b = dy7.copyOf(modes);
        }

        @Override // p000.qj1
        public FileOutputStream openStream() throws IOException {
            return new FileOutputStream(this.f37768a, this.f37769b.contains(du5.APPEND));
        }
    }

    /* JADX INFO: renamed from: fu5$d */
    public static final class C5986d extends rj1 {

        /* JADX INFO: renamed from: a */
        public final File f37770a;

        public /* synthetic */ C5986d(File file, C5983a c5983a) {
            this(file);
        }

        @Override // p000.rj1
        public byte[] read() throws IOException {
            try {
                FileInputStream fileInputStream = (FileInputStream) d62.create().register(openStream());
                return tj1.m22682c(fileInputStream, fileInputStream.getChannel().size());
            } finally {
            }
        }

        @Override // p000.rj1
        public long size() throws IOException {
            if (this.f37770a.isFile()) {
                return this.f37770a.length();
            }
            throw new FileNotFoundException(this.f37770a.toString());
        }

        @Override // p000.rj1
        public z6c<Long> sizeIfKnown() {
            return this.f37770a.isFile() ? z6c.m26593of(Long.valueOf(this.f37770a.length())) : z6c.absent();
        }

        public String toString() {
            return "Files.asByteSource(" + this.f37770a + c0b.f15434d;
        }

        private C5986d(File file) {
            this.f37770a = (File) v7d.checkNotNull(file);
        }

        @Override // p000.rj1
        public FileInputStream openStream() throws IOException {
            return new FileInputStream(this.f37770a);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: fu5$e */
    public static abstract class EnumC5987e implements l8d<File> {

        /* JADX INFO: renamed from: a */
        public static final EnumC5987e f37771a = new a("IS_DIRECTORY", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC5987e f37772b = new b("IS_FILE", 1);

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumC5987e[] f37773c = $values();

        /* JADX INFO: renamed from: fu5$e$a */
        public enum a extends EnumC5987e {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Files.isDirectory()";
            }

            @Override // p000.l8d
            public boolean apply(File file) {
                return file.isDirectory();
            }
        }

        /* JADX INFO: renamed from: fu5$e$b */
        public enum b extends EnumC5987e {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Files.isFile()";
            }

            @Override // p000.l8d
            public boolean apply(File file) {
                return file.isFile();
            }
        }

        private static /* synthetic */ EnumC5987e[] $values() {
            return new EnumC5987e[]{f37771a, f37772b};
        }

        private EnumC5987e(String $enum$name, int $enum$ordinal) {
        }

        public static EnumC5987e valueOf(String name) {
            return (EnumC5987e) Enum.valueOf(EnumC5987e.class, name);
        }

        public static EnumC5987e[] values() {
            return (EnumC5987e[]) f37773c.clone();
        }

        public /* synthetic */ EnumC5987e(String str, int i, C5983a c5983a) {
            this(str, i);
        }
    }

    private fu5() {
    }

    @Deprecated
    @p28(imports = {"com.google.common.io.FileWriteMode", "com.google.common.io.Files"}, replacement = "Files.asCharSink(to, charset, FileWriteMode.APPEND).write(from)")
    public static void append(CharSequence from, File to, Charset charset) throws IOException {
        asCharSink(to, charset, du5.APPEND).write(from);
    }

    public static qj1 asByteSink(File file, du5... modes) {
        return new C5985c(file, modes, null);
    }

    public static rj1 asByteSource(File file) {
        return new C5986d(file, null);
    }

    public static gw1 asCharSink(File file, Charset charset, du5... modes) {
        return asByteSink(file, modes).asCharSink(charset);
    }

    public static hw1 asCharSource(File file, Charset charset) {
        return asByteSource(file).asCharSource(charset);
    }

    public static void copy(File from, OutputStream to) throws IOException {
        asByteSource(from).copyTo(to);
    }

    public static void createParentDirs(File file) throws IOException {
        v7d.checkNotNull(file);
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Unable to create parent directories of " + file);
    }

    @w01
    @Deprecated
    public static File createTempDir() {
        return bog.f14314a.mo3284a();
    }

    public static boolean equal(File file1, File file2) throws IOException {
        v7d.checkNotNull(file1);
        v7d.checkNotNull(file2);
        if (file1 == file2 || file1.equals(file2)) {
            return true;
        }
        long length = file1.length();
        long length2 = file2.length();
        if (length == 0 || length2 == 0 || length == length2) {
            return asByteSource(file1).contentEquals(asByteSource(file2));
        }
        return false;
    }

    public static vhh<File> fileTraverser() {
        return vhh.forTree(f37766a);
    }

    public static String getFileExtension(String fullName) {
        v7d.checkNotNull(fullName);
        String name = new File(fullName).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? "" : name.substring(iLastIndexOf + 1);
    }

    public static String getNameWithoutExtension(String file) {
        v7d.checkNotNull(file);
        String name = new File(file).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? name : name.substring(0, iLastIndexOf);
    }

    @Deprecated
    @p28(imports = {"com.google.common.io.Files"}, replacement = "Files.asByteSource(file).hash(hashFunction)")
    public static jh7 hash(File file, lh7 hashFunction) throws IOException {
        return asByteSource(file).hash(hashFunction);
    }

    public static l8d<File> isDirectory() {
        return EnumC5987e.f37771a;
    }

    public static l8d<File> isFile() {
        return EnumC5987e.f37772b;
    }

    public static MappedByteBuffer map(File file) throws IOException {
        v7d.checkNotNull(file);
        return map(file, FileChannel.MapMode.READ_ONLY);
    }

    private static MappedByteBuffer mapInternal(File file, FileChannel.MapMode mode, long size) throws IOException {
        v7d.checkNotNull(file);
        v7d.checkNotNull(mode);
        d62 d62VarCreate = d62.create();
        try {
            FileChannel fileChannel = (FileChannel) d62VarCreate.register(((RandomAccessFile) d62VarCreate.register(new RandomAccessFile(file, mode == FileChannel.MapMode.READ_ONLY ? "r" : "rw"))).getChannel());
            if (size == -1) {
                size = fileChannel.size();
            }
            return fileChannel.map(mode, 0L, size);
        } finally {
        }
    }

    public static void move(File from, File to) throws IOException {
        v7d.checkNotNull(from);
        v7d.checkNotNull(to);
        v7d.checkArgument(!from.equals(to), "Source %s and destination %s must be different", from, to);
        if (from.renameTo(to)) {
            return;
        }
        copy(from, to);
        if (from.delete()) {
            return;
        }
        if (to.delete()) {
            throw new IOException("Unable to delete " + from);
        }
        throw new IOException("Unable to delete " + to);
    }

    public static BufferedReader newReader(File file, Charset charset) throws FileNotFoundException {
        v7d.checkNotNull(file);
        v7d.checkNotNull(charset);
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
    }

    public static BufferedWriter newWriter(File file, Charset charset) throws FileNotFoundException {
        v7d.checkNotNull(file);
        v7d.checkNotNull(charset);
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
    }

    @jgc
    @Deprecated
    @p28(imports = {"com.google.common.io.Files"}, replacement = "Files.asByteSource(file).read(processor)")
    @op1
    public static <T> T readBytes(File file, oj1<T> oj1Var) throws IOException {
        return (T) asByteSource(file).read(oj1Var);
    }

    @wx1
    @Deprecated
    @p28(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).readFirstLine()")
    public static String readFirstLine(File file, Charset charset) throws IOException {
        return asCharSource(file, charset).readFirstLine();
    }

    public static List<String> readLines(File file, Charset charset) throws IOException {
        return (List) asCharSource(file, charset).readLines(new C5983a());
    }

    public static String simplifyPath(String pathname) {
        v7d.checkNotNull(pathname);
        if (pathname.length() == 0) {
            return ".";
        }
        Iterable<String> iterableSplit = azf.m2775on('/').omitEmptyStrings().split(pathname);
        ArrayList arrayList = new ArrayList();
        for (String str : iterableSplit) {
            str.hashCode();
            if (!str.equals(".")) {
                if (!str.equals("..")) {
                    arrayList.add(str);
                } else if (arrayList.size() <= 0 || ((String) arrayList.get(arrayList.size() - 1)).equals("..")) {
                    arrayList.add("..");
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        String strJoin = xj8.m25234on('/').join(arrayList);
        if (pathname.charAt(0) == '/') {
            strJoin = pj4.f71071b + strJoin;
        }
        while (strJoin.startsWith("/../")) {
            strJoin = strJoin.substring(3);
        }
        return strJoin.equals("/..") ? pj4.f71071b : "".equals(strJoin) ? "." : strJoin;
    }

    public static byte[] toByteArray(File file) throws IOException {
        return asByteSource(file).read();
    }

    @Deprecated
    @p28(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).read()")
    public static String toString(File file, Charset charset) throws IOException {
        return asCharSource(file, charset).read();
    }

    public static void touch(File file) throws IOException {
        v7d.checkNotNull(file);
        if (file.createNewFile() || file.setLastModified(System.currentTimeMillis())) {
            return;
        }
        throw new IOException("Unable to update modification time of " + file);
    }

    public static void write(byte[] from, File to) throws IOException {
        asByteSink(to, new du5[0]).write(from);
    }

    public static void copy(File from, File to) throws IOException {
        v7d.checkArgument(!from.equals(to), "Source %s and destination %s must be different", from, to);
        asByteSource(from).copyTo(asByteSink(to, new du5[0]));
    }

    @Deprecated
    @p28(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSink(to, charset).write(from)")
    public static void write(CharSequence from, File to, Charset charset) throws IOException {
        asCharSink(to, charset, new du5[0]).write(from);
    }

    public static MappedByteBuffer map(File file, FileChannel.MapMode mode) throws IOException {
        return mapInternal(file, mode, -1L);
    }

    @jgc
    @Deprecated
    @p28(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).readLines(callback)")
    @op1
    public static <T> T readLines(File file, Charset charset, k69<T> k69Var) throws IOException {
        return (T) asCharSource(file, charset).readLines(k69Var);
    }

    @Deprecated
    @p28(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(from, charset).copyTo(to)")
    public static void copy(File from, Charset charset, Appendable to) throws IOException {
        asCharSource(from, charset).copyTo(to);
    }

    public static MappedByteBuffer map(File file, FileChannel.MapMode mode, long size) throws IOException {
        v7d.checkArgument(size >= 0, "size (%s) may not be negative", size);
        return mapInternal(file, mode, size);
    }
}
