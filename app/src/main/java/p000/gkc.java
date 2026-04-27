package p000;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class gkc {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createsCycle(rjc rjcVar) {
        for (rjc parent = rjcVar.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getKey() == null || rjcVar.getKey() == null) {
                try {
                    if (Files.isSameFile(parent.getPath(), rjcVar.getPath())) {
                        return true;
                    }
                } catch (IOException | SecurityException unused) {
                    continue;
                }
            } else if (md8.areEqual(parent.getKey(), rjcVar.getKey())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object keyOf(Path path, LinkOption[] linkOptionArr) {
        try {
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length);
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            md8.checkNotNullExpressionValue(attributes, "readAttributes(...)");
            return attributes.fileKey();
        } catch (Throwable unused) {
            return null;
        }
    }
}
