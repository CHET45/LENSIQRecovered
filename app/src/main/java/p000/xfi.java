package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.common.bean.VoiceSettingItem;
import com.eyevue.glassapp.C2558R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class xfi extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a */
    public Context f97678a;

    /* JADX INFO: renamed from: b */
    public List<VoiceSettingItem> f97679b;

    /* JADX INFO: renamed from: xfi$a */
    public static class C15049a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public ImageView f97680a;

        /* JADX INFO: renamed from: b */
        public TextView f97681b;

        /* JADX INFO: renamed from: c */
        public TextView f97682c;

        public C15049a(@efb View itemView) {
            super(itemView);
            this.f97680a = (ImageView) itemView.findViewById(C2558R.id.iv_icon);
            this.f97681b = (TextView) itemView.findViewById(C2558R.id.tv_title);
            this.f97682c = (TextView) itemView.findViewById(C2558R.id.tv_description);
        }
    }

    public xfi(Context context, List<VoiceSettingItem> dataList) {
        new ArrayList();
        this.f97678a = context;
        this.f97679b = dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f97679b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb RecyclerView.ViewHolder holder, int position) {
        VoiceSettingItem voiceSettingItem = this.f97679b.get(position);
        C15049a c15049a = (C15049a) holder;
        c15049a.f97681b.setText(voiceSettingItem.getTitle());
        c15049a.f97682c.setText(voiceSettingItem.getDescription());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        return new C15049a(LayoutInflater.from(this.f97678a).inflate(C2558R.layout.item_voice_setting, parent, false));
    }
}
