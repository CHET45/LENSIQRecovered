package p000;

import java.nio.file.Path;
import java.nio.file.Paths;

/* JADX INFO: loaded from: classes7.dex */
public final class akc {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final akc f1832a = new akc();

    /* JADX INFO: renamed from: b */
    public static final Path f1833b = Paths.get("", new String[0]);

    /* JADX INFO: renamed from: c */
    public static final Path f1834c = Paths.get("..", new String[0]);

    private akc() {
    }

    @yfb
    public final Path tryRelativeTo(@yfb Path path, @yfb Path path2) {
        md8.checkNotNullParameter(path, "path");
        md8.checkNotNullParameter(path2, "base");
        Path pathNormalize = path2.normalize();
        Path pathNormalize2 = path.normalize();
        Path pathRelativize = pathNormalize.relativize(pathNormalize2);
        int iMin = Math.min(pathNormalize.getNameCount(), pathNormalize2.getNameCount());
        for (int i = 0; i < iMin; i++) {
            Path name = pathNormalize.getName(i);
            Path path3 = f1834c;
            if (!md8.areEqual(name, path3)) {
                break;
            }
            if (!md8.areEqual(pathNormalize2.getName(i), path3)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (md8.areEqual(pathNormalize2, pathNormalize) || !md8.areEqual(pathNormalize, f1833b)) {
            String string = pathRelativize.toString();
            String separator = pathRelativize.getFileSystem().getSeparator();
            md8.checkNotNullExpressionValue(separator, "getSeparator(...)");
            pathNormalize2 = h9g.endsWith$default(string, separator, false, 2, null) ? pathRelativize.getFileSystem().getPath(t9g.dropLast(string, pathRelativize.getFileSystem().getSeparator().length()), new String[0]) : pathRelativize;
        }
        md8.checkNotNull(pathNormalize2);
        return pathNormalize2;
    }
}
