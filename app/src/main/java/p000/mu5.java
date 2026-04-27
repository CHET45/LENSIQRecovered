package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1288#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
public class mu5 extends ku5 {

    /* JADX INFO: renamed from: mu5$a */
    public static final class C9525a implements gz6 {

        /* JADX INFO: renamed from: a */
        public static final C9525a f62143a = new C9525a();

        @Override // p000.gz6
        public final Void invoke(File file, IOException iOException) throws IOException {
            md8.checkNotNullParameter(file, "<unused var>");
            md8.checkNotNullParameter(iOException, "exception");
            throw iOException;
        }
    }

    public static final boolean copyRecursively(@yfb File file, @yfb File file2, boolean z, @yfb final gz6<? super File, ? super IOException, ? extends o2c> gz6Var) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(file2, "target");
        md8.checkNotNullParameter(gz6Var, "onError");
        if (!file.exists()) {
            return gz6Var.invoke(file, new zdb(file, null, "The source file doesn't exist.", 2, null)) != o2c.f66315b;
        }
        try {
            for (File file3 : ku5.walkTopDown(file).onFail(new gz6() { // from class: lu5
                @Override // p000.gz6
                public final Object invoke(Object obj, Object obj2) {
                    return mu5.copyRecursively$lambda$4$FilesKt__UtilsKt(gz6Var, (File) obj, (IOException) obj2);
                }
            })) {
                if (file3.exists()) {
                    File file4 = new File(file2, toRelativeString(file3, file));
                    if (file4.exists() && (!file3.isDirectory() || !file4.isDirectory())) {
                        if (z) {
                            if (file4.isDirectory()) {
                                if (!deleteRecursively(file4)) {
                                }
                            } else if (!file4.delete()) {
                            }
                        }
                        if (gz6Var.invoke(file4, new hs5(file3, file4, "The destination file already exists.")) == o2c.f66315b) {
                            return false;
                        }
                    }
                    if (file3.isDirectory()) {
                        file4.mkdirs();
                    } else if (copyTo$default(file3, file4, z, 0, 4, null).length() != file3.length() && gz6Var.invoke(file3, new IOException("Source file wasn't copied completely, length of destination file differs.")) == o2c.f66315b) {
                        return false;
                    }
                } else if (gz6Var.invoke(file3, new zdb(file3, null, "The source file doesn't exist.", 2, null)) == o2c.f66315b) {
                    return false;
                }
            }
            return true;
        } catch (mog unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean copyRecursively$default(File file, File file2, boolean z, gz6 gz6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            gz6Var = C9525a.f62143a;
        }
        return copyRecursively(file, file2, z, gz6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth copyRecursively$lambda$4$FilesKt__UtilsKt(gz6 gz6Var, File file, IOException iOException) throws mog {
        md8.checkNotNullParameter(file, "f");
        md8.checkNotNullParameter(iOException, "e");
        if (gz6Var.invoke(file, iOException) != o2c.f66315b) {
            return bth.f14751a;
        }
        throw new mog(file);
    }

    @yfb
    public static final File copyTo(@yfb File file, @yfb File file2, boolean z, int i) throws lt5 {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(file2, "target");
        if (!file.exists()) {
            throw new zdb(file, null, "The source file doesn't exist.", 2, null);
        }
        if (file2.exists()) {
            if (!z) {
                throw new hs5(file, file2, "The destination file already exists.");
            }
            if (!file2.delete()) {
                throw new hs5(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (!file.isDirectory()) {
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    uj1.copyTo(fileInputStream, fileOutputStream, i);
                    u52.closeFinally(fileOutputStream, null);
                    u52.closeFinally(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } else if (!file2.mkdirs()) {
            throw new lt5(file, file2, "Failed to create target directory.");
        }
        return file2;
    }

    public static /* synthetic */ File copyTo$default(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return copyTo(file, file2, z, i);
    }

    @yfb
    @q64(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    public static final File createTempDir(@yfb String str, @gib String str2, @gib File file) throws IOException {
        md8.checkNotNullParameter(str, "prefix");
        File fileCreateTempFile = File.createTempFile(str, str2, file);
        fileCreateTempFile.delete();
        if (fileCreateTempFile.mkdir()) {
            md8.checkNotNull(fileCreateTempFile);
            return fileCreateTempFile;
        }
        throw new IOException("Unable to create temporary directory " + fileCreateTempFile + a18.f100c);
    }

    public static /* synthetic */ File createTempDir$default(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return createTempDir(str, str2, file);
    }

    @yfb
    @q64(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    public static final File createTempFile(@yfb String str, @gib String str2, @gib File file) throws IOException {
        md8.checkNotNullParameter(str, "prefix");
        File fileCreateTempFile = File.createTempFile(str, str2, file);
        md8.checkNotNullExpressionValue(fileCreateTempFile, "createTempFile(...)");
        return fileCreateTempFile;
    }

    public static /* synthetic */ File createTempFile$default(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return createTempFile(str, str2, file);
    }

    public static final boolean deleteRecursively(@yfb File file) {
        md8.checkNotNullParameter(file, "<this>");
        while (true) {
            boolean z = true;
            for (File file2 : ku5.walkBottomUp(file)) {
                if (!file2.delete() && file2.exists()) {
                    z = false;
                } else {
                    if (z) {
                        break;
                    }
                    z = false;
                }
            }
            return z;
        }
    }

    public static final boolean endsWith(@yfb File file, @yfb File file2) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(file2, "other");
        bt5 components = hu5.toComponents(file);
        bt5 components2 = hu5.toComponents(file2);
        if (components2.isRooted()) {
            return md8.areEqual(file, file2);
        }
        int size = components.getSize() - components2.getSize();
        if (size < 0) {
            return false;
        }
        return components.getSegments().subList(size, components.getSize()).equals(components2.getSegments());
    }

    @yfb
    public static String getExtension(@yfb File file) {
        md8.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        md8.checkNotNullExpressionValue(name, "getName(...)");
        return m9g.substringAfterLast(name, a18.f100c, "");
    }

    @yfb
    public static final String getInvariantSeparatorsPath(@yfb File file) {
        md8.checkNotNullParameter(file, "<this>");
        char c = File.separatorChar;
        String path = file.getPath();
        md8.checkNotNullExpressionValue(path, "getPath(...)");
        return c != '/' ? h9g.replace$default(path, c, '/', false, 4, (Object) null) : path;
    }

    @yfb
    public static String getNameWithoutExtension(@yfb File file) {
        md8.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        md8.checkNotNullExpressionValue(name, "getName(...)");
        return m9g.substringBeforeLast$default(name, ".", (String) null, 2, (Object) null);
    }

    @yfb
    public static final File normalize(@yfb File file) {
        md8.checkNotNullParameter(file, "<this>");
        bt5 components = hu5.toComponents(file);
        File root = components.getRoot();
        List<File> listNormalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(components.getSegments());
        String str = File.separator;
        md8.checkNotNullExpressionValue(str, "separator");
        return resolve(root, v82.joinToString$default(listNormalize$FilesKt__UtilsKt, str, null, null, 0, null, null, 62, null));
    }

    private static final bt5 normalize$FilesKt__UtilsKt(bt5 bt5Var) {
        return new bt5(bt5Var.getRoot(), normalize$FilesKt__UtilsKt(bt5Var.getSegments()));
    }

    @yfb
    public static final File relativeTo(@yfb File file, @yfb File file2) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(file2, "base");
        return new File(toRelativeString(file, file2));
    }

    @gib
    public static final File relativeToOrNull(@yfb File file, @yfb File file2) throws IOException {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(file2, "base");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, file2);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return new File(relativeStringOrNull$FilesKt__UtilsKt);
        }
        return null;
    }

    @yfb
    public static final File relativeToOrSelf(@yfb File file, @yfb File file2) throws IOException {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(file2, "base");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, file2);
        return relativeStringOrNull$FilesKt__UtilsKt != null ? new File(relativeStringOrNull$FilesKt__UtilsKt) : file;
    }

    @yfb
    public static final File resolve(@yfb File file, @yfb File file2) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(file2, "relative");
        if (hu5.isRooted(file2)) {
            return file2;
        }
        String string = file.toString();
        md8.checkNotNullExpressionValue(string, "toString(...)");
        if (string.length() != 0) {
            char c = File.separatorChar;
            if (!m9g.endsWith$default((CharSequence) string, c, false, 2, (Object) null)) {
                return new File(string + c + file2);
            }
        }
        return new File(string + file2);
    }

    @yfb
    public static final File resolveSibling(@yfb File file, @yfb File file2) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(file2, "relative");
        bt5 components = hu5.toComponents(file);
        return resolve(resolve(components.getRoot(), components.getSize() == 0 ? new File("..") : components.subPath(0, components.getSize() - 1)), file2);
    }

    public static final boolean startsWith(@yfb File file, @yfb File file2) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(file2, "other");
        bt5 components = hu5.toComponents(file);
        bt5 components2 = hu5.toComponents(file2);
        if (md8.areEqual(components.getRoot(), components2.getRoot()) && components.getSize() >= components2.getSize()) {
            return components.getSegments().subList(0, components2.getSize()).equals(components2.getSegments());
        }
        return false;
    }

