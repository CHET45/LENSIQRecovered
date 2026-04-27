package p000;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class eif extends nm1 {

    /* JADX INFO: renamed from: C */
    public static final String f33100C = ".v3.exo";

    /* JADX INFO: renamed from: F */
    public static final Pattern f33101F = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: H */
    public static final Pattern f33102H = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: L */
    public static final Pattern f33103L = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX INFO: renamed from: m */
    public static final String f33104m = ".exo";

    private eif(String str, long j, long j2, long j3, @hib File file) {
        super(str, j, j2, j3, file);
    }

    @hib
    public static eif createCacheEntry(File file, long j, um1 um1Var) {
        return createCacheEntry(file, j, -9223372036854775807L, um1Var);
    }

    public static eif createHole(String str, long j, long j2) {
        return new eif(str, j, j2, -9223372036854775807L, null);
    }

    public static eif createLookup(String str, long j) {
        return new eif(str, j, -1L, -9223372036854775807L, null);
    }

    public static File getCacheFile(File file, int i, long j, long j2) {
        return new File(file, i + "." + j + "." + j2 + ".v3.exo");
    }

    @hib
    private static File upgradeFile(File file, um1 um1Var) {
        String strUnescapeFileName;
        String name = file.getName();
        Matcher matcher = f33102H.matcher(name);
        if (matcher.matches()) {
            strUnescapeFileName = t0i.unescapeFileName((String) v80.checkNotNull(matcher.group(1)));
        } else {
            matcher = f33101F.matcher(name);
            strUnescapeFileName = matcher.matches() ? (String) v80.checkNotNull(matcher.group(1)) : null;
        }
        if (strUnescapeFileName == null) {
            return null;
        }
        File cacheFile = getCacheFile((File) v80.checkStateNotNull(file.getParentFile()), um1Var.assignIdForKey(strUnescapeFileName), Long.parseLong((String) v80.checkNotNull(matcher.group(2))), Long.parseLong((String) v80.checkNotNull(matcher.group(3))));
        if (file.renameTo(cacheFile)) {
            return cacheFile;
        }
        return null;
    }

    public eif copyWithFileAndLastTouchTimestamp(File file, long j) {
        v80.checkState(this.f64972d);
        return new eif(this.f64969a, this.f64970b, this.f64971c, j, file);
    }

    @hib
    public static eif createCacheEntry(File file, long j, long j2, um1 um1Var) {
        File file2;
        String keyForId;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            File fileUpgradeFile = upgradeFile(file, um1Var);
            if (fileUpgradeFile == null) {
                return null;
            }
            file2 = fileUpgradeFile;
            name = fileUpgradeFile.getName();
        }
        Matcher matcher = f33103L.matcher(name);
        if (!matcher.matches() || (keyForId = um1Var.getKeyForId(Integer.parseInt((String) v80.checkNotNull(matcher.group(1))))) == null) {
            return null;
        }
        long length = j == -1 ? file2.length() : j;
        if (length == 0) {
            return null;
        }
        return new eif(keyForId, Long.parseLong((String) v80.checkNotNull(matcher.group(2))), length, j2 == -9223372036854775807L ? Long.parseLong((String) v80.checkNotNull(matcher.group(3))) : j2, file2);
    }
}
