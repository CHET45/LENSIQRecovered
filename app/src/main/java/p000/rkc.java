package p000;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p000.md8;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nPathRecursiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,530:1\n376#1,2:534\n384#1:536\n384#1:537\n378#1,4:538\n376#1,2:542\n384#1:544\n378#1,4:545\n384#1:549\n376#1,6:550\n376#1,2:556\n384#1:558\n378#1,4:559\n1#2:531\n1863#3,2:532\n*S KotlinDebug\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n*L\n392#1:534,2\n407#1:536\n410#1:537\n392#1:538,4\n418#1:542,2\n419#1:544\n418#1:545,4\n430#1:549\n438#1:550,6\n461#1:556,2\n462#1:558\n461#1:559,4\n314#1:532,2\n*E\n"})
public class rkc extends lkc {

    /* JADX INFO: renamed from: rkc$a */
    public /* synthetic */ class C12128a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f78560a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f78561b;

        static {
            int[] iArr = new int[d03.values().length];
            try {
                iArr[d03.f28127a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d03.f28129c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d03.f28128b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f78560a = iArr;
            int[] iArr2 = new int[r2c.values().length];
            try {
                iArr2[r2c.f76903b.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[r2c.f76902a.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f78561b = iArr2;
        }
    }

    /* JADX INFO: renamed from: rkc$b */
    public static final class C12129b implements kz6 {

        /* JADX INFO: renamed from: a */
        public static final C12129b f78562a = new C12129b();

        @Override // p000.kz6
        public final Void invoke(Path path, Path path2, Exception exc) throws Exception {
            md8.checkNotNullParameter(path, "<unused var>");
            md8.checkNotNullParameter(path2, "<unused var>");
            md8.checkNotNullParameter(exc, "exception");
            throw exc;
        }
    }

    /* JADX INFO: renamed from: rkc$c */
    public static final class C12130c implements kz6 {

        /* JADX INFO: renamed from: a */
        public static final C12130c f78563a = new C12130c();

        @Override // p000.kz6
        public final Void invoke(Path path, Path path2, Exception exc) throws Exception {
            md8.checkNotNullParameter(path, "<unused var>");
            md8.checkNotNullParameter(path2, "<unused var>");
            md8.checkNotNullParameter(exc, "exception");
            throw exc;
        }
    }

    /* JADX INFO: renamed from: rkc$d */
    public /* synthetic */ class C12131d extends n07 implements gz6<Path, BasicFileAttributes, FileVisitResult> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList<Path> f78564a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kz6<c03, Path, Path, d03> f78565b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Path f78566c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Path f78567d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Path f78568e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ kz6<Path, Path, Exception, r2c> f78569f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12131d(ArrayList<Path> arrayList, kz6<? super c03, ? super Path, ? super Path, ? extends d03> kz6Var, Path path, Path path2, Path path3, kz6<? super Path, ? super Path, ? super Exception, ? extends r2c> kz6Var2) {
            super(2, md8.C9318a.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
            this.f78564a = arrayList;
            this.f78565b = kz6Var;
            this.f78566c = path;
            this.f78567d = path2;
            this.f78568e = path3;
            this.f78569f = kz6Var2;
        }

        @Override // p000.gz6
        public final FileVisitResult invoke(Path path, BasicFileAttributes basicFileAttributes) {
            md8.checkNotNullParameter(path, "p0");
            md8.checkNotNullParameter(basicFileAttributes, "p1");
            return rkc.copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(this.f78564a, this.f78565b, this.f78566c, this.f78567d, this.f78568e, this.f78569f, path, basicFileAttributes);
        }
    }

    /* JADX INFO: renamed from: rkc$e */
    public /* synthetic */ class C12132e extends n07 implements gz6<Path, Exception, FileVisitResult> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kz6<Path, Path, Exception, r2c> f78570a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Path f78571b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Path f78572c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Path f78573d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12132e(kz6<? super Path, ? super Path, ? super Exception, ? extends r2c> kz6Var, Path path, Path path2, Path path3) {
            super(2, md8.C9318a.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
            this.f78570a = kz6Var;
            this.f78571b = path;
            this.f78572c = path2;
            this.f78573d = path3;
        }

        @Override // p000.gz6
        public final FileVisitResult invoke(Path path, Exception exc) {
            md8.checkNotNullParameter(path, "p0");
            md8.checkNotNullParameter(exc, "p1");
            return rkc.copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(this.f78570a, this.f78571b, this.f78572c, this.f78573d, path, exc);
        }
    }

    public static final void checkFileName(@yfb Path path) {
        md8.checkNotNullParameter(path, "<this>");
        String name = skc.getName(path);
        int iHashCode = name.hashCode();
        if (iHashCode != 46) {
            if (iHashCode != 1518) {
                if (iHashCode != 45679) {
                    if (iHashCode != 45724) {
                        if (iHashCode != 1472) {
                            if (iHashCode != 1473 || !name.equals("./")) {
                                return;
                            }
                        } else if (!name.equals("..")) {
                            return;
                        }
                    } else if (!name.equals("..\\")) {
                        return;
                    }
                } else if (!name.equals("../")) {
                    return;
                }
            } else if (!name.equals(".\\")) {
                return;
            }
        } else if (!name.equals(".")) {
            return;
        }
        throw new fs7(path);
    }

    private static final void checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(Path path, Path path2) throws FileSystemLoopException {
        if (!Files.isSymbolicLink(path) && Files.isSameFile(path, path2)) {
            throw new FileSystemLoopException(path.toString());
        }
    }

    private static final void collectIfThrows$PathsKt__PathRecursiveFunctionsKt(q75 q75Var, ny6<bth> ny6Var) {
        try {
            ny6Var.invoke();
        } catch (Exception e) {
            q75Var.collect(e);
        }
    }

    @jjf(version = "1.8")
    @yfb
    @mh5
    public static final Path copyToRecursively(@yfb Path path, @yfb Path path2, @yfb kz6<? super Path, ? super Path, ? super Exception, ? extends r2c> kz6Var, final boolean z, boolean z2) {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(path2, "target");
        md8.checkNotNullParameter(kz6Var, "onError");
        return z2 ? copyToRecursively(path, path2, kz6Var, z, (kz6<? super c03, ? super Path, ? super Path, ? extends d03>) new kz6() { // from class: nkc
            @Override // p000.kz6
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return rkc.copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt(z, (c03) obj, (Path) obj2, (Path) obj3);
            }
        }) : copyToRecursively$default(path, path2, kz6Var, z, (kz6) null, 8, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(ArrayList<Path> arrayList, kz6<? super c03, ? super Path, ? super Path, ? extends d03> kz6Var, Path path, Path path2, Path path3, kz6<? super Path, ? super Path, ? super Exception, ? extends r2c> kz6Var2, Path path4, BasicFileAttributes basicFileAttributes) {
        try {
            if (!arrayList.isEmpty()) {
                checkFileName(path4);
                Object objLast = v82.last((List<? extends Object>) arrayList);
                md8.checkNotNullExpressionValue(objLast, "last(...)");
                checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(path4, (Path) objLast);
            }
            return toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(kz6Var.invoke(mt3.f62065a, path4, copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(path, path2, path3, path4)));
        } catch (Exception e) {
            return copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(kz6Var2, path, path2, path3, path4, e);
        }
    }

    public static /* synthetic */ Path copyToRecursively$default(Path path, Path path2, kz6 kz6Var, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            kz6Var = C12129b.f78562a;
        }
        return copyToRecursively(path, path2, (kz6<? super Path, ? super Path, ? super Exception, ? extends r2c>) kz6Var, z, z2);
    }

    private static final Path copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(Path path, Path path2, Path path3, Path path4) throws fs7 {
        Path pathResolve = path2.resolve(skc.relativeTo(path4, path).toString());
        if (!pathResolve.normalize().startsWith(path3)) {
            throw new fs7(path4, pathResolve, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
        }
        md8.checkNotNull(pathResolve);
        return pathResolve;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(kz6<? super Path, ? super Path, ? super Exception, ? extends r2c> kz6Var, Path path, Path path2, Path path3, Path path4, Exception exc) {
        return toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(kz6Var.invoke(path4, copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(path, path2, path3, path4), exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d03 copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt(boolean z, c03 c03Var, Path path, Path path2) throws IllegalAccessException, FileSystemException, InvocationTargetException {
        md8.checkNotNullParameter(c03Var, "$this$copyToRecursively");
        md8.checkNotNullParameter(path, "src");
        md8.checkNotNullParameter(path2, "dst");
        LinkOption[] linkOptions = c79.f15902a.toLinkOptions(z);
        boolean zIsDirectory = Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1));
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
        if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !zIsDirectory) {
            if (zIsDirectory) {
                deleteRecursively(path2);
            }
            fzf fzfVar = new fzf(2);
            fzfVar.addSpread(linkOptions);
            fzfVar.add(StandardCopyOption.REPLACE_EXISTING);
            CopyOption[] copyOptionArr = (CopyOption[]) fzfVar.toArray(new CopyOption[fzfVar.size()]);
            md8.checkNotNullExpressionValue(Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(...)");
        }
        return d03.f28127a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d03 copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt(boolean z, c03 c03Var, Path path, Path path2) {
        md8.checkNotNullParameter(c03Var, "<this>");
        md8.checkNotNullParameter(path, "src");
        md8.checkNotNullParameter(path2, "dst");
        return c03Var.copyToIgnoringExistingDirectory(path, path2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth copyToRecursively$lambda$6$PathsKt__PathRecursiveFunctionsKt(final ArrayList arrayList, final kz6 kz6Var, final Path path, final Path path2, final Path path3, final kz6 kz6Var2, zt5 zt5Var) {
        md8.checkNotNullParameter(zt5Var, "$this$visitFileTree");
        zt5Var.onPreVisitDirectory(new gz6() { // from class: pkc
            @Override // p000.gz6
            public final Object invoke(Object obj, Object obj2) {
                return rkc.m21403x672c94f7(arrayList, kz6Var, path, path2, path3, kz6Var2, (Path) obj, (BasicFileAttributes) obj2);
            }
        });
        zt5Var.onVisitFile(new C12131d(arrayList, kz6Var, path, path2, path3, kz6Var2));
        zt5Var.onVisitFileFailed(new C12132e(kz6Var2, path, path2, path3));
        zt5Var.onPostVisitDirectory(new gz6() { // from class: qkc
            @Override // p000.gz6
            public final Object invoke(Object obj, Object obj2) {
                return rkc.m21404xce0554b8(arrayList, kz6Var2, path, path2, path3, (Path) obj, (IOException) obj2);
            }
        });
        return bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: copyToRecursively$lambda$6$lambda$4$PathsKt__PathRecursiveFunctionsKt */
    public static final FileVisitResult m21403x672c94f7(ArrayList arrayList, kz6 kz6Var, Path path, Path path2, Path path3, kz6 kz6Var2, Path path4, BasicFileAttributes basicFileAttributes) {
        md8.checkNotNullParameter(path4, "directory");
        md8.checkNotNullParameter(basicFileAttributes, "attributes");
        FileVisitResult fileVisitResultCopyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt = copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(arrayList, kz6Var, path, path2, path3, kz6Var2, path4, basicFileAttributes);
        if (fileVisitResultCopyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt == FileVisitResult.CONTINUE) {
            arrayList.add(path4);
        }
        return fileVisitResultCopyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: copyToRecursively$lambda$6$lambda$5$PathsKt__PathRecursiveFunctionsKt */
    public static final FileVisitResult m21404xce0554b8(ArrayList arrayList, kz6 kz6Var, Path path, Path path2, Path path3, Path path4, IOException iOException) {
        md8.checkNotNullParameter(path4, "directory");
        q82.removeLast(arrayList);
        return iOException == null ? FileVisitResult.CONTINUE : copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(kz6Var, path, path2, path3, path4, iOException);
    }

    @jjf(version = "1.8")
    @mh5
    public static final void deleteRecursively(@yfb Path path) throws IllegalAccessException, FileSystemException, InvocationTargetException {
        md8.checkNotNullParameter(path, "<this>");
        List<Exception> listDeleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt = deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(path);
        if (listDeleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt.isEmpty()) {
            return;
        }
        FileSystemException fileSystemException = new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
        Iterator<T> it = listDeleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt.iterator();
        while (it.hasNext()) {
            a85.addSuppressed(fileSystemException, (Exception) it.next());
        }
        throw fileSystemException;
    }

    private static final List<Exception> deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(Path path) {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        boolean z = false;
        boolean z2 = true;
        q75 q75Var = new q75(0, 1, null);
        Path parent = path.getParent();
        if (parent != null) {
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStreamNewDirectoryStream = null;
            }
            if (directoryStreamNewDirectoryStream != null) {
                try {
                    if (directoryStreamNewDirectoryStream instanceof SecureDirectoryStream) {
                        q75Var.setPath(parent);
                        Path fileName = path.getFileName();
                        md8.checkNotNullExpressionValue(fileName, "getFileName(...)");
                        handleEntry$PathsKt__PathRecursiveFunctionsKt((SecureDirectoryStream) directoryStreamNewDirectoryStream, fileName, null, q75Var);
                    } else {
                        z = true;
                    }
                    bth bthVar = bth.f14751a;
                    u52.closeFinally(directoryStreamNewDirectoryStream, null);
                    z2 = z;
                } finally {
                }
            }
        }
        if (z2) {
            insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(path, null, q75Var);
        }
        return q75Var.getCollectedExceptions();
    }

    private static final void enterDirectory$PathsKt__PathRecursiveFunctionsKt(SecureDirectoryStream<Path> secureDirectoryStream, Path path, q75 q75Var) {
        SecureDirectoryStream<Path> secureDirectoryStreamNewDirectoryStream;
        try {
            try {
                secureDirectoryStreamNewDirectoryStream = secureDirectoryStream.newDirectoryStream(path, LinkOption.NOFOLLOW_LINKS);
            } catch (NoSuchFileException unused) {
                secureDirectoryStreamNewDirectoryStream = null;
            }
            if (secureDirectoryStreamNewDirectoryStream == null) {
                return;
            }
            try {
                Iterator<Path> it = secureDirectoryStreamNewDirectoryStream.iterator();
                md8.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    Path fileName = it.next().getFileName();
                    md8.checkNotNullExpressionValue(fileName, "getFileName(...)");
                    handleEntry$PathsKt__PathRecursiveFunctionsKt(secureDirectoryStreamNewDirectoryStream, fileName, q75Var.getPath(), q75Var);
                }
                bth bthVar = bth.f14751a;
                u52.closeFinally(secureDirectoryStreamNewDirectoryStream, null);
            } finally {
            }
        } catch (Exception e) {
            q75Var.collect(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[Catch: Exception -> 0x0013, NoSuchFileException -> 0x003d, TRY_LEAVE, TryCatch #0 {NoSuchFileException -> 0x003d, blocks: (B:11:0x002e, B:12:0x0034), top: B:19:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[Catch: Exception -> 0x0013, TRY_LEAVE, TryCatch #1 {Exception -> 0x0013, blocks: (B:4:0x0005, B:7:0x0015, B:9:0x0021, B:11:0x002e, B:12:0x0034), top: B:21:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void handleEntry$PathsKt__PathRecursiveFunctionsKt(java.nio.file.SecureDirectoryStream<java.nio.file.Path> r1, java.nio.file.Path r2, java.nio.file.Path r3, p000.q75 r4) {
        /*
            r4.enterEntry(r2)
            if (r3 == 0) goto L15
            java.nio.file.Path r0 = r4.getPath()     // Catch: java.lang.Exception -> L13
            p000.md8.checkNotNull(r0)     // Catch: java.lang.Exception -> L13
            checkFileName(r0)     // Catch: java.lang.Exception -> L13
            checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(r0, r3)     // Catch: java.lang.Exception -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L3a
        L15:
            java.nio.file.LinkOption r3 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch: java.lang.Exception -> L13
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[]{r3}     // Catch: java.lang.Exception -> L13
            boolean r3 = isDirectory$PathsKt__PathRecursiveFunctionsKt(r1, r2, r3)     // Catch: java.lang.Exception -> L13
            if (r3 == 0) goto L34
            int r3 = r4.getTotalExceptions()     // Catch: java.lang.Exception -> L13
            enterDirectory$PathsKt__PathRecursiveFunctionsKt(r1, r2, r4)     // Catch: java.lang.Exception -> L13
            int r0 = r4.getTotalExceptions()     // Catch: java.lang.Exception -> L13
            if (r3 != r0) goto L3d
            r1.deleteDirectory(r2)     // Catch: java.lang.Exception -> L13 java.nio.file.NoSuchFileException -> L3d
            bth r1 = p000.bth.f14751a     // Catch: java.lang.Exception -> L13 java.nio.file.NoSuchFileException -> L3d
            goto L3d
        L34:
            r1.deleteFile(r2)     // Catch: java.lang.Exception -> L13 java.nio.file.NoSuchFileException -> L3d
            bth r1 = p000.bth.f14751a     // Catch: java.lang.Exception -> L13 java.nio.file.NoSuchFileException -> L3d
            goto L3d
        L3a:
            r4.collect(r1)
        L3d:
            r4.exitEntry(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rkc.handleEntry$PathsKt__PathRecursiveFunctionsKt(java.nio.file.SecureDirectoryStream, java.nio.file.Path, java.nio.file.Path, q75):void");
    }

    private static final void insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(Path path, q75 q75Var) {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        try {
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(path);
            } catch (NoSuchFileException unused) {
                directoryStreamNewDirectoryStream = null;
            }
            if (directoryStreamNewDirectoryStream == null) {
                return;
            }
            try {
                Iterator<Path> it = directoryStreamNewDirectoryStream.iterator();
                md8.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    Path next = it.next();
                    md8.checkNotNull(next);
                    insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(next, path, q75Var);
                }
                bth bthVar = bth.f14751a;
                u52.closeFinally(directoryStreamNewDirectoryStream, null);
            } finally {
            }
        } catch (Exception e) {
            q75Var.collect(e);
        }
    }

    private static final void insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(Path path, Path path2, q75 q75Var) {
        if (path2 != null) {
            try {
                checkFileName(path);
                checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(path, path2);
            } catch (Exception e) {
                q75Var.collect(e);
                return;
            }
        }
        if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            Files.deleteIfExists(path);
            return;
        }
        int totalExceptions = q75Var.getTotalExceptions();
        insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(path, q75Var);
        if (totalExceptions == q75Var.getTotalExceptions()) {
            Files.deleteIfExists(path);
        }
    }

    private static final boolean isDirectory$PathsKt__PathRecursiveFunctionsKt(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean boolValueOf;
        try {
            boolValueOf = Boolean.valueOf(((BasicFileAttributeView) secureDirectoryStream.getFileAttributeView(path, BasicFileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))).readAttributes().isDirectory());
        } catch (NoSuchFileException unused) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @mh5
    private static final FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(d03 d03Var) {
        int i = C12128a.f78560a[d03Var.ordinal()];
        if (i == 1) {
            return FileVisitResult.CONTINUE;
        }
        if (i == 2) {
            return FileVisitResult.TERMINATE;
        }
        if (i == 3) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new ceb();
    }

    private static final <R> R tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt(ny6<? extends R> ny6Var) {
        try {
            return ny6Var.invoke();
        } catch (NoSuchFileException unused) {
            return null;
        }
    }

    @jjf(version = "1.8")
    @yfb
    @mh5
    public static final Path copyToRecursively(@yfb final Path path, @yfb final Path path2, @yfb final kz6<? super Path, ? super Path, ? super Exception, ? extends r2c> kz6Var, boolean z, @yfb final kz6<? super c03, ? super Path, ? super Path, ? extends d03> kz6Var2) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(path2, "target");
        md8.checkNotNullParameter(kz6Var, "onError");
        md8.checkNotNullParameter(kz6Var2, "copyAction");
        LinkOption[] linkOptions = c79.f15902a.toLinkOptions(z);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
        if (Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            boolean zStartsWith = false;
            if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && (z || !Files.isSymbolicLink(path))) {
                boolean z2 = Files.exists(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && !Files.isSymbolicLink(path2);
                if (!z2 || !Files.isSameFile(path, path2)) {
                    if (md8.areEqual(path.getFileSystem(), path2.getFileSystem())) {
                        if (z2) {
                            zStartsWith = path2.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]));
                        } else {
                            Path parent = path2.getParent();
                            if (parent != null && Files.exists(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && parent.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]))) {
                                zStartsWith = true;
                            }
                        }
                    }
                    if (zStartsWith) {
                        throw new FileSystemException(path.toString(), path2.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
                    }
                }
            }
            final Path pathNormalize = path2.normalize();
            final ArrayList arrayList = new ArrayList();
            skc.visitFileTree$default(path, 0, z, new qy6() { // from class: okc
                @Override // p000.qy6
                public final Object invoke(Object obj) {
                    return rkc.copyToRecursively$lambda$6$PathsKt__PathRecursiveFunctionsKt(arrayList, kz6Var2, path, path2, pathNormalize, kz6Var, (zt5) obj);
                }
            }, 1, (Object) null);
            return path2;
        }
        throw new NoSuchFileException(path.toString(), path2.toString(), "The source file doesn't exist.");
    }

    public static /* synthetic */ Path copyToRecursively$default(Path path, Path path2, kz6 kz6Var, final boolean z, kz6 kz6Var2, int i, Object obj) {
        if ((i & 2) != 0) {
            kz6Var = C12130c.f78563a;
        }
        if ((i & 8) != 0) {
            kz6Var2 = new kz6() { // from class: mkc
                @Override // p000.kz6
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return rkc.copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt(z, (c03) obj2, (Path) obj3, (Path) obj4);
                }
            };
        }
        return copyToRecursively(path, path2, (kz6<? super Path, ? super Path, ? super Exception, ? extends r2c>) kz6Var, z, (kz6<? super c03, ? super Path, ? super Path, ? extends d03>) kz6Var2);
    }

    @mh5
    private static final FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(r2c r2cVar) {
        int i = C12128a.f78561b[r2cVar.ordinal()];
        if (i == 1) {
            return FileVisitResult.TERMINATE;
        }
        if (i == 2) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new ceb();
    }
}
