package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.voicenotes.C4297R;
import com.watchfun.voicenotes.bean.RecordRvBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class ttd extends RecyclerView.Adapter<C13236a> {

    /* JADX INFO: renamed from: a */
    public List<RecordRvBean> f85903a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Context f85904b;

    /* JADX INFO: renamed from: ttd$a */
    public class C13236a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public TextView f85905a;

        /* JADX INFO: renamed from: b */
        public TextView f85906b;

        /* JADX INFO: renamed from: c */
        public TextView f85907c;

        public C13236a(@efb View view) {
            super(view);
            this.f85906b = (TextView) view.findViewById(C4297R.id.tv_content);
            this.f85905a = (TextView) view.findViewById(C4297R.id.tv_speaker);
            this.f85907c = (TextView) view.findViewById(C4297R.id.tv_duration);
        }
    }

    public ttd(Context context, List<RecordRvBean> list) {
        this.f85904b = context;
        setData(list);
    }

    private int getSpeakerTxtColor(String str) {
        int[] iArr = {C4297R.color.color_beff8d, C4297R.color.color_5089B6, C4297R.color.color_d07A43, C4297R.color.color_ff9efa, C4297R.color.color_fff672};
        int i = iArr[0];
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        String strSubstring = str.substring(str.length() - 1, str.length());
        strSubstring.hashCode();
        switch (strSubstring) {
            case "2":
                return iArr[1];
            case "3":
                return iArr[2];
            case "4":
                return iArr[3];
            case "5":
                return iArr[4];
            default:
                return iArr[0];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f85903a.size();
    }

    public void setData(List<RecordRvBean> list) {
        this.f85903a.clear();
        this.f85903a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb C13236a c13236a, int i) {
        RecordRvBean recordRvBean = this.f85903a.get(i);
        long startTime = recordRvBean.getStartTime();
        c13236a.f85907c.setText(String.format(Locale.ENGLISH, "%02d:%02d:%02d", Long.valueOf(startTime / 3600), Long.valueOf((startTime % 3600) / 60), Long.valueOf(startTime % 60)));
        c13236a.f85905a.setText(recordRvBean.getSpeaker());
        c13236a.f85905a.setTextColor(this.f85904b.getColor(getSpeakerTxtColor(recordRvBean.getSpeaker())));
        c13236a.f85906b.setText(recordRvBean.getContent());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public C13236a onCreateViewHolder(@efb ViewGroup viewGroup, int i) {
        return new C13236a(LayoutInflater.from(this.f85904b).inflate(C4297R.layout.rv_item_record, (ViewGroup) null));
    }
}
