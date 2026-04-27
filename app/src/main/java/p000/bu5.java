package p000;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: loaded from: classes7.dex */
public final class bu5 extends SimpleFileVisitor<Path> {

    /* JADX INFO: renamed from: a */
    @gib
    public final gz6<Path, BasicFileAttributes, FileVisitResult> f14769a;

    /* JADX INFO: renamed from: b */
    @gib
    public final gz6<Path, BasicFileAttributes, FileVisitResult> f14770b;

    /* JADX INFO: renamed from: c */
    @gib
    public final gz6<Path, IOException, FileVisitResult> f14771c;

    /* JADX INFO: renamed from: d */
    @gib
    public final gz6<Path, IOException, FileVisitResult> f14772d;

    /* JADX WARN: Multi-variable type inference failed */
    public bu5(@gib gz6<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> gz6Var, @gib gz6<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> gz6Var2, @gib gz6<? super Path, ? super IOException, ? extends FileVisitResult> gz6Var3, @gib gz6<? super Path, ? super IOException, ? extends FileVisitResult> gz6Var4) {
        this.f14769a = gz6Var;
        this.f14770b = gz6Var2;
        this.f14771c = gz6Var3;
        this.f14772d = gz6Var4;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @yfb
    public FileVisitResult postVisitDirectory(@yfb Path path, @gib IOException iOException) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        md8.checkNotNullParameter(path, "dir");
        gz6<Path, IOException, FileVisitResult> gz6Var = this.f14772d;
        if (gz6Var != null && (fileVisitResultInvoke = gz6Var.invoke(path, iOException)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultPostVisitDirectory = super.postVisitDirectory(path, iOException);
        md8.checkNotNullExpressionValue(fileVisitResultPostVisitDirectory, "postVisitDirectory(...)");
        return fileVisitResultPostVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @yfb
    public FileVisitResult preVisitDirectory(@yfb Path path, @yfb BasicFileAttributes basicFileAttributes) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        md8.checkNotNullParameter(path, "dir");
        md8.checkNotNullParameter(basicFileAttributes, "attrs");
        gz6<Path, BasicFileAttributes, FileVisitResult> gz6Var = this.f14769a;
        if (gz6Var != null && (fileVisitResultInvoke = gz6Var.invoke(path, basicFileAttributes)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        md8.checkNotNullExpressionValue(fileVisitResultPreVisitDirectory, "preVisitDirectory(...)");
        return fileVisitResultPreVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @yfb
    public FileVisitResult visitFile(@yfb Path path, @yfb BasicFileAttributes basicFileAttributes) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        md8.checkNotNullParameter(path, "file");
        md8.checkNotNullParameter(basicFileAttributes, "attrs");
        gz6<Path, BasicFileAttributes, FileVisitResult> gz6Var = this.f14770b;
        if (gz6Var != null && (fileVisitResultInvoke = gz6Var.invoke(path, basicFileAttributes)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultVisitFile = super.visitFile(path, basicFileAttributes);
        md8.checkNotNullExpressionValue(fileVisitResultVisitFile, "visitFile(...)");
        return fileVisitResultVisitFile;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @yfb
    public FileVisitResult visitFileFailed(@yfb Path path, @yfb IOException iOException) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        md8.checkNotNullParameter(path, "file");
        md8.checkNotNullParameter(iOException, "exc");
        gz6<Path, IOException, FileVisitResult> gz6Var = this.f14771c;
        if (gz6Var != null && (fileVisitResultInvoke = gz6Var.invoke(path, iOException)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultVisitFileFailed = super.visitFileFailed(path, iOException);
        md8.checkNotNullExpressionValue(fileVisitResultVisitFileFailed, "visitFileFailed(...)");
        return fileVisitResultVisitFileFailed;
    }
}
