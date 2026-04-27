package p000;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class log extends nj5 {

    /* JADX INFO: renamed from: a */
    public final File f58375a;

    /* JADX INFO: renamed from: b */
    public File f58376b;

    public log() {
        this(null);
    }

    private File createTemporaryFolderIn(File file) throws IOException {
        File fileCreateTempFile = File.createTempFile("junit", "", file);
        fileCreateTempFile.delete();
        fileCreateTempFile.mkdir();
        return fileCreateTempFile;
    }

    private boolean isLastElementInArray(int i, String[] strArr) {
        return i == strArr.length - 1;
    }

    private void recursiveDelete(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }

    private void validateFolderName(String str) throws IOException {
        if (new File(str).getParent() != null) {
            throw new IOException("Folder name cannot consist of multiple path components separated by a file separator. Please use newFolder('MyParentFolder','MyFolder') to create hierarchies of folders");
        }
    }

    @Override // p000.nj5
    public void after() {
        delete();
    }

    @Override // p000.nj5
    public void before() throws Throwable {
        create();
    }

    public void create() throws IOException {
        this.f58376b = createTemporaryFolderIn(this.f58375a);
    }

    public void delete() {
        File file = this.f58376b;
        if (file != null) {
            recursiveDelete(file);
        }
    }

    public File getRoot() {
        File file = this.f58376b;
        if (file != null) {
            return file;
        }
        throw new IllegalStateException("the temporary folder has not yet been created");
    }

    public File newFile(String str) throws IOException {
        File file = new File(getRoot(), str);
        if (file.createNewFile()) {
            return file;
        }
        throw new IOException("a file with the name '" + str + "' already exists in the test folder");
    }

    public File newFolder(String str) throws IOException {
        return newFolder(str);
    }

    public log(File file) {
        this.f58375a = file;
    }

    public File newFolder(String... strArr) throws IOException {
        File root = getRoot();
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            validateFolderName(str);
            File file = new File(root, str);
            if (!file.mkdir() && isLastElementInArray(i, strArr)) {
                throw new IOException("a folder with the name '" + str + "' already exists");
            }
            i++;
            root = file;
        }
        return root;
    }

    public File newFile() throws IOException {
        return File.createTempFile("junit", null, getRoot());
    }

    public File newFolder() throws IOException {
        return createTemporaryFolderIn(getRoot());
    }
}
