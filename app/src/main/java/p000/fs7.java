package p000;

import java.nio.file.FileSystemException;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes7.dex */
public final class fs7 extends FileSystemException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs7(@yfb Path path, @gib Path path2, @gib String str) {
        super(path.toString(), path2 != null ? path2.toString() : null, str);
        md8.checkNotNullParameter(path, "file");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fs7(@yfb Path path) {
        this(path, null, null);
        md8.checkNotNullParameter(path, "file");
    }
}
