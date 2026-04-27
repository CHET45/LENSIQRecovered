package p000;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryFlag;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;
import p000.bog;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public abstract class bog {

    /* JADX INFO: renamed from: a */
    public static final bog f14314a = pickSecureCreator();

    /* JADX INFO: renamed from: bog$b */
    public static final class C1966b extends bog {

        /* JADX INFO: renamed from: b */
        public static final int f14315b = 10000;

        private C1966b() {
            super();
        }

        @Override // p000.bog
        /* JADX INFO: renamed from: a */
        public File mo3284a() {
            File file = new File(h1g.JAVA_IO_TMPDIR.value());
            String str = System.currentTimeMillis() + "-";
            for (int i = 0; i < 10000; i++) {
                File file2 = new File(file, str + i);
                if (file2.mkdir()) {
                    return file2;
                }
            }
            throw new IllegalStateException("Failed to create directory within 10000 attempts (tried " + str + "0 to " + str + "9999)");
        }

        @Override // p000.bog
        /* JADX INFO: renamed from: b */
        public File mo3285b(String prefix) throws IOException {
            return File.createTempFile(prefix, null, null);
        }
    }

    /* JADX INFO: renamed from: bog$c */
    @wr7
    public static final class C1967c extends bog {

        /* JADX INFO: renamed from: b */
        public static final b f14316b;

        /* JADX INFO: renamed from: c */
        public static final b f14317c;

        /* JADX INFO: renamed from: bog$c$a */
        public class a implements FileAttribute<kx7<AclEntry>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ kx7 f14318a;

            public a(final kx7 val$acl) {
                this.f14318a = val$acl;
            }

            @Override // java.nio.file.attribute.FileAttribute
            public String name() {
                return "acl:acl";
            }

            @Override // java.nio.file.attribute.FileAttribute
            public kx7<AclEntry> value() {
                return this.f14318a;
            }
        }

        /* JADX INFO: renamed from: bog$c$b */
        @wr7
        public interface b {
            FileAttribute<?> get() throws IOException;
        }

        static {
            Set<String> setSupportedFileAttributeViews = FileSystems.getDefault().supportedFileAttributeViews();
            if (setSupportedFileAttributeViews.contains("posix")) {
                f14316b = new b() { // from class: cog
                    @Override // p000.bog.C1967c.b
                    public final FileAttribute get() {
                        return bog.C1967c.lambda$static$0();
                    }
                };
                f14317c = new b() { // from class: dog
                    @Override // p000.bog.C1967c.b
                    public final FileAttribute get() {
                        return bog.C1967c.lambda$static$1();
                    }
                };
            } else if (setSupportedFileAttributeViews.contains("acl")) {
                b bVarUserPermissions = userPermissions();
                f14317c = bVarUserPermissions;
                f14316b = bVarUserPermissions;
            } else {
                b bVar = new b() { // from class: eog
                    @Override // p000.bog.C1967c.b
                    public final FileAttribute get() {
                        return bog.C1967c.lambda$static$2();
                    }
                };
                f14317c = bVar;
                f14316b = bVar;
            }
        }

        private C1967c() {
            super();
        }

        private static String getUsername() {
            String strValue = h1g.USER_NAME.value();
            Objects.requireNonNull(strValue);
            try {
                Class<?> cls = Class.forName("java.lang.ProcessHandle");
                Class<?> cls2 = Class.forName("java.lang.ProcessHandle$Info");
                Class<?> cls3 = Class.forName("java.util.Optional");
                Method method = cls.getMethod("current", null);
                Method method2 = cls.getMethod(ocd.f67211j, null);
                Object objInvoke = cls3.getMethod("orElse", Object.class).invoke(cls2.getMethod("user", null).invoke(method2.invoke(method.invoke(null, null), null), null), strValue);
                Objects.requireNonNull(objInvoke);
                return (String) objInvoke;
            } catch (ClassNotFoundException unused) {
                return strValue;
            } catch (IllegalAccessException | NoSuchMethodException unused2) {
                return strValue;
            } catch (InvocationTargetException e) {
                bzg.throwIfUnchecked(e.getCause());
                return strValue;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ FileAttribute lambda$static$0() throws IOException {
            return PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rw-------"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ FileAttribute lambda$static$1() throws IOException {
            return PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rwx------"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ FileAttribute lambda$static$2() throws IOException {
            throw new IOException("unrecognized FileSystem type " + FileSystems.getDefault());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ FileAttribute lambda$userPermissions$3(FileAttribute fileAttribute) throws IOException {
            return fileAttribute;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ FileAttribute lambda$userPermissions$4(IOException iOException) throws IOException {
            throw new IOException("Could not find user", iOException);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b userPermissions() {
            try {
                final a aVar = new a(kx7.m15111of(AclEntry.newBuilder().setType(AclEntryType.ALLOW).setPrincipal(FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName(getUsername())).setPermissions(EnumSet.allOf(AclEntryPermission.class)).setFlags(AclEntryFlag.DIRECTORY_INHERIT, AclEntryFlag.FILE_INHERIT).build()));
                return new b() { // from class: fog
                    @Override // p000.bog.C1967c.b
                    public final FileAttribute get() {
                        return bog.C1967c.lambda$userPermissions$3(aVar);
                    }
                };
            } catch (IOException e) {
                return new b() { // from class: gog
                    @Override // p000.bog.C1967c.b
                    public final FileAttribute get() {
                        return bog.C1967c.lambda$userPermissions$4(e);
                    }
                };
            }
        }

        @Override // p000.bog
        /* JADX INFO: renamed from: a */
        public File mo3284a() {
            try {
                return Files.createTempDirectory(Paths.get(h1g.JAVA_IO_TMPDIR.value(), new String[0]), null, f14317c.get()).toFile();
            } catch (IOException e) {
                throw new IllegalStateException("Failed to create directory", e);
            }
        }

        @Override // p000.bog
        /* JADX INFO: renamed from: b */
        public File mo3285b(String prefix) throws IOException {
            return Files.createTempFile(Paths.get(h1g.JAVA_IO_TMPDIR.value(), new String[0]), prefix, null, f14316b.get()).toFile();
        }
    }

    /* JADX INFO: renamed from: bog$d */
    public static final class C1968d extends bog {

        /* JADX INFO: renamed from: b */
        public static final String f14319b = "Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().";

        private C1968d() {
            super();
        }

        @Override // p000.bog
        /* JADX INFO: renamed from: a */
        public File mo3284a() {
            throw new IllegalStateException(f14319b);
        }

        @Override // p000.bog
        /* JADX INFO: renamed from: b */
        public File mo3285b(String prefix) throws IOException {
            throw new IOException(f14319b);
        }
    }

    @gdi
    @wr7
    /* JADX INFO: renamed from: c */
    public static void m3283c() throws IOException {
        C1967c.userPermissions().get();
    }

    private static bog pickSecureCreator() {
        try {
            try {
                return new C1967c();
            } catch (ClassNotFoundException unused) {
                return new C1968d();
            } catch (IllegalAccessException unused2) {
                return new C1968d();
            } catch (NoSuchFieldException unused3) {
                return new C1968d();
            }
        } catch (ClassNotFoundException unused4) {
            return ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue() < ((Integer) Class.forName("android.os.Build$VERSION_CODES").getField("JELLY_BEAN").get(null)).intValue() ? new C1968d() : new C1966b();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract File mo3284a();

    /* JADX INFO: renamed from: b */
    public abstract File mo3285b(String prefix) throws IOException;

    private bog() {
    }
}
