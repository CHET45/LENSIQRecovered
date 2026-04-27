package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;

/* JADX INFO: loaded from: classes.dex */
public interface jxg extends SpinnerAdapter {

    /* JADX INFO: renamed from: jxg$a */
    public static final class C8140a {

        /* JADX INFO: renamed from: a */
        public final Context f52200a;

        /* JADX INFO: renamed from: b */
        public final LayoutInflater f52201b;

        /* JADX INFO: renamed from: c */
        public LayoutInflater f52202c;

        public C8140a(@efb Context context) {
            this.f52200a = context;
            this.f52201b = LayoutInflater.from(context);
        }

        @efb
        public LayoutInflater getDropDownViewInflater() {
            LayoutInflater layoutInflater = this.f52202c;
            return layoutInflater != null ? layoutInflater : this.f52201b;
        }

        @hib
        public Resources.Theme getDropDownViewTheme() {
            LayoutInflater layoutInflater = this.f52202c;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void setDropDownViewTheme(@hib Resources.Theme theme) {
            if (theme == null) {
                this.f52202c = null;
            } else if (theme.equals(this.f52200a.getTheme())) {
                this.f52202c = this.f52201b;
            } else {
                this.f52202c = LayoutInflater.from(new hy2(this.f52200a, theme));
            }
        }
    }

    @hib
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@hib Resources.Theme theme);
}
