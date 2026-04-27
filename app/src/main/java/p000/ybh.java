package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class ybh extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a */
    public Context f101053a;

    /* JADX INFO: renamed from: c */
    public InterfaceC15604a f101055c;

    /* JADX INFO: renamed from: d */
    public zbh f101056d;

    /* JADX INFO: renamed from: e */
    public boolean f101057e;

    /* JADX INFO: renamed from: b */
    public List<dbh> f101054b = new ArrayList();

    /* JADX INFO: renamed from: f */
    public boolean f101058f = false;

    /* JADX INFO: renamed from: ybh$a */
    public interface InterfaceC15604a {
        void click(boolean isAllSelect);

        void onItemClick(jbh record);

        void onShareClick(jbh record);
    }

    /* JADX INFO: renamed from: ybh$b */
    public static class C15605b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public zbh f101059a;

        public C15605b(@efb View itemView) {
            super(itemView);
        }

        public zbh getBinding() {
            return this.f101059a;
        }

        public void setBinding(zbh binding) {
            this.f101059a = binding;
        }
    }

    public ybh(Context context) {
        this.f101053a = context;
    }

    public String formatLongToDate(long timestamp) {
        return new SimpleDateFormat("MM月dd日 HH:mm", Locale.getDefault()).format(new Date(timestamp));
    }

    public String formatLongToTime(long timestamp) {
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(locale, "%02d:%02d:%02d", Long.valueOf(timeUnit.toHours(timestamp)), Long.valueOf(timeUnit.toMinutes(timestamp) % 60), Long.valueOf(timeUnit.toSeconds(timestamp) % 60));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f101054b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @igg({"RecyclerView"})
    public void onBindViewHolder(@efb RecyclerView.ViewHolder holder, int position) {
        zbh zbhVar = ((C15605b) holder).f101059a;
        dbh dbhVar = this.f101054b.get(position);
        zbhVar.f104737d.setText(dbhVar.getSourceLanguage());
        zbhVar.f104739f.setText(dbhVar.getTransLanguage());
        zbhVar.f104736c.setText(dbhVar.getSourceLanguage());
        zbhVar.f104740m.setText(dbhVar.getTransResult());
        zbhVar.f104738e.setText(dbhVar.getResult());
        if (position == 0) {
            zbhVar.f104735b.setVisibility(0);
        } else if (dbhVar.isLanguageChange()) {
            zbhVar.f104735b.setVisibility(0);
        } else {
            zbhVar.f104735b.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        this.f101056d = zbh.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        C15605b c15605b = new C15605b(this.f101056d.getRoot());
        c15605b.setBinding(this.f101056d);
        return c15605b;
    }

    @igg({"NotifyDataSetChanged"})
    public void setData(List<dbh> list) {
        this.f101054b.clear();
        this.f101054b.addAll(list);
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(InterfaceC15604a listener) {
        this.f101055c = listener;
    }
}
