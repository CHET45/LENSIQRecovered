package p000;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/DirectoryEntriesReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1#2:181\n*E\n"})
public final class td4 extends SimpleFileVisitor<Path> {

    /* JADX INFO: renamed from: a */
    public final boolean f84313a;

    /* JADX INFO: renamed from: b */
    @gib
    public rjc f84314b;

    /* JADX INFO: renamed from: c */
    @yfb
    public e60<rjc> f84315c = new e60<>();

    public td4(boolean z) {
        this.f84313a = z;
    }

    public final boolean getFollowLinks() {
        return this.f84313a;
    }

    @yfb
    public final List<rjc> readEntries(@yfb rjc rjcVar) throws IOException {
        md8.checkNotNullParameter(rjcVar, "directoryNode");
        this.f84314b = rjcVar;
        Files.walkFileTree(rjcVar.getPath(), c79.f15902a.toVisitOptions(this.f84313a), 1, this);
        this.f84315c.removeFirst();
        e60<rjc> e60Var = this.f84315c;
        this.f84315c = new e60<>();
        return e60Var;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @yfb
    public FileVisitResult preVisitDirectory(@yfb Path path, @yfb BasicFileAttributes basicFileAttributes) throws IOException {
        md8.checkNotNullParameter(path, "dir");
        md8.checkNotNullParameter(basicFileAttributes, "attrs");
        this.f84315c.add(new rjc(path, basicFileAttributes.fileKey(), this.f84314b));
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        md8.checkNotNullExpressionValue(fileVisitResultPreVisitDirectory, "preVisitDirectory(...)");
        return fileVisitResultPreVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @yfb
    public FileVisitResult visitFile(@yfb Path path, @yfb BasicFileAttributes basicFileAttributes) throws IOException {
        md8.checkNotNullParameter(path, "file");
        md8.checkNotNullParameter(basicFileAttributes, "attrs");
        this.f84315c.add(new rjc(path, null, this.f84314b));
        FileVisitResult fileVisitResultVisitFile = super.visitFile(path, basicFileAttributes);
        md8.checkNotNullExpressionValue(fileVisitResultVisitFile, "visitFile(...)");
        return fileVisitResultVisitFile;
    }
}
