package p000;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class dif extends mm1 {

    /* JADX INFO: renamed from: C */
    public static final String f29721C = ".v3.exo";

    /* JADX INFO: renamed from: F */
    public static final Pattern f29722F = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: H */
    public static final Pattern f29723H = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: L */
    public static final Pattern f29724L = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX INFO: renamed from: m */
    public static final String f29725m = ".exo";

    private dif(String str, long j, long j2, long j3, @hib File file) {
        super(str, j, j2, j3, file);
    }

    @hib
    public static dif createCacheEntry(File file, long j, vm1 vm1Var) {
        return createCacheEntry(file, j, -9223372036854775807L, vm1Var);
    }

    public static dif createHole(String str, long j, long j2) {
        return new dif(str, j, j2, -9223372036854775807L, null);
    }

    public static dif createLookup(String str, long j) {
        return new dif(str, j, -1L, -9223372036854775807L, null);
    }

    public static File getCacheFile(File file, int i, long j, long j2) {
        return new File(file, i + "." + j + "." + j2 + ".v3.exo");
    }

    @hib
    private static File upgradeFile(File file, vm1 vm1Var) {
        String strUnescapeFileName;
        String name = file.getName();
        Matcher matcher = f29723H.matcher(name);
        if (matcher.matches()) {
            strUnescapeFileName = x0i.unescapeFileName((String) u80.checkNotNull(matcher.group(1)));
        } else {
            matcher = f29722F.matcher(name);
            strUnescapeFileName = matcher.matches() ? (String) u80.checkNotNull(matcher.group(1)) : null;
        }
        if (strUnescapeFileName == null) {
            return null;
        }
        File cacheFile = getCacheFile((File) u80.checkStateNotNull(file.getParentFile()), vm1Var.assignIdForKey(strUnescapeFileName), Long.parseLong((String) u80.checkNotNull(matcher.group(2))), Long.parseLong((String) u80.checkNotNull(matcher.group(3))));
        if (file.renameTo(cacheFile)) {
            return cacheFile;
        }
        return null;
    }

    public dif copyWithFileAndLastTouchTimestamp(File file, long j) {
        u80.checkState(this.f61459d);
        return new dif(this.f61456a, this.f61457b, this.f61458c, j, file);
    }

    @hib
    public static dif createCacheEntry(File file, long j, long j2, vm1 vm1Var) {
        File file2;
        String keyForId;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            File fileUpgradeFile = upgradeFile(file, vm1Var);
            if (fileUpgradeFile == null) {
                return null;
            }
            file2 = fileUpgradeFile;
            name = fileUpgradeFile.getName();
        }
        Matcher matcher = f29724L.matcher(name);
        if (!matcher.matches() || (keyForId = vm1Var.getKeyForId(Integer.parseInt((String) u80.checkNotNull(matcher.group(1))))) == null) {
            return null;
        }
        long length = j == -1 ? file2.length() : j;
        if (length == 0) {
            return null;
        }
        return new dif(keyForId, Long.parseLong((String) u80.checkNotNull(matcher.group(2))), length, j2 == -9223372036854775807L ? Long.parseLong((String) u80.checkNotNull(matcher.group(3))) : j2, file2);
    }
}
