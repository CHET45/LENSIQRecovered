package p000;

import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1253:1\n1#2:1254\n1863#3,2:1255\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n*L\n440#1:1255,2\n*E\n"})
public class skc extends rkc {
    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final Path Path(String str) {
        md8.checkNotNullParameter(str, "path");
        Path path = Paths.get(str, new String[0]);
        md8.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final Path absolute(Path path) {
        md8.checkNotNullParameter(path, "<this>");
        Path absolutePath = path.toAbsolutePath();
        md8.checkNotNullExpressionValue(absolutePath, "toAbsolutePath(...)");
        return absolutePath;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final String absolutePathString(Path path) {
        md8.checkNotNullParameter(path, "<this>");
        return path.toAbsolutePath().toString();
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final Path copyTo(Path path, Path path2, boolean z) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathCopy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        md8.checkNotNullExpressionValue(pathCopy, "copy(...)");
        return pathCopy;
    }

    @jjf(version = "1.5")
    @t28
    @ihi(markerClass = {mh5.class})
    private static final Path createDirectories(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(fileAttributeArr, "attributes");
        Path pathCreateDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        md8.checkNotNullExpressionValue(pathCreateDirectories, "createDirectories(...)");
        return pathCreateDirectories;
    }

    @jjf(version = "1.5")
    @t28
    @ihi(markerClass = {mh5.class})
    private static final Path createDirectory(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(fileAttributeArr, "attributes");
        Path pathCreateDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        md8.checkNotNullExpressionValue(pathCreateDirectory, "createDirectory(...)");
        return pathCreateDirectory;
    }

    @jjf(version = "1.5")
    @t28
    @ihi(markerClass = {mh5.class})
    private static final Path createFile(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(fileAttributeArr, "attributes");
        Path pathCreateFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        md8.checkNotNullExpressionValue(pathCreateFile, "createFile(...)");
        return pathCreateFile;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final Path createLinkPointingTo(Path path, Path path2) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(path2, "target");
        Path pathCreateLink = Files.createLink(path, path2);
        md8.checkNotNullExpressionValue(pathCreateLink, "createLink(...)");
        return pathCreateLink;
    }

    @jjf(version = "1.9")
    @yfb
    public static final Path createParentDirectories(@yfb Path path, @yfb FileAttribute<?>... fileAttributeArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(fileAttributeArr, "attributes");
        Path parent = path.getParent();
        if (parent != null && !Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
            try {
                FileAttribute[] fileAttributeArr2 = (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length);
                md8.checkNotNullExpressionValue(Files.createDirectories(parent, (FileAttribute[]) Arrays.copyOf(fileAttributeArr2, fileAttributeArr2.length)), "createDirectories(...)");
            } catch (FileAlreadyExistsException e) {
                if (!Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                    throw e;
                }
            }
        }
        return path;
    }

    @jjf(version = "1.5")
    @t28
    @ihi(markerClass = {mh5.class})
    private static final Path createSymbolicLinkPointingTo(Path path, Path path2, FileAttribute<?>... fileAttributeArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(path2, "target");
        md8.checkNotNullParameter(fileAttributeArr, "attributes");
        Path pathCreateSymbolicLink = Files.createSymbolicLink(path, path2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        md8.checkNotNullExpressionValue(pathCreateSymbolicLink, "createSymbolicLink(...)");
        return pathCreateSymbolicLink;
    }

    @jjf(version = "1.5")
    @t28
    @ihi(markerClass = {mh5.class})
    private static final Path createTempDirectory(String str, FileAttribute<?>... fileAttributeArr) throws IOException {
        md8.checkNotNullParameter(fileAttributeArr, "attributes");
        Path pathCreateTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        md8.checkNotNullExpressionValue(pathCreateTempDirectory, "createTempDirectory(...)");
        return pathCreateTempDirectory;
    }

    public static /* synthetic */ Path createTempDirectory$default(Path path, String str, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str = null;
        }
        return createTempDirectory(path, str, fileAttributeArr);
    }

    @jjf(version = "1.5")
    @t28
    @ihi(markerClass = {mh5.class})
    private static final Path createTempFile(String str, String str2, FileAttribute<?>... fileAttributeArr) throws IOException {
        md8.checkNotNullParameter(fileAttributeArr, "attributes");
        Path pathCreateTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        md8.checkNotNullExpressionValue(pathCreateTempFile, "createTempFile(...)");
        return pathCreateTempFile;
    }

    public static /* synthetic */ Path createTempFile$default(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return createTempFile(path, str, str2, fileAttributeArr);
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final void deleteExisting(Path path) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        Files.delete(path);
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final boolean deleteIfExists(Path path) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        return Files.deleteIfExists(path);
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final Path div(Path path, Path path2) {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(path2, "other");
        Path pathResolve = path.resolve(path2);
        md8.checkNotNullExpressionValue(pathResolve, "resolve(...)");
        return pathResolve;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final boolean exists(Path path, LinkOption... linkOptionArr) {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(linkOptionArr, "options");
        return Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @yfb
    @yjd
    public static final Void fileAttributeViewNotAvailable(@yfb Path path, @yfb Class<?> cls) {
        md8.checkNotNullParameter(path, "path");
        md8.checkNotNullParameter(cls, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + cls + " is not available for the file " + path + a18.f100c);
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final /* synthetic */ <V extends FileAttributeView> V fileAttributesView(Path path, LinkOption... linkOptionArr) {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(linkOptionArr, "options");
        md8.reifiedOperationMarker(4, k95.f53074X4);
        V v = (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (v != null) {
            return v;
        }
        md8.reifiedOperationMarker(4, k95.f53074X4);
        fileAttributeViewNotAvailable(path, FileAttributeView.class);
        throw new us8();
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final /* synthetic */ <V extends FileAttributeView> V fileAttributesViewOrNull(Path path, LinkOption... linkOptionArr) {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(linkOptionArr, "options");
        md8.reifiedOperationMarker(4, k95.f53074X4);
        return (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final long fileSize(Path path) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        return Files.size(path);
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final FileStore fileStore(Path path) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        FileStore fileStore = Files.getFileStore(path);
        md8.checkNotNullExpressionValue(fileStore, "getFileStore(...)");
        return fileStore;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "2.1")
    @yfb
    public static final FileVisitor<Path> fileVisitor(@yfb qy6<? super zt5, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builderAction");
        au5 au5Var = new au5();
        qy6Var.invoke(au5Var);
        return au5Var.build();
    }

    @jjf(version = "1.5")
    @t28
    @ihi(markerClass = {mh5.class})
    private static final void forEachDirectoryEntry(Path path, String str, qy6<? super Path, bth> qy6Var) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(str, "glob");
        md8.checkNotNullParameter(qy6Var, "action");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            md8.checkNotNull(directoryStreamNewDirectoryStream);
            Iterator<Path> it = directoryStreamNewDirectoryStream.iterator();
            while (it.hasNext()) {
                qy6Var.invoke(it.next());
            }
            bth bthVar = bth.f14751a;
            o28.finallyStart(1);
            if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                u52.closeFinally(directoryStreamNewDirectoryStream, null);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            o28.finallyEnd(1);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o28.finallyStart(1);
                if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                    u52.closeFinally(directoryStreamNewDirectoryStream, th);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable unused) {
                    }
                }
                o28.finallyEnd(1);
                throw th2;
            }
        }
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final Object getAttribute(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(str, "attribute");
        md8.checkNotNullParameter(linkOptionArr, "options");
        return Files.getAttribute(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @yfb
    public static final String getExtension(@yfb Path path) {
        String string;
        String strSubstringAfterLast;
        md8.checkNotNullParameter(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strSubstringAfterLast = m9g.substringAfterLast(string, a18.f100c, "")) == null) ? "" : strSubstringAfterLast;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    public static /* synthetic */ void getExtension$annotations(Path path) {
    }

    private static final String getInvariantSeparatorsPath(Path path) {
        md8.checkNotNullParameter(path, "<this>");
        return getInvariantSeparatorsPathString(path);
    }

    @jjf(version = "1.4")
    @t28
    @q64(level = u64.f86866b, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @i2e(expression = "invariantSeparatorsPathString", imports = {}))
    @mh5
    public static /* synthetic */ void getInvariantSeparatorsPath$annotations(Path path) {
    }

    @yfb
    public static final String getInvariantSeparatorsPathString(@yfb Path path) {
        md8.checkNotNullParameter(path, "<this>");
        String separator = path.getFileSystem().getSeparator();
        if (md8.areEqual(separator, pj4.f71071b)) {
            return path.toString();
        }
        String string = path.toString();
        md8.checkNotNull(separator);
        return h9g.replace$default(string, separator, pj4.f71071b, false, 4, (Object) null);
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    public static /* synthetic */ void getInvariantSeparatorsPathString$annotations(Path path) {
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final FileTime getLastModifiedTime(Path path, LinkOption... linkOptionArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(linkOptionArr, "options");
        FileTime lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        md8.checkNotNullExpressionValue(lastModifiedTime, "getLastModifiedTime(...)");
        return lastModifiedTime;
    }

    @yfb
    public static final String getName(@yfb Path path) {
        md8.checkNotNullParameter(path, "<this>");
        Path fileName = path.getFileName();
        String string = fileName != null ? fileName.toString() : null;
        return string == null ? "" : string;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    public static /* synthetic */ void getName$annotations(Path path) {
    }

    @yfb
    public static final String getNameWithoutExtension(@yfb Path path) {
        String string;
        String strSubstringBeforeLast$default;
        md8.checkNotNullParameter(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strSubstringBeforeLast$default = m9g.substringBeforeLast$default(string, ".", (String) null, 2, (Object) null)) == null) ? "" : strSubstringBeforeLast$default;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    public static /* synthetic */ void getNameWithoutExtension$annotations(Path path) {
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final UserPrincipal getOwner(Path path, LinkOption... linkOptionArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(linkOptionArr, "options");
        return Files.getOwner(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    private static final String getPathString(Path path) {
        md8.checkNotNullParameter(path, "<this>");
        return path.toString();
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    public static /* synthetic */ void getPathString$annotations(Path path) {
    }

    @jjf(version = "1.5")
    @t28
    @ihi(markerClass = {mh5.class})
    private static final Set<PosixFilePermission> getPosixFilePermissions(Path path, LinkOption... linkOptionArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(linkOptionArr, "options");
        Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        md8.checkNotNullExpressionValue(posixFilePermissions, "getPosixFilePermissions(...)");
        return posixFilePermissions;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final boolean isDirectory(Path path, LinkOption... linkOptionArr) {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(linkOptionArr, "options");
        return Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final boolean isExecutable(Path path) {
        md8.checkNotNullParameter(path, "<this>");
        return Files.isExecutable(path);
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final boolean isHidden(Path path) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        return Files.isHidden(path);
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final boolean isReadable(Path path) {
        md8.checkNotNullParameter(path, "<this>");
        return Files.isReadable(path);
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final boolean isRegularFile(Path path, LinkOption... linkOptionArr) {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(linkOptionArr, "options");
        return Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final boolean isSameFileAs(Path path, Path path2) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(path2, "other");
        return Files.isSameFile(path, path2);
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final boolean isSymbolicLink(Path path) {
        md8.checkNotNullParameter(path, "<this>");
        return Files.isSymbolicLink(path);
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final boolean isWritable(Path path) {
        md8.checkNotNullParameter(path, "<this>");
        return Files.isWritable(path);
    }

    @jjf(version = "1.5")
    @ihi(markerClass = {mh5.class})
    @yfb
    public static final List<Path> listDirectoryEntries(@yfb Path path, @yfb String str) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(str, "glob");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            md8.checkNotNull(directoryStreamNewDirectoryStream);
            List<Path> list = v82.toList(directoryStreamNewDirectoryStream);
            u52.closeFinally(directoryStreamNewDirectoryStream, null);
            return list;
        } finally {
        }
    }

    public static /* synthetic */ List listDirectoryEntries$default(Path path, String str, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = "*";
        }
        return listDirectoryEntries(path, str);
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final Path moveTo(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(path2, "target");
        md8.checkNotNullParameter(copyOptionArr, "options");
        Path pathMove = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        md8.checkNotNullExpressionValue(pathMove, "move(...)");
        return pathMove;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final boolean notExists(Path path, LinkOption... linkOptionArr) {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(linkOptionArr, "options");
        return Files.notExists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Path m22079q(Path path, Path path2, boolean z, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            z = false;
        }
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathCopy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        md8.checkNotNullExpressionValue(pathCopy, "copy(...)");
        return pathCopy;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Path m22080r(String str, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = null;
        }
        md8.checkNotNullParameter(fileAttributeArr, "attributes");
        Path pathCreateTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        md8.checkNotNullExpressionValue(pathCreateTempDirectory, "createTempDirectory(...)");
        return pathCreateTempDirectory;
    }

    @jjf(version = "1.5")
    @t28
    @ihi(markerClass = {mh5.class})
    private static final /* synthetic */ <A extends BasicFileAttributes> A readAttributes(Path path, LinkOption... linkOptionArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(linkOptionArr, "options");
        md8.reifiedOperationMarker(4, k95.f53065W4);
        A a = (A) Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        md8.checkNotNullExpressionValue(a, "readAttributes(...)");
        return a;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final Path readSymbolicLink(Path path) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        Path symbolicLink = Files.readSymbolicLink(path);
        md8.checkNotNullExpressionValue(symbolicLink, "readSymbolicLink(...)");
        return symbolicLink;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @yfb
    public static final Path relativeTo(@yfb Path path, @yfb Path path2) {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(path2, "base");
        try {
            return akc.f1832a.tryRelativeTo(path, path2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "\nthis path: " + path + "\nbase path: " + path2, e);
        }
    }

    @gib
    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    public static final Path relativeToOrNull(@yfb Path path, @yfb Path path2) {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(path2, "base");
        try {
            return akc.f1832a.tryRelativeTo(path, path2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @yfb
    public static final Path relativeToOrSelf(@yfb Path path, @yfb Path path2) {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(path2, "base");
        Path pathRelativeToOrNull = relativeToOrNull(path, path2);
        return pathRelativeToOrNull == null ? path : pathRelativeToOrNull;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Path m22081s(String str, String str2, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        md8.checkNotNullParameter(fileAttributeArr, "attributes");
        Path pathCreateTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        md8.checkNotNullExpressionValue(pathCreateTempFile, "createTempFile(...)");
        return pathCreateTempFile;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final Path setAttribute(Path path, String str, Object obj, LinkOption... linkOptionArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(str, "attribute");
        md8.checkNotNullParameter(linkOptionArr, "options");
        Path attribute = Files.setAttribute(path, str, obj, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        md8.checkNotNullExpressionValue(attribute, "setAttribute(...)");
        return attribute;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final Path setLastModifiedTime(Path path, FileTime fileTime) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(fileTime, "value");
        Path lastModifiedTime = Files.setLastModifiedTime(path, fileTime);
        md8.checkNotNullExpressionValue(lastModifiedTime, "setLastModifiedTime(...)");
        return lastModifiedTime;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final Path setOwner(Path path, UserPrincipal userPrincipal) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(userPrincipal, "value");
        Path owner = Files.setOwner(path, userPrincipal);
        md8.checkNotNullExpressionValue(owner, "setOwner(...)");
        return owner;
    }

    @jjf(version = "1.5")
    @t28
    @ihi(markerClass = {mh5.class})
    private static final Path setPosixFilePermissions(Path path, Set<? extends PosixFilePermission> set) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(set, "value");
        Path posixFilePermissions = Files.setPosixFilePermissions(path, set);
        md8.checkNotNullExpressionValue(posixFilePermissions, "setPosixFilePermissions(...)");
        return posixFilePermissions;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m22082t(Path path, String str, qy6 qy6Var, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = "*";
        }
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(str, "glob");
        md8.checkNotNullParameter(qy6Var, "action");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            md8.checkNotNull(directoryStreamNewDirectoryStream);
            Iterator<Path> it = directoryStreamNewDirectoryStream.iterator();
            while (it.hasNext()) {
                qy6Var.invoke(it.next());
            }
            bth bthVar = bth.f14751a;
            o28.finallyStart(1);
            if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                u52.closeFinally(directoryStreamNewDirectoryStream, null);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            o28.finallyEnd(1);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o28.finallyStart(1);
                if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                    u52.closeFinally(directoryStreamNewDirectoryStream, th);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable unused) {
                    }
                }
                o28.finallyEnd(1);
                throw th2;
            }
        }
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final Path toPath(URI uri) {
        md8.checkNotNullParameter(uri, "<this>");
        Path path = Paths.get(uri);
        md8.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ Path m22083u(Path path, Path path2, boolean z, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            z = false;
        }
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathMove = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        md8.checkNotNullExpressionValue(pathMove, "move(...)");
        return pathMove;
    }

    @jjf(version = "1.5")
    @t28
    @ihi(markerClass = {mh5.class})
    private static final <T> T useDirectoryEntries(Path path, String str, qy6<? super vye<? extends Path>, ? extends T> qy6Var) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(str, "glob");
        md8.checkNotNullParameter(qy6Var, "block");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            md8.checkNotNull(directoryStreamNewDirectoryStream);
            T tInvoke = qy6Var.invoke(v82.asSequence(directoryStreamNewDirectoryStream));
            o28.finallyStart(1);
            if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                u52.closeFinally(directoryStreamNewDirectoryStream, null);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            o28.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o28.finallyStart(1);
                if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                    u52.closeFinally(directoryStreamNewDirectoryStream, th);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable unused) {
                    }
                }
                o28.finallyEnd(1);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ Object m22084v(Path path, String str, qy6 qy6Var, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = "*";
        }
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(str, "glob");
        md8.checkNotNullParameter(qy6Var, "block");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            md8.checkNotNull(directoryStreamNewDirectoryStream);
            Object objInvoke = qy6Var.invoke(v82.asSequence(directoryStreamNewDirectoryStream));
            o28.finallyStart(1);
            if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                u52.closeFinally(directoryStreamNewDirectoryStream, null);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            o28.finallyEnd(1);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o28.finallyStart(1);
                if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                    u52.closeFinally(directoryStreamNewDirectoryStream, th);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable unused) {
                    }
                }
                o28.finallyEnd(1);
                throw th2;
            }
        }
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "2.1")
    public static final void visitFileTree(@yfb Path path, @yfb FileVisitor<Path> fileVisitor, int i, boolean z) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(fileVisitor, "visitor");
        Files.walkFileTree(path, z ? v6f.setOf(FileVisitOption.FOLLOW_LINKS) : w6f.emptySet(), i, fileVisitor);
    }

    public static /* synthetic */ void visitFileTree$default(Path path, FileVisitor fileVisitor, int i, boolean z, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        visitFileTree(path, (FileVisitor<Path>) fileVisitor, i, z);
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "2.1")
    @yfb
    public static final vye<Path> walk(@yfb Path path, @yfb jkc... jkcVarArr) {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(jkcVarArr, "options");
        return new fkc(path, jkcVarArr);
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final Path Path(String str, String... strArr) {
        md8.checkNotNullParameter(str, "base");
        md8.checkNotNullParameter(strArr, "subpaths");
        Path path = Paths.get(str, (String[]) Arrays.copyOf(strArr, strArr.length));
        md8.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    @jjf(version = "1.5")
    @ihi(markerClass = {mh5.class})
    @yfb
    public static final Path createTempDirectory(@gib Path path, @gib String str, @yfb FileAttribute<?>... fileAttributeArr) throws IOException {
        md8.checkNotNullParameter(fileAttributeArr, "attributes");
        if (path != null) {
            Path pathCreateTempDirectory = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            md8.checkNotNullExpressionValue(pathCreateTempDirectory, "createTempDirectory(...)");
            return pathCreateTempDirectory;
        }
        Path pathCreateTempDirectory2 = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        md8.checkNotNullExpressionValue(pathCreateTempDirectory2, "createTempDirectory(...)");
        return pathCreateTempDirectory2;
    }

    @jjf(version = "1.5")
    @ihi(markerClass = {mh5.class})
    @yfb
    public static final Path createTempFile(@gib Path path, @gib String str, @gib String str2, @yfb FileAttribute<?>... fileAttributeArr) throws IOException {
        md8.checkNotNullParameter(fileAttributeArr, "attributes");
        if (path != null) {
            Path pathCreateTempFile = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            md8.checkNotNullExpressionValue(pathCreateTempFile, "createTempFile(...)");
            return pathCreateTempFile;
        }
        Path pathCreateTempFile2 = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        md8.checkNotNullExpressionValue(pathCreateTempFile2, "createTempFile(...)");
        return pathCreateTempFile2;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final Path div(Path path, String str) {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(str, "other");
        Path pathResolve = path.resolve(str);
        md8.checkNotNullExpressionValue(pathResolve, "resolve(...)");
        return pathResolve;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final Path moveTo(Path path, Path path2, boolean z) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathMove = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        md8.checkNotNullExpressionValue(pathMove, "move(...)");
        return pathMove;
    }

    @jjf(version = "1.5")
    @t28
    @ihi(markerClass = {mh5.class})
    private static final Map<String, Object> readAttributes(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(str, "attributes");
        md8.checkNotNullParameter(linkOptionArr, "options");
        Map<String, Object> attributes = Files.readAttributes(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        md8.checkNotNullExpressionValue(attributes, "readAttributes(...)");
        return attributes;
    }

    public static /* synthetic */ void visitFileTree$default(Path path, int i, boolean z, qy6 qy6Var, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        visitFileTree(path, i, z, (qy6<? super zt5, bth>) qy6Var);
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final Path copyTo(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(path2, "target");
        md8.checkNotNullParameter(copyOptionArr, "options");
        Path pathCopy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        md8.checkNotNullExpressionValue(pathCopy, "copy(...)");
        return pathCopy;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "2.1")
    public static final void visitFileTree(@yfb Path path, int i, boolean z, @yfb qy6<? super zt5, bth> qy6Var) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(qy6Var, "builderAction");
        visitFileTree(path, fileVisitor(qy6Var), i, z);
    }
}