    @yfb
    public static final String toRelativeString(@yfb File file, @yfb File file2) throws IOException {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(file2, "base");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, file2);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return relativeStringOrNull$FilesKt__UtilsKt;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + a18.f100c);
    }

    private static final String toRelativeStringOrNull$FilesKt__UtilsKt(File file, File file2) throws IOException {
        bt5 bt5VarNormalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(hu5.toComponents(file));
        bt5 bt5VarNormalize$FilesKt__UtilsKt2 = normalize$FilesKt__UtilsKt(hu5.toComponents(file2));
        if (!md8.areEqual(bt5VarNormalize$FilesKt__UtilsKt.getRoot(), bt5VarNormalize$FilesKt__UtilsKt2.getRoot())) {
            return null;
        }
        int size = bt5VarNormalize$FilesKt__UtilsKt2.getSize();
        int size2 = bt5VarNormalize$FilesKt__UtilsKt.getSize();
        int iMin = Math.min(size2, size);
        int i = 0;
        while (i < iMin && md8.areEqual(bt5VarNormalize$FilesKt__UtilsKt.getSegments().get(i), bt5VarNormalize$FilesKt__UtilsKt2.getSegments().get(i))) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = size - 1;
        if (i <= i2) {
            while (!md8.areEqual(bt5VarNormalize$FilesKt__UtilsKt2.getSegments().get(i2).getName(), "..")) {
                sb.append("..");
                if (i2 != i) {
                    sb.append(File.separatorChar);
                }
                if (i2 != i) {
                    i2--;
                }
            }
            return null;
        }
        if (i < size2) {
            if (i < size) {
                sb.append(File.separatorChar);
            }
            List listDrop = v82.drop(bt5VarNormalize$FilesKt__UtilsKt.getSegments(), i);
            String str = File.separator;
            md8.checkNotNullExpressionValue(str, "separator");
            v82.joinTo(listDrop, sb, (124 & 2) != 0 ? ", " : str, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        return sb.toString();
    }

    private static final List<File> normalize$FilesKt__UtilsKt(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!md8.areEqual(name, ".")) {
                if (!md8.areEqual(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || md8.areEqual(((File) v82.last((List) arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    @yfb
    public static final File resolve(@yfb File file, @yfb String str) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(str, "relative");
        return resolve(file, new File(str));
    }

    @yfb
    public static final File resolveSibling(@yfb File file, @yfb String str) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(str, "relative");
        return resolveSibling(file, new File(str));
    }

    public static final boolean startsWith(@yfb File file, @yfb String str) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(str, "other");
        return startsWith(file, new File(str));
    }

    public static final boolean endsWith(@yfb File file, @yfb String str) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(str, "other");
        return endsWith(file, new File(str));
    }
}
