package p000;

/* JADX INFO: loaded from: classes6.dex */
public class ebh {

    /* JADX INFO: renamed from: a */
    public boolean f32557a;

    /* JADX INFO: renamed from: b */
    public dbh f32558b;

    /* JADX INFO: renamed from: c */
    public boolean f32559c;

    public ebh(boolean isSelect, dbh xfTransFreelyMessage) {
        this.f32557a = isSelect;
        this.f32558b = xfTransFreelyMessage;
    }

    public dbh getXfTransFreelyMessage() {
        return this.f32558b;
    }

    public boolean isAlreadyPlayed() {
        return this.f32559c;
    }

    public boolean isSelect() {
        return this.f32557a;
    }

    public void setAlreadyPlayed(boolean alreadyPlayed) {
        this.f32559c = alreadyPlayed;
    }

    public void setSelect(boolean select) {
        this.f32557a = select;
    }

    public void setXfTransFreelyMessage(dbh xfTransFreelyMessage) {
        this.f32558b = xfTransFreelyMessage;
    }
}
