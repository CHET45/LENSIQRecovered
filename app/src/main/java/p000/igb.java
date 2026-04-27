package p000;

import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public class igb {

    /* JADX INFO: renamed from: f */
    public static igb f46963f;

    /* JADX INFO: renamed from: a */
    public String f46964a = "普通通知";

    /* JADX INFO: renamed from: b */
    public String f46965b = "";

    /* JADX INFO: renamed from: c */
    public String f46966c = "Notice";

    /* JADX INFO: renamed from: d */
    public String f46967d = "app服务正在运行中";

    /* JADX INFO: renamed from: e */
    public int f46968e = C2531R.mipmap.ic_eyevue_launcher;

    private igb() {
    }

    public static igb getInstance() {
        if (f46963f == null) {
            synchronized (igb.class) {
                try {
                    if (f46963f == null) {
                        f46963f = new igb();
                    }
                } finally {
                }
            }
        }
        return f46963f;
    }

    public int getIconId() {
        return this.f46968e;
    }

    public String getNoticeDescription() {
        return this.f46965b;
    }

    public String getNoticeName() {
        return this.f46964a;
    }

    public String getNoticeText() {
        return this.f46967d;
    }

    public String getNoticeTitle() {
        return this.f46966c;
    }

    public void setAllParameters(String noticeName, String noticeDescription, String noticeTitle, String noticeText, int iconId) {
        this.f46964a = noticeName;
        this.f46965b = noticeDescription;
        this.f46966c = noticeTitle;
        this.f46967d = noticeText;
        this.f46968e = iconId;
    }

    public void setIconId(int iconId) {
        this.f46968e = iconId;
    }

    public void setNoticeDescription(String noticeDescription) {
        this.f46965b = noticeDescription;
    }

    public void setNoticeName(String noticeName) {
        this.f46964a = noticeName;
    }

    public void setNoticeText(String noticeText) {
        this.f46967d = noticeText;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.f46966c = noticeTitle;
    }
}
