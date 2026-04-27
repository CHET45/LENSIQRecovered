package p000;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: loaded from: classes7.dex */
@ihi(markerClass = {mh5.class})
@jjf(version = "2.1")
public interface zt5 {
    void onPostVisitDirectory(@yfb gz6<? super Path, ? super IOException, ? extends FileVisitResult> gz6Var);

    void onPreVisitDirectory(@yfb gz6<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> gz6Var);

    void onVisitFile(@yfb gz6<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> gz6Var);

    void onVisitFileFailed(@yfb gz6<? super Path, ? super IOException, ? extends FileVisitResult> gz6Var);
}
