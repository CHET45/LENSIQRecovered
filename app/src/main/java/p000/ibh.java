package p000;

/* JADX INFO: loaded from: classes6.dex */
public class ibh {

    /* JADX INFO: renamed from: a */
    public boolean f46472a;

    /* JADX INFO: renamed from: b */
    public hbh f46473b;

    /* JADX INFO: renamed from: c */
    public boolean f46474c;

    public ibh(boolean isSelect, hbh xfTransFreelyMessage) {
        this.f46472a = isSelect;
        this.f46473b = xfTransFreelyMessage;
    }

    public hbh getXfTransFreelyMessage() {
        return this.f46473b;
    }

    public boolean isAlreadyPlayed() {
        return this.f46474c;
    }

    public boolean isSelect() {
        return this.f46472a;
    }

    public void setAlreadyPlayed(boolean alreadyPlayed) {
        this.f46474c = alreadyPlayed;
    }

    public void setSelect(boolean select) {
        this.f46472a = select;
    }

    public void setXfTransFreelyMessage(hbh xfTransFreelyMessage) {
        this.f46473b = xfTransFreelyMessage;
    }
}
