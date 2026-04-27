package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.bn4;

/* JADX INFO: loaded from: classes6.dex */
public class bd1 {

    /* JADX INFO: renamed from: a */
    public final int f13378a;

    /* JADX INFO: renamed from: b */
    public final String f13379b;

    /* JADX INFO: renamed from: c */
    public String f13380c;

    /* JADX INFO: renamed from: d */
    @efb
    public final File f13381d;

    /* JADX INFO: renamed from: e */
    @hib
    public File f13382e;

    /* JADX INFO: renamed from: f */
    public final bn4.C1954a f13383f;

    /* JADX INFO: renamed from: g */
    public final List<h61> f13384g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final boolean f13385h;

    /* JADX INFO: renamed from: i */
    public boolean f13386i;

    public bd1(int i, @efb String str, @efb File file, @hib String str2) {
        this.f13378a = i;
        this.f13379b = str;
        this.f13381d = file;
        if (q0i.isEmpty(str2)) {
            this.f13383f = new bn4.C1954a();
            this.f13385h = true;
        } else {
            this.f13383f = new bn4.C1954a(str2);
            this.f13385h = false;
            this.f13382e = new File(file, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m3043a() {
        return this.f13385h;
    }

    public void addBlock(h61 h61Var) {
        this.f13384g.add(h61Var);
    }

    public bd1 copy() {
        bd1 bd1Var = new bd1(this.f13378a, this.f13379b, this.f13381d, this.f13383f.get(), this.f13385h);
        bd1Var.f13386i = this.f13386i;
        Iterator<h61> it = this.f13384g.iterator();
        while (it.hasNext()) {
            bd1Var.f13384g.add(it.next().copy());
        }
        return bd1Var;
    }

    public bd1 copyWithReplaceId(int i) {
        bd1 bd1Var = new bd1(i, this.f13379b, this.f13381d, this.f13383f.get(), this.f13385h);
        bd1Var.f13386i = this.f13386i;
        Iterator<h61> it = this.f13384g.iterator();
        while (it.hasNext()) {
            bd1Var.f13384g.add(it.next().copy());
        }
        return bd1Var;
    }

    public bd1 copyWithReplaceIdAndUrl(int i, String str) {
        bd1 bd1Var = new bd1(i, str, this.f13381d, this.f13383f.get(), this.f13385h);
        bd1Var.f13386i = this.f13386i;
        Iterator<h61> it = this.f13384g.iterator();
        while (it.hasNext()) {
            bd1Var.f13384g.add(it.next().copy());
        }
        return bd1Var;
    }

    public h61 getBlock(int i) {
        return this.f13384g.get(i);
    }

    public int getBlockCount() {
        return this.f13384g.size();
    }

    @hib
    public String getEtag() {
        return this.f13380c;
    }

    @hib
    public File getFile() {
        String str = this.f13383f.get();
        if (str == null) {
            return null;
        }
        if (this.f13382e == null) {
            this.f13382e = new File(this.f13381d, str);
        }
        return this.f13382e;
    }

    @hib
    public String getFilename() {
        return this.f13383f.get();
    }

    public bn4.C1954a getFilenameHolder() {
        return this.f13383f;
    }

    public int getId() {
        return this.f13378a;
    }

    public long getTotalLength() {
        if (isChunked()) {
            return getTotalOffset();
        }
        Object[] array = this.f13384g.toArray();
        long contentLength = 0;
        if (array != null) {
            for (Object obj : array) {
                if (obj instanceof h61) {
                    contentLength += ((h61) obj).getContentLength();
                }
            }
        }
        return contentLength;
    }

    public long getTotalOffset() {
        Object[] array = this.f13384g.toArray();
        long currentOffset = 0;
        if (array != null) {
            for (Object obj : array) {
                if (obj instanceof h61) {
                    currentOffset += ((h61) obj).getCurrentOffset();
                }
            }
        }
        return currentOffset;
    }

    public String getUrl() {
        return this.f13379b;
    }

    public boolean isChunked() {
        return this.f13386i;
    }

    public boolean isLastBlock(int i) {
        return i == this.f13384g.size() - 1;
    }

    public boolean isSameFrom(cn4 cn4Var) {
        if (!this.f13381d.equals(cn4Var.getParentFile()) || !this.f13379b.equals(cn4Var.getUrl())) {
            return false;
        }
        String filename = cn4Var.getFilename();
        if (filename != null && filename.equals(this.f13383f.get())) {
            return true;
        }
        if (this.f13385h && cn4Var.isFilenameFromResponse()) {
            return filename == null || filename.equals(this.f13383f.get());
        }
        return false;
    }

    public boolean isSingleBlock() {
        return this.f13384g.size() == 1;
    }

    public void resetBlockInfos() {
        this.f13384g.clear();
    }

    public void resetInfo() {
        this.f13384g.clear();
        this.f13380c = null;
    }

    public void reuseBlocks(bd1 bd1Var) {
        this.f13384g.clear();
        this.f13384g.addAll(bd1Var.f13384g);
    }

    public void setChunked(boolean z) {
        this.f13386i = z;
    }

    public void setEtag(String str) {
        this.f13380c = str;
    }

    public String toString() {
        return "id[" + this.f13378a + "] url[" + this.f13379b + "] etag[" + this.f13380c + "] taskOnlyProvidedParentPath[" + this.f13385h + "] parent path[" + this.f13381d + "] filename[" + this.f13383f.get() + "] block(s):" + this.f13384g.toString();
    }

    public bd1(int i, @efb String str, @efb File file, @hib String str2, boolean z) {
        this.f13378a = i;
        this.f13379b = str;
        this.f13381d = file;
        if (q0i.isEmpty(str2)) {
            this.f13383f = new bn4.C1954a();
        } else {
            this.f13383f = new bn4.C1954a(str2);
        }
        this.f13385h = z;
    }
}
