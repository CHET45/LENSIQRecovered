package p000;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class yde {

    /* JADX INFO: renamed from: a */
    public static final EnumC15628b f101259a;

    /* JADX INFO: renamed from: b */
    public static final int f101260b = 4;

    /* JADX INFO: renamed from: c */
    public static final int f101261c = 28;

    /* JADX INFO: renamed from: d */
    public static final int f101262d = 2;

    /* JADX INFO: renamed from: e */
    public static final String f101263e = "";

    /* JADX INFO: renamed from: f */
    public static final EnumC15628b f101264f;

    /* JADX INFO: renamed from: g */
    public static final int f101265g = 4;

    /* JADX INFO: renamed from: h */
    public static final int f101266h = 28;

    /* JADX INFO: renamed from: i */
    public static final int f101267i = 2;

    /* JADX INFO: renamed from: j */
    public static final String f101268j = "";

    /* JADX INFO: renamed from: k */
    public static final String f101269k;

    /* JADX INFO: renamed from: l */
    public static final Logger f101270l;

    /* JADX INFO: renamed from: yde$a */
    public static final class C15627a extends RuntimeException {
        public C15627a(String message) {
            super(message);
        }
    }

    /* JADX INFO: renamed from: yde$b */
    public enum EnumC15628b {
        GOOGLE_INTERNAL,
        PUBLIC
    }

    static {
        EnumC15628b enumC15628b = EnumC15628b.PUBLIC;
        f101259a = enumC15628b;
        f101264f = enumC15628b;
        f101269k = versionString(4, 28, 2, "");
        f101270l = Logger.getLogger(yde.class.getName());
    }

    private yde() {
    }

    private static boolean checkDisabled() {
        String str = System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        return str != null && str.equals("true");
    }

    public static void validateProtobufGencodeVersion(EnumC15628b domain, int major, int minor, int patch, String suffix, String location) {
        if (checkDisabled()) {
            return;
        }
        validateProtobufGencodeVersionImpl(domain, major, minor, patch, suffix, location);
    }

    private static void validateProtobufGencodeVersionImpl(EnumC15628b domain, int major, int minor, int patch, String suffix, String location) {
        if (checkDisabled()) {
            return;
        }
        String strVersionString = versionString(major, minor, patch, suffix);
        if (major < 0 || minor < 0 || patch < 0) {
            throw new C15627a("Invalid gencode version: " + strVersionString);
        }
        EnumC15628b enumC15628b = f101264f;
        if (domain != enumC15628b) {
            throw new C15627a(String.format("Detected mismatched Protobuf Gencode/Runtime domains when loading %s: gencode %s, runtime %s. Cross-domain usage of Protobuf is not supported.", location, domain, enumC15628b));
        }
        if (major != 4) {
            if (major != 3) {
                throw new C15627a(String.format("Detected mismatched Protobuf Gencode/Runtime major versions when loading %s: gencode %s, runtime %s. Same major version is required.", location, strVersionString, f101269k));
            }
            f101270l.warning(String.format(" Protobuf gencode version %s is exactly one major version older than the runtime version %s at %s. Please update the gencode to avoid compatibility violations in the next runtime release.", strVersionString, f101269k, location));
        }
        if (28 < minor || (minor == 28 && 2 < patch)) {
            throw new C15627a(String.format("Detected incompatible Protobuf Gencode/Runtime versions when loading %s: gencode %s, runtime %s. Runtime version cannot be older than the linked gencode version.", location, strVersionString, f101269k));
        }
        if (28 > minor || 2 > patch) {
            f101270l.warning(String.format(" Protobuf gencode version %s is older than the runtime version %s at %s. Please avoid checked-in Protobuf gencode that can be obsolete.", strVersionString, f101269k, location));
        }
        if (!suffix.equals("")) {
            throw new C15627a(String.format("Detected mismatched Protobuf Gencode/Runtime version suffixes when loading %s: gencode %s, runtime %s. Version suffixes must be the same.", location, strVersionString, f101269k));
        }
    }

    private static String versionString(int major, int minor, int patch, String suffix) {
        return String.format("%d.%d.%d%s", Integer.valueOf(major), Integer.valueOf(minor), Integer.valueOf(patch), suffix);
    }
}
